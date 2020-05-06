package si.uni_lj.fri.lrk.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import si.uni_lj.fri.lrk.viewmodeldemo.ui.viewmodeldemo.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_demo_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
