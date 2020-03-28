package india.abhijeet.k.sensorsmartkit;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ActivityOptionsCompat options;
    ImageView battery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        battery=findViewById(R.id.main_Battery_card_icon);
    }



    public void goBattery(View view)
    {
        try {
            intent = new Intent(this, BatterySensorActivity.class);
            options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, battery, ViewCompat.getTransitionName(battery));
            startActivity(intent, options.toBundle());
        }
        catch (Exception  es)
        {

            Toast.makeText(this,"ex:-"+es.toString(),Toast.LENGTH_SHORT).show();
        }
    }



}
