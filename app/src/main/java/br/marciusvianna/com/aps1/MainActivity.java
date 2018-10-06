package br.marciusvianna.com.aps1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Info> ListaInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaInfo = new ArrayList<>();
        ListaInfo.add(new Info("Alaska", "A dog mais pateta do mundo",R.drawable.lala1));

        ListaInfo.add(new Info("Google", "O buscador mais famoso",R.drawable.lala2));

        ListaInfo.add(new Info("Lalá", "Melhor companheira <3",R.drawable.lala3));

        ListaInfo.add(new Info("Estilosa", "Muito gata essa cachorra",R.drawable.lala4));

        ListaInfo.add(new Info("Rsrs", "Rsrsrsrsrsrsrsrs",R.drawable.lala5));

        ListaInfo.add(new Info("Chico?", "??????",R.drawable.chico));

        ListaInfo.add(new Info("Laladra", "Perdeu dogão",R.drawable.laladra));

        ListaInfo.add(new Info("<3", "<3",R.drawable.alaska));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, ListaInfo);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}