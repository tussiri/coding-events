package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Code Till Dawn");
        events.add("Code Co-op");
        events.add("Code and Coffee");
        model.addAttribute("events", events);
        return "events/index";

    }

    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }


}
