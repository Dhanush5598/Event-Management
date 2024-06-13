package com.Amaze.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Amaze.entity.EventsEntity;
import com.Amaze.entity.Form;
import com.Amaze.repository.EventsRepo;
import com.Amaze.repository.FormRepo;
import com.Amaze.serviceInterface.EventServiceInterface;

@Service
public class EventServiceImplementation implements EventServiceInterface {

    @Autowired
    private EventsRepo repo;  

    @Override
    public EventsEntity loadEventData(String eventCategory) {
        Optional<EventsEntity> data = repo.findByEventCategory(eventCategory);
        if (data.isPresent()) {
            return data.get();
        } else {
            return null;
        }
    }
@Autowired
private FormRepo fRepo;
    @Override
    public List<Form> getUserEvents(String email) {
       List <Form> list =fRepo.findEventByEmail(email);
        
        return list;
    }
    @Override
    public void deleteUserBooking(Integer id) {
        
        fRepo.cancelEventById(id);
    }

   
    
}
