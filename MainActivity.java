package ph.edu.iicsust.gabriel.kenjiangelo.lab1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTextView = findViewById(R.id.resultTextView);

                int EvenNum = 10;
                int Current = 0;

                for (int i = 1;Current<EvenNum;i++)
                {
                    if (i%2==0)
                    {
                        Current++;
                        resultTextView.append(i + ", ");
                    }
                }
            }
                    });
    }
}
