package database

import scala.slick.driver.H2Driver.simple._
import scala.slick.lifted.{ProvenShape, ForeignKeyQuery}

import controllers.CourseController._

/*class Courses(tag: Tag) extends Table[(String, Professor, Schedule, String)](tag, "courses") {
  def name = Column[String]("name")
  def professor = Column[Professor]("professor")
  def schedule = Column[Schedule]("schedule")
  def description = Column[String]("description")

  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(String, Professor, Schedule, String)] = (name, professor, schedule, description)
}*/
