#include<stdio.h>
#include<stdlib.h>
int main(){
    int ch,top=-1,st[10],item,i;
    printf("\nMenu\n1.Push operation\n2.Pop operation\n3.Display stack\n4.Exit");
    do{
        printf("\n Enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:if(top==9)
                       printf("Stack overflow");
                   else
                   {
                       printf("\n enter element to push:");
                       scanf("%d",&item);
                       top++;
                       st[top]=item;
                   } 
                   break;
            case 2:if(top==-1)
                        printf("Stack underflow");
                    else
                    {
                        item=st[top];
                        top--;
                        printf("%d is popped",item);
                    }
                    break;
            case 3:for(i=top;i>=0;i--)
                      printf("%d\t",st[i]);
                    break;
            case 4:exit(0);
            default:printf("Invalid entry");
        }
    }while(1);
}