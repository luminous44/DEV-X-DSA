package main

import "fmt"

type payment struct {
}

func (p payment) makePayment(amount int) {
    
	paymentGateWay := bkash{}

	paymentGateWay.pay(float32(amount))

}

type bkash struct{}
type nogot struct{}
type fkGateway struct{}

func (b bkash) pay(amount float32) {
		fmt.Println("making payment using Bkash : ", amount)
}

func (n nogot) pay(amount float32) {

	fmt.Println("making payment using Nogot : ", amount)
}

func (fg fkGateway) pay(amount float32){
	fmt.Println("making payment using nogot : ", amount)
}

func main() {

	payment := payment{}
	payment.makePayment(25.0)

}