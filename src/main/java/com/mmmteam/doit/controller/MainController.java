package com.mmmteam.doit.controller;

import com.mmmteam.doit.domain.Answer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping
@CrossOrigin
public class MainController {

    private List<Answer> list = new ArrayList<>();

    public MainController() {
        initialAdd();
    }

    private void initialAdd() {
        list.add(new Answer("no", "https://yesno.wtf/assets/no/1-c7d128c95c1740ec76e120146c870f0b.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/23-5fe6c1ca6c78e7bf9a7cf43e406fb8db.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/17-829284e9dd894ce9fb65fbe86d2e382c.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/32-b62f1f8058c1d7f06c528319faccfb38.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/29-6bf57c5bf3fed2dcdbed64afff7a7930.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/31-cc391a4c0332a4ce5b4d4666f64a7b4a.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/16-b66d2db7543f5259c86abc166d6901cf.gif"));
        list.add(new Answer("no", "https://yesno.wtf/assets/no/23-5fe6c1ca6c78e7bf9a7cf43e406fb8db.gif"));

        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/13-c3082a998e7758be8e582276f35d1336.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/10-271c872c91cd72c1e38e72d2f8eda676.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/0-c44a7789d54cbdcad867fb7845ff03ae.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/2-5df1b403f2654fa77559af1bf2332d7a.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/6-304e564038051dab8a5aa43156cdc20d.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/14-b57c6dc03aa15a4b18f53eb50d6197ee.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/14-b57c6dc03aa15a4b18f53eb50d6197ee.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/8-2f93962e2ab24427df8589131da01a4d.gif"));
        list.add(new Answer("yes", "https://yesno.wtf/assets/yes/9-6403270cf95723ae4664274db51f1fd4.gif"));

        Collections.shuffle(list);
    }


    @GetMapping
    public Answer answer() {
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(i + " : " + list.get(i));
        return list.get(i);
    }

    @GetMapping("/all")
    public Iterable<Answer> findAll() {
        return list;
    }

    @PostMapping
    public void add(@RequestBody Answer a) {
        list.add(a);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(value = "id") int id) {
        list.remove(id);
    }
}


