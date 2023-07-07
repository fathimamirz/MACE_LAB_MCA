#!/bin/bash
pattern=$1
IFS=":"
while read account password uid gid name directory shell
do
    if [[ $(echo $name | grep -i -c "$pattern") -gt 0 ]]
    then
        echo "$account:$password:$uid:$gid:$name:$directory:$shell"
    fi
done < /etc/passwd
