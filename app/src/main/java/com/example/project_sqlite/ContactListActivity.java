package com.example.project_sqlite;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ContactListActivity extends AppCompatActivity {
    ListView lvContactList;
    ContactAdapter contactAdapter;
    List<Contact> contactList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContactList = (ListView) findViewById(R.id.lvContactList);
//        contactList = new ArrayList<>();

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        contactList = databaseHandler.getAllContacts();

        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.contact_list_item, contactList);
        lvContactList.setAdapter(contactAdapter);
    }
}
