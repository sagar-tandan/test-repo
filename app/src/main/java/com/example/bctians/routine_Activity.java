package com.example.bctians;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class routine_Activity extends AppCompatActivity {

    private RecyclerView routineRec;
    private DatabaseReference reference;

    private List<routineModel> list;

    private routineAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        routineRec = findViewById(R.id.routineRec);

        reference = FirebaseDatabase.getInstance().getReference().child("ROUTINE");

        getRoutine();
    }

    private void getRoutine() {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list = new ArrayList<>();
                for (DataSnapshot snapshot1 : snapshot.getChildren()){
                    routineModel model = snapshot1.getValue(routineModel.class);
                    list.add(model);
                }

                adapter = new routineAdapter(routine_Activity.this,list);
                routineRec.setLayoutManager(new LinearLayoutManager(routine_Activity.this));
                routineRec.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(routine_Activity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}