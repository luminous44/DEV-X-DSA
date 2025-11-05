package main

import (
	//"bufio"
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

//  f, err := os.Create("example2.txt")

 
//  if err != nil {
	
// 	panic(err)
//  }
  
//  defer f.Close()

// //  f.WriteString("hi go")
// //  // appending 
// // f.WriteString(" nice language")

// bytes := []byte("hello golang")

// f.Write(bytes)

// data read and write one to another file(streaming fashion)

// sourceFile, err := os.Open("example.txt")

// if err != nil{
// 	panic(err)
// }

// defer sourceFile.Close()

// destFile, err := os.Create("example2.txt")

// if err != nil {
// 	panic(err)
// }

// defer destFile.Close()

// reader := bufio.NewReader(sourceFile)

// Writer := bufio.NewWriter(destFile)

// for  {

// 	b, err := reader.ReadByte()
	
// if err != nil {

// 	if err.Error() != "EOF"{
//       	panic(err)
// 	}
//   break
// }

// 	e := Writer.WriteByte(b)

// 	if err != nil {
// 	panic(e)
// }

// }

// Writer.Flush()

// fmt.Println("written to new file")

// delete file

err := os.Remove("example2.txt")

	if err != nil {
	panic(err)
}

fmt.Println("file deleted successfully")

}