package com.example.bangundatarraiyanabl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegitigaFragment extends Fragment {
    private EditText txt_alas,txt_tinggi;
    private Button btnCount2;
    private TextView resultsluas,resultskel;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        txt_alas= v.findViewById(R.id.txt_alas);
        txt_tinggi= v.findViewById(R.id.txt_tinggi);
        btnCount2= v.findViewById(R.id.btnCount2);
        resultsluas= v.findViewById(R.id.resultsluas);
        resultskel= v.findViewById(R.id.resultskel);

        btnCount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if(nilai1.isEmpty()){
                    txt_alas.setError("Tidak boleh kosong");
                    txt_tinggi.requestFocus();

                } else if (nilai2.isEmpty()){
                    txt_alas.setError("Tidak boleh kosong");
                    txt_tinggi.requestFocus();
                }

                else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);


                    Double luas = 0.5 * alas*tinggi;
                    resultsluas.setText(String.format("%.2f", luas));
                    Double keliling = 3 * alas;
                    resultskel.setText(String.valueOf(keliling));

                }


            }
        });


        return v;
    }
}