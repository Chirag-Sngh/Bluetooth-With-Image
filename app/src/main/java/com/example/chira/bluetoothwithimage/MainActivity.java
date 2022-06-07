package com.example.chira.bluetoothwithimage;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    BluetoothAdapter ba;
    private boolean bluet=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib=(ImageButton)findViewById(R.id.imageButton);
        ba=BluetoothAdapter.getDefaultAdapter();
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bluet==false)
                {
                    ba.enable();
                    ib.setImageResource(R.drawable.wof);
                }
                else
                {
                    ba.disable();
                    ib.setImageResource(R.drawable.won);
                }
            }
        });

    }
}
