package com.example.loggo.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.fragment.NavHostFragment;

import com.example.loggo.R;

public class CategoryFragment extends Fragment implements View.OnClickListener {

    private CategoryViewModel categoryViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel =
                ViewModelProviders.of(this).get(CategoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_category, container, false);

        // Set OnClick Listener for all the buttons
        root.findViewById(R.id.button_tv).setOnClickListener(this);

        return root;
    }

    public void onClick(View v) {
        // Set Backlog to be loaded to button pressed
        switch (v.getId()) {
            // TODO: all the buttons
            case R.id.button_tv:
                // TODO
                break;
        }

        // Navigate to library fragment
        NavHostFragment.findNavController(this).navigate(R.id.action_navigation_category_to_navigation_library);
    }
}

/* TODO: button listener & navcontroller
*        sends user to library fragment
*        sends button selected data
*        get rid of back button?
*        on normal startup, library is loaded
*        on first load, open category */