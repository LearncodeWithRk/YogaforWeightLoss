package in.brandvidiya.yogaforweightloss.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.brandvidiya.yogaforweightloss.R;
import in.brandvidiya.yogaforweightloss.more.Calculate_page;
import in.brandvidiya.yogaforweightloss.more.Calendar_page;
import in.brandvidiya.yogaforweightloss.more.Reminders_page;
import in.brandvidiya.yogaforweightloss.more.chart_page;
import in.brandvidiya.yogaforweightloss.more.feedback_page;
import in.brandvidiya.yogaforweightloss.more.human_body;
import in.brandvidiya.yogaforweightloss.more.setting_page;


public class moreFragment extends Fragment {

TextView Reminders,Calendar,Calculate,body_pro,feedback,setting,chart;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_more, container, false);
        context = view.getContext();

        setting = view.findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), setting_page.class);
                startActivity(intent);
            }
        });



        chart = view.findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), chart_page.class);
                startActivity(intent);
            }
        });
        Reminders = view.findViewById(R.id.Reminders);
        Reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), Reminders_page.class);
                startActivity(intent);
            }
        });
        Calendar = view.findViewById(R.id.Calendar);
        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), Calendar_page.class);
                startActivity(intent);
            }
        });

        Calculate = view.findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), Calculate_page.class);
                startActivity(intent);
            }
        });

        body_pro = view.findViewById(R.id.body_pro);
        body_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), human_body.class);
                startActivity(intent);
            }
        });

        feedback = view.findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), feedback_page.class);
                startActivity(intent);
            }
        });






        return view;
    }


    private void Click(View view) {



    }


}