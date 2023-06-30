set serveroutput on
create function findMax(x in number,y in number)
return number is
 z number(2);
begin 
if x>y then
 z:=x;
else
 z:=y;
end if;
return z;
end;

declare
a number(2);
b number(2);
c number(2);
begin
a:=&a;
b:=&b;
c:=findMax(a,b);
dbms_output.put_line('Max of '||a||' , '||b||' is: '||c);
end;






