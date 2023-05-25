package ru.hackathon.sovcombankchallenge.stage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "test_stages")
@RequiredArgsConstructor
@Getter
@Setter
public class TestStage extends Stage {
    @Column(name = "DEADLINE")
    private LocalDateTime deadline;
    @Column(name = "DURATION")
    private Duration duration;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Question> questions;
}
