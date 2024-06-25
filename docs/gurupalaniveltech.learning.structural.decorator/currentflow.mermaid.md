classDiagram
 note "Current Flow "
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

ICarService .. CarOwner
ICarService <|.. CarService : implements

