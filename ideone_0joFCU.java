#include<stdio.h>
int main()
{ intn,i,j,c;
scanf("%d",&n);
int a[2][n],b=0;
char ch,cc;
scanf("&c",&cc);
scanf("&c",&ch);
for(i=0;i<2;i++)
for(j=0;j<n;j++)
scanf("%d",a[i][j]);
switch (ch)
{
	case m:
		for(i=0;i<n;i++)
		{b=b+a[i][c];
		c=1-c;
		}
		c=1;
		for(i=0;i<n;i++)
		{b=b-a[c][i];
		c=1-c;
		}
		printf("&d",b);
		break;
		case d:
			for(i=0;i<n;i++)
			{
				b=b+a[c][i];
			}
			printf("%d",b);
			break;
			default:
			break;
}}
			}
		/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}