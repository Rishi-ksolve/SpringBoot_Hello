package com.userlogin.springuser.Service;


import com.userlogin.springuser.Entiry.Events;
import com.userlogin.springuser.Entiry.Evnt;
import com.userlogin.springuser.Entiry.Register;

import java.util.List;

public interface UserService {

    Register addUser(Register register);

    List<Register> getUser();

    String getUserEvents(Register register);

    List<Evnt> getEvents();

    String userEventRegister(Events events);

    List<Events> showUserEvents(Long userId);

    Register getSingleUser(Long userId);

    List<Events> showAllEvent();
}
