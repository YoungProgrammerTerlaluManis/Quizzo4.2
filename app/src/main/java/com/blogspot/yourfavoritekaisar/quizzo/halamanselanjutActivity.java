package com.blogspot.yourfavoritekaisar.quizzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class halamanselanjutActivity extends AppCompatActivity {

    @BindView(R.id.tebakzeus)
    ImageView tebakzeus;
    @BindView(R.id.poseidonimg)
    Button poseidonimg;
    @BindView(R.id.zeus)
    Button zeus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanselanjut);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.poseidonimg, R.id.zeus})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.poseidonimg:
                Toast.makeText(this,"Salah Zeus kok jenggot nya pendek",Toast.LENGTH_SHORT).show();
                break;
            case R.id.zeus:
                Intent pindah = new Intent(halamanselanjutActivity.this, tebaknegaraActivity.class);
                startActivity(pindah);
                Toast.makeText(this,"Jago Sekarang Tebak \nBendera Monako",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
