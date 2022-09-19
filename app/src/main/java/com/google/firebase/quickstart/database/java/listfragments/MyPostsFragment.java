package com.google.firebase.quickstart.database.java.listfragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    final private DatabaseReference mDatabase;

    public MyPostsFragment(DatabaseReference databaseReference) {
        super(databaseReference);
        this.mDatabase = databaseReference;
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return mDatabase.child("user-posts").child(getUid());
    }
}
