#include<stdio.h>
#include<stdlib.h>
int getdata()
{
    int a;
    printf("\n Enter element to insert:");
    scanf("%d",&a);
    return a;
}
int main()
{
    int a[10],i,size,ch,n,pos;
    printf("\n Enter size of array:");
    scanf("%d",&size);
    for(i=0;i<size;i++)
       scanf("%d",&a[i]);
    printf("\n menu\n1.Insert at beginning\n 2.Insert at end\n 3.Insert at position\n4.Delete at beginning\n 5.Delete at end\n 6.Delete at position\n7.Display\n8.Exit\n");
    do{
        printf("\n Enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:n=getdata();
                   size++;
                   for(i=size-1;i>=0;i--)
                    {
                        a[i+1]=a[i];
                    }
                    a[0]=n;
                    break;
            case 2: n=getdata();
                    size++;
                    a[size-1]=n;
                    break;
            case 3: n=getdata();
                    size++;
                    printf("\n Enter position to insert");
                    scanf("%d",&pos);
                    for(i=size-1;i>=pos-1;i--)
                        a[i+1]=a[i];
                    a[pos-1]=n;
                    break;
            case 4: for(i=0;i<size-1;i++)
                    a[i]=a[i+1];
                    size--;
                    break;
            case 5: size--;
                    break;
            case 6: printf("\n Enter position to delete:");
                    scanf("%d",&pos);
                    for(i=pos-1;i<size;i++)
                        a[i]=a[i+1];
                    size--;
                    break;
            case 7: printf("\n Array:-\n");
                    for(i=0;i<size;i++)
                        printf("%d\t",a[i]);
                    break;
            case 8: exit(0);
            default: printf("\n Invalid entry\n");
        }
    }while(1);
}