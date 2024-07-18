package com.example.recyclerview;
public  class RecyclerViewItem {
    private  int images;
    private String text1;
    private String text2;
    RecyclerViewItem(int images, String text1, String text2) {
        this.images=images;
        this.text1=text1;
        this.text2=text2;
    }

    public int getImages() {
        return images;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
