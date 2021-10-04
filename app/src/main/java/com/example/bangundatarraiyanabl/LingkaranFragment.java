package com.example.bangundatarraiyanabl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LingkaranFragment extends Fragment {
    private Button btncount3;
    private EditText txt_jari;
    private TextView resultsluas;
    private TextView resultskel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);

        btncount3 = v.findViewById(R.id.btncount3);
        txt_jari = v.findViewById(R.id.txt_jari);
        resultsluas = v.findViewById(R.id.resultsluas);
        resultskel = v.findViewById(R.id.resultskel);

        btncount3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txt_jari.getText().toString();
                if(nilai.isEmpty()){
                    txt_jari.setError("Tidak boleh kosong");
                    txt_jari.requestFocus();

                } else {
                    Double jari = Double.parseDouble(nilai);

                    Double luas = 3.14 * (jari*jari);
                    resultsluas.setText(String.format("%.2f", luas));
                    Double keliling = 2 * 3.14 * jari;
                    resultskel.setText(String.format("%2f", keliling));
                }


            }
        });


        return  v;
    }
}