package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.recyclerView);

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Margot Robbie","rahulSingh@gmail.com","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSnao54-XbBOOEpa4-eWFsdGJ7MslD7oymP4Vs13VknwbLZNFsA"));
        contacts.add(new Contact("Vijay Kumar","saroyav3@gmail.com","https://humanimals.co.nz/wp-content/uploads/2019/11/blank-profile-picture-973460_640.png"));
        contacts.add(new Contact("Deepak","Deepak@gmail.com","https://humanimals.co.nz/wp-content/uploads/2019/11/blank-profile-picture-973460_640.png"));
        ContactRecViewAdapter adapter = new ContactRecViewAdapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));


    }
}