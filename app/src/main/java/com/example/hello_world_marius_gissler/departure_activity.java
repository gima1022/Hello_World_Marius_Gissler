package com.example.hello_world_marius_gissler;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello_world_marius_gissler.network.KvvService;
import com.example.hello_world_marius_gissler.network.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class departure_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departure);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://projekte.kvv-efa.de/")
                .addConverterFactory(GsonConverterFactory.create())//string in objekt umformatieren
                .build();

        KvvService service = retrofit.create(KvvService.class);

        Call<Result> resultCall = service.listDepartures();

        resultCall.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result =response.body();

                Log.i("DepartureActivity",String.valueOf(result.getDepartureList().size()));
                Log.i("DepartureActivityINT", String.valueOf(Integer.valueOf(result.getDepartureList().size())));


                for (int i=1; i < Integer.valueOf(result.getDepartureList().size()) ; i++)
                {
                   // int departure_list_eintrag = Log.i("Departure List Eintrag", result.getDepartureList().toString());


                    Log.i("Departure List Eintrag nr "+i, result.getDepartureList().get(i).toString());

                //    Log.i("Departure List Eintrag", result.getNumber().get(i).toString()); //kein zugriff auf servingLine??
                //    Log.i("Departure List Eintrag", result.getName().get(i).toString());


                }

              //  Log.i("DepartureActivityLIST",getDepartureList().toArray() );
            }



            @Override
            public void onFailure(Call<Result> call, Throwable t) {

                Log.d("departureActivity!","Antragfehler");
            }
        });


        TextView departure_txt= this.findViewById(R.id.departure_txt);

    }
}