package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractThursday {
    public static final String DB_NAME_THURSDAY = "com.example.android.weekify.db.thursday";
    public static final int DB_VERSION_THURSDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}