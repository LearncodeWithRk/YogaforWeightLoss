package in.brandvidiya.yogaforweightloss.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.brandvidiya.yogaforweightloss.Diet.proteins_page;
import in.brandvidiya.yogaforweightloss.R;
import in.brandvidiya.yogaforweightloss.more.Reminders_page;


public class mealFragment extends Fragment {
    Context context;
TextView proteins;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_meal, container, false);
        context = view.getContext();

        proteins = view.findViewById(R.id.proteins);
        proteins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), proteins_page.class);
                startActivity(intent);
            }
        });







        return view;
    }



    private void Click(View view){

    }


}