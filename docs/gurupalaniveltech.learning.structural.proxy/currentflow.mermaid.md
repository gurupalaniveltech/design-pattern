classDiagram
 note "Current Flow of our existing app"

class PatternTest { 
+ void main(String[])$
}

class LegacyBank  { 
    <<Client>>
+ void process(Payment)
}

class Payment {      
<<interface>>
<<Subject>>
+ void makePayment(String,String)
}

class PaymentService { 
    <<RealSubject>>
+ void makePayment(String,String)
}


Payment .. LegacyBank
Payment <|.. PaymentService : implements