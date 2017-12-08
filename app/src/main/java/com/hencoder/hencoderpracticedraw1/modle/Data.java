package com.hencoder.hencoderpracticedraw1.modle;

/**
 * <pre>
 *     author : shortbin
 *     e-mail : xxx@xx
 *     time   : 2017/12/08
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public class Data {

    private int mColor;
    private String mName;
    private float mAngle;

    public Data(int color,String name,float angle){
        mColor=color;
        mName=name;
        mAngle=angle;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public float getAngle() {
        return mAngle;
    }

    public void setAngle(float angle) {
        mAngle = angle;
    }
}
