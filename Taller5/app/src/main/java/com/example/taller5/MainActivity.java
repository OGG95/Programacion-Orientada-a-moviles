package com.example.taller5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText textUser, textPass;
    ImageButton button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textUser = findViewById(R.id.editTextTextPersonName);
        textPass = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.imageButton);
        //face = findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://web.facebook.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);

            }
        });
        button2 = findViewById(R.id.imageButton2);
        //face = findViewById(R.id.imageButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);

            }
        });
    }

    private void leerWS(){
        String ws = "http://10.0.2.2:8080/consultar/5";
        StringRequest post = new StringRequest(Request.Method.GET, ws, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String user= jsonObject.getString("user");
                    textUser.setText(user);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("error",error.getMessage());
            }
        });
        Volley.newRequestQueue(this).add(post);
    }
}