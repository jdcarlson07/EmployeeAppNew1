package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class EmployeeListActivity extends AppCompatActivity
{

    ListView employeeList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);


        this.employeeList = this.findViewById(R.id.employeeLV);

        if(Core.theEmployees.size() > 0)
        {
            Core.generateNameList();
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Core.theEmployeeNames);
            this.employeeList.setAdapter(adapter);
        }
    }
}
