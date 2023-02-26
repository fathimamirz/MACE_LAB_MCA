#include<stdio.h>
#include<stdbool.h>
int a[10],b[10],u[10];
int bita[]={0,0,0,0,0,0,0,0,0,0},bitb[]={0,0,0,0,0,0,0,0,0,0};
int main()
{
    int usize,asize,bsize,i,j;
    printf("\n Enter size of Universal set:");
    scanf("%d",&usize);
    printf("\n Enter elements:");
    for(i=0;i<usize;i++)
    {
        scanf("%d",&u[i]);
    }
    printf("\n Enter size of setA:");
    scanf("%d",&asize);
    printf("\n Enter elements:");
    for(i=0;i<asize;i++)
    {
        scanf("%d",&a[i]);
        for(j=0;j<usize;j++)
        {  if(a[i]==u[j])
               bita[j]=1;
        }
    }
    printf("\n Enter size of setB:");
    scanf("%d",&bsize);
    printf("\n Enter elements:");
    for(i=0;i<bsize;i++)
    {
        scanf("%d",&b[i]);
        for(j=0;j<usize;j++)
        {  if(b[i]==u[j])
               bitb[j]=1;
        }
    }
    printf("\n bitstring set A:\n{");
    for(i=0;i<usize;i++)
        printf("%d ",bita[i]);
    printf("}");
    printf("\n bitstring set B:\n{");
    for(i=0;i<usize;i++)
        printf("%d ",bitb[i]);
    printf("}");
    printf("\n UNION\n");
    printf("{");
    for(i=0;i<usize;i++)
       if(bita[i]||bitb[i]==true)
            printf("1 ");
       else
            printf("0 ");
    printf("}")  ;     
    printf("\nINTERSECTION\n");
    printf("{");
    for(i=0;i<usize;i++)
       if(bita[i]&&bitb[i]==true)
            printf("1 ");
       else
            printf("0 ");
    printf("}")  ;
    printf("\n DIFFERENCE\n");
    printf("{");
    for(i=0;i<usize;i++)
       if(bita[i]&&(!bitb[i])==true)
            printf("1 ");
       else
            printf("0 ");
    printf("}")  ;
}