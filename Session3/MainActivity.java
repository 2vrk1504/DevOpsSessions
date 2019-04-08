package comcalcula.example.a97053.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView listRecycler;
    ListAdapterTest la;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        listRecycler = findViewById(R.id.list);

        RequestQueue requestQueue = VolleySingleton.getInstance(this).getRequestQueue();
        final JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                "https://opentdb.com/api.php?amount=10&category=18&difficulty=easy&type=multiple",
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray array = response.getJSONArray("response");
                            Gson gson = new Gson();
                            QuestionClass[] questions = gson.fromJson(array.toString(), QuestionClass[].class);
                            la = new ListAdapterTest(questions, context);
                            listRecycler.setAdapter(la);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        requestQueue.add(request);
    }
}
