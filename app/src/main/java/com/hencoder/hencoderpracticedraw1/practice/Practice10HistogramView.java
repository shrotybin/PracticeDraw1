package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private String[] mStrings;
    private int[] mHeight;
    private float height=500;
    private float width;
    private int mPadding=20;
    private int itemWidth=80;

    float lastPositiot=100+mPadding;


    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint=new Paint();
        mStrings=new String[]{"Froyo","GB","ICS","JB","KitKat","L","M"};
        mHeight=new int[]{10,20,20,100,150,200,150};

        width=itemWidth*(mStrings.length)+(mStrings.length+1)*mPadding;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(100,100,100,height+100,mPaint);
        canvas.drawLine(100,height+100,width+100,height+100,mPaint);



        for (int i = 0; i < mStrings.length; i++) {
            mPaint.setColor(Color.GREEN);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(lastPositiot,height+100-mHeight[i],100+mPadding*(i+1)+itemWidth*(i+1),height+100,mPaint);

            mPaint.setColor(Color.WHITE);
            mPaint.setTextSize(25);
            canvas.drawText(mStrings[i], (float) (lastPositiot+itemWidth*0.3),height+150,mPaint);

            lastPositiot=100+mPadding*(i+2)+itemWidth*(i+1);
        }
    }
}
