package com.my.schedule.domain.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uuid;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private LocalDate createdDate;
}
