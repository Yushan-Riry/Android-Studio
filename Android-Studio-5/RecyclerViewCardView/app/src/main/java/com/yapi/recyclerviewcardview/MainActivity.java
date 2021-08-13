package com.yapi.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Hyukjae", "Surabaya"));
        siswaList.add(new Siswa("Eko", "Sidoarjo"));
        siswaList.add(new Siswa("Eka", "Jakarta"));
        siswaList.add(new Siswa("Gustiwana", "Bandung"));
        siswaList.add(new Siswa("Reggie", "Manado"));
        siswaList.add(new Siswa("Norman", "Aceh"));
        siswaList.add(new Siswa("Emry", "Malang"));
        siswaList.add(new Siswa("Yuki", "Yogyakarta"));
        siswaList.add(new Siswa("Yuko", "Semarang"));
        siswaList.add(new Siswa("Sehun", "Batu"));
        siswaList.add(new Siswa("Taeyong", "Surabaya"));
        siswaList.add(new Siswa("Ten", "Waru"));
        siswaList.add(new Siswa("Taemin", "Mojokerto"));
        siswaList.add(new Siswa("Heeseung", "Jombang"));
        siswaList.add(new Siswa("Jackson", "Surabaya"));
        siswaList.add(new Siswa("Lee Yeon", "Riau"));
        siswaList.add(new Siswa("Lee Rang", "Papua"));
        siswaList.add(new Siswa("Eunhyuk", "Sukodono"));
        siswaList.add(new Siswa("Soobin", "Malang"));
        siswaList.add(new Siswa("Chani", "Jakarta"));
        siswaList.add(new Siswa("Hyukjae", "Surabaya"));
        siswaList.add(new Siswa("Hyukjae", "Surabaya"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("LEE HYUKJAE", "BALI"));
        adapter.notifyDataSetChanged();
    }
}