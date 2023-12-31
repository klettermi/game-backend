package com.example.game.domain.hangman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hangman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Long id;

    @Column
    private String word;

    @Column
    private String currentAnswer;

    @Column
    @Builder.Default
    private int count = 1;

    public void update(String newAnswer, int count) {
        this.currentAnswer = newAnswer;
        this.count = count;
    }
}
