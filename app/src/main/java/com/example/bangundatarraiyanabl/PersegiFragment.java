package com.example.bangundatarraiyanabl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiFragment extends Fragment {
    private Button btnCount;
    private EditText txt_sisi;
    private TextView resultsluas;
    private TextView resultskel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        btnCount = v.findViewById(R.id.btnCount);
        txt_sisi = v.findViewById(R.id.txt_sisi);
        resultsluas = v.findViewById(R.id.resultsluas);
        resultskel = v.findViewById(R.id.resultskel);


        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_sisi.getText().toString();

                if(nilai.isEmpty()){
                    txt_sisi.setError("Tidak boleh kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer luas = sisi*sisi;
                    Integer keliling =4*sisi;
                    resultsluas.setText(String.valueOf(luas));
                    resultskel.setText(String.valueOf(keliling));
                }


            }
        });




        return v;
    }
}