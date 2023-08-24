package com.example.fleetmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VehicleDetailsActivity extends AppCompatActivity {

    private ImageView vehicleImage;
    private TextView vehicleName, vehicleType, vehicleNumber, vehicleSource, vehicleDestination,
            vehicleCurrentLocation, vehicleStockTemperature, vehicleFuelLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_details);

        setViewIds();
        Intent intent = getIntent();
        Vehicle vehicle = (Vehicle) intent.getSerializableExtra("vehicle");
        // Assuming you have a method to set the image
        setVehicleImage(vehicleImage, vehicle);
        vehicleName.setText(vehicle.getName());
        vehicleType.setText(vehicle.getType());
        vehicleNumber.setText(vehicle.getNumber());
        vehicleSource.setText(vehicle.getSource());
        vehicleDestination.setText(vehicle.getDestination());
        vehicleCurrentLocation.setText(vehicle.getCurrentLocation());
        vehicleStockTemperature.setText(vehicle.getGoodsTemperature());
        vehicleFuelLevel.setText(vehicle.getFuelStatus());
    }

    private void setViewIds() {
        vehicleImage = findViewById(R.id.vehicleImage);
        vehicleName = findViewById(R.id.vehicleName);
        vehicleType = findViewById(R.id.vehicleType);
        vehicleNumber = findViewById(R.id.vehicleNumber);
        vehicleSource = findViewById(R.id.vehicleSource);
        vehicleDestination = findViewById(R.id.vehicleDestination);
        vehicleCurrentLocation = findViewById(R.id.vehicleCurrentLocation);
        vehicleStockTemperature = findViewById(R.id.vehicleGoodsTemperature);
        vehicleFuelLevel = findViewById(R.id.vehicleFuelStatus);
    }

    private void setVehicleImage(ImageView imageView, Vehicle vehicle) {
        // Code to set the image, depending on how you handle images
    }
}
