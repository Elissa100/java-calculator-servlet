<!DOCTYPE html>
 <html>
  <head>
   <title>Simple Calculator</title>
    <link rel="stylesheet" type="text/css" href="operations.css">
     </head> 
     <body> 
     <h1>Simple Calculator</h1> 
     <form action="operation" method="post" class="operation"> 
     <label for="num1">Number 1:</label> 
     <input type="number" id="num1" name="num1" class="op" required><br><br> 
     <label for="num2">Number 2:</label>
      <input type="number" id="num2" name="num2" class="op" required><br><br> 
      <label for="operation">Operation:</label> 
      <select id="operation" name="operation"> 
      <option value="add">Add</option> 
      <option value="subtract">Subtract</option>
       <option value="multiply">Multiply</option> 
       <option value="divide">Divide</option> 
       </select><br><br> 
       <input type="submit" value="Calculate"> 
       </form> 
       </body> 
       </html>