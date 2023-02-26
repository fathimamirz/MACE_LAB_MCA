#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a[10],i,j,item,low,high,mid,n,temp,ch;
    printf("\n Enter array size:");
    scanf("%d",&n);
    printf("\n enter array elements:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n Menu\n1.Linear search\n2.Binary search\nEnter your choice");
    scanf("%d",&ch);
    printf("\n Enter element to search:");
    scanf("%d",&item);
    switch(ch)
    {
        case 1: for(i=0;i<n;i++)
                {
                    if(a[i]==item){
                        printf("%d is found",item);
                        exit(0);
                    }
                }
                printf("%d not found",item);
                break;
        case 2:
               for(i=0;i<n;i++)
               {
                   for(j=i+1;j<n;j++){
                       if(a[i]>a[j])
                       {
                           temp=a[i];
                           a[i]=a[j];
                           a[j]=temp;
                       }
                   }
               }
               printf("\n Array\n");
               for(i=0;i<n;i++)
                   printf("%d\t",a[i]);
               low = 0;
               high = n - 1;
               mid = (low+high)/2;
               while (low <= high) {
                     if(a[mid] < item)
                           low = mid + 1;
                     else if (a[mid] == item) 
                     {
                            printf("\n%d found at location %d", item, mid+1);
                            break;
                    }
                    else
                            high = mid - 1;
                    mid = (low + high)/2;
                }
                if(low > high)
                printf("Not found! %d isn't present", item);
                break;
        default:printf("\n invalid entry");
    }
}
