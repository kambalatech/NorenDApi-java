/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kspl.norenexampleapp;

import com.noren.javaapi.NorenDApiJava;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author itsku
 */
public class NorenDExampleApp {

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to Noren!");
        NorenDApiJava api = new com.noren.javaapi.NorenDApiJava("https://rama.kambala.co.in/DealerWClient/");
        
        String response = api.login("TSTDLR1", "YGb@765", "RRRRR1997R", "Krishna_DAPI", "krishpernad123", "java-");
        System.out.println(response);
            
        
        JSONObject securityinfo=api.get_security_info("NFO","335003");
        System.out.println(securityinfo.toString());

        
        JSONObject reply = api.place_order("B","C","TSTINV3", "NSE", "CANBK-EQ", 1, 0, "LMT", 220.0, "java", null, null, null, null, null, null, null); 
        System.out.println(reply.toString());
        
        //String newprice_type,Double newprice,Double newtrigger_price,Double bookloss_price, Double bookprofit_price , Double trail_price)
        JSONObject test= api.modify_order("22122800000006","NSE","AARVI-EQ",50,"DS",610.0, 0.0, 0.0 ,0.0 , 0.0,"DEMO"); 
        System.out.println(test.toString());
        
        JSONArray book; 
        book = api.get_order_book();
        System.out.println(book.toString());
        
        book = api.get_trade_book(); 
        if(book != null)
            System.out.println(book.toString());
        
        JSONObject exitorder = api.exit_order("22122700000001","H"); 
        System.out.println(exitorder.toString());
        
        JSONObject cancelorder = api.cancel_order("22122700000001"); 
        System.out.println(cancelorder.toString());
        
        JSONObject quotes = api.get_quotes("NSE","2211"); 
        System.out.println(quotes.toString());
        
        JSONObject clients = api.get_clients(); 
        System.out.println(clients.toString());
        
        JSONArray pos;
        pos = api.get_positions(); 
        System.out.println(pos.toString());
        
        String logout= api.log_out(); 
        System.out.println(logout);
    }
}
