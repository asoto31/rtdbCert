package com.google.firebase.quickstart.database.java.listfragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class RecentPostsFragment extends PostListFragment {

    final private DatabaseReference mDatabase;

    public RecentPostsFragment(DatabaseReference databaseReference) {
        super(databaseReference);
        this.mDatabase = databaseReference;
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query recentPostsQuery = mDatabase.child("posts");
        // [END recent_posts_query]

        return recentPostsQuery;
    }
}
