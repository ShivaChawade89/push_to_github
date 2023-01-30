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
        String url="https://api.chucknorris.io/jokes/random";
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient  client=HttpClient.newBuilder().build();
        HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());

//        JSONObject jsonResponse=new JSONObject(response);
//        System.out.println(jsonResponse.toString());


    }
}
        System.out.println(response.statusCode());
        System.out.println(response.body());

