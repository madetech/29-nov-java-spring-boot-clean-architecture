package com.learntech.horsefacts.usecases;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;
import org.junit.jupiter.api.Test;

public class GetHorseFactTests {
    @Test
    void canGetASingleHorseFact()  {
        IGetHorseFactUseCase subject = new GetHorseFact();
        assert(subject.execute() == "a cool horse fact");
    }

    @Test
    void canGetAnotherHorseFact() {
        IGetHorseFactUseCase subject = new GetHorseFact();
        assert(subject.execute() == "a sweet horse fact");
    }
}
