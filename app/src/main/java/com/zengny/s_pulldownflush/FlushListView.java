package com.zengny.s_pulldownflush;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

/**
 * Created by zengny
 * on 2016/9/12 23:18.
 */
public class FlushListView extends ListView {
    public FlushListView(Context context) {
        super(context);
    }

    public FlushListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FlushListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean performItemClick(View view, int position, long id) {
        return super.performItemClick(view, position, id);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }
}
