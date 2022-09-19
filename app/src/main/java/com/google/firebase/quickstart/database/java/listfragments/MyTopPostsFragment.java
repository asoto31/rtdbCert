package com.google.firebase.quickstart.database.java.listfragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyTopPostsFragment extends PostListFragment {

    final private DatabaseReference mDatabase;

    public MyTopPostsFragment(DatabaseReference databaseReference) {
        super(databaseReference);
        this.mDatabase = databaseReference;
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // My top posts by number of stars
        String myUserId = getUid();
        Query myTopPostsQuery = mDatabase.child("user-posts").child(myUserId);

        return myTopPostsQuery;
    }
}
