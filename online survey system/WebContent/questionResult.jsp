<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <script src="https://cdn.freecodecamp.org/testable-projects-fcc/v1/bundle.js"></script>


<head>
  <link rel="stylesheet" href="survey1.css">
  <title>3 Monkey Survey</title>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  type="text/css" href="images/bootstrap.min.css">
    <script  src="images/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- SweetAlert2 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.2.0/sweetalert2.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.2.0/sweetalert2.all.min.js"></script>
</head>

<body>
  <header>
    <section class="title-text">
      <h1 id="title">3 Monkey Survey Form </h1>
      <p id="description" class="title-text"><em style="font-size: 90%;">Let us know about Tollywood</em></p>
    </section>
  </header>
  
  <main>
    <form id="survey-form">
      <section id="survey-fields">
        
        
       


  <!-- How likely is that you would recommend freeCodeCamp to a friend -->
        <label for="opinion">1)who is the best Actor in Tfi</label>
        <fieldset id="opinion">
           
        <input type="radio" id="pk" name="answer1" value="pk">
        <label for="male">PK</label><br>
        <input type="radio" id="ntr" name="answer1" value="ntr">
        <label for="female">NTR</label><br>
        <input type="radio" id="prabhas" name="answer1" value="prabhas">
        <label for="other">Prabhas</label>
        <input type="radio" id="rc" name="answer1" value="rc">
        <label for="other">Ramcharan</label>

        </fieldset>


        <label for="opinion1">1)which Dance Do you like most</label>
        <fieldset id="opinion1">
           
        <input type="radio" id="aa" name="answer2" value="Alluarjun">
        <label for="male">AlluArjun</label><br>
        <input type="radio" id="ntr" name="answer2" value="ntr">
        <label for="female">Ntr</label><br>
        <input type="radio" id="rp" name="answer2" value="ram">
        <label for="other">RamPotheneni</label>
        <input type="radio" id="rc" name="answe2" value="rc">
        <label for="other">RamCharan</label>

        </fieldset>





        <label for="opinion2">1)who is best director in TFI</label>
        <fieldset id="opinion2">
           
        <input type="radio" id="tri" name="answer3" value="trivikram">
        <label for="male">Trivikram</label><br>
        <input type="radio" id="raj" name="answer3" value="rajamouli">
        <label for="female">Rajamouli</label><br>
        <input type="radio" id="suk" name="answer3" value="sukumar">
        <label for="other">Sukumar</label>
        <input type="radio" id="kri" name="answer3" value="krish">
        <label for="other">Krish</label>

        </fieldset>
        
       
        
        
        
      
        
       

      <!-- submit -->
      <button id="success"  >submit</button>
    </form>
  </main>
 
</body>
</html>
<style>
    .row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}
.col{
    background-color: orange;
}


.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
  background-color: orange;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: orange;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

span.price {
  float: right;
  color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (and change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
body {
  background-color: aliceblue;
  font-family: sans-serif;
  text-align: center;
}
button {
  background-color: cadetblue;
  color: whitesmoke;
  border: 0;
  -webkit-box-shadow: none;
  box-shadow: none;
  font-size: 18px;
  font-weight: 500;
  border-radius: 7px;
  padding: 15px 35px;
  cursor: pointer;
  white-space: nowrap;
  margin: 10px;
}
img {
  width: 200px;
}
input[type="text"] {
  padding: 12px 20px;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 10px;
  box-sizing: border-box;
}
h1 {
  border-bottom: solid 2px grey;
}
#success {
  background: green;
}
#error {
  background: red;
}
#warning {
  background: coral;
}
#info {
  background: cornflowerblue;
}
#question {
  background: grey;
}

</style>
<script>
  $(document).on('click', '#success', function(e) {
			swal(
				'Success',
				'THANK YOU FOR YOU SURVEY',
				'success'
			)
		});
</script>

<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%
System.out.println("welcome");
try{
	Connection con=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
	PreparedStatement psmt=con.prepareStatement("select * from questions");
	PreparedStatement psmt1=con.prepareStatement("select * from result");
	ResultSet rs=psmt.executeQuery();
	ResultSet rs1=psmt1.executeQuery();
	int i=1;
	while(rs.next() && rs1.next()){
		System.out.println("entered into loop--"+rs);
		int c=1;
		/*if(rs1==null){
			PreparedStatement psmt2=con.prepareStatement("update result set id="+rs.getInt(1)+"");
			psmt2.executeUpdate();
			System.out.println("updated");
			System.out.println("null values");
			PreparedStatement psmt3=con.prepareStatement("update result set O1="+c+",O2="+c+",O3="+c+",O4="+c+" where id="+rs.getInt(1)+"");
			psmt3.executeUpdate();
			System.out.println("updated1");
			
			}*/
			System.out.println("not null values");
			String k=String.valueOf(i);
			 String question1=request.getParameter("answer"+k);
			 System.out.println(question1);
			 /*System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
			 System.out.println(rs.getString(4));
			 System.out.println(rs.getString(5));
			 System.out.println(rs.getString(6));
			 System.out.println(rs1.getInt(1));
			 System.out.println(rs1.getString(2));
			 System.out.println(rs1.getString(3));
			 System.out.println(rs1.getString(4));
			 System.out.println(rs1.getString(5));*/
			 if(question1.equals(""+rs.getString(3)+"")){
					System.out.println("entered");
					  c=rs1.getInt(2);
					  System.out.println(c);
					  c=++c;
					  System.out.println(c);
					  PreparedStatement psmt4=con.prepareStatement("update result set O1="+c+" where id="+rs.getInt(1));
					  psmt4.executeUpdate();
					System.out.println("option1");
				  }
				  else if(question1.equals(""+rs.getString(4)+"")){
					  System.out.println("entered1");
					  c=rs1.getInt(3);
					  c=++c;
					  System.out.println(c);
					  PreparedStatement psmt5=con.prepareStatement("update result set O2="+c+" where id="+rs.getInt(1)+"");
						psmt5.executeUpdate();
						System.out.println("option2");
					 
				  }
				  else if(question1.equals(""+rs.getString(5)+"")){
					  System.out.println("entered2");
					  c=rs1.getInt(4);
					  c=++c;
					  System.out.println(c);
					  PreparedStatement psmt6=con.prepareStatement("update result set O3="+c+" where id="+rs.getInt(1)+"");
						psmt6.executeUpdate();
						System.out.println("option3");
				  }
				  else{
						  c=rs1.getInt(5);
						  c=++c;
						  System.out.println(c);
						  PreparedStatement psmt7=con.prepareStatement("update result set O4="+c+" where id="+rs.getInt(1)+"");
							psmt7.executeUpdate();
							System.out.println("option4");
				  }
			 
			
		
		
	  i++;
}
	             response.sendRedirect("control.html");
}
catch(Exception e){
	System.out.println(e);
	
}


     %>
     