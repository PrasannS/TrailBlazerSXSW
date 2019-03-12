package stringcheesedevs.android.apps.com.trailblazer;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;

import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;

public class CustomAutoCompleteTextChangedListener implements TextWatcher {

    public static final String TAG = "CustomAutoCompleteTextChangedListener.java";
    Context context;

    public CustomAutoCompleteTextChangedListener(Context context){
        this.context = context;
    }

    @Override
    public void afterTextChanged(Editable s) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
                                  int after) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTextChanged(CharSequence userInput, int start, int before, int count) {

        // if you want to see in the logcat what the user types
        Log.e("tag", "User input: " + userInput);

        Dashboard dashboard = ((Dashboard) context);

        // query the database based on the user input
        dashboard.item = dashboard.getItemsFromDb(userInput.toString());

        // update the adapater
        dashboard.myAdapter.notifyDataSetChanged();
        dashboard.myAdapter = new ArrayAdapter<String>(dashboard, android.R.layout.simple_dropdown_item_1line, dashboard.item);
        dashboard.myAutoComplete.setAdapter(dashboard.myAdapter);

    }
}
