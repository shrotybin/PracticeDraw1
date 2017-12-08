package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.modle.Data;

import java.util.ArrayList;
import java.util.List;

public class Practice11PieChartView extends View {

    private List<Data> mDataList;
    private Paint mPaint;

    private int mPadding=3;

    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mDataList = new ArrayList<>();
        Data data = new Data(Color.RED, "Lolipop", 120);
        mDataList.add(data);
        Data data1 = new Data(Color.BLUE, "KitKat", 100);
        mDataList.add(data1);
        Data data2 = new Data(Color.GREEN, "Jelly Bean", 40);
        mDataList.add(data2);
        Data data3 = new Data(Color.WHITE, "Ice Cream Sandwich", 19);
        mDataList.add(data3);
        Data data4 = new Data(Color.BLACK, "Gingerbread", 5);
        mDataList.add(data4);
        Data data5 = new Data(Color.GRAY, "Foryo", 5);
        mDataList.add(data5);
        Data data6 = new Data(Color.YELLOW, "Marshmallow", 50);
        mDataList.add(data6);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width=getWidth()/2;
        int height=getHeight()/2;
        int startAngle=-180;

        for (int i = 0; i < mDataList.size(); i++) {
            Data data = mDataList.get(i);
            mPaint.setColor(data.getColor());

            if (i==0){
                canvas.drawArc(width-220,height-220,width+200,height+200,startAngle,data.getAngle(),true,mPaint);
            }else{
                canvas.drawArc(width-200,height-200,width+200,height+200,startAngle,data.getAngle(),true,mPaint);
            }
            startAngle+=data.getAngle()+mPadding;
        }

    }
}
