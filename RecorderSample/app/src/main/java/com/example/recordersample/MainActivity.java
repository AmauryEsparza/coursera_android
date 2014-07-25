package com.example.recordersample;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.app.Activity;
import android.os.Environment;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by Amaury Esparza on 23/07/2014.
 */
public class MainActivity extends Activity{
    private String outputFile = null;
    private Button start, stop, play;
    private MediaRecorder myAudioRecorder;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button1);
        stop = (Button) findViewById(R.id.button2);
        play = (Button) findViewById(R.id.button3);

        stop.setEnabled(false);
        play.setEnabled(false);

        outputFile = Environment.getExternalStorageDirectory().getAbsolutePath()+"/myrecording.3gp";
        myAudioRecorder = new MediaRecorder();
        myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        myAudioRecorder.setOutputFile(outputFile);
    }

    public void start(View view)
    {
        try{
            myAudioRecorder.prepare();
            myAudioRecorder.start();
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        start.setEnabled(false);
        stop.setEnabled(true);
        Toast.makeText(getApplicationContext(), "Recording Started", Toast.LENGTH_LONG).show();
    }

    public void stop(View view)
    {
        myAudioRecorder.stop();
        myAudioRecorder.release();
        myAudioRecorder = null;
        start.setEnabled(true);
        stop.setEnabled(false);
        Toast.makeText(getApplicationContext(), "Recorder Stop", Toast.LENGTH_LONG).show();
    }

    public void play(View view) throws IOException {
        MediaPlayer m = new MediaPlayer();
        m.setDataSource(outputFile);
        m.prepare();
        m.start();
        Toast.makeText(getApplicationContext(), "Playing audio", Toast.LENGTH_LONG).show();
    }
}
