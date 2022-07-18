package com.nurkholiq.trafficsignsapp.games.data;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.games.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {
    public static List<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Apakah arti dari simbol diatas?", "Dilarang Jalan Terus", new ArrayList(Arrays.asList("Dilarang Masuk", "Dilarang Jalan Terus", "Dilarang Berhenti", "Dilarang Parkir")), R.drawable.rl_1_stop));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Dilarang Pejalan Kaki", new ArrayList(Arrays.asList("Dilarang Berhenti", "Dilarang Berhenti", "Dilarang Pejalan Kaki", "Dilarang Jalan Terus")), R.drawable.rl_7_pedestrian));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Dilarang Masuk", new ArrayList(Arrays.asList("Dilarang Masuk", "Dilarang Jalan Terus", "Dilarang Parkir", "Dilarang Berhenti")), R.drawable.rl_2_entry));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Tikungan Ke kiri", new ArrayList(Arrays.asList("Wajib Ke Kiri", "Dilarang Belok Ke Kiri", "Tikungan Ke Kanan", "Tikungan Ke kiri")), R.drawable.rp_1_left));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Wajib Ke Kanan", new ArrayList(Arrays.asList("Tikungan Ke Kanan", "Dilarang Belok Ke Kanan", "Wajib Mengikuti Arah", "Wajib Ke Kanan")), R.drawable.rw_2_right));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Tikungan Pertama Ke Kiri", new ArrayList(Arrays.asList("Tikungan Pertama Ke Kiri", "Wajib Ke Kiri", "Tikungan Pertama Ke Kanan", "Tikungan Ke kiri")), R.drawable.rp_5_left_bend));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Wajib dilewati", new ArrayList(Arrays.asList("Wajib dilewati", "Wajib Mengikuti Arah", "Wajib Ke Kanan", "Tikungan Ke Kanan")), R.drawable.rw_6_skipped));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Dilarang Parkir", new ArrayList(Arrays.asList("Dilarang Jalan Terus", "Dilarang Masuk", "Dilarang Parkir", "Dilarang Berhenti")), R.drawable.rl_6_parking));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Tanjakan", new ArrayList(Arrays.asList("Dilarang Tanjakan", "Lampu Pengatur Lalu Lintas", "Dilarang Masuk Motor Roda 4", "Tanjakan")), R.drawable.rp_7_climb));
        questions.add(new Question("Apakah arti dari simbol diatas?", "Tikungan Pertama Ke Kanan", new ArrayList(Arrays.asList("Wajib Ke Kanan", "Tikungan Pertama Ke Kiri", "Dilarang Belok Ke Kanan", "Tikungan Pertama Ke Kanan")), R.drawable.rp_6_right_bend));
//        questions.add(new Question("Simbol manakah yang digunakan sebagai tanda berhenti?", String.valueOf(R.drawable.group_2), new ArrayList(Arrays.asList(String.valueOf(R.drawable.group_1), String.valueOf(R.drawable.group_4), String.valueOf(R.drawable.rp_7_climb), String.valueOf(R.drawable.group_2))), -1));
        return questions;
    }
}
