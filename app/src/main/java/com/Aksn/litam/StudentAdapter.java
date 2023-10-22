package com.Aksn.litam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    ArrayList<StudentItem> StudentItem;
    Context context;

    private OnItemClickListener onitemClickListener;
    public interface OnItemClickListener{
        void onClick(int position);
    }

    public StudentAdapter(Context context, ArrayList <StudentItem> studentItem) {
        this.StudentItem = studentItem;
        this.context = context;
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{
TextView roll;
TextView name;
TextView status;
        public StudentViewHolder(@NonNull View itemView,OnItemClickListener onItemClickListener) {
            super(itemView);
            roll = itemView.findViewById(R.id.roll);
            name = itemView.findViewById(R.id.name);
            status = itemView.findViewById(R.id.status);
            itemView.setOnClickListener(v-> onItemClickListener.onClick(getAdapterPosition()));
        }
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item,parent,false);
        return new StudentViewHolder(itemView,onitemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
       holder.roll.setText(StudentItem.get(position).getRoll());
       holder.name.setText(StudentItem.get(position).getName());
       holder.status.setText(StudentItem.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return StudentItem.size();
    }
}
