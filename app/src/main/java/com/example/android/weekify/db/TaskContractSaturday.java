package com.example.android.weekify.db;

import android.provider.BaseColumns;

public class TaskContractSaturday {
    public static final String DB_NAME_SATURDAY = "com.example.android.weekify.db.saturday";
    public static final int DB_VERSION_SATURDAY = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}