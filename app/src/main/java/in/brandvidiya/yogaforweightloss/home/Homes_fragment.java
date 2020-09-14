package in.brandvidiya.yogaforweightloss.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import in.brandvidiya.yogaforweightloss.R;
import in.brandvidiya.yogaforweightloss.joining_from;
import in.brandvidiya.yogaforweightloss.mainpage.MainActivity;
import in.brandvidiya.yogaforweightloss.stopwatch.stop_watch_page;


public class Homes_fragment extends Fragment {
    Button btn_yoga1,yoga2;
    TextView stop_watch;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_homes_fragment, container, false);
        context = view.getContext();


        stop_watch = view.findViewById(R.id.stop_watch);
        stop_watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), stop_watch_page.class);
                startActivity(intent);
            }
        });



        btn_yoga1 = view.findViewById(R.id.btn_yoga1);
        btn_yoga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), joining_from.class);
                startActivity(intent);
            }
        });

        yoga2 = view.findViewById(R.id.yoga2);
        yoga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        return view;
    }


}