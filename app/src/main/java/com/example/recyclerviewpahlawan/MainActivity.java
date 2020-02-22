package com.example.recyclerviewpahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvListPahlawan;
    private ArrayList<PahlawanModel> listPahlawan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListPahlawan = findViewById(R.id.rvListPahlawan);
        rvListPahlawan.setHasFixedSize(true);
        listPahlawan.addAll(PahlawanData.getListData());

        showRecylerList();
    }
    private void showRecylerList(){
        rvListPahlawan.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvListPahlawan.setAdapter(pahlawanAdapter);
    }
}
