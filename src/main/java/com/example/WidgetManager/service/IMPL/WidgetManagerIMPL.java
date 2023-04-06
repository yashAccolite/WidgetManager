package com.example.WidgetManager.service.IMPL;

import com.example.WidgetManager.model.WidgetManager;
import com.example.WidgetManager.repository.WidgetManagerRepo;
import com.example.WidgetManager.service.WidgetManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WidgetManagerIMPL implements WidgetManagerService {
    @Autowired
    private WidgetManagerRepo widgetManagerRepo;

    public WidgetManagerIMPL(WidgetManagerRepo widgetManagerRepo){
        this.widgetManagerRepo=widgetManagerRepo;
    }

    @Override
    public WidgetManager saveWidgetData(WidgetManager widgetManager) {
        return widgetManagerRepo.save(widgetManager);
    }

    @Override
    public List<WidgetManager> fetchWidgetData() {
        return widgetManagerRepo.findAll();
    }

    @Override
    public WidgetManager fetchWidgetById(Long id) {
        return widgetManagerRepo.findById(id).get();
    }

    @Override
    public void deleteWidgetById(Long id) {
        widgetManagerRepo.deleteById(id);
    }

    @Override
    public WidgetManager updateWidget(Long id, WidgetManager widgetManager) {
        WidgetManager wData= widgetManagerRepo.findById(id).get();

        if(Objects.nonNull(widgetManager.getWidgetName()) && !"".equals(widgetManager.getWidgetName())){
            wData.setWidgetName(widgetManager.getWidgetName());
        }
        if(Objects.nonNull(widgetManager.getWidgetTag()) && !"".equals(widgetManager.getWidgetTag())){
            wData.setWidgetTag(widgetManager.getWidgetTag());
        }
        if(Objects.nonNull(widgetManager.getWidgetStatus()) && !"".equals(widgetManager.getWidgetStatus())){
            wData.setWidgetStatus(widgetManager.getWidgetStatus());
        }
        if(Objects.nonNull(widgetManager.getWidgetSize()) && !"".equals(widgetManager.getWidgetSize())){
            wData.setWidgetSize(widgetManager.getWidgetSize());
        }
        if(Objects.nonNull(widgetManager.getDescription()) && !"".equals(widgetManager.getDescription())){
            wData.setDescription(widgetManager.getDescription());
        }
        return widgetManagerRepo.save(wData) ;
    }

    @Override
    public List<WidgetManager> fetchWidgetBySize(String WidgetSize) {
        return widgetManagerRepo.findAllByWidgetSize(WidgetSize);
    }

    @Override
    public List<WidgetManager> fetchWidgetByName(String name) {
        return widgetManagerRepo.findALlByWidgetNameIgnoreCase(name);
    }

    @Override
    public List<WidgetManager> fetchWidgetByTag(String tag) {
        return widgetManagerRepo.findAllByWidgetTagIgnoreCase(tag);
    }

    @Override
    public List<WidgetManager> fetchWidgetByStatus(String status) {
        return widgetManagerRepo.findAllByWidgetStatusIgnoreCase(status);
    }
}
