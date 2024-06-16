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
<<Target>>
+ void makePayment(String,String)
}

class PaymentServiceV1 { 
    <<Adaptee>>
+ void makePayment(String,String)
}


Payment .. LegacyBank
Payment <|.. PaymentServiceV1 : implements