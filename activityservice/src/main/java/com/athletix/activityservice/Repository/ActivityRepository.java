package com.athletix.activityservice.Repository;

import com.athletix.activityservice.dto.ActivityResponse;
import com.athletix.activityservice.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActivityRepository extends MongoRepository<Activity,String> {
    List<Activity> findByUserId(String userId);
}
