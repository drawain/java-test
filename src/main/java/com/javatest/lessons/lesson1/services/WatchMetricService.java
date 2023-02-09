package com.javatest.lessons.lesson1.services;

import java.time.LocalDate;
import java.util.Map;

public class WatchMetricService {
    
    public Map<String, Long> fetchAllMetricsForPeriod(LocalDate startDate, LocalDate endDate) {
        return Map.of(
            "avg_heart_rate_bpm", 123L,
            "calories_total", 123L,
            "steps_total", 3245L
        );
    }

}
