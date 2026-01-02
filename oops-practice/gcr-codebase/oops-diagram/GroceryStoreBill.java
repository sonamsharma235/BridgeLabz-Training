1.	Class Diagram
+--------------------+       1     *       +---------------------+
|     Customer       |-------------------->|      Product        |
+--------------------+                     +---------------------+
| - name: String     |                     | - name: String      |
|                    |                     | - quantity: double  |
|                    |                     | - pricePerUnit: double |
+--------------------+                     +---------------------+
         |
         | uses
         v
+------------------------------+
|        BillGenerator         |
+------------------------------+
| +generateBill(c: Customer): double |
+------------------------------+

2.	Object Diagram
Snapshot of objects:

+------------------------+
| Customer               |
| name = "Alice"         |
+------------------------+
         |
         | has
         v
+----------------------------+     +-----------------------------+
| Product                    |     | Product                     |
| name = "Apples"            |     | name = "Milk"               |
| quantity = 2.0             |     | quantity = 1.0              |
| pricePerUnit = 3.0         |     | pricePerUnit = 2.0          |
+----------------------------+     +-----------------------------+

3.	Sequence Diagram
Actor       Customer           BillGenerator
  |              |                   |
  |---checkout()------------------->|
  |                                 |
  |       generateBill()           |
  |<--------- total: $8 -----------|
  |                                 |
