package com.example.WidgetManager.controller;

import com.example.WidgetManager.model.WidgetManager;
import com.example.WidgetManager.service.WidgetManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accolite/WidgetManager")
//@CrossOrigin(origins = "http://localhost:4200/")
public class WidgetManagerController {
   @Autowired
   private WidgetManagerService widgetManagerService;

   @PostMapping("/saveWidget")
   public WidgetManager saveWidgetData(@RequestBody WidgetManager widgetManager){
         return widgetManagerService.saveWidgetData(widgetManager);
   }

   @GetMapping("/widgets")
   public List<WidgetManager> fetchWidgetData(){
      return widgetManagerService.fetchWidgetData();

   }
   @GetMapping("/widget/{id}")
   public WidgetManager fetchWidgetById(@PathVariable("id") Long id){
      return widgetManagerService.fetchWidgetById(id);
   }

   @DeleteMapping("/widget/{id}")
   public void deleteWidgetById(@PathVariable("id") Long id){
      widgetManagerService.deleteWidgetById(id);
   }

   @PutMapping("/widget/{id}")
   public WidgetManager updateWidget(@PathVariable("id") Long id,@RequestBody WidgetManager widgetManager){
      return widgetManagerService.updateWidget(id,widgetManager);
   }

   @GetMapping("/widget/size/{size}")
   public List<WidgetManager> fetchWidgetBySize(@PathVariable("size") String size){
      return  widgetManagerService.fetchWidgetBySize(size);
   }

   @GetMapping("/widget/name/{name}")
   public List<WidgetManager> fetchWidgetByName(@PathVariable("name") String name){
      return widgetManagerService.fetchWidgetByName(name);
   }

   @GetMapping("/widget/tag/{tag}")
   public List<WidgetManager> fetchWidgetByTag(@PathVariable("tag") String tag){
      return widgetManagerService.fetchWidgetByTag(tag);
   }

   @GetMapping("/widget/status/{status}")
   public List<WidgetManager> fetchWidgetByStatus(@PathVariable("status") String status){
      return widgetManagerService.fetchWidgetByStatus(status);
   }


}
