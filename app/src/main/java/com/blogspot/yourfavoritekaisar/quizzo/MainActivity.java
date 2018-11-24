package com.blogspot.yourfavoritekaisar.quizzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.salah)
    Button salah;
    @BindView(R.id.benar)
    Button benar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.salah, R.id.benar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.salah:
                Toast.makeText(this,"salah cuk",Toast.LENGTH_SHORT).show();
                break;
            case R.id.benar:
                Intent pindah = new Intent(MainActivity.this, halamanselanjutActivity.class);
                startActivity(pindah);
                Toast.makeText(this,"Tebak gambar",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
