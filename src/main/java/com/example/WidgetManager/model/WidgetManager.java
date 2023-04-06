package com.example.WidgetManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class WidgetManager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long widgetId;
    private String widgetName;
    private String widgetTag;
    private String widgetStatus;
    private String widgetSize;
    private String description;
}
