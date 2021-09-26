System.out.println("Hello, I'll be checking if you're a cat today, Press enter to proceed >>> ");
String proceed = console.nextLine();

System.out.println("Who are you? ");
String name = console.nextLine();
System.out.println("Well hi " + name + " anyways lets get to the test");

System.out.println("What animal are you? ");
String animal = console.nextLine();
System.out.println("Hm " + name + " Looks like you're a " + animal);

System.out.println("Are you a cat? ");
String cat = console.nextLine();
System.out.println("Looks like you said " + cat + " to being a cat");

System.out.println("Last question, how old are you? ");
int age = console.nextInt();
System.out.println("So " + name + ", looks like you're " + age + "that would be" age / 15 + "in cat years");

System.out.println( name + " Press eneter if you'd like to see your results >>> ");
String proceed2 = console.nextLine();

System.out.println("Hey " + name + " here are your results: ");
System.out.println("𝗡𝗮𝗺𝗲 " + name);
System.out.println("𝗔𝗴𝗲 " + age);
System.out.println("𝗔𝗴𝗲 𝗜𝗻 𝗖𝗮𝘁 𝗬𝗲𝗮𝗿𝘀? " + age / 15);
System.out.println("𝗔𝗻𝗶𝗺𝗮𝗹 " + animal);
System.out.println("𝗜𝘀 𝗮 𝗖𝗮𝘁? " + cat);
System.out.println("Thank you " + name + ", Press enter again");
String proceed3 = console.nextLine();
System.out.println("Ｌｅａｖｅ <owo> ");
