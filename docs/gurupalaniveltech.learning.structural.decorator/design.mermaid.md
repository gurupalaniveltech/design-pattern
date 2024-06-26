classDiagram
 note "Decorator Design Pattern "
class CarOwner {
    <<Client>>
+ void service(ICarService)
}
class ICarService { 
<<interface>>
+ void service()
}
class CarService { 
+ void service()
}

class PatternTest { 
+ void main(String[])$
}

class BaseCarServiceDecorator { 
<<abstract>>
+ ICarService carService
+ BaseCarServiceDecorator BaseCarServiceDecorator(ICarService)
+ void service()
}

class ExtraCoatingCarServiceDecorator { 
+ ExtraCoatingCarServiceDecorator ExtraCoatingCarServiceDecorator(ICarService)
+ void service()
}



class OilChangeCarServiceDecorator { 
+ OilChangeCarServiceDecorator OilChangeCarServiceDecorator(ICarService)
+ void service()
}


ICarService .. CarOwner
ICarService <|.. CarService : implements
ICarService <|.. BaseCarServiceDecorator : implements
BaseCarServiceDecorator <|-- ExtraCoatingCarServiceDecorator  : extends
BaseCarServiceDecorator <|-- OilChangeCarServiceDecorator  : extends
BaseCarServiceDecorator --> "1" ICarService : carService