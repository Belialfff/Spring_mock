package org.lanit;

import org.lanit.models.AlertsItem;
import org.lanit.models.TickersItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Controller
public class JSONController {

    @PostMapping(value = "json")
    public Object postResponse (@RequestBody AlertsItem alertsItem) throws IOException {
        // Setting start time
        long startTime = System.currentTimeMillis();
        TickersItem tickersItem = new TickersItem();
        //Reading template file into string
         List<String> templateResponse = Files.readAllLines(Paths.get("F:\\быц-тыц\\MOCK\\src\\main\\resources\\templates\\json\\json\\getResponse.json"), StandardCharsets.UTF_8);

        UUID uuid = UUID.randomUUID();
        long executionTime = System.currentTimeMillis() - startTime;
        String clientId = tickersItem.getTicker() + ":" + alertsItem.getTimeframe() + ":" + alertsItem.getPercent();
        //Setting time in format
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'I'HH:mm:5s");
        String formattedDT = dtFormatter.format(dt);
        //Preparing response body
        String responseBody = String.format(String.join("\n", templateResponse), tickersItem.getTicker(), alertsItem.getTimeframe(), alertsItem.getPercent(), formattedDT);
        return ResponseEntity.ok().header("content-type", "application/json").body(responseBody);}}



/*
public class JSONController {

    @PostMapping(value = "json")
    public Object postResponse (@RequestParam(value = "ticker") String ticker, @RequestParam(value = "timeframe") Integer timeframe, @RequestParam(value = "percent") Integer percent ) throws IOException {
        long startTime = System.currentTimeMillis();
        String filePath = "src/main/resources/files/templates.json";
        String templateResponse = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        UUID uuid = UUID.randomUUID();
        ObjectMapper objectMapper = new ObjectMapper();
        RequestJson requestJson = objectMapper.readValue(requestBody, RequestJson.class);
        String UserID = requestJson.getUserID();
        String responseBody = String.format(templateResponse, UserID, );

        return ResponseEntity.ok().header("content-type", "application/json").body(responseBody);

    }
}
*/
