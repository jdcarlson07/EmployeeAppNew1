package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EmployeeListActivity extends AppCompatActivity
{
    TextView list;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        this.list = this.findViewById(R.id.list);
        if(Core.theEmployees.size() > 0)
        {
            int lastItem = Core.theEmployees.size() - 1;
            String stringOfLastObject = Core.theEmployees.get(lastItem).toString();
            list.setText(stringOfLastObject);
        }
    }
}
