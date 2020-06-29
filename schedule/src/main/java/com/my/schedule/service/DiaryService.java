package com.my.schedule.service;

import com.my.schedule.domain.payload.request.DiaryListResponse;
import com.my.schedule.domain.payload.request.DiaryRequest;

import java.util.List;

public interface DiaryService {

    public void diarySave(DiaryRequest diaryRequest);
    public List<DiaryListResponse> diaryList();
    public void dropDiary(Integer uuid);
}
