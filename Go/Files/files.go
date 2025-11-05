package main

import (
	
	"fmt"
	"os"
)

func main() {
fmt.Println()
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

//  data, err :=	os.ReadFile("example.txt")

//  if err != nil {
	
// 	panic(err)
//  }

//  fmt.Println(string(data))
 
 //read folder
 
//  dir,err :=os.Open("../")

//  if err != nil {
	
// 	panic(err)
//  }

//  defer dir.Close()

//  fileInfo, err := dir.ReadDir(-1)

//  for _, fi := range fileInfo {
// 	fmt.Println(fi.Name(),fi.IsDir())
//  }

 // create file

 f, err := os.Create("example2.txt")

 
 if err != nil {
	
	panic(err)
 }
  
 defer f.Close()

//  f.WriteString("hi go")
//  // appending 
// f.WriteString(" nice language")

bytes := []byte("hello golang")

f.Write(bytes)

}