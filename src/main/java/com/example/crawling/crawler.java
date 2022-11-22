package com.example.crawling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Connection;

public class crawler {

    public static void main(String[] args) {
        // Jsoup를 이용해서 사이트 크롤링
        String url = "https://www.viviennewestwood.com/en/women/jewellery/earrings/olympia-earrings-pink-gold-6201030E02G237G237.html"; //크롤링할 url지정

        try {
            Connection conn = Jsoup.connect(url);
            Document html = conn.get();      //Document에는 페이지의 전체 소스가 저장된다

            //select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
            Elements img = html.getElementsByAttributeValue("class", "b-pdp_main_images-container-list");
            System.out.println("출력시작");
            System.out.println(img.get(0));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}