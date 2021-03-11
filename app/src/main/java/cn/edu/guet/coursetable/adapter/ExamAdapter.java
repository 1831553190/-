package cn.edu.guet.coursetable.adapter;

import com.zhuangfei.timetable.model.Schedule;
import com.zhuangfei.timetable.model.ScheduleEnable;

import java.util.ArrayList;

import cn.edu.guet.coursetable.model.ExamData;


/**
 * Created by eswd on 2020/12/14.
 */

public final class ExamAdapter implements ScheduleEnable {
    private final ExamData course;

    public ExamAdapter(ExamData course) {
        this.course = course;
    }

    @Override
    public Schedule getSchedule() {
        Schedule schedule = new Schedule();
        schedule.setName("[考试]\n" + course.getCname());
        schedule.setRoom(course.getCroomno());
        schedule.setTeacher(course.getName());
        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = course.getStartweek(); i <= course.getEndweek(); i++)
//        {
        list.add(course.getZc());
//        }
        schedule.setWeekList(list);
        schedule.setDay(course.getXq());
        int a = (Integer.parseInt(course.getKsjc()) - 1) * 2 + 1;
        schedule.setStart(a);
        schedule.setStep(2);
        schedule.putExtras("courseNumber", course.getCourseno());
        schedule.putExtras("courseType", "考试");
        schedule.putExtras("beginWeek", course.getZc());
        schedule.putExtras("endWeek", course.getZc());
        return schedule;
    }
}
