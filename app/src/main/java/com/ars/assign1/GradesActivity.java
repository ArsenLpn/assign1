package com.ars.assign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class GradesActivity extends AppCompatActivity {
    private static final String TAG = "GradesActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);
        ListView myListView = (ListView)findViewById(R.id.Courses_view);

        //create list of courses
        Random rnd = new Random();
        int courseCount = rnd.nextInt(4);
        courseCount++;                                              //lets generate at least one obj.
        ArrayList<Course> mCourses= new ArrayList<>();
        for (int i = 0;i < courseCount; i++)
        {
            mCourses.add(Course.generateRandomCourse());
        }

        CoursesAdapter adapter = new CoursesAdapter(this,R.layout.courses_view,mCourses);
        myListView.setAdapter(adapter);

    }
}
