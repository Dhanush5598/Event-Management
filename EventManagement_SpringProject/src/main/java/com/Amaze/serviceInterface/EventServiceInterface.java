package com.Amaze.serviceInterface;



import java.util.List;

import com.Amaze.entity.EventsEntity;
import com.Amaze.entity.Form;

public interface EventServiceInterface {

   // public String loadEvent(String eventCategory);
   public EventsEntity loadEventData(String eventCategory);

public List<Form> getUserEvents(String email);

public void deleteUserBooking(Integer id);

}
