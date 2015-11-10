package tab.luseen.com.AndroidTab;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import tab.luseen.com.tab4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar()!=null) {
            getSupportActionBar().setElevation(0);
        }
        ViewPager viewPager=(ViewPager)findViewById(R.id.ViewPager);
        viewPager.setAdapter(new Adapter(getSupportFragmentManager(),MainActivity.this));
        TabLayout tab=(TabLayout)findViewById(R.id.Tablayout);
        tab.setupWithViewPager(viewPager);
    }
}
