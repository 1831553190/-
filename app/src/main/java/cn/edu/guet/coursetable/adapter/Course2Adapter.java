package cn.edu.guet.coursetable.adapter;

import com.zhuangfei.timetable.model.Schedule;
import com.zhuangfei.timetable.model.ScheduleEnable;

import java.util.ArrayList;

import cn.edu.guet.coursetable.model.Course;

/**
 * Created by Mr.小世界 on 2018/10/10.
 */

/**
 * 课程解析类
 */
public final class Course2Adapter implements ScheduleEnable
{
    private final Course course;

    public Course2Adapter(Course course)
    {
        this.course = course;
    }

    @Override
    public Schedule getSchedule()
    {
        Schedule schedule = new Schedule();
        schedule.setName(course.getCname());
        schedule.setRoom(course.getCroomno());
        schedule.setTeacher(course.getTeacherName());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = course.getStartweek(); i <= course.getEndweek(); i++)
        {
            list.add(i);
        }
        schedule.setWeekList(list);
        schedule.setDay(course.getWeek());
        int a=(Integer.parseInt(course.getSeq())-1)*2+1;
        schedule.setStart(a);
        schedule.setStep(2);
        schedule.putExtras("courseNumber",course.getCourseno());
        schedule.putExtras("courseType",course.getTname());
        schedule.putExtras("beginWeek",course.getStartweek());
        schedule.putExtras("endWeek",course.getEndweek());
        return schedule;
    }
}
