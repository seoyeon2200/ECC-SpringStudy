package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; //URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트

@Controller//이 클래스가 컨트롤러임을 선언
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(){ //메서드 작성
        return "greetings"; //greetings.mustache 파일 반환
    }
}
