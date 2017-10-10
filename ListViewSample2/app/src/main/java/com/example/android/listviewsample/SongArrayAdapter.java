package com.example.android.listviewsample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Shereen on 10/9/2017.
 */

public class SongArrayAdapter extends ArrayAdapter<Song> {
    public SongArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Song[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem=convertView;
        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.song_list_item,parent,false);
        }
        TextView nameTextView=(TextView)listItem.findViewById(R.id.name_text_view);
        TextView artistTextView=(TextView)listItem.findViewById(R.id.artist_text_view);
        TextView durationTextView=(TextView)listItem.findViewById(R.id.duration_text_view);

        Song song=getItem(position);
        nameTextView.setText(song.getName());
        artistTextView.setText(song.getArtist());
        durationTextView.setText(song.getDuration()+"");

        return  listItem;
    }
}
