#include<stdio.h>
#include<stdlib.h>
struct node {
	int data;
	struct node *next;
}                 ;
struct node *start;
void push() {
	int x;
	struct node *ptr=(struct node*)malloc(sizeof(struct node*));
	if(ptr==NULL) {
		printf("\nCan't push element");
	}
	else {
		printf("\nEnter the value : ");
		scanf("%d",&x);
		if(start==NULL) {
			ptr->data=x;
			ptr->next=NULL;
			start=ptr;
		}
		else {
			ptr->data=x;
			ptr->next=start;
			start=ptr;
		}
	}
}
void pop() {
	int x;
	struct node *ptr;
	if(start==NULL) {
		printf("\nUnderflow");
	}
	else {
		x=start->data;
		ptr=start;
		start=start->next;
		free(ptr);
		printf("Element popped - %d",x);
	}
}
void search() {
	int i=1,f=0,x;
	struct node *ptr;
	ptr=start;
	if(ptr==NULL) {
		printf("\nStack is empty");
	}
	else {
		printf("\nEnter element : ");
		scanf("%d",&x);
		while(ptr!=NULL) {
			if(ptr->data==x) {
				f=1;
				break;
			}
			i++;
			ptr=ptr->next;
		}
		if(f==0)
			printf("\nItem not found");
		else
			printf("\nItem found at position %d",i);
	}
}
void display()
{
    struct node *ptr=(struct node*)malloc(sizeof(struct node *));
    ptr=start;
    while(ptr->next!=NULL){
        printf("%d\t",ptr->data);
        ptr=ptr->next;
    }
    printf("%d",ptr->data);
}
int main() {
	int ch=0;
	do {
		printf("\n\n1:Push");
		printf("\n2:Pop");
		printf("\n3:Linear search");
		printf("\n4:Display");
		printf("\n5:Exit");
		printf("\nEnter your choice : ");
		scanf("%d",&ch);
		switch(ch) {
			case 1:push();
			break;
			case 2:pop();
			break;
			case 3:search();
			break;
			case 4:display();
			break;
			case 5:exit(0);
			break;
			default:printf("\nInvalid choice");
		}
	}while(1);
	return 0;
}