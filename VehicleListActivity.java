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
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Josh", "Lightning McQueen", "Race Car", "1","LMQ01", "Radiator Springs", "Piston Cup", "Florida", "25°C", "Full"));
        vehicleList.add(new Vehicle("Mary", "The Mystery Machine", "Van", "2","MM02", "Coolsville", "Haunted Mansion", "Illinois", "22°C", "Half"));
        vehicleList.add(new Vehicle("Steve", "Herbie", "Sedan", "3","HRB03", "Los Angeles", "Racetrack", "California", "23°C", "Low"));
        vehicleList.add(new Vehicle("Anna", "Optimus Prime", "Truck", "4","OPT04", "Cybertron", "Earth", "New York", "24°C", "Full"));
        vehicleList.add(new Vehicle("Mike", "KITT", "Sports Car", "5","KTT05", "Knight Industries", "Mission", "Nevada", "26°C", "Full"));
        vehicleList.add(new Vehicle("Sophia", "Ecto-1", "Wagon", "6","ECT06", "New York", "Ghostbusters HQ", "New York", "20°C", "Half"));
        vehicleList.add(new Vehicle("Jake", "Batmobile", "Sports Car", "7","BTM07", "Gotham City", "Batcave", "Gotham", "21°C", "Low"));
        vehicleList.add(new Vehicle("Linda", "DeLorean", "Sports Car", "8","DLR08", "1985", "2015", "California", "25°C", "Full"));
        vehicleList.add(new Vehicle("Tom", "General Lee", "Coupe", "9","GNL09", "Hazzard County", "Race", "Georgia", "30°C", "Low"));
        vehicleList.add(new Vehicle("Emily", "A-Team Van", "Van", "10","ATV10", "Los Angeles", "Mission", "California", "22°C", "Half"));
        vehicleList.add(new Vehicle("John", "Bumblebee", "Sports Car", "11","BMB11", "Cybertron", "Earth", "Texas", "27°C", "Full"));
        vehicleList.add(new Vehicle("Sarah", "Mach 5", "Race Car", "12","MCH12", "Racetrack", "World Race", "Japan", "19°C", "Low"));
        vehicleList.add(new Vehicle("Daniel", "FAB 1", "Limousine", "13","FAB13", "England", "International Rescue", "London", "18°C", "Half"));
        vehicleList.add(new Vehicle("Grace", "Jurassic Park Jeep", "Jeep", "14","JPJ14", "Isla Nublar", "Visitor Center", "Costa Rica", "29°C", "Low"));
        vehicleList.add(new Vehicle("Alex", "James Bond's Aston Martin", "Sports Car", "15","AM15", "MI6", "Mission", "France", "24°C", "Full"));
        vehicleList.add(new Vehicle("Lucy", "Black Beauty", "Sedan", "16","BBY16", "Century City", "Daily Sentinel", "California", "25°C", "Half"));

        return vehicleList;
    }
}