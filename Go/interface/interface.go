package main

import "fmt"

type paymenter interface{
	pay(amount float32)
}

type payment struct {

	paymentGateWay paymenter
}

func (p payment) makePayment(amount int) {
    
	p.paymentGateWay.pay(float32(amount))

}

type bkash struct{}
type nogot struct{}
type fkGateway struct{}

func (b bkash) pay(amount float32) {
		fmt.Println("making payment using Bkash : ", amount)
}

func (n nogot) pay(amount float32) {

	fmt.Println("making payment using Nogod : ", amount)
}

func (fg fkGateway) pay(amount float32){
	fmt.Println("making payment using fake gateway : ", amount)
}

func main() {
     bkashPay := bkash{}
	payment := payment{
		paymentGateWay : bkashPay,  
	}
	payment.makePayment(25.0)

}