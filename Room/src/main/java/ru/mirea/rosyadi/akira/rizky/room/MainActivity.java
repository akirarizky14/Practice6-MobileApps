package ru.mirea.rosyadi.akira.rizky.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        Employee1 employee1 = db.employee1();
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "John Smith";
        employee.salary = 10000;

        employee1.insert(employee);

        List<Employee> employees = employee1.getAll();

        employee = employee1.getById(1);

        employee.salary = 20000;
        employee1.update(employee);
        Log.d(TAG, employee.name + " " + employee.salary);
    }
}