package com.software.arielb.interactivestory.model;

/**
 * Created by arielb on 12/27/2014.
 */
public class Page {

    private int mImageId;
    private String mName;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal=false;
    public Page(int imageId, String name, Choice choice1, Choice choice2){
        mImageId=imageId;
        mName=name;
        mChoice1=choice1;
        mChoice2=choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page (int imageId, String name){
        mImageId=imageId;
        name=mName;
        mChoice2=null;
        mChoice1=null;
        mIsFinal=true;

    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public int getImageId() {

        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
