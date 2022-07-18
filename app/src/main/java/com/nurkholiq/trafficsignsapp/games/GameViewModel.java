package com.nurkholiq.trafficsignsapp.games;

import android.os.CountDownTimer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.nurkholiq.trafficsignsapp.games.data.DataSource;
import com.nurkholiq.trafficsignsapp.games.model.Question;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GameViewModel extends ViewModel {
    private List<Question> questions = DataSource.getQuestions();
    private int indexQuestion = 0;
    private int nilai = 0;

    public GameViewModel() {
        _question.postValue(questions.get(indexQuestion));
    }

    private long durationInMinute = TimeUnit.MINUTES.toMillis(1);
    private MutableLiveData<Long> _duration = new MutableLiveData<>();
    LiveData<Long> duration = _duration;

    private static MutableLiveData<Question> _question = new MutableLiveData<>();
    LiveData<Question> question = _question;

    private CountDownTimer timer = new CountDownTimer(durationInMinute, 1000) {
        @Override
        public void onTick(long l) {
            _duration.postValue(l);
        }

        @Override
        public void onFinish() {
            nextQuestion();
        }
    };

    Boolean nextQuestion() {
        indexQuestion += 1;

        if (indexQuestion < questions.size()) {
            _question.postValue(questions.get(indexQuestion));
            return true;
        } else {
            return false;
        }
    }

    void startTimer() {
        timer.start();
    }

    void restartTimer() {
        timer.cancel();
        timer.start();
    }

    void correctAnswer() {
        nilai += 1;
    }

    int getNilai() {
        return nilai;
    }
}
