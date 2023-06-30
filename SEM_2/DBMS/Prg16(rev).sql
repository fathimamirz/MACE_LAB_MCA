set serveroutput on
declare
strs varchar(10);
rev varchar(10);
len number ;
begin
strs:='&k';
dbms_output.put_line(strs);
len:=Length(strs);
dbms_output.put_line(len);
for i IN REVERSE 1.. len
loop
rev:=rev||Substr(strs,i,1);
end loop;
dbms_output.put_line('given string :'||strs);
dbms_output.put_line('reverse string :'||rev);
end;