package com.learntech.horsefacts;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HorseFactsController {
    @Autowired
    IGetHorseFactUseCase getHorseFact;

    @RequestMapping("/")
    public Object getHorseFact() {
        return getHorseFact.execute();
    }
}
