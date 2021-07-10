package com.example.noteapp3.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.noteapp3.R;
import com.example.noteapp3.model.TaskModel;

public class FormFragment extends Fragment {

    TextView title, desc;
    Button save;
    TaskModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        initView(view);
        initClickListener(view);
        return view;
    }
    private void initClickListener(View view) {
        String tit= title.getText().toString();
        String des = desc.getText().toString();
        save.setOnClickListener(v -> {
            model = new TaskModel(tit,des);
            NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);
            navController.navigateUp();
        });
    }
    private void initView(View view) {
        title = view.findViewById(R.id.title_et);
        desc = view.findViewById(R.id.desc_ed);
        save = view.findViewById(R.id.btn_save);
    }
}