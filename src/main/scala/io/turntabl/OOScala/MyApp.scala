package io.turntabl.OOScala

import io.turntabl.student.TLCStudent

object MyApp extends App {

  val student = new TLCStudent("Franklin", "Wae")
  val student1 = new TLCStudent("Alexander", "Maakua", 2)



  print(student isSameService student1)
  println
  print(student Topgrade("Physics",95.0))

}
