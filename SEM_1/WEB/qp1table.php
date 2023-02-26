<?php
      $con=new mysqli("localhost","root","","SUPERMARKET");
      if($con->connect_error){
          die("Conection error".$con->connect_error);
      }
      $tb="create table prod_detail(p_id int(3) primary key,p_name varchar(20) not null,unit_price int(2),quan int(2),cost int(2))";
      if($con->query($tb)===TRUE){
        echo 'Table prod_detail created';
      }
      else
      {
           echo 'Error in creating table'.$con->error;
      }
?>