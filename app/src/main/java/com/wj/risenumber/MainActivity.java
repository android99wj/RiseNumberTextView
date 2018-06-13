package com.wj.risenumber;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.risenumber.views.RiseNumberTextView;

public class MainActivity extends AppCompatActivity {

  @InjectView(R.id.rtv)
  RiseNumberTextView rtv;

  private Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
    context = this;
    rtv.startRunning();
  }
}
