<html>
    <head>
        <script type='text/javascript'>
            fuction validate(){
                if(document.reg.name.value===""){
                    alert('Name is required');
                    document.reg.name.focus();
                    return false;
                }
                
                if(document.reg.gen.value===""){
                    alert('Gender is required');
                    document.reg.gen.focus();
                    return false;
                }
                
                if(document.reg.dob.value===""){
                    alert('Date of birth is required');
                    document.reg.dob.focus();
                    return false;
                }
                
                if(document.reg.add.value===""){
                    alert('Address is required');
                    document.reg.add.focus();
                    return false;
                }
                
                if(document.reg.phn.value===""){
                    alert('Phone number is required');
                    document.reg.phn.focus();
                    return false;
                }
                
                if(document.reg.gua.value===""){
                    alert('Guardian is required');
                    document.reg.gua.focus();
                    return false;
                }
                
                if(document.reg.cou.value===""){
                    alert('Gender is required');
                    document.reg.cou.focus();
                    return false;
                }
            }
        </script>
        </head>
        <body>
            <form action="" method="" name="reg" onsubmit="return(validate());">
            <table border="2">
                <th>NAME</th><td><input type="text" name="name"></td>
                <th>GENDER</th><td>Male<input type="radio" name="gen">Female<input type="radio" name="gen">Others<input type="radio" name="gen"></td>
                <th>Date of Birth</th><td><input type="date" name="dob"></td>
                <th>Address</th><td><input type="textarea" name="add"></td>
                <th>Phone number</th><td><input type="text" name="phn"></td>
                <th>Guardian</th><td><input type="text" name="gua"></td>
                <th>Hobbies</th><td>Singing<input type="checkbox" name="hob"><br>Dancing<input type="checkbox" name="hob"><br>Reading<input type="checkbox" name="hob"><br>Others<input type="text" name="hob"></td>                
                <th>Extra Curricular</th><td><input type="text" name="ext"></td>
                <th>Courses</th><td>BCA<input type="radio" name="cou">BBA<input type="radio" name="cou">Bsc<input type="radio" name="cou"></td>
                <td colspan="2"><input type="submit" value="SUBMIT"></td>
            </table>
        </body>
    </html>