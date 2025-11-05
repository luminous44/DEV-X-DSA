package main

import (
	"fmt"
	"os"
)

func main() {

//  f, err :=	os.Open("example.txt")

//  if err != nil {
	
// 	panic(err)
//  }

//  fileInfo, err := f.Stat()

//  if err != nil {
// 	panic(err)
//  }
//  fmt.Println("file name : ", fileInfo.Name())
//  fmt.Println("file or folder : ", fileInfo.IsDir())
//  fmt.Println("file size : ", fileInfo.Size())
//  fmt.Println("file permission : ",fileInfo.Mode())
//  fmt.Println("file modification at : ",fileInfo.ModTime())

// read file
 
// f, err :=	os.Open("example.txt")

//  defer f.Close()

//  buf :=make([]byte, 15)

//  d, err := f.Read(buf)
 
//  if err != nil {
	
// 	panic(err)
//  }

//  fmt.Println("data : ",d,buf)
 
//  for i := 0; i < len(buf); i++ {
// 	 fmt.Println("data : ",d,string(buf[i]))
	
//  }

 data, err :=	os.ReadFile("example.txt")

 if err != nil {
	
	panic(err)
 }

 fmt.Println(string(data))
 


}