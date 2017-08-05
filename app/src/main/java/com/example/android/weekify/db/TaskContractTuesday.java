package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractTuesday {
    public static final String DB_NAME_TUESDAY = "com.example.android.weekify.db.tuesday";
    public static final int DB_VERSION_TUESDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}