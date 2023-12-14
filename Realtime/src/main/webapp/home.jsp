<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body{
            background-color: rgb(21, 21, 21);
            margin:0px;
            padding:0px;
        }
        .main
        {
           
            
            width: 100vw;
            height: 100vh;
            border-radius: 5%;
            border: 2px solid black;
            box-sizing: border-box;
            background-image:url(//cdn.wallpapersafari.com/43/55/xWmp82.jpg);
            
            
            justify-content: center;
            align-items: center;
        }
        h1{
            font-size: 60px;
            text-align: center;
        }
        .second
        {
           width:50vw;
           height:50vh;
          
        
           color: rgb(16, 16, 16);
           font-size: 30px;

        }
        a{
            transition: all;
            font-size: larger;
            text-decoration: wavy;
            color: black;   
        }
        a:hover{
           scale: 2;
           translate: scale(4);

        }
        li{
            margin: 53px;
        }
</style>
</head>
<body>
    <form class="main" action="homie">

        <h1>This is the HOme Page:</h1>
       
        <div class="second">
        <ol class="secclass">
            <li><a href="Search.jsp">Search customer</a></li>
            <li><a href="newuser.jsp">Add new customer</a></li>
            <li><a href="delete.jsp">Delete customer</a></li>
    
            
        </ol>
    </div>
    </form>
</body>
</html>