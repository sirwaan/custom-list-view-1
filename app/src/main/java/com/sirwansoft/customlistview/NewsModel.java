package com.sirwansoft.customlistview;

public class NewsModel {
    public int inageName;
    public String titleName;

    public NewsModel() {
    }

    public NewsModel(int inageName, String titleName) {
        this.inageName = inageName;
        this.titleName = titleName;
    }

    public int getInageName() {
        return inageName;
    }

    public void setInageName(int inageName) {
        this.inageName = inageName;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
}
