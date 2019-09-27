package com.example.loadmylist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loadmylist.R;
import com.example.loadmylist.Utils;
import com.example.loadmylist.model.Animal;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private List<Animal> animalList;

    public AnimalAdapter(List<Animal> animalList) {
        this.animalList = animalList;
    }
    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.animal_item,
                parent,
                false
        );

        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);


        holder.name.setText(animal.getName());


        holder.type.setText(animal.getType());

        holder.legCount.setText(String.valueOf(animal.getLegCount()));

        holder.isAdult.setText(String.valueOf(animal.isAdult()));

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY", Locale.US);

        Date date = animal.getDateOfAdoption();

        String adopt = formatter.format(date);

        holder.date.setText(adopt);

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder{
       TextView name;
       TextView type;
       TextView legCount;
       TextView isAdult;
       TextView date;


        AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);

            type = itemView.findViewById(R.id.tv_type);

            legCount = itemView.findViewById(R.id.tv_leg_count);

            isAdult = itemView.findViewById(R.id.tv_is_adult);

            date = itemView.findViewById(R.id.tv_date_of_adoption);

        }
    }
}
