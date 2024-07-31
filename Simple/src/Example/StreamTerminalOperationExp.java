package Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("Reflection","Collection","Stream","Structure","Sorting","State");
System.out.println("forEach:");
names.stream().forEach(System.out::println);

System.out.println("\ncollect(Name Starts with 'S')");
List<String> sNames=names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
sNames.forEach(System.out::println);

String concatenatedNames=names.stream().reduce("", (partialString,element) -> partialString + " " +element);
System.out.println("\nreduce (concatenated names):");
System.out.println(concatenatedNames.trim());

long count=names.stream().count();
System.out.println("\ncount:"+count);

Optional<String> firstName=names.stream().findFirst();
System.out.println("\nfindFirst:");
firstName.ifPresent(System.out::println);

boolean allStartsWithS=names.stream().allMatch(name -> name.startsWith("S"));
System.out.println("\nallMatch (all start with 'S')");
System.out.println(allStartsWithS);

boolean anyStartsWithS=names.stream().anyMatch(name -> name.startsWith("S"));
System.out.println("\nanyMatch (any starts with 'S'):");
System.out.println(anyStartsWithS);
	}

}
