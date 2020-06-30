package com.my.schedule.domain.repository;

import com.my.schedule.domain.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByOrderByCreatedDateAsc();
}
