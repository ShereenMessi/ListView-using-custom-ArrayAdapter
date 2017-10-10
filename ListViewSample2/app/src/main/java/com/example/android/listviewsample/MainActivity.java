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

        Song[] songs = new Song[10];
        songs[0] = new Song("Hello", "Adele", "4:13");
        songs[1] = new Song("Despacito", "Luis France", "3:09");
        songs[2] = new Song("Blank Space", "Taylor Swift", "5:29");
        songs[3] = new Song("Mey", "Farmisk", "3:11");
        songs[4] = new Song("Happy","Pharrel Williams","4:09");
        songs[5] = new Song("Papaoutai","Stroame","3:53");
        songs[6] = new Song("The Rains of Castamere","Jackie Evancho","3:39");
        songs[7] = new Song("Yaxsi Olar","Üzeyir Mehdizade","5:59");
        songs[8] = new Song(" Bê To","Bane Şîrwan","4:08");
        songs[9] = new Song("Ma Mallet","Sariya Alsawwas","4:10");

        SongArrayAdapter adapter = new SongArrayAdapter(this, R.layout.song_list_item, songs);
        listView.setAdapter(adapter);

    }
}
