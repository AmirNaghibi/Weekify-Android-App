package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractFriday {
    public static final String DB_NAME_FRIDAY = "com.example.android.weekify.db.friday";
    public static final int DB_VERSION_FRIDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}