package com.example.csc250_fall2019_employeemanager;

import java.util.ArrayList;

public class Core
{
    public static Employee theEmployee = null;
    public static int myValue;
    public static ArrayList<Employee> theEmployees = new ArrayList<Employee>();
    public static ArrayList<String> theEmployeeNames = new ArrayList<String>();
    public static int employeeCounter = 0;

    public static void generateNameList()
    {
       while(Core.employeeCounter < Core.theEmployees.size())
        {
            String temp = Core.theEmployees.get(Core.employeeCounter).toString();
            Core.theEmployeeNames.add(temp);
            Core.employeeCounter++;
        }
    }
}
