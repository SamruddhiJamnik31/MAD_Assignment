package com.example.circularprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircularProgressView extends View {

    private Paint backgroundPaint;
    private Paint progressPaint;
    private Paint textPaint;

    private int progress = 0;

    // Constructor 1 (IMPORTANT)
    public CircularProgressView(Context context) {
        super(context);
        init();
    }

    // Constructor 2 (IMPORTANT)
    public CircularProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    // Initialize paints
    private void init() {
        backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.LTGRAY);
        backgroundPaint.setStyle(Paint.Style.STROKE);
        backgroundPaint.setStrokeWidth(20);
        backgroundPaint.setAntiAlias(true);

        progressPaint = new Paint();
        progressPaint.setColor(Color.parseColor("#4CAF50"));
        progressPaint.setStyle(Paint.Style.STROKE);
        progressPaint.setStrokeWidth(20);
        progressPaint.setStrokeCap(Paint.Cap.ROUND);
        progressPaint.setAntiAlias(true);

        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(60);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);

        int stroke = 20;
        int radius = size / 2 - stroke;

        int cx = width / 2;
        int cy = height / 2;

        // Draw background circle
        canvas.drawCircle(cx, cy, radius, backgroundPaint);

        // Draw progress arc
        float sweepAngle = (progress / 100f) * 360;
        canvas.drawArc(cx - radius, cy - radius, cx + radius, cy + radius,
                -90, sweepAngle, false, progressPaint);

        // Draw text
        canvas.drawText(progress + "%", cx, cy + 20, textPaint);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate(); // refresh view
    }
}