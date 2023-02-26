<?php
       $con=new mysqli("localhost","root","","SUPERMARKET");
       if($con->connect_error){
           die("Conection error".$con->connect_error);
       }
       $in="insert into prod_detail(p_id,p_name,unit_price,quan)values('$_GET[id]','$_GET[nm]','$_GET[un]','$_GET[qt]')";
       if($con->query($in)){
          echo '';
       }
       else
       {
          echo 'error in insertion'.$con->error;
       }
       $tot="update prod_detail set cost=unit_price*quan";
       if($con->query($tot))
       {
        echo ' ';
       }
       $ex="select * from prod_detail";
       $sel=$con->query($ex);
       if($sel->num_rows>0)
       {
            echo '<table border=2><tr><th>PRODUCT_ID</th><th>PRODUCT_NAME</th><th>UNIT_PRICE</th><th>QUANTITY</th><th>TOTAL</th></tr>';
            while($d=$sel->fetch_assoc())
            {
                echo '<tr><td>'.$d['p_id'].'</td><td>'.$d['p_name'].'</td><td>'.$d['unit_price'].'</td><td>'.$d['quan'].'</td><td>'.$d['cost'].'</td></tr>';
            }
       }
       
?>