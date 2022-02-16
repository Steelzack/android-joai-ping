package org.jesperancinha.ping;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.steelzack.ping.R;

public class MainActivity extends FragmentActivity {

    private ViewPager pingPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pingPager = (ViewPager) findViewById(R.id.ping_pager);
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        pingPager.setAdapter(swipeAdapter);
        getActionBar().setTitle(R.string.app_name);
    }
}
