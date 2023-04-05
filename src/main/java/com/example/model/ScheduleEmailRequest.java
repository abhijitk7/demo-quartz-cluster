package com.example.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class ScheduleEmailRequest {

    private String email;

    private String subject;

    private String body;

    private LocalDateTime dateTime;

    private ZoneId timeZone;
}
