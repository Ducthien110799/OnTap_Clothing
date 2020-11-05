package thien.cntt.clothing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ShirtListAdapter shirtListAdapter;
    private ArrayList<Shirt> shirtArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.rcvMain);

        shirtArrayList= new ArrayList<>();
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.a1));
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.b5));
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.a2));
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.a1));
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.b5));
        shirtArrayList.add(new Shirt("Polo","12$",R.drawable.a2));



        shirtListAdapter = new ShirtListAdapter(this, shirtArrayList);
        recyclerView.setAdapter(shirtListAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager= new GridLayoutManager(MainActivity.this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}