sen=input("Enter the sentence : ")
n=""
for x in sen:
    if(x.isalpha() or x==' '):
        n+=x
print(len(n.split()))
