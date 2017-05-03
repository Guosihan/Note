package com.example.gsh.note;

/**
 * Created by gsh on 2017/5/3.
 */

public class NoteData {
     String CreatTime;
     String ChangeTime;
     String Content;
     String Title;
     String SecondTitle;

    public String getCreatTime() {
        return CreatTime;
    }

    public void setCreatTime(String creatTime) {
        CreatTime = creatTime;
    }

    public String getChangeTime() {
        return ChangeTime;
    }

    public void setChangeTime(String changeTime) {
        ChangeTime = changeTime;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSecondTitle() {
        return SecondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        SecondTitle = secondTitle;
    }
}
