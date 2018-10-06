package com.example.louisedanielledeve.widgets;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastBtn = (Button) findViewById(R.id.toastBtn);
        Button snackbarBtn = (Button) findViewById(R.id.snackbarBtn);
        Button snackbaractBtn = (Button) findViewById(R.id.snackbaractBtn);

        toastBtn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String message = "Sending...";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();

            }

        });
        snackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_Layout_id);
                String message = "Snackbar Message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });
        snackbaractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_Layout_id);
                String message = "Snackbar message with Action";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbaract(view, message, duration);
            }


        });


    }
    public void showSnackbar(View view,String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }

    public void showSnackbaract(View view, String message, int duration)
    {
        final  Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });

        snackbar.show();

    }
}






