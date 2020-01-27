package soft.gen.demonestedscrollrv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerticalViewPager viewPager = findViewById(R.id.card_view);
        viewPager.setAdapter(new SlidePageAdapter(this));
    }
}
