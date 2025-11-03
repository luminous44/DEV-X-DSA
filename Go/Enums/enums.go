package main

import "fmt"


type OrderStatus int
//type Order string

// for int
const(

	Received OrderStatus = iota
	Confirmed
	Prepared 
	Delivered

)
// for string
// const(

// 	Received Order = "recived"
// 	Confirmed      = "Confirmed"
// 	Prepared       = "Prepared"
// 	Delivered      = "Delivered"

// )

func changeStatus(status OrderStatus) {
	fmt.Println("change order status to",status )
}

func main() {

	changeStatus(Prepared) 

}