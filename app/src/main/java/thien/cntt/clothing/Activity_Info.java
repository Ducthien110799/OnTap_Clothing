package thien.cntt.clothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Info extends AppCompatActivity {
    private TextView tvName;
    private TextView tvPrice;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__info);
        Intent intent = getIntent();
        Bundle bundle= getIntent().getExtras();

        String name= intent.getStringExtra("name");
        String price= intent.getStringExtra("price");
        int img= bundle.getInt("img");

        tvName= findViewById(R.id.tvNameInfo);
        tvPrice= findViewById(R.id.tvPriceInfo);
        imgView= findViewById(R.id.imgInfo);

        tvName.setText(name);
        tvPrice.setText(price);
        imgView.setImageResource(img);

    }
}