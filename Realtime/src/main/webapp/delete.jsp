<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .mainn
    {
     margin:0px;
            padding:0px;
        background-image: url(//cdn.wallpapersafari.com/43/55/xWmp82.jpg);
       
        
        height: 100vh;
        width: 100vw;
        box-sizing: border-box;
        
    }
    label{
        font-size: 30px;

    }
    .container
    {
        margin: 8px;
        width: 50vw;
        height:50vh ;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }
    input,button{
        font-size: 20px;
        padding: 10px;
        margin: 10px;
    }
    button{
        margin: 34px;
    }
</style>
</head>
<body>
<form class="mainn" action="delete">
    <div class="container">

        <div>
            <label for="acno">Account:</label>
            <input type="text" placeholder="Enter the acc number to be deleted:" id="acno "  name="acno"><br>
            <label for="name">Customer name:</label>
            <input type="text" placeholder="Enter the acc name:" id="name "  name="name"><br>
        </div>
        <div>
        <button>Submit</button>
        <button>Reset</button>
        </div>
    </div>
    </form>

</body>
</html>