package com.ncertguruji.mcqtabbedapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private final String [] chapterNames = {
            "Noun",
            "Pronoun",
            "Adjective",
            "Verb",
            "Adverb",
            "Preposition",
            "Conjunction",
            "Interjection",
            "Summary",
            "Practice",
            "Share",
            "Credits"
    };
    private final String [] chapterDescription = {
            "Noun is a naming word...",
            "It is used in place of noun...",
            "Adjective qualifies noun...",
            "Verb shows an action or...",
            "An Adverb describes verb...",
            "Preposition shows relationship...",
            "A conjunction joins two words...",
            "Interjection is a word or...",
            "One line definitions",
            "Practice Questions",
            "Share this app",
            "Attribute to the artists"

    };
    private final Integer [] imageId = {
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_layout,container,false);
        ListView listView = view.findViewById(android.R.id.list);

        // For populating list data
        customPosListAdapter customCountryList = new customPosListAdapter(getActivity(), chapterNames,chapterDescription, imageId);
        listView.setAdapter(customCountryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

//                Toast.makeText(getApplicationContext(),"You Selected "+chapterNames[position]+ " as Country",Toast.LENGTH_SHORT).show();
                String chapter = chapterNames[position];
                if (chapter.equals("Noun")){
                    Intent intent = new Intent(getActivity().getApplicationContext(),Noun.class);
                    startActivity(intent);
                }
            }
        });
        return view;

    }
}
