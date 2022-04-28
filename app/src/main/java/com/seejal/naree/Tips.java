package com.seejal.naree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Tips extends AppCompatActivity {
    private TextView text1;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        text1 = findViewById(R.id.textview1);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tips.this);
                builder.setMessage("1.Let someone know where you’re going.\n" +
                        "2.Distribute your money in your belongings.\n" +
                        "3.Read up on the place you are visiting for any security issues.\n" +
                        "4.Respect the culture you’re in and dress appropriately.")
                        .setPositiveButton("ok",null);

                AlertDialog alert= builder.create();
                alert.show();
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tips.this);
                builder.setMessage("They must have all the emergency numbers with them and Whatsapp also if possible so that they can immediately tell their family members and police.")
                        .setPositiveButton("ok",null);

                AlertDialog alert= builder.create();
                alert.show();
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tips.this);
                builder.setMessage("Self-defense techniques are the first and foremost thing to which each and every woman must be aware of and get proper self-defense training for their safety. They must be aware of some effective defense techniques such as kicks to the groin, blocking punches, etc.")
                        .setPositiveButton("ok",null);

                AlertDialog alert= builder.create();
                alert.show();
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tips.this);
                builder.setMessage("Pepper spray can also be proved as a useful self-defense tool however it has a drawback that some people cannot be harmed through it even after full-face spray.")
                        .setPositiveButton("ok",null);

                AlertDialog alert= builder.create();
                alert.show();
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tips.this);
                builder.setMessage("Care for a pet. While nothing can replace the human connection,...\n" +
                        "Keep stress in check...\n" +
                        "Practice relaxation techniques. A daily relaxation practice can help relieve symptoms of depression,...\n" +
                        "Not skipping meals. Going too long between meals can make you feel irritable and tired,...")
                        .setPositiveButton("ok",null);

                AlertDialog alert= builder.create();
                alert.show();
            }

        });
    }
}