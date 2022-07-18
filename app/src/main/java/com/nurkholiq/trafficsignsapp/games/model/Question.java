package com.nurkholiq.trafficsignsapp.games.model;

import java.util.List;

public class Question {
    private final String question;
    private final String correctAnswer;
    private final List<String> answers;
    private final int imageQuestion;

    public Question(String question, String correctAnswer, List<String> answers, int imageQuestion){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
        this.imageQuestion = imageQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getImageQuestion() {
        return imageQuestion;
    }
}
