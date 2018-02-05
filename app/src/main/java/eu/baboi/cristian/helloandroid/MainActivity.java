package eu.baboi.cristian.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int pictures[] = {R.drawable.bunny, R.drawable.bed, R.drawable.beaver, R.drawable.dog};
    final int messages[] = {R.string.txt_job, R.string.txt_demand, R.string.txt_education, R.string.txt_future};
    ImageView picture;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.id_message);

        picture = findViewById(R.id.id_animal);
        picture.setImageDrawable(null);
    }
    @Override
    protected void onStart() {
        super.onStart();
        int which_one = 0;
        which_one = (int) Math.floor(Math.random() * 4);

        picture.setImageResource(pictures[which_one]);
        text.setText(messages[which_one]);
    }

    @Override
    protected void onStop() {
        super.onStop();
        picture.setImageDrawable(null);
    }
}

