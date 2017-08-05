package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractWednesday {
    public static final String DB_NAME_WEDNESDAY = "com.example.android.weekify.db.wednesday";
    public static final int DB_VERSION_WEDNESDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}