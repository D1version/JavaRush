package com.javarush.test.level27.lesson15.big01.statistic;


import com.javarush.test.level27.lesson15.big01.statistic.event.EventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventType;

import java.util.*;


public class StatisticManager
{
    private static StatisticManager ourInstance = new StatisticManager();
    public StatisticStorage storage=new StatisticStorage();


    public static StatisticManager getInstance()
    {
        return ourInstance;
    }
    private StatisticManager()
    {
    }
    private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> map;
        public StatisticStorage(){
            map=new HashMap<>();
            for (EventType e:EventType.values()){
                map.put(e,new ArrayList<EventDataRow>());
            }
        }
    }

    public void register(EventDataRow data) {

    }

}
