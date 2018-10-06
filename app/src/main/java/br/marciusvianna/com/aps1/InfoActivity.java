package br.marciusvianna.com.aps1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView TxtName;
    private TextView TxtDescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TxtName = findViewById(R.id.txtname);
        TxtDescription = findViewById(R.id.txtDesc);
        img = findViewById(R.id.infominiature);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Name");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Miniature") ;

        TxtName.setText(Title);
        TxtDescription.setText(Description);
        img.setImageResource(image);
    }
}
