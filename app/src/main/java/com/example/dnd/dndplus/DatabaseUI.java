package com.example.dnd.dndplus;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DatabaseUI {

    public final static DatabaseReference mydatabase=FirebaseDatabase.getInstance().getReference();
    public final static FirebaseStorage storage = FirebaseStorage.getInstance();
    public final static FirebaseAuth mAuth =FirebaseAuth.getInstance();





}
