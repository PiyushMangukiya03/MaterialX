package com.material.components.activity.player;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.material.components.R;
import com.material.components.utils.Tools;

public class PlayerMusicGenreImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_music_genre_image);
    }

    public void genreClick(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            b.setSelected(!b.isSelected());
//            if (b.isSelected()){
//                Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();
//            }else {
//                Toast.makeText(this, "Unselect", Toast.LENGTH_SHORT).show();
//            }
        }
    }
}
