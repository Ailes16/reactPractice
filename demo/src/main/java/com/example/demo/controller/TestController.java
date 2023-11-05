package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.model.TestModel;
import com.example.demo.response.ResponseJson;
import com.example.demo.response.SignUpJson;

/**
 * Reactの動作確認用のコントローラクラス
 * 
 * @author Ailes16
 * @version 1.0
 */
@RestController
@RequestMapping("/")
// TODO 調べる
@CrossOrigin(origins = "*")
public class TestController {

    @GetMapping
    public TestModel test() {
        return new TestModel();
    }

    @PostMapping("/signUp")
    public ResponseJson<SignUpJson> register(@RequestBody SignUpJson req) {

        System.out.println("userName : " + req.getUserName());
        System.out.println("email : " + req.getEmail());
        System.out.println("password : " + req.getPassword());

        ResponseJson<SignUpJson> res = new ResponseJson<>();

        res.getMessage().put("userName", "ユーザー名を入力してください");
        res.getMessage().put("email", "メールアドレスを入力してください");
        res.getMessage().put("password", "パスワードを入力してください");

        return res;
    }
}
