<?php
    $con=new mysqli("localhost","root","");
    if($con->connect_error){
        die("Conection error".$con->connect_error);
    }
    $db="create database SUPERMARKET";
    if($con->query($db))
    {
        echo 'Database created';
    }
    else
    {
        echo 'Error in creating database'.$con->error;
    }
?>