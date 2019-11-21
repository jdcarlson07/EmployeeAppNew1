package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddEmployeeClick(View v)
    {
        Intent i = new Intent(this, EmployeeEntryActivity.class);
        Core.myValue = 15;
        this.startActivity(i);

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if(Core.theEmployee != null)
        {
            int size = Core.theEmployees.size() - 1;
            int numEmployees = Core.theEmployees.size();
            Toast.makeText(this, "Received result: " + Core.theEmployees.get(size).toString() + "\n" + "Number of Employees: " + numEmployees, Toast.LENGTH_LONG).show();

        }

    }

    public void onEmployeeListClick(View v)
    {
        Intent i = new Intent(this, EmployeeListActivity.class);
        this.startActivity(i);
    }
}
