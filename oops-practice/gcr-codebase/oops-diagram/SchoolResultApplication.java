1.	Class Diagram

+------------------+         1     *        +------------------+
|     Student      |---------------------->|     Subject      |
+------------------+                      +------------------+
| - name: String    |                      | - name: String   |
| - id: int         |                      | - marks: int     |
+------------------+                      +------------------+

         |
         | uses
         v
+--------------------------+
|     GradeCalculator      |
+--------------------------+
| +calculateGrade(s:Student): String |
+--------------------------+

2.	Object Diagram 

Objects at a point in time:

+-----------------------+
| Student               |
| name = "John"         |
| id = 101              |
+-----------------------+
         |
         | has
         v
+-------------------+    +--------------------+
| Subject           |    | Subject            |
| name = "Maths"    |    | name = "Science"   |
| marks = 90        |    | marks = 85         |
+-------------------+    +--------------------+

3.	Sequence Diagram (Grade Calculation Scenario)

Actor        Student          GradeCalculator
 |               |                     |
 |---requestGrade()------------------->|
 |                                     |
 |         calculateGrade()           |
 |<--------------grade: "A"-----------|
 |                                     |     
