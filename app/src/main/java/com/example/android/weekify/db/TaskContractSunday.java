package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractSunday {
    public static final String DB_NAME_SUNDAY = "com.example.android.weekify.db.sunday";
    public static final int DB_VERSION_SUNDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}