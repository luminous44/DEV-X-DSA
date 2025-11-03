package main

import (
	"fmt"
	"time"


)


func processNum(numChan chan int){

	fmt.Println("processing number :", <-numChan)

}
func main() {

     numChan := make(chan int)
	 go processNum(numChan)
	  numChan <- 20

    time.Sleep(time.Second*2)
   channels are blocking 
	messageChannel := make(chan string)
	messageChannel <- "ping" // sending data

	msg := <-messageChannel // receive  data

	fmt.Println(msg)
 

}