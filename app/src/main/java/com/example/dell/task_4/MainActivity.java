package com.example.dell.task_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String SEX="sex";
    private final static String AGE="age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names={"张三","李四","王五"};
        String[] sexs={"男","女","男"};
        String[] ages={"19","21","20"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<names.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME,names[i]);
            item.put(SEX,sexs[i]);
            item.put(AGE,ages[i]);
            items.add(item);
        }
        SimpleAdapter adpter=new SimpleAdapter(this,items,R.layout.item,new
        String[]{NAME,SEX,AGE},new int[]{R.id.txtName,R.id.txtSex,R.id.txtAge});

        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adpter);
    }
}
