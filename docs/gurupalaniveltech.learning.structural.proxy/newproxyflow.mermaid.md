

classDiagram
 note "New Proxy Flow "


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
class PaymentGateway  {
<<ProxySubject>>
	+makePayment(data: String): void
	-additionCheck(): void
	-additionLogs(): void
}

Payment .. LegacyBank
Payment <|.. PaymentGateway : implements
Payment <|.. PaymentService : implements
PaymentGateway --> "1" PaymentService : paymentService


