import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.time.temporal.ChronoUnit;

public class PersonFabric extends Person {
    protected static final String[] man_names = {"James","John","Robert","Michael","William","David","Richard","Joseph","Charles","Thomas","Daniel","Matthew","Anthony","Donald","Steven","Paul","Andrew","Brian","Mark","Edward","Kevin","George","Joshua","Eric","Frank","Scott","Justin","Brandon","Gary","Jerry","Dennis","Peter","Jeremy","Stephen","Gregory","Timothy","Todd","Aaron","Keith","Jonathan","Raymond","Bryan","Jeffrey","Adam","Jose","Jesse","Patrick","Shawn","Terry","Samuel","Larry","Roberto","Nicholas","Chris","Sean","Walter","Cole","Craig","Alan","Philip","Victor","Joe","Douglas","Carl","Ryan","Benjamin","Bobby","Donald","Kenny","Harry","Ronald","Anthony","Gerald","Louis","Micheal","Maurice","Marvin","Leroy","Danny","Rick","Derek","Jerry","Lucas","Gordon","Bradley","Oscar","Francisco","Luis","Jason","Glenn","Philip","Brent","Eli","Curtis","Herbert","Barry","Kelly","Ralph","Steve","Clarence","Mack","Jacob","Caleb","Colin","Heath","Damon","Dallas","Parker","Horace","Moses","Jude","Reuben","Winston","Cyril","Anton","Edwin","Oliver","Cleveland","Earnest","Otis","Wesley","Trevor","Saul","Simon","Arthur","Herman","Leslie","Jerome","Henry","Marcus","Amos","Milton","Tony","Perry","Maxwell","Miles","Julian","Chuck","Roman","Dwight","Toby","Brody","Lane","Reed","Marshall","Gabe","Graham","Harrison","Robbie","Bruce","Stuart","Adrian","Stanton","Cooper","Sheldon","Clyde","Byron","Elliot","Noel","Darcy","Roland","Rex","Stanley","Noah","Quinn","Preston","Rafael","Landon","Cody","Xavier","Chase","Desmond","Javier","Saul","Porter","Wilson","Otto","Brock","Hugo","Ward","Casey","Nash","Jared","Kurt","Drew","Hank","Ivan","Karl","Alec","Lyle","Vernon","Waylon","Roman","Jax","Zane","Grant","Micah","Shane","Hector","Abel","Jagger","Bennett","Ronan","Soren","Emmett","Griffin","Kellan","Corbin","Kieran","Rhys","Levi","Beau","Callum","Nolan","Sebastian","Gideon","Dax","Talon","Dante","Ryder","Axel","Bodhi","Zander","Kyler","Kai","Rocco","Archer","Zayden","Declan","Knox","Jett","Cruz","Rowan","Marcus","Maddox","Gunner","Hendrix","Casen","Kason","Niko","Bryson","Sutton","Colby","Emery","Daxton","Jones","Thatcher","Radley","Duke","Zayden","Rowdy","Kasen","Layne","Lennon","Rogan","Tyson","Huxley","Beck","Quin","Decker","Kian","Karson","Bode","Madden","Murphy","Remy","Greyson","Dexter","Keegan","Colson","Kaiser","Gatlin","Ridge","Vance","Houston","Callan","Kalden","Vail","Corban","Monty","Garret","Kennon","Palmer","Link","Brecken","Maxon","Crosby","Holt","Kyson","Mercer","Gentry","Arlo","Krew","Ellis","Griffith","Holland","Finley","Briggs","Jamison","Milan","Karsen","Griffon","Finnegan","Luca","Oden","Bowen","Coen","Brayden","Dereon","Porter","Holland","Adair","Bronson","Cullen","Anders","Channing","Zephyr","Dalton","Tag","Moray","Nile","Orrin","Parker","Tate","Ringo","Nash","Oakley","Canaan","Casen","Creed","Cohan","Finnick","Cagney","Raiden","Stellan","Crosley","Cason","Kane","Greer","Sloan","Kael","Haiden","Earl","Linus","Bravo","Cole","Rocky","Wilder","Noble","Dawson","Kole","Jaxton","Alaric","Alistair","Brighton","Darragh","Deon","Hardy","Graeme","Heathcliff","Jasper","Jett","Lawson","Macallister","Presley","Teague","Tristan"};
    protected static final String[] surnames = {"Smith","Jones","Williams","Brown","Taylor","Davis","Miller","Wilson","Moore","Anderson","Thomas","Jackson","White","Harris","Martin","Thompson","Garcia","Martinez","Robinson","Clark","Rodriguez","Lewis","Lee","Walker","Hall","Allen","Young","Hernandez","King","Wright","Lopez","Hill","Scott","Green","Adams","Baker","Gonzalez","Nelson","Carter","Mitchell","Perez","Roberts","Turner","Phillips","Campbell","Parker","Evans","Edwards","Collins","Stewart","Sanchez","Morris","Rogers","Reed","Cook","Morgan","Bell","Murphy","Bailey","Rivera","Cooper","Richardson","Cox","Howard","Ward","Torres","Peterson","Gray","Ramirez","James","Watson","Brooks","Kelly","Sanders","Price","Bennett","Wood","Barnes","Ross","Henderson","Coleman","Jenkins","Perry","Powell","Long","Patterson","Hughes","Flores","Washington","Butler","Simmons","Foster","Gonzales","Bryant","Alexander","Russell","Griffin","Diaz","Hayes","Myers","Ford","Hamilton","Graham","Sullivan","Wallace","Woods","Cole","West","Jordan","Owens","Reynolds","Fisher","Ellis","Harrison","Gibson","Mcdonald","Cruz","Marshall","Ortiz","Gomez","Murray","Freeman","Wells","Webb","Simpson","Stevens","Tucker","Porter","Hunter","Hicks","Crawford","Henry","Boyd","Mason","Morales","Kennedy","Warren","Dixon","Ramos","Reyes","Burns","Gordon","Shaw","Holmes","Rice","Robertson","Hunt","Black","Daniels","Palmer","Mills","Nichols","Grant","Knight","Ferguson","Rose","Stone","Hawkins","Dunn","Perkins","Hudson","Spencer","Gardner","Stephens","Payne","Pierce","Berry","Matthews","Arnold","Wagner","Willis","Ray","Watkins","Olson","Carroll","Duncan","Snyder","Hart","Cunningham","Bradley","Lane","Andrews","Ruiz","Harper","Fox","Riley","Armstrong","Carpenter","Weaver","Greene","Lawrence","Elliott","Chavez","Sims","Austin","Peters","Kelley","Franklin","Lawson","Fields","Gutierrez","Ryan","Schmidt","Carr","Vasquez","Castillo","Wheeler","Chapman","Oliver","Montgomery","Richards","Williamson","Johnston","Banks","Meyer","Bishop","Mccoy","Howell","Alvarez","Morrison","Hansen","Fernandez","Garza","Harvey","Little","Burton","Stanley","Nguyen","George","Jacobs","Reid","Kim","Fuller","Lynch","Dean","Gilbert","Garrett","Romero","Welch","Larson","Frazier","Burke","Hanson","Day","Mendoza","Moreno","Bowman","Medina","Fowler","Brewer","Hoffman","Carlson","Silva","Pearson","Holland","Douglas","Fleming","Jensen","Vargas","Byrd","Davidson","Hopkins","May","Terry","Herrera","Wade","Soto","Walters","Curtis","Neal","Caldwell","Lowe","Jennings","Barnett","Graves","Jimenez","Horton","Shelton","Barrett","Obrien","Castro","Sutton","Gregory","Mckinney","Lucas","Miles","Craig","Rodriquez","Chambers","Holt","Lambert","Fletcher","Watts","Bates","Hale","Rhodes","Pena","Beck","Newman","Haynes","McDaniel","Mendez","Bush","Vaughn","Parks","Dawson","Santiago","Norris","Hardy","Love","Steele","Curry","Powers","Schultz","Barker","Guzman","Page","Munoz","Ball","Keller","Chandler","Weber","Leonard","Walsh","Lyons","Ramsey","Wolfe","Schneider","Mullins","Benson","Sharp","Bowen","Daniel","Barber","Cummings","Hines","Baldwin","Griffith","Valdez","Hubbard","Salazar","Reeves","Warner","Stevenson","Burgess","Santos","Tate","Cross","Garner","Mann","Mack","Moss","Thornton","Dennis","Mcgee","Farmer","Delgado","Aguilar","Vega","Glover","Manning","Cohen","Harmon","Rodgers","Robbins","Newton","Todd","Blair","Higgins","Ingram","Reese","Cannon","Strickland","Townsend","Potter","Goodwin","Walton","Rowe","Hampton","Ortega","Patton","Swanson","Joseph","Francis","Goodman","Malone","Cortez","Wolff","Watts","Lorentz"};
    protected static final String[] woman_names = {"Olivia", "Emma", "Charlotte", "Ava", "Sophia", "Amelia", "Isabella", "Mia", "Evelyn", "Harper", "Abigail", "Emily", "Elizabeth", "Sofia", "Madison", "Avery", "Ella", "Scarlett", "Grace", "Chloe", "Victoria", "Riley", "Aria", "Luna", "Zoey", "Hazel", "Nora", "Lily", "Addison", "Aurora", "Penelope", "Lucy", "Audrey", "Bella", "Stella", "Gabriella", "Claire", "Skylar", "Isla", "Layla", "Savannah", "Eleanor", "Maya", "Emilia", "Alice", "Jade", "Molly", "Ivy", "Rose", "Hannah", "Everly", "Leah", "Aubrey", "Katherine", "Madeline", "Paisley", "Aaliyah", "Ellie", "Alexa", "Ashley", "Ariana", "Taylor", "Isabelle", "Makayla", "Gianna", "Arianna", "Mackenzie", "Caroline", "Eva", "Hailey", "Allison", "Natalie", "Sarah", "Kylie", "Elise", "Lauren", "Sophie", "Morgan", "Amber", "Lydia", "Alice", "Marley", "Reagan", "Alexandra", "Lila", "Julia", "Brianna", "Violet", "Bailey", "Piper", "Kaylee", "Annabelle", "Kennedy", "Jocelyn", "Kaitlin", "Melanie", "Naomi", "Alana", "Liliana", "Lucia", "Callie", "Diana", "Daniella", "Sara", "Phoebe", "Cora", "Lena", "Bethany", "Danielle", "Jasmine", "Lila", "Kimberly", "Cassandra", "Tessa", "Selena", "Adeline", "Elaina", "Holly", "Marissa", "Clara", "Anastasia", "Katelyn", "Hayden", "Esmeralda", "Bianca", "Elaine", "Mabel", "Luna", "Faith", "Annie", "Juliana", "Simone", "Camille", "Shelby", "Summer", "Alexis", "Paige", "Jade", "Brooke", "Tiffany", "Audrina", "Nadia", "Aria", "Dakota", "Hope", "Fiona", "Lila", "Giselle", "Anaya", "Celeste", "Mckenna", "Alisha", "Heather", "Esmeralda", "Angelina", "Louisa", "Lara", "Adelina", "Noelle", "Yasmin", "Vivian", "Camila", "Brielle", "Remy", "Cecilia", "Eleanor", "Willa", "Reina", "Nyla", "Shirley", "Sandra", "Emery", "Blaire", "Indira", "Lavender", "Mila", "Freya", "Althea", "Ruth", "Willow", "Octavia", "Arielle", "Leilani", "Eloise", "Evangeline", "Sienna", "Presley", "Rowan", "Marlowe", "Catalina", "Winter", "Talia", "Cadence", "Veronica", "Genevieve", "Josephine", "Zara", "Athena", "Persephone", "Seraphina", "Ariana", "Scarlett", "Helena", "Gabrielle", "Persephone", "Annalise", "Liliana", "Valentina", "Octavia", "Maeve", "Elara", "Arabella", "Nova", "Ophelia", "Calliope", "Isolde", "Gwendolyn", "Guinevere", "Cosette", "Aurelia", "Cassiopeia", "Eowyn", "Elowen", "Fionnuala", "Guadalupe", "Hephzibah", "Idalia", "Jessamine", "Kalila", "Leocadia", "Marceline", "Nouvel", "Odele", "Parthenia", "Quinola", "Romola", "Safira", "Tamarine", "Ulrika", "Vespera", "Winola", "Xiomara", "Yvetta", "Zephirine"};
    protected LocalDate startDate = LocalDate.of(1432, 1, 1);
    protected LocalDate current = LocalDate.of(1532, 12, 31);
    public PersonFabric() {
        gender = genderGenerator();
        if (gender == Gender.MALE)
            name = manNameGenerator();
        else
            name = womanNameGenerator();
        surname = surnameGenerator();
        character = characterGenerator();
        BirthDate = birthDateGenerator();
        age = ageGenerator();
    }
    public String manNameGenerator() {
        Random random = new Random();
        return man_names[random.nextInt(man_names.length)];
    }
    public String womanNameGenerator() {
        Random random = new Random();
        return woman_names[random.nextInt(woman_names.length)];
    }
    public String surnameGenerator() {
        Random random = new Random();
        return surnames[random.nextInt(surnames.length)];
    }
    public Character characterGenerator() {
        Random random = new Random();
        return Character.values()[random.nextInt(Character.values().length)];
    }
    public Gender genderGenerator() {
        Random random = new Random();
        return Gender.values()[random.nextInt(Gender.values().length)];
    }
    public long ageGenerator() {
        return ChronoUnit.YEARS.between(BirthDate, current);
    }
    public LocalDate birthDateGenerator() {
        return randomLocalDate(startDate, current);
    }
    public LocalDate randomLocalDate(LocalDate start, LocalDate end) {
        long startDay = start.toEpochDay();
        long endDay = end.toEpochDay();

        long randomDay = ThreadLocalRandom.current().nextLong(startDay, endDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
