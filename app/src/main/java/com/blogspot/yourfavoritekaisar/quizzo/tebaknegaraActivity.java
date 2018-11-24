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

public class tebaknegaraActivity extends AppCompatActivity {

    @BindView(R.id.tebakindo)
    ImageView tebakindo;
    @BindView(R.id.benderaindo)
    Button benderaindo;
    @BindView(R.id.benderamona)
    Button benderamona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebaknegara);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.benderaindo, R.id.benderamona})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.benderaindo:
                Intent pindah = new Intent(tebaknegaraActivity.this, statemantActivity.class);
                startActivity(pindah);
                Toast.makeText(this,"Ini mah gampang",Toast.LENGTH_SHORT).show();
                break;
            case R.id.benderamona:
                Toast.makeText(this,"masa bendera indo salah \nUlang SD dulu kocak",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
