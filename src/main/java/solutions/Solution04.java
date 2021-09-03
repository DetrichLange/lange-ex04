/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Detrich Lange
 */

package solutions;
import java.util.Scanner;

/*
Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and
injects those into a story that you create.
    Use a single output statement for this program.
    If your language supports string interpolation or string substitution, use it to build up the output.
        e.g. use printf() instead of println()

1: Prompt user for noun
2: Save input to string Inputnoun
3: Prompt user for verb
4: Save input to string Inputverb
5: Prompt user for adverb
6: Save input to string Inputadverb
7: Prompt user for adjective
8: Save input to string Inputadjective
9: Print ("Did you %s your %s %s %s? That's not very funny, but okay.", Inputverb, Inputadjective, Inputnoun, Inputadverb)
 */

public class Solution04
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a noun:");
        String Inputnoun = in.nextLine();
        System.out.print("Enter a verb:");
        String Inputverb = in.nextLine();
        System.out.print("Enter an adjective:");
        String Inputadjective = in.nextLine();
        System.out.print("Enter an adverb:");
        String Inputadverb = in.nextLine();

        System.out.printf("Did you %s your %s %s %s? That's not very funny, but okay.", Inputverb, Inputadjective, Inputnoun, Inputadverb);
    }
}
