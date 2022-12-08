//First.java  
import java.applet.Applet;  
import java.awt.Graphics;  
public class First extends Applet{ 

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class CYOC2 {
    private static Scanner input = new Scanner(System.in);
    private static String weapon;
    private static boolean valid;

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to \"The Quest of a Century!\" ");
        System.out.println("NOTES:");
        System.out.println("1. The game will only recognize words that are CAPITALIZED in the prompts.");
        System.out.println("2. You do not have to type your inputs in caps. The game is smarter than that!");
        System.out.println("3. If you input something different, you will be asked to try again.");
        enter();

        game();
    }

    private static void game() {
        System.out.println("You have awoken in a cold sweat, a feeling of longing ruling your thoughts.");
        System.out.println("The lingering effects of a strange dream that is quickly fading from memory, leaving behind only a misty but clear picture of a fair maiden in distress.");
        System.out.println("The last thing you remember is her calling out your name, pleading for you to rescue her from a wicked dragon.");
        enter();
        System.out.println("This is motivation enough to spring you into action, you pack a bundle of moldy cheese and what is left of your stale bread.");
        System.out.println("You venture into the village square and climb atop an old barrel to make an announcement.");
        enter();
        System.out.println("“I am hereby proclaiming my undying love for the maiden of my dreams. Last night, she came to me in a vision, begging for help and rescue from the evil clutches of a dragon.");
        System.out.println("Today I will set off to find her, save her, and bring her home for us to be wed on the day of the autumn equinox.”");
        enter();
        System.out.println("The town cheers, rallying around the cause of true love.");
        System.out.println("Out of their excitement for you they offer up supplies that might help you in your grand journey.");
        System.out.println("What armor do you choose? LEATHER (light and weak) or IRON (heavy and strong)?");

        String armor = input.nextLine().toLowerCase();
        valid = false;


        while (!valid) {
            if (armor.equals("leather") || armor.equals("iron"))
                valid = true;
            else {
                System.out.println("Hmm I didn't understand that, try again.");
                armor = input.nextLine().toLowerCase();
            }
        }
        switch (armor) {
            case "leather":
                System.out.println("You have chosen the leather armor.");
                break;
            case "iron":
                System.out.println("You have chosen the iron armor.");
                break;
        }
        System.out.println("What weapon do you choose? BOW or SWORD?");
        weapon = input.nextLine().toLowerCase();
        valid = false;

        while (!valid) {
            if (weapon.equals("bow") || weapon.equals("sword"))
                valid = true;
            else {
                System.out.println("Hmm I didn't understand that, try again.");
                weapon = input.nextLine();
            }
        }
        if (weapon.equals("bow")) {
            System.out.println("you have chosen the BOW weapon.");
            enter();
            System.out.println("You come across a canyon on your journey. You use some rope on the ground next to you and one of your arrows to make a zipline across the canyon.");
            System.out.println("Friction doesn't apply in this specific scenario, so you slide across the canyon with ease.");
            enter();
            System.out.println("Exhausted from your journey so far, you collapse to the ground and pass out.");
            enter();
            System.out.println("You awake to a gaggle of women leaning over you speaking in hushed tones.");
            System.out.println("As your eyes flutter open a collective gasp escapes all 5 of them. You sit upright, very disoriented and trying to take in your surroundings.");
            System.out.println("Suddenly you remember your triumph over the first obstacle in your journey and how you collapsed in the village out of exhaustion late last night. ");
            System.out.println("you spring to your feet and excitedly inform the women of your noble quest.");
            enter();
            System.out.println("The women, seeing your weapon and armor, collectively come to the conclusion that you must be a knight.");
            enter();
            System.out.println("And upon coming to this conclusion, they quickly tell you about the problem ailing their small village.");
            enter();
            System.out.println("A band of ogres inhabit the woods beyond, and they terrorize the people of the village by destroying homes and kidnapping people.");
            System.out.println("The women beg you to slay the beasts and save their village before continuing your quest.");
            System.out.println("Filled with a sense of purpose you agree to absolve this village of its woes and to slay the ogre.");
            enter();
            System.out.println("The women lead you to the leader of their village, and you begin to collaborate with her to formulate a plan to take down the ogre.");
            System.out.println("After reaching a conclusion with the village leader, you prepare for battle.");
            System.out.println("All your armor is freshly polished and prepared, your weapon is sharpened and revived.");
            System.out.println("The whole village gathers at the edge of the woods to bid you farewell and good luck as you set off on yet another journey.");
            enter();
        } else {
            System.out.println("you have chosen the SWORD weapon.");
            enter();
            System.out.println("You thank all of the other villagers for their kindness, setting off with a satchel stocked with fruit and dried meat.");
            System.out.println("You step into the forest, not knowing what lies ahead but hoping to find the romance you’ve dedicated yourself towards.");
            enter();
            System.out.println("You walk for what feels like hours, watching the sun crawl across the sky and observing all the trees and plants you walk past.");
            enter();
            System.out.println("ust as you are about to stop and take a break against the trunk of a tree, you notice a peculiar section of thorns.");
            System.out.println("Upon further investigation, the section extends into what appears to be a wall of thorns, extending to over four times your height.");
            System.out.println("You stare at it for a few seconds, worrying about it before a small grin comes across your face. Your first obstacle.");
            System.out.println("Do you try to go AROUND or hack THROUGH?");
            String thornWall = input.nextLine().toLowerCase();
            valid = false;
            while (!valid) {
                if (thornWall.equals("around") || thornWall.equals("through"))
                    valid = true;
                else {
                    System.out.println("Hmm, didn't catch that, try again.");
                    thornWall = input.nextLine();
                }
            }

            if (thornWall.equals("around")) {
                System.out.println("You decide to walk along the wall, hoping you will find something or someone to help you before night falls.");
                System.out.println("A couple hours pass and the sun has started to sink behind the trees. With every step you take, your hopes of finding anything dwindles to nearly nothing before you ");
                System.out.println("find what appears to be a small opening in the wall, with two guards on either side of it.");
                System.out.println("You barely have time to register that there are even people standing there before you collapse onto the forest floor, exhausted and incredibly dehydrated from your journey.");
                enter();
                System.out.println("You awake to a gaggle of women leaning over you speaking in hushed tones.");
                System.out.println("As your eyes flutter open a collective gasp escapes all 5 of them. You sit upright, very disoriented and trying to take in your surroundings.");
                System.out.println("Suddenly you remember your triumph over the first obstacle in your journey and how you collapsed in the village out of exhaustion late last night. ");
                System.out.println("you spring to your feet and excitedly inform the women of your noble quest.");
                enter();
                System.out.println("The women, seeing your weapon and armor, collectively come to the conclusion that you must be a knight.");
                enter();
                System.out.println("And upon coming to this conclusion, they quickly tell you about the problem ailing their small village.");
                enter();
                System.out.println("A band of ogres inhabit the woods beyond, and they terrorize the people of the village by destroying homes and kidnapping people.");
                System.out.println("The women beg you to slay the beasts and save their village before continuing your quest.");
                System.out.println("Filled with a sense of purpose you agree to absolve this village of its woes and to slay the ogre.");
                enter();
                System.out.println("The women lead you to the leader of their village, and you begin to collaborate with her to formulate a plan to take down the ogre.");
                System.out.println("After reaching a conclusion with the village leader, you prepare for battle.");
                System.out.println("All your armor is freshly polished and prepared, your weapon is sharpened and revived.");
                System.out.println("The whole village gathers at the edge of the woods to bid you farewell and good luck as you set off on yet another journey.");
                enter();

            } else if (thornWall.equals("through")) {
                System.out.println("You try to hack through the wall.");
                input.next();
                System.out.println("The thorns are too thick and sharp to hack through. they stab you and you bleed out an die in the wall.");
                System.out.println("YOU DIED. GAME OVER.");
                game();
            }
        }
                System.out.println("You encounter the ogre not but a mile in. A large oaf of a creature, you are much more nimble than he is. ");
                System.out.println("What do you do? Do you ATTACK him or try to OUTSMART him?");
                String ogre = input.nextLine().toLowerCase();
                valid = false;
                while (!valid) {
                    if (ogre.equals("attack") || ogre.equals("outsmart"))
                        valid = true;

                    else {
                        System.out.println("hmm, didn't catch that. Try again.");
                        ogre = input.nextLine();
                    }

                }
                if (ogre.equals("outsmart")) {
                    System.out.println("You try to outsmart the ogre.");
                    enter();
                    System.out.println("Although you are more nimble, the ogre is much smarter than you. He sees your plan coming from a mile away.");
                    System.out.println("The ogre kills you and you die a miserable gruesome death. So much for trying to save the princess.");
                    System.out.println("YOU DIED. GAME OVER.");
                    enter();
                    game();
                    return;
                } else {
                    System.out.println("you attack the ogre with your " + weapon + ".");
                    enter();
                    System.out.println("He swings at you with a large tree branch but you dodge across the mossy forest floor.");
                    System.out.println("You attack him until the ogre finally falls.");
                    enter();
                    System.out.println("Using your bloodied " + weapon + ", you saw off his ear and bring it back to the village as a trophy.");
                    enter();
                }

            System.out.println("You return to the village triumphant. The villagers cheer and the leader bestows you with one of her very own protective necklaces.");
            System.out.println("The villagers prepare a feast and you fill your tummy until you might burst.");
            System.out.println("Grand tales are told and many laughs are exchanged.");
            System.out.println("You are invited to stay and defend the village from the ogres, and are even offered a home that they will begin to build as soon as your approval is given.");
            enter();
            System.out.println("What do you do? do you STAY and protect or LEAVE and continue on your journey?");
            String decision = input.nextLine().toLowerCase();
            valid = false;
            while (!valid) {
                if (decision.equals("stay") || decision.equals("leave"))
                    valid = true;
                else {
                    System.out.println("hmm, didn't catch that. Try again.");
                    decision = input.nextLine();

                }
                if (decision.equals("stay")) {
                    System.out.println("You win! The princess was actually an evil witch trying to lure you into her trap.");
                    game();
                }


                if (decision.equals("leave")) {
                    System.out.println("At some point in the night, you are approached by a young boy.");
                    System.out.println("“Why don’t you want to stay with us?” he asks.");
                    enter();
                    System.out.println("“Oh child, it’s not that I don’t want to stay with you, but I have a noble quest that I wish to complete.");
                    System.out.println("I am journeying to save a beautiful princess from an evil dragon.”");
                    enter();
                    System.out.println("“Do you think you will ever return and live here?”");
                    enter();
                    System.out.println("“Maybe one day with my beautiful maiden at my side”");
                    enter();
                    System.out.println("“Oh but must you venture into the woods filled with dangers untold?”");
                    enter();
                    System.out.println("“Whatever do you mean?”");
                    enter();
                    System.out.println("“There are oh too many stories of deadly monsters who kill you painfully, evil witches ");
                    System.out.println("who lure you to your death, and even just the vastness of the forest, able to swallow you with no way out.”");
                    enter();
                    System.out.println("“Oh my boy those are but tall tales, stories told to scare you into behaving.");
                    System.out.println("I believe love to be stronger than any opponent out there, you mustn't worry for my safety, dear boy.”");
                    enter();
                    System.out.println("“I think it would be best for you to live here, where it’ll be safe and you can be happy.”");
                    enter();
                    System.out.println("After a long night of celebration, you awake the next morning with the decision made. ");
                    System.out.println("You linger a little while in your room, taking everything in for what may be the last time.");
                    System.out.println("You make your way to the village leader, not too eager to tell her that you won’t be staying and must continue on your journey.");
                    System.out.println("She doesn’t show much emotion upon hearing the news, only taking a deep breath and wishing you luck,");
                    System.out.println("as well as allowing you to take any provisions you may need. You thank her and leave, preparing a satchel full of fresh fruits and delicious ogre Jerky.");
                    enter();
                    System.out.println("The whole village is sad to see you leave, many people approaching you to say their goodbyes- some of which you don’t quite recognize,");
                    System.out.println("then again you don’t remember a lot of last night.");
                    enter();
                    System.out.println("You set off, bursting with pride at having defeated one monster already. You believe the dragon will be quickly vanquished as well.");
                }



            }
            System.out.println("You see a tower in the distance, with a dragon at the base.");
        enter();
        System.out.println("From where you are, they both look so small, the dragon no bigger than your pinkie finger, adding to your illusion of power. ");
        enter();
        System.out.println("After not too long, you arrive at the tower, and the princess notices you just before the dragon does.");
        enter();
        System.out.println("She calls out to you but quickly stops herself, but not before the dragon takes note of your presence.");

            if (weapon.equals("bow")) {
                System.out.println("You shoot the dragon for far away, through its eye and puncturing its brain. It dies instantly.");
                enter();
                System.out.println("The princess steps out of the castle and laughs menacingly.");
                enter();
                System.out.println("She is actually and evil witch who was luring you to your doom. She kills you and takes your weapon as a trophy.");
                System.out.println("YOU DIED. GAME OVER.");
                game();
            } else {
                System.out.println("You whip out your weapon unsheathing your trusty sword");
                System.out.println("You charge towards the dragon but it takes off in flight before you can reach it. ");
                enter();
                System.out.println("The dragon breathes fire, raining down on you and burning you to a crisp.");
                enter();
                System.out.println("Your sword falls to the ground, unharmed by the fire, and the dragon scoops it up and takes it up to the princess.");
                enter();
                System.out.println("She grins menacingly, picking it up by the handle and admiring it before setting it down,");
                System.out.println("moving to grab something to hang it up on the wall with.");
                System.out.println("She has a wall nearly covered in various weapons from an overabundant amount of “suitors” who had all attempted to “rescue” her.");
                enter();
                System.out.println(" The last thing you ever see is her nailing your sword to her wall of trophies as you slowly die on the ground below, your quest for nothing.");
                System.out.println("YOU DIED. GAME OVER.");
                game();

            }
        }
        public static void enter(){
            System.out.println("Press enter to continue");
            try{System.in.read();}
            catch(Exception e){}
        }
    }
    
}
}
