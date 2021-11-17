package edu.asu.cidse.se.covid_analytics.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import edu.asu.cidse.se.covid_analytics.model.State;

public class StudentAPInfo {

    //will be creating a list that will be containing the State type
    //we will be soon abstract data from the json api from COVID website

    ArrayList<State>  stateInfoArrayList = new ArrayList<State>();
    //using the websites api in order to grab data
    String URL =
            "https://api.covidactnow.org/v2/state/{state}.json?apiKey=4fffd4f9a61b49388b45eb9e6599ab13";


    //creating a method that will help store data into and array list

    /**
     * Will be returning an array list with information for State such as name,country and county
     * @return stateInfoArrayList
     */
    public List<State> getState(){
        //calling information via object since it is a json object
        JsonObjectRequest jsonObjectRequestRequest = new JsonObjectRequest(Request.Method.GET, URL,null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                JSONArray jsonArray = response.names();
                for (int i = 0; i < response.length(); i++) {
                    try {

                        Log.d("StudenAPInfo","getState(): " + jsonArray.getJSONArray(i).getString(0));

                        //State student = new State();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("StudentAPInfo","Error could not grab data from API");
            }
        });
        return stateInfoArrayList;
    }



}
