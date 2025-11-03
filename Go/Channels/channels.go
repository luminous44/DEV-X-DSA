package main

import (
	"fmt"
	"math/rand/v2"
	"time"
	//"time"
)


func processNum(numChan chan int){


	for num :=range numChan{
      	fmt.Println("processing number :", num)
		time.Sleep(time.Second)
	}



}
func main() {

     numChan := make(chan int)
	 go processNum(numChan)
	
	 for {
		numChan <- rand.IntN(1000)
	 }

   // time.Sleep(time.Second*2)
//    //channels are blocking 
// 	messageChannel := make(chan string)
// 	messageChannel <- "ping" // sending data

// 	msg := <-messageChannel // receive  data

// 	fmt.Println(msg)
 

}