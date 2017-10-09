package com.example.android.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list_view);

        Song [] songs= new Song[3];
        songs[0]=new Song("Hello","Adele",4);
        songs[1]=new Song("Despacito","Luis France",3);
        songs[2]=new Song("Blank Space","Taylor Swift",5);

        SongArrayAdapter adapter=new SongArrayAdapter(this,R.layout.song_list_item,songs);
        listView.setAdapter(adapter);

    }
}
