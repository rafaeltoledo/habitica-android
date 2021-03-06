package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.tasks.Task;

import android.content.Context;
import android.content.Intent;


public class DailiesListFactory extends TaskListFactory {
    public DailiesListFactory(Context context, Intent intent) {
        super(context, intent, Task.TYPE_DAILY, R.layout.widget_dailies_list_row, R.id.dailies_text);
    }
}