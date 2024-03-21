package com.oop.solid.srp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


public class UserAggregator{
    public String getUsersfromRestAPI(){
        try {
            // Define the URL you want to request
            URL url = new URL("https://jsonplaceholder.typicode.com/todos");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.3683.103 Safari/537.36 OPR/60.0.3255.170");

            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Close the connection
            connection.disconnect();
            return response.toString();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    public void saveToFile() throws IOException{
        String users = getUsersfromRestAPI();
        Files.write(Paths.get("./users.json"), users.getBytes());
    }
}