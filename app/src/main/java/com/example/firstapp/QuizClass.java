package com.example.firstapp;

import java.io.Serializable;
import java.util.List;

public class QuizClass implements Serializable {
    question[] questions;
    int correctCount;
    int wrongCount;

    QuizClass(){
        correctCount = 0;
        wrongCount = 0;
        questions = new question[10];

        for(int i=0; i<10; i++)
            questions[i] = new question();

        questions[0].statement = "When the letter khaa follows a noon saakinah, which tajweed rule must be exercised?";
        questions[0].options = new String[]{
                "Ikhfaa",
                "Ith-haar",
                "Iqlaab",
                "Idghaam"
        };
        questions[0].correctOption = 2;

        questions[1].statement = "Idgaam shafawee is...";
        questions[1].options = new String[]{
                "When a meem saakinah is followed by another meem",
                "When a noon saakinah is followed by yaa, waaw, noon or meem",
                "When meem saakinah is followed by the letter baa",
                "When a noon saakinah is followed by laam or raa"
        };
        questions[1].correctOption = 1;

        questions[2].statement = "What are ظ ذ ث ?";
        questions[2].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Tarfiyah",
                "Lahatiyahh"
        };
        questions[2].correctOption = 1;

        questions[3].statement = "From where ف comes ?";
        questions[3].options = new String[]{
                "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                "Inner part of the both lips touch each other",
                "Outer part of both lips touch each other",
                "Rounding both lips and not closing the mouth"
        };
        questions[3].correctOption = 0;

        questions[4].statement = "From where م comes ?";
        questions[4].options = new String[]{
                "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                "Inner part of the both lips touch each other",
                "Outer part of both lips touch each other",
                "Rounding both lips and not closing the mouth"
        };
        questions[4].correctOption = 2;

        questions[5].statement = "How many makharaj are there for the letters of Arabic alphabets";
        questions[5].options = new String[]{
                "15",
                "17",
                "12",
                "19"
        };
        questions[5].correctOption = 1;

        questions[6].statement = "What is the most difficult letter to pronounce?";
        questions[6].options = new String[]{
                "Dhaad",
                "Mem",
                "Noon",
                "Khaa"
        };
        questions[6].correctOption = 0;

        questions[7].statement = "What are ج ش ی ?";
        questions[7].options = new String[]{
                "Lahatiyah",
                "Shajariyah-Haafiyah",
                "Halqiyah",
                "Tarfiyah"
        };
        questions[7].correctOption = 1;

        questions[8].statement = "What are ص ز س ?";
        questions[8].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Tarfiyah",
                "Lahatiyahh"
        };
        questions[8].correctOption = 1;

        questions[9].statement = "What is the strongest letter?";
        questions[9].options = new String[]{
                "Taa",
                "Haa",
                "Dal",
                "Jeem"
        };
        questions[9].correctOption = 0;
    }

    public void check(int index){
        if(questions[index].check()) correctCount++;
        else wrongCount++;
    }
}