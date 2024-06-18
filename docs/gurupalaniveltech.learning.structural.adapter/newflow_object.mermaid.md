classDiagram
 note "New Flow using Object Adapter"

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

class PaymentServiceV2 { 
       <<Adaptee>>
+ void makePayment(String,String)
}

class PaymentObjectAdapter { 
     <<Adapter>>
-paymentServiceV2: PaymentServiceV2
+ void makeJSONPayment(String,String)
- String converter(xmlData: String)
}


Payment .. LegacyBank
Payment <|.. PaymentObjectAdapter : implements
PaymentObjectAdapter --> "1" PaymentServiceV2 : paymentServiceV2


