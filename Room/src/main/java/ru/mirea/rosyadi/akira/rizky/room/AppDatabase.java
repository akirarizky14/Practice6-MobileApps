package ru.mirea.rosyadi.akira.rizky.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract Employee1 employee1();
}