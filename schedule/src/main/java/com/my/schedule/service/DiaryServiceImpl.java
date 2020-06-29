package com.my.schedule.service;

import com.my.schedule.domain.entity.Diary;
import com.my.schedule.domain.payload.request.DiaryListResponse;
import com.my.schedule.domain.payload.request.DiaryRequest;
import com.my.schedule.domain.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService{

    private final DiaryRepository diaryRepository;

    @Override
    public void diarySave(DiaryRequest diaryRequest) {
        if (diaryRequest.getCreatedDate() == null) {
            diaryRepository.save(
                    Diary.builder()
                    .content(diaryRequest.getContent())
                    .createdDate(LocalDate.now())
                    .build()
            );
        }else {
            diaryRepository.save(
                    Diary.builder()
                    .content(diaryRequest.getContent())
                    .createdDate(diaryRequest.getCreatedDate())
                    .build()
            );
        }
    }

    @Override
    public List<DiaryListResponse> diaryList() {

        List<DiaryListResponse> list = new ArrayList<>();

        for (Diary diary : diaryRepository.findAll()) {
            list.add(DiaryListResponse.builder()
            .content(diary.getContent())
            .createdDate(diary.getCreatedDate())
            .build());
        }
        return list;
    }

    @Override
    public void dropDiary(Integer uuid) {

        diaryRepository.deleteById(uuid);
    }
}
