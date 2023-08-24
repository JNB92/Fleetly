package com.example.fleetmanagement;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.Toast;
public class VehicleListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private VehicleAdapter vehicleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_list);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Vehicle> vehicleList = generateDummyData();
        vehicleAdapter = new VehicleAdapter(vehicleList);
        recyclerView.setAdapter(vehicleAdapter);
        vehicleAdapter.setOnItemClickListener(position -> {
            Vehicle selectedVehicle = vehicleList.get(position);
            Intent intent = new Intent(VehicleListActivity.this, VehicleDetailsActivity.class);
            intent.putExtra("vehicle", selectedVehicle);
            startActivity(intent);
        });
    }

    private ArrayList<Vehicle> generateDummyData() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        vehicleList.add(new Vehicle("Lightening Mcqueen", "Race car", "32", "Mqueensville","Piston Cup", "Bum fuck", "25", "Low"));
        return vehicleList;
    }
}