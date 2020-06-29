package com.my.schedule.domain.repository;

import com.my.schedule.domain.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {
}
