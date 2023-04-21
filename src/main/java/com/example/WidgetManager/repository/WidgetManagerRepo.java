package com.example.WidgetManager.repository;

import com.example.WidgetManager.model.WidgetManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WidgetManagerRepo extends JpaRepository<WidgetManager, UUID> {


}
