import java.util.Scanner;
 public class remedies{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("PROBLEM\n");
        System.out.println("1.Headache\n");
        System.out.println("2.Fever\n");
        System.out.println("3.Stomach pain\n");
        System.out.println("4.Cough\n");
        System.out.println("5.Weakness/tiredness\n");
        System.out.println("6.Joint pains\n");
        System.out.println("7.High blodd pressure(BP)\n");
        System.out.println("8.Diabetes\n");
        System.out.println("9.Weak eyesight\n");
        System.out.println("10.Memory loss\n");
        System.out.println("11.Hearing loss\n");
        System.out.println("12.Weak immunity\n");
        System.out.println("13.Depression\n");
         System.out.println("Enter the number that related to your problem from the above list:");
       int choice=sc.nextInt();
        
          switch (choice){
            case 1: System.out.print("*This will occur because of stress,dehydration ,lack of sleep,eye strain\n");
                   System.out.print("*some Remedies to overcome this Drink more water,rest in a quiet place,sleep properly\n");
                   break;
            case 2: System.out.print("*This will occur because of infection,flu,viral illness\n");
                   System.out.print("*some Remedies to overcome this Drink plenty of water,Take rest,light food \n consult a doctor if fever lasts more than 2 days.\n");
                   break;
            case 3: System.out.print("*This will occur because of Indigestion,gas,food poisioning\n");
                   System.out.print("*some Remedies to overcome this avoid oily food,Drink warm water,eat light meals,take medical help if severe pain is facing.\n");
                   break;
            case 4: System.out.print("*This will occur because of cold,throat infection,allergy.\n");
                   System.out.print("*some Remedies to overcome this Drink warm water,honey with warm water,avoid cool drinks,consult a doctor if cough lasts 1 week.\n");
                   break;
            case 5: System.out.print("*This will occur because of low nutrition,anamia,lack of sleep.\n");
                   System.out.print("*some Remedies to overcome this balanced diet,take iron rich foods,regular sleep,exercise lightly.\n");
                   break;
            case 6: System.out.print("*This will occur because of weak bones,cartilage wear,aging joints.\n");
                   System.out.print("*some Remedies to overcome this light exercise,warm oil massage,take calcium rich food,take medicines if severe pain is facing.\n");
                   break;
            case 7: System.out.print("*This will occur because of stree,diet,reduced heart efficiency.\n");
                   System.out.print("*some Remedies to overcome this reduce salt intake,daily walking,regular bp checkups,take prescribed medicines.\n");
                   break;
            case 8: System.out.print("*This will occur because of reduced insulin efficiency,lifestyle changes.\n");
                   System.out.print("*some Remedies to overcome this control sugar intake,eat small frequent meals,regular exercise,monitor blood sugar.\n");
                   break;
            case 9: System.out.print("*This will occur because of aging eye lens,vitamin deficiency.\n");
                   System.out.print("*some Remedies to overcome this regular eye checkups,proper lighting at home,vitamin rich foods,take a surgery if doctor suggests.\n");
                   break;
            case 10: System.out.print("*This will occur because of brain aging,vitamin deficiency,poor sleep.\n");
                   System.out.print("*some Remedies to overcome this mental activities(reading,puzzles),healthy diet,good sleep routine,medical consultation if worsening.\n");
                   break;
            case 11: System.out.print("*This will occur because of aging ear nerves,long exposure to loud sounds.\n");
                   System.out.print("*some Remedies to overcome this hearing tests, use hearing aids if needed,avoid loud noise.\n");
                   break;
            case 12: System.out.print("*This will occur because of aging immune system.\n");
                   System.out.print("*some Remedies to overcome this nutrition diet,vaccinations,regular health checkups,good hygiene");
                   break;
            case 13: System.out.print("*This will occur because of isolation,loss of routine,health problems");
                   System.out.print("*some Remedies to overcome this family interations,social activities,light exercise,counseling if needed");
                   break;         
            default:System.out.println("*other than these problems may need a doctor consultation.\n");
                   break;

        
         
       } 
    }
 }

