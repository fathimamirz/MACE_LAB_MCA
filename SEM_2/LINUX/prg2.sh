file1="/var/log/syslog"
file2="/var/log/kern.log"
file3="/var/file"
mydate="^Apr 28"

for file in $file{1,2,3}
do
        if [[ -f $file ]]
        then
                echo "=========From file $file========"
                egrep "$mydate" /var/log/syslog | head
        else
                echo "==========File $file NOT found======"
        fi
done

