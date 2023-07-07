#!/bin/bash
add()
{
	i=$1
	j=$2
	((k=i+j))
	echo Sum is $k
}
sub()
{
	i=$1
	j=$2
	((k=i-j))
	echo Sum is $k
}
mul()
{
	i=$1
	j=$2
	((k=i*j))
	echo Sum is $k
}
echo "Enter your option: 1: Add, 2:Subtract, 3: Multiply"
read i
case $i in
	1) add 1 2;;
	2) sub 1 2;;
	3) mul 1 2;;
esac

