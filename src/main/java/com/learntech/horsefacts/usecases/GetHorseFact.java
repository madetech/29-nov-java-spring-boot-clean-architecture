package com.learntech.horsefacts.usecases;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;

public class GetHorseFact  implements IGetHorseFactUseCase {
    @Override
    public String execute() {
        return "a cool horse fact";
    }
}
