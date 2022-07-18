package com.nurkholiq.trafficsignsapp.games;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.nurkholiq.trafficsignsapp.databinding.ActivityGameBinding;
import com.nurkholiq.trafficsignsapp.games.model.Question;

import java.util.concurrent.TimeUnit;

public class GameActivity extends AppCompatActivity {

    private GameViewModel viewModel;
    private ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutGames;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        viewModel = new GameViewModel();
        viewModel.duration.observe(this, this::onCountDown);
        viewModel.question.observe(this, this::onSetQuestion);

        binding.next.setOnClickListener(v -> {

            checkAnswer();

            if (viewModel.nextQuestion()) {
                viewModel.restartTimer();
            } else {
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra(ResultActivity.RESULT_TAG, String.valueOf(viewModel.getNilai()));
                startActivity(intent);
                finish();
            }
        });
    }

    private void onCountDown(Long duration) {
        long second = TimeUnit.MILLISECONDS.toSeconds(duration);
        binding.timer.setText(String.valueOf(second));

        if (second == 0) {
            checkAnswer();
        }
    }

    private void checkAnswer() {
        int id = binding.answers.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        Question question = viewModel.question.getValue();

        if (rb.getTag().toString().equalsIgnoreCase(question.getCorrectAnswer())) {
            viewModel.correctAnswer();
        }
    }

    private void onSetQuestion(Question question) {

        binding.question.setText(question.getQuestion());
        setRadioButton(binding.answer1, question.getAnswers().get(0));
        setRadioButton(binding.answer2, question.getAnswers().get(1));
        setRadioButton(binding.answer3, question.getAnswers().get(2));
        setRadioButton(binding.answer4, question.getAnswers().get(3));

        if (question.getImageQuestion() != -1) {
            binding.imgQuestion.setVisibility(View.VISIBLE);
            binding.imgQuestion.setBackgroundResource(question.getImageQuestion());
        } else {
            binding.imgQuestion.setVisibility(View.GONE);
        }

        viewModel.startTimer();
    }

    private void setRadioButton(RadioButton rb, String answer) {
        try {
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), Integer.parseInt(answer), null);
            rb.setText(null);
            rb.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
        } catch (Exception e) {
            rb.setText(answer);
        } finally {
            rb.setTag(answer);
            rb.setChecked(false);
        }
    }
}