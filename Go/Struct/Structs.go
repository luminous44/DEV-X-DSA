package main

import (
	"fmt"
	"time"
)
type order struct {
	id     string
	amount float32
	status string
	createdAt time.Time
}
func newOrder(id,status string,amount float32) *order{

	myOrder := order{
		id: id,
		status: status,
		amount: amount,
	}

	return &myOrder
}
func(o *order) changeStatus(stu string ){
	o.status = stu
}

func(o order) getId() string{
	return o.id
}

func main() {

	myOrder := order{
		id : "001",
		amount: 50.67,
		status: "received",
	}

	fmt.Println(myOrder)
	myOrder.createdAt = time.Now()
	fmt.Println(myOrder)
	myOrder.changeStatus("confirmed")
	fmt.Println(myOrder)
	// fmt.Println(myOrder.getId())
	
    order1 := newOrder("001","paid",45.09)
	fmt.Println(order1)

	// for onetime struct
    
		langua := struct {
		name    string
		isGood  bool
	}{
		name:   "golang",
		isGood: true,
	}

	fmt.Println(langua)

}