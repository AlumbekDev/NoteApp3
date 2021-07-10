package com.example.noteapp3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.noteapp3.R;
import com.example.noteapp3.databinding.FragmentHomeBinding;
import com.example.noteapp3.model.TaskModel;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    HomeAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        initRecycler();
        return binding.getRoot();
    }

    private void initRecycler() {
        adapter = new HomeAdapter();
        binding.rv.setAdapter(adapter);
        adapter.addModel(new TaskModel("title", "desc"));
        adapter.addModel(new TaskModel("title", "desc"));
        adapter.addModel(new TaskModel("title", "desc"));
        adapter.addModel(new TaskModel("title", "desc"));
        adapter.addModel(new TaskModel("title", "desc"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}