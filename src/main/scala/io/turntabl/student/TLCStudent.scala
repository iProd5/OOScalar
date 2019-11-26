package io.turntabl.student

import java.time.Year

import io.turntabl.grade.Grade
import javax.security.auth.Subject


class TLCStudent(val firstName: String,val secondName: String,
                 val ID: Int=1, val roleDescription: String = "novice", year:Int =2019,
                 val gitHubURL: String= "turntabl github") {
  //  overiding
  override def toString = s"$firstName $secondName has an id of $ID, is a $roleDescription and uses $gitHubURL"


  //calculate years
  def yearsWithTurntable() = Year.now.getValue -year;
  def isSameService(s:TLCStudent) =   yearsWithTurntable()== s.yearsWithTurntable()

 def Topgrade(subject: String, grade: Double) = Grade(subject, grade)
}
object TLCStudent{
  def apply(firstName: String, secondName: String, ID: Int, roleDescription: String, year: Int, gitHubURL: String): TLCStudent = new TLCStudent(firstName, secondName, ID, roleDescription, year, gitHubURL)
}






