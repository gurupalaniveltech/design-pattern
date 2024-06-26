classDiagram
 note "Strategy Design Pattern "

class TripStrategy { 
<<interface>>
+ void travel()
}

class PatternTest { 
+ void main(String[])$
}

class TripContext { 
+ void setTripStrategy(TripStrategy)
+ void executeMyTrip()
}

class LongTripStrategy { 
+ void travel()
}

class ShortTripStrategy { 
+ void travel()
}


TripContext --> "1" TripStrategy : tripStrategy
TripStrategy <|.. LongTripStrategy  : implements
TripStrategy <|.. ShortTripStrategy : implements

