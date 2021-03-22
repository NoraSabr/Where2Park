/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package where2park;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Nora
 */
public class JSONData {

    public static void main(String[] args) throws MalformedURLException, IOException {

        String url = "https://opendata.rdw.nl/resource/8u4d-s4q7.json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);

        }
        in.close();
        
        //JSONObject jsonFile = new JSONObject(response.toString());
      
        JSONArray dataArray = new JSONArray(response.toString());//jsonFile.getJSONArray("");
        System.out.println(dataArray.length());
        System.out.println("ok");
              
        
        
        
        
        }
    }
