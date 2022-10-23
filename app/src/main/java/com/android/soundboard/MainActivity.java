package com.android.soundboard;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private SoundPool soundpool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10;
   boolean loaded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundpool = new SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(1)
                .build();
        sound1 = soundpool.load(this, R.raw.aahshit, 1);
        sound2 = soundpool.load(this, R.raw.aaaaaaaaaa, 1);
        sound3 = soundpool.load(this,R.raw.bonk,1);
        sound4 = soundpool.load(this,R.raw.emotionald,1);
        sound5 = soundpool.load(this,R.raw.fbi,1);
        sound6 = soundpool.load(this,R.raw.whatrudoin,1);
        sound7 = soundpool.load(this,R.raw.whatthedogdoin,1);
        sound8 = soundpool.load(this,R.raw.bruh,1);
        sound9 = soundpool.load(this,R.raw.error,1);
        sound10 = soundpool.load(this,R.raw.hennnnaaaaaa,1);
    }
@SuppressLint("NonConstantResourceId")public void playsound(View v){
        switch (v.getId()){
            case R.id.r1c1:
                soundpool.play(sound1,.99f,.99f,0,0,1);
                break;
            case R.id.r1c2:
                soundpool.play(sound2,.99f,.99f,0,0,1);
                break;
            case R.id.r2c1:
                soundpool.play(sound3,.99f,.99f,0,0,1);
                break;
            case R.id.r2c2:
                soundpool.play(sound4,.99f,.99f,0,0,1);
                break;
            case R.id.r3c1:
                soundpool.play(sound5,.99f,.99f,0,0,1);
                break;
                case R.id.r3c2:
                    soundpool.play(sound6,.99f,.99f,0,0,1);
                    break;
            case R.id.r4c1:
                soundpool.play(sound7,.99f,.99f,0,0,1);
                break;
            case R.id.r4c2:
                soundpool.play(sound8,1,1,0,0,1);
                break;
            case R.id.r5c1:
                soundpool.play(sound9,.99f,.99f,0,0,1);
                break;
            case R.id.r5c2:
                soundpool.play(sound10,.99f,.99f,0,0,1);
                break;
        }
}
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundpool.release();
        soundpool= null;
    }
}