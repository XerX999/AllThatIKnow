package CodeSammlungen;

public class _003IncrementDecrement {

	public static void main(String[] args) {
		int i = 1;
		i = ++i;
		System.out.println(i); // 2
		int j = 1;
		j = j++;
		System.out.println(j); //1

		/*
		 * Präinkrement erhöht die Variable vor dem Zugriff
		 * Postinkrement nach dem Zugriff
		 * Man sieht dass j in zweiten Beispiel zuerst zugewiesen wird und damit bleibt j gleich. erst nachdem j sich selbst neu zugewiesen wird,
		 * wird es inkrementiert und damit kommt das inkrement nicht zum vorschein.
		 */
		
		//Sleepy opperator -=-
		j = 10;
		j -=- j + 3;
		System.out.println(j);
		
		i = 10;
		i +=- i;
		System.out.println(i);
		
		/*
		 * anscheinend ist der Verbundopperator vor dem = und danach eine Vorzeichen änderung
		 */
	}

}
