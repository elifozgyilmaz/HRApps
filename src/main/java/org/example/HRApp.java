package org.example;

public class HRApp
{
    public static void main(String[] args) {
    Department department1=new Department();
    Department department2=new Department();
    Department department3=new Department();

    department1.Name="HR";
    department1.Employee="Elif Yılmaz";

    department2.Name="IT";
    department2.Employee="Uğur Uzun";

    department3.Name="Marketing";
    department3.Employee="Zeynep Çelik";

    department1.getEmployee();
    department2.getEmployee();
    department3.getEmployee();
    }
}