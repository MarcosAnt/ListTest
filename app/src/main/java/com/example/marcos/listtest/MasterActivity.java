package com.example.marcos.listtest;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MasterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_master)

        String[] itens = new String[]{"Item 0", "Item 1", "Item 2"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView lv, View v, int position, long id) {
        super.onListItemClick(lv, v, position, id);

        //Obtem o item da lista q foi clicado
        Object obj = this.getListAdapter().getItem(position);
        String item = obj.toString();

        Toast.makeText(this, "Selecionado: " + item, Toast.LENGTH_LONG).show();
    }
}
