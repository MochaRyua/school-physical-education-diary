package com.my.schedule.controller;

import com.my.schedule.domain.payload.request.DiaryListResponse;
import com.my.schedule.domain.payload.request.DiaryRequest;
import com.my.schedule.service.DiaryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/diary")
public class DiaryController {

    private final DiaryServiceImpl diaryService;

    @GetMapping("/write")
    public void diary(@RequestBody DiaryRequest diaryRequest) {

        diaryService.diarySave(diaryRequest);
    }

    @GetMapping("/list")
    public List<DiaryListResponse> list() {

       return diaryService.diaryList();
    }

    @GetMapping("/drop")
    public void drop(@RequestParam Integer uuid) {

        diaryService.dropDiary(uuid);
    }
}
