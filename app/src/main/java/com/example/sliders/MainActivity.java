package com.example.sliders;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Tile[] tiles = new Tile[15];
    RelativeLayout mLayout;
    final String TAG = "TROUBLE";
    int cellWidth;
    int[] cellLocations;
    int idBase = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = findViewById(R.id.mLayout);

        initializeLayout();
        createTiles();
    }

   private void initializeLayout() {
        // Setup - get the width of the screen (dm.widthPixels)
        DisplayMetrics dM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(dM);
        // Define the width of a cell to be:
        // width of screen - 5 * 16(padding between buttons) divided by number of buttons across
        cellWidth = (dM.widthPixels - 80) / 4;
        cellLocations = new int[]{16,(cellWidth+32), (2*cellWidth+48), (3*cellWidth+64)};
    }

    private void createTiles() {
        for (int i = 0; i < 15; i++) {
            tiles[i] = new Tile(getParent());
            tiles[i].setId(idBase + i);
            tiles[i].setText(i);
            tiles[i].setOnClickListener(this);
        }
    }


    @SuppressLint("ResourceType")
    @Override
    public void onClick(View v) {
        // Each tile has been assigned an ID of 1001-1016
    }

}