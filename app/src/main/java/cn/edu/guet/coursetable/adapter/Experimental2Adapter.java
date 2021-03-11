package cn.edu.guet.coursetable.adapter;

import com.zhuangfei.timetable.model.Schedule;
import com.zhuangfei.timetable.model.ScheduleEnable;

import java.util.ArrayList;

import cn.edu.guet.coursetable.model.Experimental;

/**
 * Created by Mr.小世界 on 2018/10/12.
 */

/**
 * 实验解析类
 */
public final class Experimental2Adapter implements ScheduleEnable
{
    private final Experimental experimental;

    public Experimental2Adapter(Experimental experimental)
    {
        this.experimental = experimental;
    }


    @Override
    public Schedule getSchedule()
    {
        Schedule schedule = new Schedule();
        schedule.setStart((experimental.getStart()-1)*2+1);
        schedule.setStep(2);
        schedule.setWeekList(new ArrayList<Integer>()
        {{
            add(experimental.getWeek());
        }});
        schedule.setDay(experimental.getDayOfWeek());
        schedule.putExtras("week",experimental.getWeek());
        schedule.setTeacher(experimental.getTeacherName());
//        schedule.putExtras("beginWeek",experimental.getWeek());
        schedule.setName("[实验]" + experimental.getCname());
        schedule.setRoom(experimental.getRoom());
        schedule.putExtras("name",experimental.getItemname());
        return schedule;
    }
}
