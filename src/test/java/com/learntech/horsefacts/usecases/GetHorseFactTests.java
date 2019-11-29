package com.learntech.horsefacts.usecases;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;
import com.learntech.horsefacts.core.interfaces.IHorseFactGateway;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.BDDMockito.given;

public class GetHorseFactTests {
    IHorseFactGateway horseFactGateway = Mockito.mock(IHorseFactGateway.class);

    @Test
    void canGetASingleHorseFact()  {
        String expected = "a cool horse fact";
        given(horseFactGateway.getHorseFact()).willReturn(expected);
        IGetHorseFactUseCase subject = new GetHorseFact(horseFactGateway);
        assert(subject.execute() == expected);
    }

    @Test
    void canGetAnotherHorseFact() {
        String expected = "a sweet horse fact";
        given(horseFactGateway.getHorseFact()).willReturn(expected);
        IGetHorseFactUseCase subject = new GetHorseFact(horseFactGateway);
        assert(subject.execute() == expected);
    }
}
