package com.cs315.notecardz;

public class Question {
    private int txtId;
    private boolean answer;

    public Question(int txtSign, boolean answerThing)
    {
        txtId = txtSign;
        answer = answerThing;
    }

    public void setTxt(int txtSign)
    {
        txtId = txtSign;
    }

    public void setAnswer(boolean answerThing)
    {
        answer = answerThing;
    }

    public int getTxt()
    {
        return txtId;
    }

    public boolean getAnswer()
    {
        return answer;
    }
}
