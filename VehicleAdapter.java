package com.example.fleetmanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {
    private ArrayList<Vehicle> vehicleList;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    private OnItemClickListener mListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public VehicleAdapter(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vehicle, parent, false);
        return new VehicleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        Vehicle vehicle = vehicleList.get(position);
        // Assuming you have a method to set the image
        setVehicleImage(holder.vehicleImage, vehicle);
        holder.vehicleName.setText(vehicle.getName());
        holder.vehicleType.setText(vehicle.getType());
        // Repeat for other attributes
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class VehicleViewHolder extends RecyclerView.ViewHolder {
        ImageView vehicleImage;
        TextView vehicleName;
        TextView vehicleType;
        // Declare other TextViews for other attributes

        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            vehicleImage = itemView.findViewById(R.id.vehicleImage);
            vehicleName = itemView.findViewById(R.id.vehicleName);
            vehicleType = itemView.findViewById(R.id.vehicleType);
            // Initialize other TextViews for other attributes

            itemView.setOnClickListener(v -> {
                if (mListener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        mListener.onItemClick(position);
                    }
                }
            });
        }
    }

    private void setVehicleImage(ImageView imageView, Vehicle vehicle) {
        // Code to set the image, depending on how you handle images
    }
}
