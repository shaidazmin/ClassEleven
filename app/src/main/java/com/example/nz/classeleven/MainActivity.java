package com.example.nz.classeleven;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.buttn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // set Title .....

                alertDialog.setTitle(R.string.titel);

                // set Message ......
                alertDialog.setMessage(R.string.msg);

                //  set message ....
                alertDialog.setIcon(R.drawable.icon);

                // set Positive Button ..

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(MainActivity.this,"Okay",Toast.LENGTH_SHORT).show();

                    }
                });

                alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Cancled",Toast.LENGTH_SHORT).show();
                    }
                });


                    ///alert dilog show  code .....

                AlertDialog alertDialogShow = alertDialog.create();
                alertDialogShow.show();



            }

        });





    }
}
