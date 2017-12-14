import java.util.Scanner;

public class TextGame {

	Scanner bim = new Scanner(System.in);
	String input;

	/*
	 * public void inpt(input) { input = bim.nextLine(); }
	 */
	public static void die() {
		println("You died.");
		System.exit(0);
	}

	public static void println(String input) {
		System.out.println(input);
	}
	public static void main(String[] args) {
		Scanner bim = new Scanner(System.in);
		String input;

		println("This is a simple text based game. Type exactly what is displayed in the parentheses or it will not be recognized. Type (PLAY) to play.");
		input = bim.nextLine();

		while (input.equals("PLAY")) {

			println("You wake up stranded on a beach. ");
			System.out.print("You notice sharks swimming in the water, miles of sand to your left and right, ");
			System.out.println("and a dense jungle behind you.");
			println("(enter the water, enter the jungle, walk left, walk right)");
			input = bim.nextLine();

			if (input.equals("enter the water")) {
				println("You start swimming and suddenly you feel a burst of pain. A shark has bitten your leg and pulls you under.");
				die();

			} else if (input.equals("walk left")) {
				println("You walk as much as you can, but nothing is found. Eventually, you collapse from dehydration.");
				die();
			} else if (input.equals("walk right")) {
				println("You walk for about 30 minutes before finding a small opening into the jungle leading to waterfall.");
				println("The water seems safe to drink, and something seems to be behind it.");
				System.out.println("(check the waterfall, drink the water)");
				input = bim.nextLine();

			}
			if (input.equals("drink the water")) {
				println("Cool and refreshing.");
				println("As you bend down to drink more, piranhas jump out and bite your face. Your balance is thrown off and you fall in.");
				die();
			}

			{
				if (input.equals("check the waterfall")) {
					println("The wreck of something sits here. Looks a lot like a ship of some sort. How could this get here?");
					println("(check the wreck)");
					input = bim.nextLine();

					if (input.equals("check the wreck")) {
						println("It looks like some sort of naval ship");
						println("An opening is visible.");
						println("(enter the ship)");
						input = bim.nextLine();

						if (input.equals("enter the ship")) {
							println("Its definitely a naval ship. The wreckage of a gun can be seen. Some planes can be seen as well. You see a skeleton in a naval outfit with the name \"D. Duenas\" on it.");
							println("Maybe this is how you got here?");
							println("(continue exploring)");
							input = bim.nextLine();
						}

						if (input.equals("continue exploring")) {
							println("You continue walking through the ship, and break in the bow of the ship leads into a small ravine.");
							println("Looking back at the ship, you can read the letters S, R, A, T, and O. The rest is scraped off or gone.");
							println("(exit the ravine, walk in the ravine)");
							input = bim.nextLine();
						}
					}
				}
			}

			if (input.equals("enter the jungle")) {
				println("You push through leaves and bushes and arrive at a fork leading left and right");
				println("(go left, go right)");
				input = bim.nextLine();

				if (input.equals("go left")) {
					println("You find a cave. Its a little scary and dark, but theres no going back now.");
					println("(enter the cave)");
					input = bim.nextLine();

					if (input.equals("enter the cave")) {
						println("You arrive at a section in the cave with slippery and rocky terrain, and the ground has erroded to the point that only a small walkway remains. Maybe you can make it?");
						println("There is also another walkway that seems safer, but is very dark.");
						println("(take the slippery path, take the dark path)");
						input = bim.nextLine();

						if (input.equals("take the slippery path")) {
							println("You take a couple steps and it seems fine, but then you slip off and fall down into the chasm.");
							die();
						} else if (input.equals("take the dark path")) {
							println("You walk very slowly through the passageway to avoid running into anything.");
							println("It pays off and you make it into a large circular chamber with something resembling an altar inside");
							println("(check the altar, check the walls)");
							input = bim.nextLine();

							if (input.equals("check the altar")) {
								println("You walk over and place your hands on the altar. Upon making contact, a man runs over");
								println(" and knocks you down, shouting unintelligibly about defiling the sacred altar to someone. ");
								println("He pulls out a knife and stabs you, still rambling like a madman.");
								die();
							}
							if (input.equals("check the walls")) {
								println("You walk around and feel the walls, eventually finding a hidden door. Its completely flat and can't be pulled opened from this side.");
								println("When pushed upon, it feels stuck. Maybe if it's hit with enough force it'll open?");
								println("(charge the door)");
								input = bim.nextLine();

								if (input.equals("charge the door")) {
									println("The force from your body did the trick. You burst into a room with a small mat resembling");
									println(" a bed and a table. Some mystery meat lies on the table.");
									println("(take a nap, eat the meat)");
									input = bim.nextLine();

									if (input.equals("take a nap")) {
										println("You wake up to a seemingly crazy man shouting and making loud noises at you.");
										println("His speech doesn't make much sense but he seems hostile.");
										println("(attack him, try to calm him down)");
										input = bim.nextLine();
									}
									if (input.equals("eat the meat")) {
										println("It tastes a little strange but it's sustainence nontheless.");
										println("During your meal, a seemingly crazy man appears and starts shouting and making loud noises at you.");
										println("He doesn't make sense to you but he seems hostile");
										println("(attack him, try to calm him down)");
										input = bim.nextLine();
									}
									if (input.equals("attack him")) {
										println("He pulls out a knife but seems very clumsy with it. Its easy to grab his wrist and pry the knife from him.");
										println("Without the knife, he shrinks back from you.");
										println("(kill him, spare him)");
										input = bim.nextLine();

										if (input.equals("kill him")) {
											println("You stab him and he dies.");
											println("There is nothing else in the room.");
											println("(return to the altar room)");
											input = bim.nextLine();

											if (input.equals("leave the room")) {
												println("");
											}
										} else if (input.equals("spare him")) {
											println("You put the knife away and you notice he starts to follow you everywhere you go.");
											println("(return to the altar room, inspect the man)");
											input = bim.nextLine();
										}
									}
									if (input.equals("try to calm him down")) {
										println("You try to calm him down but he can't understand what you're saying.");
										println("Then he gets angrier from something you said and he stabs you.");
										die();
									}

									if (input.equals("inspect the man")) {
										println("He's dressed in some sort of uniform.");
										println("There's nothing else here to note.");
										println("(return to the altar room)");
										input = bim.nextLine();
									}

									if (input.equals("return to the altar room")) {
										println("Back to the altar room. Nothing has changed.");
										println("(check the altar)");
										input = bim.nextLine();
									}

									if (input.equals("check the altar")) {
										println("You walk up to the altar and reach towards it but the madman pulls you back and reaches for it himself.");
										println("Upon touching the altar, his hand gets chopped off by a hidden blade.");
										println("He clutches his wrist where his hand once was, and a hidden door opens up");
										println("(enter the hidden door)");
										input = bim.nextLine();
									}

									if (input.equals("enter the hidden door")) {
										println("It's an old, unused path covered in vines and moss, and its semi lit.");
										println("Walking along the path brings you and the man to a fork in the road.");
										println("(walk left, walk right)");
										input = bim.nextLine();

										if (input.equals("walk left")) {
											println("You continue down the path and it becomes a little brighter. A bright light can be seen, and in excitement to leave the cave, you race towards it.");
											println("You run as fast as you can with the man behind you, but when you get near you hear the boiling of lava.");
											println("You try to stop but your speed carries you over the edge.");
											die();
										} else if (input.equals("walk right")) {
											println("You continue and the path starts to slope up. Seems like it leads up to the surface. Hopefully.");
											println("True to logic, you emerge onto a grassy area. There is a destroyed machine semi buried in the dirt.");
											println("(check the destroyed machine)");
											input = bim.nextLine();
										}
										if (input.equals("check the destroyed machine")) {
											println("It's a downed plane. Checking inside the cockpit shows its a japanese plane and a skeleton in a flight suit labeled \"T. Vu\" .");
											println("It's a far out idea but maybe it's possible to repair the plane?");
											println("(inspect the plane)");
											input = bim.nextLine();
										}

										if (input.equals("inspect the plane")) {
											println("You read its an A6M1 Mitsubishi Zero. It's WWII era...");
											println("It's been this long and you realize that you can't recall the year. The plane seems fairly old but new enough to be operable if repaired.");
											println("It's nose is semi damaged but the soft dirt helped keep it intact. The engine inside is falling out of the nose, and some pieces are coming out.");
											println("You can't remember the year, but you can recognize the parts of the engine that are present and missing.");
											println("You know its a nakajima sakae 12 engine. It's a two-row 14 cylinder air-cooled radial engine.");
											println("The valvetrain is a little damaged, some pushrods are a little bent and some screws need replacing. Other than that its looking pretty good.");
											println("Taking a look at the fuselage, its damaged more than the engine and will need some real repair. Where can materials be found to repair this thing?");
											println("(start exploring)");
											input = bim.nextLine();
										}

										if (input.equals("start exploring")) {
											println("There's two possible places to go to.");
											println("There's a ravine to the right and a path through some trees leading to a river.");
											println("(travel to ravine, travel to river)");
											input = bim.nextLine();
										}
										if (input.equals("travel to river")) {
											println("You motion to the man to follow you to the river.");
											println("The river is running fairly quickly, but theres nothing of real value here. Nothing visible anyways. The water is very clear and looks very fresh.");
											println("(enter the river, travel to ravine)");
											input = bim.nextLine();
										}

										if (input.equals("travel to ravine")) {
											println("You motion to the man to follow you to the ravine");
											println("It's a small ravine and you jump down into it and start walking.");
											println("Theres another huge metal machine here. It's hard to tell what it is from this angle.");
											println("(investigate further)");
											input = bim.nextLine();
										}

										else if (input.equals("enter the river")) {
											println("There doesn't seem to be anything hostile, but there's something metallic in here as well. Doesn't seem to have an opening around your position.");
											println("(search for an opening)");
											input = bim.nextLine();
										}

										if (input.equals("search for an opening")) {
											println("Inspecting the river floor reveals a log surrounding a metal tube with a hatch. This is probably the entrance to the machine.");
											println("The log has been blocking the water from surrounding and entering the hatch. Did someone do this? It's hard to think that the log somehow floated around the hatch by");
											println(" itself.");
											println("Moving to the hatch, you grab the wheel to open it but it's shut tight. The man walks over and does what he can to help pull with his one hand.");
											println("It moves a little but you need better leverage to really get a good grip, although maybe it could also be opened with just a little more force.");
											println("(change footing, try pulling harder)");
											input = bim.nextLine();

											if (input.equals("change footing")) {
												println("You move your feet around to get a better grip, but you slip.");
												println("Without a grasp on the river bed, the current rapidly pushes you along, and your head collides with the rocks in the river.");
												die();
											}

											if (input.equals("try pulling harder")) {
												println("The wheel spins open and you can lift the hatch. You and the man climb inside.");
												println("Inside, the name U-511 is printed on a file sitting on a desk. It makes no sense how something like this could have gotten here.");
												println("The most important thing is that it probably has the parts you need.");
												println("(search for parts)");
												input = bim.nextLine();

											}

											if (input.equals("search for parts")) {
												println("Theres a pile of scrap sheet metal leaning against the side of the submarine. You walk over and pick it up, and its not that heavy. Together, you and the man could probably ");
												println("bring it all back to the plane to repair the fuselage.");
												println("Theres also some parts that look like the ones you need to fix up the engine. They're not that much to carry and you could probably take it back yourself.");
												println("(take the sheet metal, take the engine parts)");
												input = bim.nextLine();

												if (input.equals("take the sheet metal")) {
													println("You and the man together grab the sheet metal. You throw it out of the hatch of the submarine, and then you follow. You carry it back to the plane.");
													println("You have the sheet metal now but you didn't think about how you were going to attach it.");
													println("Theres still the ravine path to explore so you should head there now.");
													println("(explore the ravine)");
													input = bim.nextLine();
												} else if (input.equals("take the engine parts")) {
													println("You grab all the parts you think you'll need for the engine and then climb out of the submarine with the man.");
													println("When you get back to the plane, you can see you got all the right parts, but you have no tools to work with.");
													println("Theres still the ravine path to explore so you should head there now.");
													println("(explore the ravine)");
													input = bim.nextLine();
												}
												if (input.equals("explore the ravine")) {
													println("You walk along the ravine, and eventually reach a large metal machine, with the letters S, R, A, T, and O visible. It looks like another naval ship. How in hell are these things getting here?");
													println("Nonetheless, if its a military ship, it should have the tools you need inside.");
													println("(enter the ship)");
													input = bim.nextLine();
												}
												if (input.equals("enter the ship")) {
													println("Walking through a hole in the side, you pass by a skeleton lying on the ground. You walk through the halls of the ship with the man looking for any kind of tool chest or storage.");
													println("After searching for a seemingly long amount of time, you find a room with huge engines and a tool cabinet.");
													println("Searching throught the toolbox provides you with the tools you need to repair the plane. You grab some of the tools, give the rest to the man, and return to the plane.");
													println("(return to the plane)");
													input = bim.nextLine();
												}
												if (input.equals("return to the plane")) {
													println("You return to the plane with the required tools. You immediately set to work repairing whatever it may be.");
													println("");
													println("It starts to get dark so you stop to gather the tools to store them somewhere.");
													println("You find a nice cool spot under a palm tree to rest.");
													println("The plane is looking good and you can't wait to finish it tomorrow.");
													println("");
													println("You wake up at an unknown time, but the moon is high in the sky. Theres some sort of rustling coming from the nearby tall grass.You haven't seen any other signs of life other than the man, who is sleeping, but it should be okay.");
													println("You close your eyes again, but you get thrown onto your stomach by whatever just jumped out of the bush!");
													println("It jumps on your back so you can't see what it is, and its starts to slash your back. Not long after though, the man knocks it away with the wrench you were using to build the plane. You can stand up, relatively unharmed.");
													println("From what you can see in the dark of night, it crawls on all fours and is kind of skinny. It also must have sharp claws or something to have scratched up your back.");
													println("It runs off into the tall grass again.The man helps you back up. He's been strangely quiet since he became an ally. You tell him we should finish the plane and leave before any more of those things come back.");
													println("(complete the plane)");
													input = bim.nextLine();
												}
												
												if(input.equals("complete the plane"))
												{
													println("You bury yourselves in work with the plane, but you keep an ear out for the crawler monsters.");
													println("You work until morning and complete the plane by the time the sun is fully up. There is still no sign of the crawler monster.");
													if(input.equals("take the engine parts"))
													{
														println("conrgatz you picked up engine parts");
													}
												}
													

												}

											}

										}

									}
								}
							}
						}
					}
				}
			}
		}
	}
