package com.blinkedge.quizapplication

object Constants
{

    fun  getQuestion() : ArrayList<Question>{
        val questionList = ArrayList<Question>();

        val ques1 = Question(
            1,
            "What Contry does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argintenia",
            "Austrilla",
            "Armenia",
            "Austria",
            1
        );
         questionList.add(ques1);

        val ques2 = Question(
            2,
            "What Contry does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argintenia",
            "Austrilla",
            "Armenia",
            "Austria",
            2
        );
        questionList.add(ques2);


        val ques3 = Question(
            3,
            "What Contry does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argintenia",
            "Austrilla",
            "Belgium",
            "Austria",
            3
        );
        questionList.add(ques3);


        val ques4 = Question(
            4,
            "What Contry does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Austrilla",
            "Armenia",
            "Austria",
            1
        );
        questionList.add(ques4);
        return questionList;

    }
}