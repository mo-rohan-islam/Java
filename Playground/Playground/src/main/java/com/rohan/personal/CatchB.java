/*
 * The Chase Game (100 Marks)
Company HR has decided to conduct entertainment and fun activities for the quarter. One such activity is The Chase Game. In the game, there will be two teams, a chasing team and an escaping team. The game will be played in a maze of N*N slots where only one member will be present at a particular slot.

HR has divided the employees into two teams - 

Team Red (Chasing Team)

Team Blue (Escaping Team)


Team Red will try to chase and catch the team Blue members. There are few conditions though for the game:

One person can catch only one person.

A person can catch the member only in the same row.

For example: A member of Team Red has two members of Team Blue in his row then he can catch only one of them. If the member was in the same column he cannot catch him.

A Red team member cannot catch a member of the Blue team if he is more than D units away. 


A member of the Red team will be represented by R and a member of the Blue team will be represented by B. HR wants to know the maximum number of Blue team members which will be caught by Red Team members given the positions of members in the maze. Can you help HR so they can prepare for the gifts accordingly for the winners?


Example:

Given below is a maze of 4*4. A member of Team Red cannot catch a Blue Team member which is more than 2 units away. A single slot is considered a single unit. 





Row 1: Both the Blue team members can be caught by the Red team members.

Row 2: The Red team member can catch two of the Blue team members. But as one person can catch only one person, only one of them will be caught.

Row 3: Both the Blue team members can be caught as both are in reach of Red team members.

Row 4:  Both the Blue team members can be caught as both are in reach of Red team members.


The total number of Blue team members which can be caught are 7.




Input Format
The first line of input consists of the numbers of test cases, T.

The first line of each test case consists of two space-separated integers, N and D respectively.

Next N lines each consists of N space-separated integers representing the position of Red team member or Blue Team members represented by R and B respectively.



Constraints
1<= T <=10

1<= N <=100

1<= D <=N



Output Format
For each test case, print the maximum number of Blue team members which can be caught.

Sample TestCase 1
Input
1
4 2
R R B B
B B B R
R B R B
R B B R
Output
7
 * 
 */

package com.rohan.personal;

import java.util.Scanner;

public class CatchB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < testCases; i++) {
			String metaInput = scan.nextLine();
			int N = Integer.parseInt(metaInput.substring(0, 1));
			int D = Integer.parseInt(metaInput.substring(2));

			String[][] arr = new String[N][N];
			for (int j = 0; j < N; j++) {
				String rowInput = scan.nextLine();
				String[] row = rowInput.split(" ");
				arr[j] = row;
			}

			int count = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (arr[j][k].equals("R")) {
						for (int l = 1; l <= D; l++) {
							if ((k + l) < N && arr[j][k + l].equals("B")) {
								++count;
								break;
							} else if (k >= l && arr[j][k - l].equals("B")) {
								++count;
								break;
							}
						}
					}
				}
			}

			System.out.println(count);
		}

		scan.close();

	}

}
