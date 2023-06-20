#include <stdio.h>
#include<stdlib.h>
struct node {
    int data;
    struct node *next;
};

// Recursive function to reverse the linked list
void reverse(struct node **head_ref)
{
    // Base case: empty list or single element
    if(*head_ref == NULL || (*head_ref)->next == NULL)
        return;

    // Recursive case: reverse the rest of the list
    struct node *rest = (*head_ref)->next;
    reverse(&rest);

    // Link the first element to the end of the reversed list
    (*head_ref)->next->next = *head_ref;
    (*head_ref)->next = NULL;

    // Update the head of the reversed list
    *head_ref = rest;
}

// Utility function to create a new node
struct node *new_node(int data)
{
    struct node *n = malloc(sizeof(struct node));
    n->data = data;
    n->next = NULL;
    return n;
}

// Utility function to print the linked list
void print_list(struct node *head)
{
    while (head != NULL) {
        printf("%d --> ", head->data);
        head = head->next;
    }
    printf("null");
    printf("\n");
}

int main()
{
    struct node *head = new_node(1);
    head->next = new_node(2);
    head->next->next = new_node(3);
    head->next->next->next = new_node(4);

    print_list(head);
    reverse(&head);
    print_list(head);

    return 0;
}
