package com.example.WidgetManager.service;

import com.example.WidgetManager.model.WidgetManager;
import java.util.List;

public interface WidgetManagerService {
        WidgetManager saveWidgetData(WidgetManager widgetManager);

        List<WidgetManager> fetchWidgetData();

        WidgetManager fetchWidgetById(Long id);

    void deleteWidgetById(Long id);

    WidgetManager updateWidget(Long id, WidgetManager widgetManager);

    List<WidgetManager> fetchWidgetBySize(String size);

    List<WidgetManager> fetchWidgetByName(String name);

    List<WidgetManager> fetchWidgetByTag(String tag);

    List<WidgetManager> fetchWidgetByStatus(String status);
}
