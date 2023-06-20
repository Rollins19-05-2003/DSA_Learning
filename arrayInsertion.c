#include<stdio.h>
int main()
{
    int arr[100], pos, n, value;
    printf("Enter the number of elements : ");
    scanf("%d",&n);

    printf("Enter %d elements",n);
    for(int i = 0; i<n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Enter the position where you want to add the number : ");
    scanf("%d", &pos);

    printf("Enter the value");
    scanf("%d", &value);
    // shifting the elements to its right 
    for(int i = n-1; i>=pos-1; i--){
        arr[i+1] = arr[i];
    }

    arr[pos-1] = value;

    printf("The resultant array is : ");
    for(int i = 0; i<=n; i++){
        printf("%d", arr[i]);
    }
    return 0;
}