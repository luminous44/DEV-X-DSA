package main

import (
	"fmt"
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

func sum( result chan int,num1 int, num2 int){
	numResult := num1 + num2
	result <- numResult

}
func main() {
   result := make(chan int)

   go sum (result,4,5)

   res := <- result
   fmt.Println(res)
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