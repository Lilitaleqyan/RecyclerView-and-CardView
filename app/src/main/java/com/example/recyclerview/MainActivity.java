package com.example.recyclerview;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ArrayList<RecyclerViewItem> items=new ArrayList<>();
       items.add(new RecyclerViewItem(R.drawable.baseline_access_time_24, "LearningTime", "Computer"));
       items.add(new RecyclerViewItem(R.drawable.baseline_access_alarm_24, "TimeEat", "Pizza"));
       items.add(new RecyclerViewItem(R.drawable.baseline_access_time_24, "TimePhone", "Phone"));
      recyclerView=findViewById(R.id.recyclerview);
      recyclerView.setHasFixedSize(true);
      adapter=new RecyclerViewAdapter(items);
      layoutManager=new LinearLayoutManager(this);
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(layoutManager);

    }
}

