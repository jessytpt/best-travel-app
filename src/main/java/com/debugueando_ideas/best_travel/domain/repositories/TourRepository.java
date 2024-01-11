package com.debugueando_ideas.best_travel.domain.repositories;

import com.debugueando_ideas.best_travel.domain.entities.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity,Long> {
}
