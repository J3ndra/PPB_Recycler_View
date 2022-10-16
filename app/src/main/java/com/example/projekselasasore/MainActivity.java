package com.example.projekselasasore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.projekselasasore.adapter.MenuAdapter;
import com.example.projekselasasore.model.MenuModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MenuModel> modelArrayList = new ArrayList<>();
    RecyclerView recyclerView_menu;

    int gambarMenu[] = {
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
            R.drawable.menu7,
            R.drawable.menu8,
            R.drawable.menu9
    };

    String namaMenu[] = {
            "Nasi Goreng",
            "Soto Madura",
            "Ayam Goreng",
            "Nasi Kuning",
            "Nasi Rames",
            "Nasi Gudeg",
            "Soto Sapi",
            "Bubur Ayam",
            "Bakso Sapi"
    };

    String hargaMenu[] = {
            "17000",
            "18000",
            "22000",
            "14000",
            "12000",
            "13000",
            "15000",
            "12000",
            "17000",
    };

    String satuanMenu[] = {
            "Piring",
            "Mangkok",
            "Ekor",
            "Pincuk",
            "Piring",
            "Pincuk",
            "Mangkok",
            "Mangkok",
            "Mangkok"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_menu = findViewById(R.id.rv_menu);

        baca_menu_makanan();

        MenuAdapter menuAdapter = new MenuAdapter(modelArrayList, this);
        recyclerView_menu.setAdapter(menuAdapter);
        recyclerView_menu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void baca_menu_makanan() {
        for(int i=0; i<namaMenu.length; i++) {
            modelArrayList.add(new MenuModel(
                    namaMenu[i],
                    hargaMenu[i],
                    satuanMenu[i],
                    gambarMenu[i]
            ));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pilihan, menu);
        return super.onCreateOptionsMenu(menu);
    }
}