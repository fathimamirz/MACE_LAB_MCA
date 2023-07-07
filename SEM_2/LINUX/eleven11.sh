select i in add sub mul quit
do
        case $i in
                "add") echo $(($1+$2));;
                "sub") echo $(($1-$2));;
                "mul") echo $(($1*$2));;
                "quit") break;;
                *) echo "Invalid option"
        esac
done
