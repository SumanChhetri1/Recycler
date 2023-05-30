package com.example.recycler;

public class MyData {
    private String title;
    private String discription;
    private int img;

    public MyData(String title,String discription,int img){

        this.title=title;
        this.discription=discription;
        this.img=img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
