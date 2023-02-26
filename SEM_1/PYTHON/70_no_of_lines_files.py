inf=0

try:
    file1=input("Enter the file name: ")
    inf=open(file1,'r')
    print("Number of lines in file= ",len(inf.readlines()))
    
except IOError as io:
    print(io)
finally:
    if inf:inf.close()