package com.my.schedule.domain.payload.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Builder
public class DiaryListResponse {

    private Integer uuid;

    private String content;

    private LocalDate createdDate;
}
