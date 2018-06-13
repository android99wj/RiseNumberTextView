package com.wj.risenumber.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Hannah on 2018/6/12.
 */

public class RiseNumberTextView extends TextView {

  //时长
  private static final int duration   = 3000;
  private              int fromNumber = 0, endNumber = 1000;

  public RiseNumberTextView(Context context) {
    this(context, null);
  }

  public RiseNumberTextView(Context context,
      @Nullable
          AttributeSet attrs) {
    super(context, attrs);
  }

  public void setData(int fromNumber, int endNumber) {
    this.fromNumber = fromNumber;
    this.endNumber = endNumber;
  }

  /**
   * 开始运行展示
   */
  public void startRunning() {
    ValueAnimator valueAnimator = ValueAnimator.ofInt(fromNumber, endNumber);
    valueAnimator.setDuration(duration);
    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator valueAnimator) {
        String showStr = valueAnimator.getAnimatedValue().toString();
        setText(showStr);
      }
    });
    valueAnimator.start();
  }
}
