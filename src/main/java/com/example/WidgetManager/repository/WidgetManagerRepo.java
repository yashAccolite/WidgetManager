package com.example.WidgetManager.repository;

import com.example.WidgetManager.model.WidgetManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WidgetManagerRepo extends JpaRepository<WidgetManager, Long> {

    public List<WidgetManager> findAllByWidgetSize(String WidgetSize);
    public List<WidgetManager> findALlByWidgetNameIgnoreCase(String name);

    public List<WidgetManager> findAllByWidgetStatusIgnoreCase(String status);
    public List<WidgetManager> findAllByWidgetTagIgnoreCase(String tag);


}
