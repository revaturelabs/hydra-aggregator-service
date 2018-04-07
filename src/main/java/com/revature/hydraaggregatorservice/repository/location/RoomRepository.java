package com.revature.hydraaggregatorservice.repository.location;

import com.revature.hydraaggregatorservice.model.location.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {
}
