classDiagram
 note "New Flow using Class Adapter"

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
+ void makeJSONPayment(String,String)
}

class PaymentClassAdapter { 
 <<Adapter>>
+ void makePayment(String,String)
- String converter(xmlData: String)
}


Payment <|.. PaymentClassAdapter : implements
PaymentServiceV2 <|-- PaymentClassAdapter : extends
Payment .. LegacyBank
