package com.learntech.horsefacts.usecases;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;
import com.learntech.horsefacts.core.interfaces.IHorseFactGateway;
import org.springframework.beans.factory.annotation.Autowired;

public class GetHorseFact  implements IGetHorseFactUseCase {
    private IHorseFactGateway horseFactGateway;

    public GetHorseFact(IHorseFactGateway horseFactGateway) {
        this.horseFactGateway = horseFactGateway;
    }

    @Override
    public String execute() {
        return horseFactGateway.getHorseFact();
    }
}
