package main

import (
	"fmt"
	"time"
	// "math/rand/v2"
	// "time"
	// //"time"
)

// // sending data
// func processNum(numChan chan int){

// 	for num :=range numChan{
//       	fmt.Println("processing number :", num)
// 		time.Sleep(time.Second)
// 	}

// }

// func sum( result chan int,num1 int, num2 int){
// 	numResult := num1 + num2
// 	result <- numResult

// }

// for simple go routines we can use channels and for multiple go routines we can use waitgroup go routines

// in channels sending and receive ing are blocking

// func task(done chan bool){
// 	defer func(){ done <- true }()
// 	fmt.Println("processing......")
// }


func emailSender(emailChan chan string, done chan bool){
	defer func(){ done <- true }()
	for email := range emailChan{ 
		fmt.Println("sending email to", email)
		time.Sleep(time.Second)
	}
}

func main() {
    
	emailChan := make(chan string,100) // it's not block bez it's buffered  channel 
    done := make(chan bool)
   
	for i:=0; i<10; i++{
		emailChan <- fmt.Sprintf("%d@gmail.com",i)
	}
    go emailSender(emailChan,done)
	fmt.Println("done sending....")

	// emailChan <- "1@example.com"
	// emailChan <- "2@example.com"

	// fmt.Println(<- emailChan)
	// fmt.Println(<- emailChan)

    <- done
	
      


    // done := make(chan bool)

    // go task(done)

	// <- done

//    result := make(chan int)

//    go sum (result,4,5)

//    res := <- result
//    fmt.Println(res)
    //  numChan := make(chan int)
	//  go processNum(numChan)
	
	//  for {
	// 	numChan <- rand.IntN(1000)
	//  }

   // time.Sleep(time.Second*2)
//    //channels are blocking 
// 	messageChannel := make(chan string)
// 	messageChannel <- "ping" // sending data

// 	msg := <-messageChannel // receive  data

// 	fmt.Println(msg)
 

}