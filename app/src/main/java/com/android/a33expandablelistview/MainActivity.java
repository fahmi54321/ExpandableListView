package com.android.a33expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> list;
    private HashMap<String,List<String>> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         listView = (ExpandableListView) findViewById(R.id.listview);
         initData();
         listAdapter = new Adapter(this,list,hashMap);
         listView.setAdapter(listAdapter);
    }

    private void initData() {
        list = new ArrayList<>();
        hashMap = new HashMap<>();

        list.add("Kotlin");
        list.add("Java");
        list.add("Flutter");
        list.add("Xamarin");

        List<String> peminatKotlin = new ArrayList<>();
        peminatKotlin.add("Fahmi Abdul Aziz");

        List<String> peminatJava = new ArrayList<>();
        peminatJava.add("Fahmi");
        peminatJava.add("Abdul");
        peminatJava.add("Aziz");

        List<String> peminatFlutter = new ArrayList<>();
        peminatFlutter.add("Fitria");
        peminatFlutter.add("Alya");
        peminatFlutter.add("Putri");

        List<String> peminatXamarin = new ArrayList<>();
        peminatXamarin.add("Muhammad");
        peminatXamarin.add("Ega");
        peminatXamarin.add("Dermawan");


        hashMap.put(list.get(0),peminatKotlin);
        hashMap.put(list.get(1),peminatJava);
        hashMap.put(list.get(2),peminatFlutter);
        hashMap.put(list.get(3),peminatXamarin);

    }
}