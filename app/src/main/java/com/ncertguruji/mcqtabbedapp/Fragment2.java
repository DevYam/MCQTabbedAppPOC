package com.ncertguruji.mcqtabbedapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    RadioGroup radioGroup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        Button button = view.findViewById(R.id.nfButton);
        Button buttonCheck = view.findViewById(R.id.check);
        radioGroup = view.findViewById(R.id.skyColor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hey there", Toast.LENGTH_SHORT).show();
            }
        });

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId()==R.id.blue){
                    Toast.makeText(getActivity().getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    RadioButton correctRadioButton = view.findViewById(R.id.blue);
                    correctRadioButton.setBackgroundColor(getResources().getColor(R.color.green));
                }
                else {
                    Toast.makeText(getActivity().getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
