package ru.rt.payment.core.handler;


//        Обращаемся к контейнеру, в котором находится компоненты для обработки подходящих запроосов.

// Если планируем создать класс на основе этого интерфейса, то можем определить абстрактный класс
// который будет контролировать жизненный цикл компонентов, обрабатывающие request and response.

import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;

public interface HandleRequest<RQ extends Request, RS extends Response> {
    RS handle(RQ request);
}
