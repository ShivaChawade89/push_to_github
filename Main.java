package org.example;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {
//        System.out.println("Hello world!");
        String url="https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=f4a462e07be440c990a09f6361b2cc20&include=minutely&contentType=json";
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient  client=HttpClient.newBuilder().build();
        HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());

//        JSONObject jsonResponse=new JSONObject(response);
//        System.out.println(jsonResponse.toString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}

