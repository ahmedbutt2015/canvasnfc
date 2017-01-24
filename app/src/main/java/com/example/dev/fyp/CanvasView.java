package com.example.dev.fyp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.dev.fyp.Helper.TagPosition;

/**
 * Created by dev on 8/26/16.
 */
public class CanvasView extends View {

    Paint paint = new Paint();
    public CanvasView(Context context) {
        super(context);
    }

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        paint.setColor(Color.RED);
        int [] temp = TagPosition.getXYAxis(NfcActivity.text);
        canvas.drawCircle(temp[0],temp[1],10,paint);

    }
}
