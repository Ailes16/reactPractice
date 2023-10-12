package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.model.TestModel;

/**
 * Reactの動作確認用のコントローラクラス
 * 
 * @author Ailes16
 * @version 1.0
 */
@Controller
@RequestMapping("/")
// TODO 調べる
@CrossOrigin(origins = "*")
public class TestController {

    @ResponseBody
    @GetMapping
    public TestModel test() {
        return new TestModel();
    }
}
