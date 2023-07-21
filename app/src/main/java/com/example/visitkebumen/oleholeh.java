package com.example.visitkebumen;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class oleholeh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oleholeh);
//        setupOnBackPressed();
//        return view;

    }

//    private void setupOnBackPressed() {
//        requireActivity().getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback(true){
//            @Override
//            public void handleOnBackPressed() {
//                if (isEnabled()) {
//                    Toast.makeText(requireContext(),"kembali", Toast.LENGTH_SHORT).show();
//                    setEnabled(false);
//                    requireActivity().onBackPressed();
//                }
//            }
//        });
//    }


}