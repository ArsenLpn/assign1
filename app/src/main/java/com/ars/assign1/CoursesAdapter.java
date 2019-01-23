package com.ars.assign1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoursesAdapter extends ArrayAdapter<Course> {
    private static final String TAG = "CoursesAdapter";
    private Context mContext;
    int mResource;

    public CoursesAdapter(Context context, int resource, List<Course> objects) {
        super(context, resource, objects);
        this.mContext = context;
        mResource = resource;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String courseName = getItem(position).getCourseTitle();
        String courseAvg = "99";


        //inflater setup
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);


        TextView tvCourse = (TextView) convertView.findViewById(R.id.course_name);
        TextView tvCourseGrade = (TextView) convertView.findViewById(R.id.course_grade);

        tvCourse.setText(courseName);
        tvCourseGrade.setText(courseAvg);

        return convertView;

    }
}
