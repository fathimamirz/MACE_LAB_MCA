#include<stdio.h>
void main()
{
    int que[10],front=0,rear=-1,ch,item,i;
    printf("\nMenu\n1.insert to queue\n2.Delete from queue\n3.Display\n4.Exit");
    do{
        printf("\n Enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:if(rear==9)
                       printf("Queue overflow");
                   else
                   {
                       printf("\n Enter element to insert:");
                       scanf("%d",&item);
                       rear++;
                       que[rear]=item;
                   } 
                   break;
            case 2:if(front==rear+1||(rear==-1))
                        printf("Queue empty");
                   else
                   {
                       item=que[front];
                       front++;
                       printf("%d is deleted",item);
                   }
                   break;
            case 3:for(i=front;i<rear+1;i++)
                        printf("%d\t",que[i]);
                    break;
            case 4:exit(0);
            default:printf("\nInvalid entry");
        }
    }while(1);
}