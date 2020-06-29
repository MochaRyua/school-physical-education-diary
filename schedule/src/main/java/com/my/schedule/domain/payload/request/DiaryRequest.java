package com.my.schedule.domain.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DiaryRequest {

    private String content;

    private LocalDate createdDate;
}
