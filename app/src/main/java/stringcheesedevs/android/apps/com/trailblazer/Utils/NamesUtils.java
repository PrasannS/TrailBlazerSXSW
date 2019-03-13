package stringcheesedevs.android.apps.com.trailblazer.Utils;

import android.content.Context;

import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;
import stringcheesedevs.android.apps.com.trailblazer.TBApplication;

public class NamesUtils {


    public static String[] names = {"10 cc"
            ,"10 Years"
            ,"2 Chainz"
            ,"3 Doors Down"
            ,"4minute"
            ,"4 Strings"
            ,"The 1975"
            ,"5 Seconds of Summer"
            ,"50 Cent"
            ,"6ix9ine"
            ,"Aaliyah"
            ,"ABBA"
            ,"Abandon All Ships"
            ,"The All-American Rejects"
            ,"The Airborne Toxic Event"
            ,"Ace Hood"
            ,"Ace of Base"
            ,"Adassa"
            ,"Admiral T"
            ,"Afrojack"
            ,"AGA"
            ,"Airbourne"
            ,"Aitana"
            ,"AJR"
            ,"Akon"
            ,"Alan Tam"
            ,"Alesso"
            ,"Alexander Rybak"
            ,"Alison Krauss"
            ,"Alphabeat"
            ,"All That Remains"
            ,"All Time Low"
            ,"Allstar Weekend"
            ,"Aloe Blacc"
            ,"Alter Bridge"
            ,"Amaranthe"
            ,"Angels & Airwaves"
            ,"Anthrax"
            ,"Alice Nine"
            ,"Alphaville"
            ,"AFI"
            ,"After Midnight Project"
            ,"Alessia Cara"
            ,"Amy Holland"
            ,"Amy Winehouse"
            ,"Ana Guerra"
            ,"Ana Moura"
            ,"Anastacia"
            ,"Anberlin"
            ,"Andrea Bocelli"
            ,"Anggun"
            ,"Any Gabrielly"
            ,"A-Mei"
            ,"Apink"
            ,"Apocalyptica"
            ,"Armin Van Buuren"
            ,"Arnaldo Antunes"
            ,"Ariana Grande"
            ,"A R Rahman"
            ,"Aqua"
            ,"The Aquabats"
            ,"As It Is"
            ,"Ashanti"
            ,"Ashlee Simpson"
            ,"Asher Roth"
            ,"Ashes Divide"
            ,"Ashton Shepherd"
            ,"Asia"
            ,"Astrid S"
            ,"Asuca Hayashi"
            ,"Atreyu"
            ,"Audioslave"
            ,"August Burns Red"
            ,"Auliʻi Cravalho"
            ,"Aura Dione"
            ,"Avenged Sevenfold"
            ,"Avicii"
            ,"Aya Hirano"
            ,"Ayọ"
            ,"Babyface"
            ,"BG"
            ,"Baba Saad"
            ,"Babi Xavier"
            ,"Base Ball Bear"
            ,"Bastille"
            ,"Barei"
            ,"BEAST"
            ,"Bee Gees"
            ,"The Beatles"
            ,"Backstreet Boys"
            ,"Belinda Peregrín"
            ,"Beni Arashiro"
            ,"Benny Benassi"
            ,"Billy Blue"
            ,"Bishop Lamont"
            ,"Big Bang "
            ,"Big Sean"
            ,"Big Time Rush"
            ,"Biquini Cavadão"
            ,"Birdman"
            ,"Björk"
            ,"Blue"
            ,"Buckcherry"
            ,"The Black Eyed Peas"
            ,"Blackpink "
            ,"Black Tide"
            ,"Black Veil Brides"
            ,"Blaxy Girls"
            ,"Blue October"
            ,"Blood Raw"
            ,"Bloodhound Gang"
            ,"Bloom 06"
            ,"Bob Marley"
            ,"Bob Sinclar"
            ,"Bobby McFerrin"
            ,"Bohemia"
            ,"Bombay Rockers"
            ,"Bon Jovi"
            ,"Bond"
            ,"Bone Thugs-n-Harmony"
            ,"Boston"
            ,"The Bravery"
            ,"Bradley Cooper"
            ,"Brand New"
            ,"Brandy"
            ,"Breaking Benjamin"
            ,"Bridgit Mendler"
            ,"Bruna Guerin"
            ,"Bruno Campos"
            ,"Bruno & Marrone"
            ,"Bryan Adams"
            ,"Brynn Cartelli"
            ,"Busta Rhymes"
            ,"Butthole Surfers"
            ,"BtoB "
            ,"BTS "
            ,"Boyzone"
            ,"Boys Republic "
            ,"Bow Wow"
            ,"Bullet for My Valentine"
            ,"Bun B"
            ,"Buraka Som Sistema"
            ,"Bushido"
            ,"Camille"
            ,"Caparezza"
            ,"Capital Cities"
            ,"Carlinhos Brown"
            ,"Carlos Alazraqui"
            ,"Carlos do Carmo"
            ,"Carly Rae Jepsen"
            ,"The Carpenters"
            ,"Carrie Underwood"
            ,"The Cranberries"
            ,"The Crystal Method"
            ,"The Cure"
            ,"Cascada"
            ,"Cassadee Pope"
            ,"Cássia Eller"
            ,"Cassie"
            ,"Cash Cash"
            ,"Cassper Nyovest"
            ,"Cazuza"
            ,"Cedric Gervais"
            ,"Cepeda"
            ,"Cinema Bizarre"
            ,"City Boy"
            ,"Craig David"
            ,"Chamillionaire"
            ,"Charlee"
            ,"Charles Aznavour"
            ,"Charles Hamilton"
            ,"Chay Suede"
            ,"The Chemical Brothers"
            ,"Chenoa"
            ,"Cher"
            ,"Cher Lloyd"
            ,"Cherish"
            ,"Cheryl"
            ,"Chester French"
            ,"Chilla Kiana"
            ,"Children Collide"
            ,"Chicane"
            ,"Children of Bodom"
            ,"Chris Cornell"
            ,"Chris Daughtry"
            ,"Chitãozinho & Xororó"
            ,"Cimorelli"
            ,"Claude Kelly"
            ,"Coal Chamber"
            ,"Christina Milian"
            ,"Christina Grimmie"
            ,"Chrisette Michelle"
            ,"Chumbawamba"
            ,"Clementino"
            ,"Clouds"
            ,"Club Dogo"
            ,"Colbie Caillat"
            ,"Colby O'Donis"
            ,"Coldplay"
            ,"Common"
            ,"Corson"
            ,"Cory Gunz"
            ,"Counting Crows"
            ,"Clique Girlz"
            ,"Charles Hamilton"
            ,"Crashdïet"
            ,"Ciara"
            ,"Cine"
            ,"CPM 22"
            ,"Crazy Frog"
            ,"Crazy Town"
            ,"Creamy"
            ,"Crystal Castles"
            ,"Crystal Kay"
            ,"Curren$y"
            ,"Cut Copy"
            ,"Cyndi Lauper"
            ,"DeLon"
            ,"D12"
            ,"D. Brown"
            ,"Da Mouth"
            ,"Daddy Yankee"
            ,"Daiyan Trisha"
            ,"Dan Black"
            ,"Dan Reynolds"
            ,"Daniel Merriweather"
            ,"Danzig"
            ,"Dark Tranquility"
            ,"Darren Espanto"
            ,"David Banner"
            ,"David Bisbal"
            ,"David Bustamante"
            ,"David Fonseca"
            ,"David Gray"
            ,"David Guetta"
            ,"David Nail"
            ,"Darude"
            ,"Days Difference"
            ,"Dead by April"
            ,"Debbie Harry"
            ,"Dave Matthews Band"
            ,"Deadmau5"
            ,"Death "
            ,"Dean"
            ,"Deep Purple"
            ,"Demi Lovato"
            ,"Denez Prigent"
            ,"Depeche Mode"
            ,"Desiigner"
            ,"Diamond Platnumz"
            ,"Dido"
            ,"Dtidrik Solli-Tangenh"
            ,"Die Antwoord"
            ,"Dierks Bentley"
            ,"Dire Straits"
            ,"Dirty Vegas"
            ,"Dima Bilan"
            ,"Divine Brown"
            ,"Dizzee Rascal"
            ,"DJ Khaled"
            ,"DJ Snake"
            ,"DMX"
            ,"DNCE"
            ,"Doda"
            ,"Dolly Parton"
            ,"Dolores O'Riordan"
            ,"Don Omar"
            ,"Donna Lewis"
            ,"Double You"
            ,"The-Dream"
            ,"Dreams Come True"
            ,"DragonForce"
            ,"Dragonette"
            ,"Drake"
            ,"Drake Bell"
            ,"The Drums"
            ,"Dr. Dre"
            ,"Duck Sauce"
            ,"Duffy"
            ,"Duke Dumont"
            ,"Dulce Maria"
            ,"Duran Duran"
            ,"DVDA"
            ,"Dwayne Johnson"
            ,"Dzeko"
            ,"The Eagles"
            ,"Eason Chan"
            ,"Easton Corbin"
            ,"Edoardo Bennato"
            ,"Eels"
            ,"Eiffel 65"
            ,"Elhaida Dani"
            ,"Elena Paparizou"
            ,"Ellie Goulding"
            ,"Elton John"
            ,"Emily Blunt"
            ,"Eminem"
            ,"Emma Bunton"
            ,"Emmelie de Forest"
            ,"Enigma"
            ,"Enrique Iglesias"
            ,"Enya"
            ,"Emma's Imagination"
            ,"Empire of the Sun"
            ,"Enter Shikari"
            ,"Equinox"
            ,"Eric Papilaya"
            ,"Eric Whitacre"
            ,"Eriko Tamura"
            ,"Eros Ramazzotti"
            ,"Erykah Badu"
            ,"Escape the Fate"
            ,"Estelle"
            ,"Eugenio Bennato"
            ,"Evanescence"
            ,"Exodus"
            ,"Fabolous"
            ,"Fabri Fibra"
            ,"Faithless"
            ,"Fall Out Boy"
            ,"FanFan"
            ,"Fang Wu"
            ,"Far East Movement"
            ,"Faryl Smith"
            ,"Fazura"
            ,"Felli Fel"
            ,"Fergie"
            ,"Fever Ray"
            ,"The Fevers"
            ,"Finger Eleven"
            ,"Fish Leong"
            ,"Fisherman's Friends"
            ,"Flaw"
            ,"Flipsyde"
            ,"Flo Rida"
            ,"Florence and the Machine"
            ,"Florence Welch"
            ,"Forever the Sickest Kids"
            ,"Franco Battiato"
            ,"Frankie Goes to Hollywood"
            ,"French Montana"
            ,"Fresno"
            ,"Gal Gadot"
            ,"Game"
            ,"Gary Allan"
            ,"George Benson"
            ,"George Lam"
            ,"George Michael"
            ,"George Harrison"
            ,"George Strait"
            ,"Ghostface Killah"
            ,"Gianna Nannini"
            ,"Gin Lee"
            ,"Giorgio Moroder"
            ,"Girlicious"
            ,"Girls' Generation "
            ,"Glasses Malone"
            ,"Gloria Jessica"
            ,"Gloria Trevi"
            ,"Go Back to the Zoo"
            ,"Godsmack"
            ,"The Go-Go's"
            ,"Gorillaz"
            ,"Gotye"
            ,"Great White"
            ,"Guns N' Roses"
            ,"Gwen Stefani"
            ,"Hacken Lee"
            ,"Haddaway"
            ,"Hailee Steinfeld"
            ,"Halsey"
            ,"Hedley"
            ,"Helena Paparizou"
            ,"Helene Fischer"
            ,"Hellogoodbye"
            ,"Hevo 84"
            ,"Hide"
            ,"HIM"
            ,"Hinder"
            ,"Hins Cheung"
            ,"Holly Williams"
            ,"Mr Hudson"
            ,"Hoobastank"
            ,"Hollywood Monsters "
            ,"Hollywood Undead"
            ,"Hot Rod"
            ,"Hot Chelle Rae"
            ,"Hozier"
            ,"Hyper Crush"
            ,"G.NA "
            ,"I Blame Coco"
            ,"I Prevail"
            ,"Il Volo"
            ,"Ice Nine Kills"
            ,"Ida Maria"
            ,"Idina Menzel"
            ,"Iggy Azalea"
            ,"Ilya"
            ,"Imagine Dragons"
            ,"India Arie"
            ,"In Dread Response"
            ,"Inna"
            ,"Ivete Sangalo"
            ,"Incubus"
            ,"Infected Mushroom"
            ,"Inner Circle"
            ,"Infinite "
            ,"Irene Cara"
            ,"Iron Maiden"
            ,"Ironik"
            ,"Isaac Hayes"
            ,"Israel Kamakawiwoʻole"
            ,"Institute"
            ,"IU "
            ,"Jacky Cheung"
            ,"Jack Jersey"
            ,"Jack Johnson"
            ,"The Jackson 5"
            ,"Jacob Collier"
            ,"Jada"
            ,"Jadakiss"
            ,"Jadyn Maria"
            ,"Jae Millz"
            ,"James Blunt"
            ,"James Morrison"
            ,"Jamie Principle"
            ,"Jan Hammer"
            ,"Jane Birkin"
            ,"Jason Dy"
            ,"Jay Sean"
            ,"Jay Hardway"
            ,"Jay-Z"
            ,"Ja Rule"
            ,"JD McCrary"
            ,"Jean-Michel Jarre"
            ,"Jedward"
            ,"Jemaine Clement"
            ,"Jeremih"
            ,"Jessie J"
            ,"Jessie James"
            ,"Jessica Sanchez"
            ,"Jennifer Lopez"
            ,"Jessica Mauboy"
            ,"Jessica Simpson"
            ,"Jin Au-Yeung"
            ,"Joana Zimmer"
            ,"Joe Jonas"
            ,"Joe Walsh"
            ,"John Lennon"
            ,"John Mayer"
            ,"Johnny Cash"
            ,"Johnta Austin"
            ,"Jonas Blue"
            ,"Josh Gracin"
            ,"Joe Satriani"
            ,"Jordan Chan"
            ,"Josh Gad"
            ,"Josh Turner"
            ,"Josh Dun"
            ,"Jovanotti"
            ,"Juanes"
            ,"Juan Karlos Labajo"
            ,"Juelz Santana"
            ,"Julia Michaels"
            ,"Justin Bieber"
            ,"Jacquees"
            ,"J-Xtreme"
            ,"Kaitlyn Maher"
            ,"Kanye West"
            ,"Kardinal Offishall"
            ,"KARA "
            ,"Karen Mok"
            ,"Karol Sevilla"
            ,"Karkadan"
            ,"Katharine McPhee"
            ,"Kat DeLuna"
            ,"Kate Earl"
            ,"Keith David"
            ,"Keith Urban"
            ,"Kelis"
            ,"Kelly Chen"
            ,"Kendrick Lamar"
            ,"Keri Hilson"
            ,"Keshia Chanté"
            ,"Kevin Rudolf"
            ,"Keyshia Cole"
            ,"Kid Abelha"
            ,"Kid Cudi"
            ,"Kidz Bop Kids"
            ,"The Killers"
            ,"Kim Hyun Joong"
            ,"Kim Wilde"
            ,"Kiss"
            ,"K.I.Z"
            ,"The Knife"
            ,"Kris Wu"
            ,"Krista Siegfrids"
            ,"Kristen Bell"
            ,"Kuana Torres Kahele"
            ,"Kyu Sakamoto"
            ,"Lady Antebellum"
            ,"Lady Gaga"
            ,"Lana Del Rey"
            ,"Lifer"
            ,"Lionel Richie"
            ,"Lobão"
            ,"Logic"
            ,"Lorde"
            ,"La Roux"
            ,"Ladyhawke"
            ,"Lawson"
            ,"Lee Ann Womack"
            ,"Legião Urbana"
            ,"Leslie Cheung"
            ,"Lights"
            ,"Lil Ru"
            ,"Lil Scrappy"
            ,"Lil Twist"
            ,"Lil' Kim"
            ,"Lil Mosey"
            ,"Lil Wayne"
            ,"Lil Yachty"
            ,"Lin-Manuel Miranda"
            ,"LMFAO"
            ,"The Lonely Island"
            ,"Lucenzo"
            ,"Ludo"
            ,"Ludacris"
            ,"Luke Bryan"
            ,"Lulu Santos"
            ,"The Lumineers"
            ,"LUNA SEA"
            ,"Limp Bizkit"
            ,"Lim Hyung Joo"
            ,"Lena Meyer-Landrut"
            ,"Luísa Sonza"
            ,"Lyca Gairanod"
            ,"Mack 10"
            ,"Mack Maine"
            ,"Madonna"
            ,"The Maine"
            ,"Mamonas Assassinas"
            ,"Mannie Fresh"
            ,"Manu Gavassi"
            ,"Mao Denda"
            ,"Marcelo D2"
            ,"Marky"
            ,"Mark Oliver Everett"
            ,"Mark Salling"
            ,"Martin Garrix"
            ,"Martin Solveig"
            ,"Mallary Hope"
            ,"Maria Isabel"
            ,"Maria Dwi Permata Simorangkir"
            ,"Mariah Carey"
            ,"Mariana Elisabetsky"
            ,"Marilyn Manson"
            ,"Maroon 5"
            ,"Masaharu Fukuyama"
            ,"Momoland "
            ,"Marracash"
            ,"Marta Sánchez"
            ,"Massacration"
            ,"Maureen McGovern"
            ,"MaxBoys"
            ,"Kevin McHale"
            ,"Meat Loaf"
            ,"Megumi Hayashibara"
            ,"Mel Fronckowiak"
            ,"Melanie Fiona"
            ,"Melissa Etheridge"
            ,"Melody Gardot"
            ,"Method Man"
            ,"Megadeth"
            ,"Metallica"
            ,"Metal Church"
            ,"MIA"
            ,"Michael Jackson"
            ,"Michael Sarver"
            ,"Migos"
            ,"Miguel"
            ,"Mihimaru GT"
            ,"Mika"
            ,"Mike Posner"
            ,"Miki Imai"
            ,"Miley Cyrus"
            ,"Milton Nascimento"
            ,"Miyavi"
            ,"Miss A"
            ,"Mohamed Mounir"
            ,"Momoiro Clover"
            ,"Mr Hudson"
            ,"Mumford & Sons"
            ,"Muse"
            ,"Mushroomhead"
            ,"Ms. Triniti"
            ,"Morteza Pashaei"
            ,"Mýa"
            ,"Mylène Farmer"
            ,"Nadia Nakai "
            ,"The Naked and Famous"
            ,"Nami Tamaki"
            ,"Namie Amuro"
            ,"Nas"
            ,"Nasty C "
            ,"Natalia Lafourcade"
            ,"Nav"
            ,"Natalia Kills"
            ,"N-Dubz"
            ,"Ne-Yo"
            ,"Nelly"
            ,"Nelly Furtado"
            ,"Neon Trees"
            ,"N.E.R.D"
            ,"Nicole Scherzinger"
            ,"Nick Cave"
            ,"Nickelback "
            ,"Nicki Minaj"
            ,"Nicola Roberts"
            ,"Nicole Scherzinger"
            ,"Nightwish"
            ,"Nine Inch Nails"
            ,"Noize MC"
            ,"Noizy"
            ,"Nolwenn Leroy"
            ,"Nimo [de]"
            ,"NOFX"
            ,"The Notorious B.I.G."
            ,"NX Zero"
            ,"O–P"
            ,"Of Monsters and Men"
            ,"Oh Wonder"
            ,"Oingo Boingo"
            ,"OneRepublic"
            ,"Oomph!"
            ,"Orianthi"
            ,"Emily Osment"
            ,"The Offspring"
            ,"The Outfield"
            ,"Owl City"
            ,"O-Town"
            ,"P.O.D."
            ,"Papa Roach"
            ,"The Parlotones"
            ,"Patrick Juvet"
            ,"Paul McCartney"
            ,"Paul Engemann"
            ,"Paula Fernandes"
            ,"Paulina Rubio"
            ,"Pedro Abrunhosa"
            ,"Pet Shop Boys"
            ,"Peter Bjorn and John"
            ,"Katy Perry"
            ,"Pierce the Veil"
            ,"Pixie Lott"
            ,"Perfume"
            ,"Phantogram"
            ,"Phil Collins"
            ,"Pink Floyd"
            ,"Play"
            ,"Playaz Circle"
            ,"The Police"
            ,"Polina Gagarina"
            ,"Post Malone"
            ,"Pussycat Dolls"
            ,"Parachute"
            ,"The Presets"
            ,"Prima J"
            ,"Prudence Liew"
            ,"PSY"
            ,"Queen"
            ,"Queens of the Stone Age"
            ,"Queensrÿche"
            ,"R5"
            ,"Ra"
            ,"Rabbi Shergill"
            ,"Radwimps"
            ,"Rae Sremmurd"
            ,"Rainbow "
            ,"Rainer + Grimm"
            ,"Rammstein"
            ,"The Ramones"
            ,"Randy Newman"
            ,"Raul Seixas"
            ,"Raven-Symoné"
            ,"Razorlight"
            ,"Reba McEntire"
            ,"Rebeldes"
            ,"Redman"
            ,"Red Hot Chili Peppers"
            ,"Red Velvet "
            ,"Renato Russo"
            ,"Rev Theory"
            ,"Rick Astley"
            ,"Rick Ross"
            ,"Rich Boy"
            ,"Rihanna"
            ,"Ringo Sheena"
            ,"Ringo Starr"
            ,"Rise Against"
            ,"Rob Paulsen"
            ,"Rob Zombie"
            ,"Robbie Williams"
            ,"Roberto Garcia"
            ,"Robyn"
            ,"Rod Stewart"
            ,"Roi Méndez"
            ,"Rooney"
            ,"Ross Lynch"
            ,"RPM"
            ,"Rubber Soul"
            ,"Ryan Tedder"
            ,"Serena Ryder"
            ,"Sakis Rouvas"
            ,"Sakura Gakuin"
            ,"Samsons"
            ,"Sam Smith"
            ,"Sandy"
            ,"Sandy & Júnior"
            ,"Sandy Lam"
            ,"Sara Paula Gómez Arias"
            ,"Sarah Silverman"
            ,"The Saturdays"
            ,"Satyricon"
            ,"Saulo Vasconcelos"
            ,"Saving Grace"
            ,"Scooter"
            ,"Scorpions"
            ,"Sean Garrett"
            ,"Sean Paul"
            ,"Seeb"
            ,"Seether"
            ,"Serge Gainsbourg"
            ,"Sergio Godinho"
            ,"Serebro"
            ,"Seth MacFarlane"
            ,"Shaggy"
            ,"Shakira"
            ,"Shane Filan"
            ,"Shania Twain"
            ,"Shareefa"
            ,"Shawn Mendes"
            ,"SHINee "
            ,"Shontelle"
            ,"Sia"
            ,"Sigma"
            ,"Sigrid"
            ,"Silentó"
            ,"Simone & Simaria"
            ,"Simple Minds"
            ,"Simple Plan"
            ,"Siti Nurhaliza"
            ,"Seiko Matsuda"
            ,"Selena Gomez"
            ,"Smile.dk"
            ,"Slash"
            ,"Slayer"
            ,"Smash Mouth"
            ,"Snow Patrol"
            ,"Sonata Arctica"
            ,"Soraya Arnelas"
            ,"Soulja Boy"
            ,"Stevie Wonder"
            ,"Sunidhi Chauhan"
            ,"Sugarland"
            ,"Space Cowboy"
            ,"Spice Girls"
            ,"Spose"
            ,"Stefanie Sun"
            ,"Steve Winwood"
            ,"Sting"
            ,"Street Drum Corps"
            ,"Steel Panther"
            ,"Stromae"
            ,"Sum 41"
            ,"Super Junior "
            ,"Super Monkey's"
            ,"Supertramp"
            ,"Sully Erna"
            ,"Svoy"
            ,"Swae Lee"
            ,"SZA"
            ,"T Lopez"
            ,"T-ara "
            ,"The Stunners"
            ,"Tessanne Chin"
            ,"Taio Cruz"
            ,"Takako Matsu"
            ,"Take That"
            ,"Tamar Braxton"
            ,"Tami Chynn"
            ,"Tamta"
            ,"Tarja"
            ,"Taylor Swift"
            ,"Tears for Fears"
            ,"Teresa Teng"
            ,"Teyana Taylor"
            ,"Thirty Seconds to Mars"
            ,"Tiago Abravanel"
            ,"Tiago Bettencourt"
            ,"Tiësto"
            ,"Tihuana"
            ,"Tim McGraw"
            ,"Tina Parol"
            ,"Tinchy Stryder"
            ,"Tiziano Ferro"
            ,"Tono Rosario"
            ,"Toni Braxton"
            ,"Tokio Hotel"
            ,"Tom Tom Club"
            ,"Tony Anselmo"
            ,"Toquinho"
            ,"Tori Kelly"
            ,"Tove Lo"
            ,"Trippie Redd"
            ,"Troye Sivan"
            ,"t.A.T.u."
            ,"The Tragically Hip"
            ,"Tupac Shakur"
            ,"Twelve Girls Band"
            ,"Tyga"
            ,"TYP"
            ,"Tyson Ritter"
            ,"Tyler Joseph"
            ,"U2"
            ,"Ultrabeat"
            ,"Vacca"
            ,"The Vamps"
            ,"Vangelis"
            ,"Van Halen"
            ,"Vanessa Carlton"
            ,"The Veer Union"
            ,"Venom"
            ,"Vince Gill"
            ,"Volbeat"
            ,"Wale"
            ,"Cyndi Wang"
            ,"The Wanted"
            ,"Wanting Qu"
            ,"WaT"
            ,"The Weeknd"
            ,"Weezer"
            ,"Westlife"
            ,"The Who"
            ,"Wisin & Yandel"
            ,"Wolfmother"
            ,"Wyclef Jean"
            ,"Willy Northpole"
            ,"Will Pan"
            ,"will.i.am"
            ,"Within Temptation"
            ,"Wiz Khalifa"
            ,"Wonder Girls "
            ,"Wu Bai"
            ,"Xonia"
            ,"Vanness Wu"
            ,"Xuxa"
            ,"Yasuko Matsuyuki"
            ,"Yazz"
            ,"Yeah Yeah Yeahs"
            ,"Years & Years"
            ,"Yelle"
            ,"Yellow Magic Orchestra"
            ,"Yngwie Malmsteen"
            ,"Yohio"
            ,"Yoko Ono"
            ,"Young Jeezy"
            ,"Your Favorite Martian"
            ,"Yū Hayami"
            ,"Yumi Matsutoya"
            ,"Yung L.A."
            ,"Yves Larock"
            ,"Zana Messia"
            ,"Zascha Moktan"
            ,"Zélia Duncan"
            ,"Zendaya"
            ,"Zucchero"   };
    public static String[] artistIDs = {"f37c537b-3557-4031-bfd6-ab63ced32854",
            "b18bc9c4-6f22-4f1b-a918-e9c86a39fe7a",
            "dff0d392-4cd5-4052-9fbb-f485df3891e5",
            "2386cd66-e923-4e8e-bf14-2eebe2e9b973",
            "7c7a377e-2137-4120-ac20-c3d7286256e6",
            "fa6521a7-56b5-4e56-b946-fda469becba9",
            "5b6ebfe0-f72b-4902-bba9-74c8af0f1af0",
            "830e5c4e-6b7d-431d-86ab-00c751281dc5",
            "8e68819d-71be-4e7d-b41d-f1df81b01d3f",
            "2282c539-05a2-477c-82b7-fe40798d37f3",
            "bc85da58-52d9-457d-ae8d-5d8d4ec870a9",
            "d87e52c5-bb8d-4da8-b941-9f4928627dc8",
            "4a90622e-fc29-4c60-845b-d1752cd286cd",
            "09885b8e-f235-4b80-a02a-055539493173",
            "02009c05-67b2-4e04-b19c-b2762dbff4b7",
            "986ee464-cf8a-4e59-a71f-74756102067f",
            "d4a1404d-e00c-4bac-b3ba-e3557f6468d6",
            "239c8eea-895e-4b6f-bfd5-3e51a61230df",
            "a19287e1-b752-4470-9969-278d31fe4ea3",
            "a3ee920f-4e7f-4993-8aca-4b8538cfaa4a",
            "3bd14ca2-5639-4565-ac1a-f1ab5804232f",
            "5365f55c-b1e1-48f9-b09f-078f7a14cb1f",
            "a24f2bd3-0d1b-4c03-8d91-6297ab5a2811",
            "2eb55bd9-cfbf-44fd-a5da-92dd825284c7",
            "1138a764-2212-4d0a-b02d-0dc14df91e08",
            "7e832266-ac8d-4e9d-8a87-5f1bd56cc04e",
            "addb00fd-733c-4223-8fdf-f78be2488acd",
            "1e69316c-14fa-42ba-88f2-06f6743632f7",
            "6b064ead-91a4-4ac8-8076-b1febe4f4aac",
            "ce6d5579-1f03-4992-8189-a40f8f0489b0",
            "4f8b7186-b2a2-40db-97ae-6e1cd46d57b1",
            "62162215-b023-4f0e-84bd-1e9412d5b32c",
            "dd2948ca-23bb-45eb-8902-4e00d18cbb5b",
            "4bf89e02-6c30-4603-9f6a-52619b1bea1a",
            "60a23fda-a440-4ab9-a344-7dfdd2ed341a",
            "eb380962-99bb-46c0-af40-1c7790a7822a",
            "06e4547a-bdbf-44a6-bca6-af015fb05376",
            "b616d6f0-ec1f-4c69-8a79-12a97ece7372",
            "90967f7a-dccf-43f8-a212-e84b34e24a7d",
            "31aa6f87-8d00-4ae9-a5cc-6d7eeea109d2",
            "1c3919b2-43ca-4a4a-935d-9d50135ec0ef",
            "bb38dec3-6069-40d5-89d8-e518bda75bf4",
            "97e69730-3791-423b-9770-287261588854",
            "8439a325-3bdf-4c47-a7af-55dfc7c42c11",
            "dfe9a7c4-8cf2-47f4-9dcb-d233c2b86ec3",
            "67158463-7136-4204-8a07-d65959594e92",
            "b5954bc9-bd18-4064-a17a-1ad719e617a5",
            "d3b2bec4-b70e-460e-b433-a865ceac2de8",
            "c648509e-9916-4c56-ab63-652a03da16dd",
            "c5a0a216-c33c-42dc-92b8-4b60236f8dad",
            "c2543756-c98c-452e-b536-60f2ca877046",
            "d7cec2ce-a6cf-4d20-8998-b0fc7c27fb21",
            "efcf32d9-30b6-45b6-b8eb-e6ed456d0cb3",
            "9102bdf6-b03e-4470-9f78-12127c4995cc",
            "788ad31c-bf0c-4a31-83f8-b8b130d79c76",
            "477b8c0c-c5fc-4ad2-b5b2-191f0bf2a9df",
            "d3a71b82-e2e3-4dce-85c2-ce1271912426",
            "f4fdbb4c-e4b7-47a0-b83b-d91bbfcfa387",
            "e0bba708-bdd3-478d-84ea-c706413bedab",
            "a1ed5e33-22ff-4e7d-a457-42f4309e135f",
            "0396220e-d266-4980-b5f2-b0926d905bec",
            "9bf53ccf-fa6c-4b33-857f-96a3d0117f2f",
            "a47ed6d5-480e-428c-8ce9-d7a6a571e857",
            "463c514e-c30d-4a2a-a87b-762535253a80",
            "c7d35b71-961e-4713-b65d-35a98591204a",
            "7acc6c97-2654-4ffa-945f-daeabaa8e5ae",
            "9f1c4795-60fb-42e7-a90c-fe75f4a1f4bb",
            "8f695099-c714-4ad0-8888-36eca37fee84",
            "be389638-e74f-46a9-83d2-91ee3ce1fb0c",
            "2ffcd572-21fe-4b8f-ab39-0eebe9d7dc7e",
            "17e137fb-59e5-4fd7-af48-afc34995396c",
            "020bfbb4-05c3-4c86-b372-17825c262094",
            "5bac9b4f-2f1c-4d39-8d11-231d5b6650ce",
            "715d6b2d-9b1f-4615-8e7c-71cf5e9bcde3",
            "60e2557e-a9ae-404c-a562-b792151199e1",
            "24e1b53c-3085-4581-8472-0b0088d2508c",
            "c85cfd6b-b1e9-4a50-bd55-eb725f04f7d5",
            "bb5b461a-f9d3-4937-9012-0fd331bf720c",
            "633c13a3-335a-466f-8e01-535837faeff5",
            "7fa62c0b-2c74-491e-a2a1-17c3b043f326",
            "435837d0-9896-48f1-a80f-66579628ca06",
            "69a32556-f5f6-462f-848b-1849fe408393",
            "b1792916-4b4e-4941-a72e-0bbc5d77d449",
            "b3b24a1d-78b4-40c9-98ef-19fb812b067a",
            "7808accb-6395-4b25-858c-678bbb73896b",
            "ed97c5f6-42a6-4641-9ba0-7363ce073c19",
            "3aae9d5b-9bf1-4f9f-9079-50a3a197a74a",
            "bf0f7e29-dfe1-416c-b5c6-f9ebc19ea810",
            "b10bbbfc-cf9e-42e0-be17-e2c3e1d2600d",
            "2f569e60-0a1b-4fb9-95a4-3dc1525d1aad",
            "14d78134-bb77-4c1e-8c9b-b74284abf1cc",
            "05eb7c35-eccb-48f9-a1a9-cfa450156678",
            "674bf89f-8e70-4472-929d-6b4ed6f98c88",
            "9c79224c-70cd-4367-8d90-35ca99401b75",
            "b39cee8e-d6da-476a-a229-c6a46bf99ad5",
            "4cba75fd-de31-4a38-aa50-9b1f5bacdd4d",
            "942a9807-9c1a-4a0e-a285-1fde2c5be9d1",
            "94785e0f-81be-4360-a9e1-a00df5dc8bc6",
            "98ad20c3-f758-46b4-8244-3a1483db40e9",
            "dcf5807c-ef1f-4291-b452-6824080ecac4",
            "87c5dedd-371d-4a53-9f7f-80522fb7f3cb",
            "9c79224c-70cd-4367-8d90-35ca99401b75",
            "822e92ef-72ea-42e0-9af1-b987816b487a",
            "d5be5333-4171-427e-8e12-732087c6b78e",
            "48646387-1664-4c9a-9139-9bfd091b823c",
            "091547f6-bf0d-47e3-bb4d-e3b5c5f4caab",
            "33319aed-9bd7-4cd1-903c-716845c1b7cd",
            "7430bf42-636b-42ae-863f-8a7463dfcefd",
            "d6a3eeec-cde0-4c10-89b2-93e0bd5f34e6",
            "4245b44f-78e6-404f-8fed-a7bc2a223a57",
            "b2dbfc09-b332-408b-a235-1850e41971c5",
            "06bb5ffb-cc92-4842-9148-cd3c5db1ad3e",
            "ed2ac1e9-d51d-4eff-a2c2-85e81abd6360",
            "f9ab44f1-7b19-4ecb-830c-403abcf36cd1",
            "a996b5bd-db99-4257-b036-336f63448aa2",
            "ce390e09-1479-4d50-9b85-81a6e46fc2c0",
            "99186cd1-81d3-44b0-8215-8cff400f97a9",
            "5dcdb5eb-cb72-4e6e-9e63-b7bace604965",
            "c16a2424-6f7b-4538-a547-0cef5add7056",
            "2fa45bbb-0efb-4950-9d40-94bf23cbfec1",
            "0d8b0d50-e4cf-4da4-965d-f24c58ec3268",
            "7e30debb-3308-49ab-a5ac-6d49319a5705",
            "cbe7746f-d4b4-4f0d-a435-1aa181d97b1b",
            "9311e2bc-bb3f-44cf-90d8-b1fe6912b60b",
            "01e60eba-52df-4694-8f09-39f43abe54e9",
            "854a1807-025b-42a8-ba8c-2a39717f1d25",
            "f59f7cee-8f6a-4a6f-b23c-f3b5fdf6208f",
            "71a9789c-fc1d-4a95-a4ec-82833e0fa2c3",
            "ed842905-b374-47db-8074-f890f126533b",
            "c5a0743b-de76-4311-9a11-c49c8733aed1",
            "4dbf5678-7a31-406a-abbe-232f8ac2cd63",
            "2d30a023-3738-4572-a71f-3bbaef4f05da",
            "10a9ff92-9637-4498-afea-7044b2ab0dc0",
            "2339bc21-aa92-4850-86f0-4bb9433910c8",
            "7728b64d-8925-4a1c-b684-a88c6194a241",
            "0c1d9174-709d-43ab-bc95-733ef61abe2a",
            "5523ed49-38bc-44fa-8670-2a9c354de0b1",
            "77122242-04d2-45ca-a4aa-520848ba3c17",
            "2a81f398-647b-4580-b24c-d78b3103a27b",
            "d530dbf9-69b1-404f-98f2-0431104f5a1e",
            "c1f5d7c6-1bce-45f1-bb80-f9c74bb9c740",
            "2061f628-01cd-4343-a078-900f639d67fe",
            "13246906-ec3b-4ec5-bc2f-f7ca802facea",
            "a5511b19-c0af-4886-ab1a-042980644dd2",
            "82462e70-bc00-43ba-8d96-734efa6e72ac",
            "119a2c67-e6d6-41cf-a58c-c51b75c80daa",
            "4c61c6e4-b8d2-45b5-b31a-ab064f5ef9f4",
            "21c1650e-3838-43f9-b9ad-652c958781ea",
            "d69e14f1-4276-4935-a5d0-495bb11a109c",
            "09887aa7-226e-4ecc-9a0c-02d2ae5777e1",
            "4580d83b-093e-4241-91fb-2dd71f5f1f3f",
            "70f0e309-5418-49b6-a130-666e2f76eecd",
            "c98d40fd-f6cf-4b26-883e-eaa515ee2851",
            "aaf09f31-bb5c-43e5-9f54-bb6554c33a71",
            "69ee3720-a7cb-4402-b48d-a02c366f2bcf",
            "04af2581-6692-4f14-a7fe-151a36f20368",
            "4b714531-2c81-48d2-b134-4197f820caa1",
            "b3b9eb0c-d0b4-4570-b816-4e05e308b444",
            "4a8ac23a-e27a-44db-814a-f8c31beb68e6",
            "dda162b4-f871-4e89-b081-b7b3470782f0",
            "cae7634f-8104-4eb7-9371-6097ad078bb5",
            "e554daf4-4ad0-438f-a7f9-832519451fd2",
            "c9073012-4547-4a72-8963-738d9f8503cc",
            "84092226-7700-4e93-a166-c231ca1ed352",
            "09e126f5-28c2-426c-bc08-6fb44ef8a9c8",
            "5f17e9fa-b437-4cc3-9f6a-1f7eaf3e3563",
            "89e39f67-65cc-4f90-b145-b1b56c209f8a",
            "4fbc55bb-61be-4eb7-b4b4-c08c68b4e060",
            "15023b60-fbbc-475a-829f-49afa6333e2f",
            "5f264b87-d5f6-487d-aa3e-ae4c5f0c6fc9",
            "97daf4f4-34d4-4666-9175-02105a594378",
            "8c2e6ce3-d8d5-4591-a01a-02c367d128a9",
            "1946a82a-f927-40c2-8235-38d64f50d043",
            "84d36e65-e9a1-4259-80a5-1b92cbe45162",
            "bfcc6d75-a6a5-4bc6-8282-47aec8531818",
            "48fbfb0b-92ee-45eb-99c2-0bde4c05962e",
            "e82500a8-70ce-46ad-a028-b0690420d560",
            "2d499150-1c42-4ffb-a90c-1cc635519d33",
            "341e61ab-c0f1-4397-bfef-3674a922816a",
            "733c0b9e-54cd-4433-9a02-b15c13e79465",
            "3c580721-5380-45e8-965f-5c471e984438",
            "8b506e4a-c343-467b-aad6-300a9bfac355",
            "f57e14e4-b030-467c-b202-539453f504ec",
            "cbf9738d-8f81-4a92-bc64-ede09341652d",
            "21e3292e-dac8-4609-b57d-402f926aa41f",
            "28156b5b-a90e-4cae-89ff-b6a2b4d12f39",
            "443d3e33-366e-4a75-ab68-8ea65bd1cb32",
            "396d316b-a9de-4c3e-88e8-a1caf730a6b5",
            "f3430779-bbec-437b-944d-1fbf45d2e786",
            "78e98e0e-f873-4e5e-b4b7-88b7293fd713",
            "94d40ba7-2b35-48ae-86f1-66ea06102693",
            "197db30d-0886-41ad-908e-c9dd70e62739",
            "7b7b1e6f-e73e-41a0-9d72-8f0b30c6992d",
            "87bca6c2-8e10-4971-9e1c-114b34c08054",
            "1dc3c12f-0726-4f60-beb4-6acf350c28d1",
            "ef8ffb35-51ac-436a-8e23-0dd3a95a6328",
            "efc8a006-d0c6-4a9b-8cb1-91ca770fa2b9",
            "d71c2b20-616a-4bb8-a848-e6edac412c3b",
            "cc197bad-dc9c-440d-a5b5-d52ba2e14234",
            "c0a1179b-b14a-4d68-a3c1-1fdab16ed602",
            "433b8074-130d-4e2e-a141-dbfeb72544b6",
            "10ae95fd-6e01-48ec-8108-d49fedcc259f",
            "a0327dc2-dc76-44d5-aec6-47cd2dff1469",
            "2cb6a048-e027-4ad1-a36f-8654758af1d9",
            "97daf4f4-34d4-4666-9175-02105a594378",
            "36fb40e7-380e-4463-bf4c-358080c11462",
            "03172286-f7ed-4864-a4db-459cd5ca9790",
            "96293bb9-10f6-48db-bf2b-dec177b6d10f",
            "a305918f-ce88-4834-a134-3381e34ad4e8",
            "3df914b9-e0bc-493c-875a-c412f84ecdad",
            "8996b655-fbad-4018-b430-1bd8fab43235",
            "2d1ede49-25a0-4b55-9d1f-f367abe94ed3",
            "b1570544-93ab-4b2b-8398-131735394202",
            "86443348-fd26-48cf-bd13-7ea7fa27505c",
            "4ce1c576-305a-4b82-82fa-5e5359056219",
            "caaba574-dfbc-4681-8e56-19b5150897d2",
            "7bd9e20e-74b9-446a-a2ed-a223f82a36e7",
            "ddb19d64-d0c2-4695-8f67-88b4286887d3",
            "9ab19acf-06d9-4c92-bd5a-8c945488d45b",
            "20ff3303-4fe2-4a47-a1b6-291e26aa3438",
            "4a0ba93e-c7cc-43bf-b9e1-c7d1359616db",
            "2f522f5c-111c-4ce8-8bd0-d82e97c227ad",
            "d3b5408b-c3b2-441e-8272-63371f814a0e",
            "4658babc-774d-4d15-840b-fc7d496d93ba",
            "d570e140-68fc-40ee-9a7a-0fae7209f784",
            "535401f6-2fd0-4f3b-a58a-5dba94f915f6",
            "8925a01a-8608-411d-a90b-f3a52d061208",
            "c8af07f4-4dd1-4cc1-aa87-54ed8e390806",
            "4f7d204d-dcc1-4fe8-913e-0629b530ce2e",
            "c0cc5d77-937d-4296-a349-0a09d733fbfb",
            "95c8b6b7-1e24-4987-804c-024f6b05cd91",
            "52d95505-a5bf-46d1-90a4-7d51316e6400",
            "f84e0f7d-86b0-4957-8b17-6b46d6e47246",
            "3e8bd859-7d82-49e0-b267-84fc46e2bf68",
            "302bd7b9-d012-4360-897a-93b00c855680",
            "a73662ac-647d-4ca4-b26d-162a0d5c5a8e",
            "9ffad8aa-b671-4a9a-a527-a95bdaaa0ec4",
            "20649b30-272e-4de1-8cfe-d6e92ac7045d",
            "5578d1ad-02db-4b17-ada1-32d1aa4efd49",
            "6eb59bd3-4232-4a00-b8fe-86670cab7473",
            "07e748f1-075e-428d-85dc-ce3be434e906",
            "4a00ec9d-c635-463a-8cd4-eb61725f0c60",
            "dbb3b771-ae77-4381-b61c-758b5b7898ec",
            "5e6c760b-42e0-4df4-a221-0269355da00a",
            "79491354-3d83-40e3-9d8e-7592d58d790a",
            "faf4cefb-036c-4c88-b93a-5b03dd0a0e6b",
            "ff7592f0-2c7f-4df6-a178-56aa5c5cf966",
            "8538e728-ca0b-4321-b7e5-cff6565dd4c0",
            "05b75ee5-98cd-430e-b1ec-ec0f61fdabda",
            "a4dd4cc7-576d-4126-9780-75a48741234e",
            "d1353a0c-26fb-4318-a116-defde9c7c9ad",
            "9300a3a4-c74a-46ca-93b8-4d4b4b740e8a",
            "7e07ffb5-c0f6-4891-a74d-a5e12a247785",
            "6bd7faa9-601f-44db-a2a6-239209f83156",
            "614e3804-7d34-41ba-857f-811bad7c2b7a",
            "75df1c98-2075-494f-9612-b87513f0e50c",
            "8b86576e-1cf5-46c8-970a-a79d13c2e0f0",
            "00433d62-f84b-4913-be62-206c865042c4",
            "1a99cc88-aea3-4fe3-96b9-20791667f65f",
            "081a2d60-9791-4e05-a075-f1890355eeee",
            "31445b1e-96f3-4c7f-84ec-dd02e647e690",
            "f3bf61f8-97d4-4e52-a73d-2ddbbe8196c8",
            "b02dc689-7859-461d-b70e-9fe1f64fddce",
            "87452e5d-d526-4637-9f23-133faeb22508",
            "1d543e07-d0d2-4834-a8db-d65c50c2a856",
            "13c10976-99f1-4cb4-8fbe-56067e91d865",
            "afbdfac9-2955-4404-ae22-c08bf1c1b51e",
            "ba7c4a1c-aa4e-488a-92dc-be92cb6bca6b",
            "136dd883-5a23-4b75-8079-0cd658d76ba1",
            "23d8426c-18c7-46e6-a51d-7395bd43c641",
            "f984ebbf-8534-4163-9cb8-295c91535446",
            "ef58d4c9-0d40-42ba-bfab-9186c1483edd",
            "00ef5e52-582b-4d53-a03a-bbd5b3084197",
            "9fff2f8a-21e6-47de-a2b8-7f449929d43f",
            "094f10e7-27d5-400d-a145-331013e67229",
            "c3ecef5d-84f3-4942-8c24-0a626343c3f4",
            "5f6ab597-f57a-40da-be9e-adad48708203",
            "5269d3d2-63c6-4b8f-8200-6908ffa365d5",
            "2c4dae8c-e591-49e0-9c5a-62b310a15788",
            "6060d1bb-94f8-4863-89b9-425487f2f6b2",
            "f07d2a0a-955f-4adc-b70a-7aba348f343d",
            "1a1cd7f3-e5df-4eca-bae2-2757c9e656b5",
            "49336317-4ddb-4bbf-a75c-227e19b8c112",
            "5f3411dd-4723-430a-a82b-c5580abd5bb0",
            "7eb0fbce-7e15-4620-a11f-e4d9a310d1e3",
            "f46bd570-5768-462e-b84c-c7c993bbf47e",
            "e3489fd7-e93e-4232-bccb-f4261e3361d8",
            "c6ada25c-8590-4b75-8013-883a8df55882",
            "e80cb9fc-37b9-469b-9c73-ff26e79941f7",
            "14387b0f-765c-4852-852f-135335790466",
            "6ee7a715-e0c0-46d0-a215-2e17001699fc",
            "77a4ee27-a482-49db-a7f6-11bde59842cf",
            "28a40a67-ecd3-432a-be2f-51490a7743ec",
            "33ca19f4-18c8-4411-98df-ac23890ce9f5",
            "b83bc61f-8451-4a5d-8b8e-7e9ed295e822",
            "ad19960f-6968-4de4-af86-f6ba1f64c9cd",
            "b95ce3ff-3d05-4e87-9e01-c97b66af13d4",
            "71b03238-e53d-4e1e-9b3a-6ce1dcdf2894",
            "7d397268-6447-458f-8da5-a89aa4f451b8",
            "f1d1df24-91af-4d27-83a4-9b4ad29b37eb",
            "35f866dc-c061-48ba-8157-cf2e0eac4857",
            "4967c0a1-b9f3-465e-8440-4598fd9fc33c",
            "f4038a4a-77af-4363-a2a8-5d847bb7f1ba",
            "ac7e838c-3d95-47c2-92a9-81767ad7c217",
            "329f95db-f02e-40bf-a5f7-0dea11529ce3",
            "672ac8f7-2113-4c92-b3bc-3b72b1c1bfe7",
            "0b57055c-12cd-4305-9547-c80d42032d59",
            "50da04cf-cc25-4313-ac1a-99e84f18cca7",
            "82c365bb-d4fd-4217-89ff-ad82425276b5",
            "3ab7295a-54ac-40e8-b1b2-3d110a143550",
            "321531fc-db73-4ffa-a959-61a61a2908c1",
            "4c7ccacb-d962-4f18-b2dc-44d7417f89ac",
            "4c7a5854-6b75-4623-a684-6a3d785d9015",
            "99689dd2-6aa8-49fe-9387-1039befb9ad3",
            "f4a31f0a-51dd-4fa7-986d-3095c40c5ed9",
            "18e9bfd5-db23-4bc1-be0f-5710e5d656e4",
            "d2299099-e617-46dd-b013-ba0b4c72bc63",
            "ca2c3c55-83ff-4a8b-886a-c45156519469",
            "23d9d74d-c95e-46a6-be26-a6075c49747a",
            "516cef4d-0718-4007-9939-f9b38af3f784",
            "068aac98-463a-4221-9d85-78a16e1c2302",
            "adb4e8ea-0932-4e4b-9e69-f48feee90ce1",
            "6bd5655c-b7fe-48ee-8925-c2d2d8798618",
            "97056efa-1d47-485a-8de8-e29a43122166",
            "e5d406bb-a9a5-4bf4-a8e9-ef1d97e3ec94",
            "15433754-81e7-411d-8535-e6554d7ef487",
            "1c46e82f-4764-4d82-a33b-5d5aee5e2881",
            "f7df5df4-4dfa-459d-972b-1ba051c15ddc",
            "d1932cd4-28d5-4564-a851-62f3125dbf7f",
            "0b76f632-25fa-4681-9862-86499c28afd3",
            "f984379d-87cc-4ca0-9fc3-70d0b25fd9a9",
            "a3a93432-2c3a-45a7-9d33-39084516bd1f",
            "24295618-32d7-4a6c-a142-98b19d69b89f",
            "2c8fb177-1465-4586-9e23-6020b9606199",
            "4593d49a-7f67-46ba-9ec0-126bd676286f",
            "5fee3020-513b-48c2-b1f7-4681b01db0c6",
            "88798869-338b-418e-9c47-97365444b734",
            "5c6f8874-cb53-4f4d-9168-cc2af8c7ecf9",
            "0cd117b2-2e21-406d-80cf-5ce0a6065e37",
            "c09c8263-40ef-4352-8031-e438b1ce68fc",
            "45dc5f07-6609-4760-a933-8c9e0f858d05",
            "583aec45-62fc-4972-8da2-f09aacc70fc5",
            "af13ed16-957a-40f2-a933-719236dc2636",
            "07cc14fb-4784-4a25-804b-2686ed5ef52c",
            "d211333a-22eb-4be7-a2ac-ca12c73646db",
            "467f69b6-8d6d-4d2c-bfad-e89adf2806ff",
            "d268408c-d635-4e76-b7f7-e4e0fe959e52",
            "ccb8f30e-4d71-40c4-8b1d-846dafe73e2c",
            "42a8f507-8412-4611-854f-926571049fa0",
            "5ab2cf34-517e-48eb-b3a5-34e1cbcd600a",
            "3b39abeb-0064-4eed-9ddd-ee47a45c54cb",
            "116ed804-4d04-43fd-809f-24e18b17233c",
            "fc817311-4f42-4985-bc42-78b671d1dc18",
            "38dd6337-19ae-4793-ab4b-313eff523457",
            "afa7180c-8333-4b9a-85f0-28a19bddf1bb",
            "b7442f18-d9be-4185-8b51-482510046156",
            "93fae984-0b8a-45cc-8558-0f4e130249a5",
            "da5bd072-1870-4b05-84c4-064937a35419",
            "f5b33d1b-e8bc-444e-bc5c-490473aa0f50",
            "2b916c27-6972-4453-9027-ac9c941e5c27",
            "ac2d1c91-3667-46aa-9fe7-170ca7fce9e2",
            "eec163e4-a013-4af0-9641-c5b2df41fff7",
            "e21857d5-3256-4547-afb3-4b6ded592596",
            "6f6fd596-76e0-4b82-aa37-f558ac2d337b",
            "328676f3-76ac-40df-b154-31e6f533286a",
            "eeb1195b-f213-4ce1-b28c-8565211f8e43",
            "2e41ae9c-afd2-4f20-8f1e-17281ce9b472",
            "5a2463af-eef0-4a22-bc8f-5865fbe9c78e",
            "6508cf1d-4da2-4d71-81ec-0e072338991f",
            "373f5bcf-f1ce-4515-83ed-0b8ed636bc14",
            "3377f3bb-60fc-4403-aea9-7e800612e060",
            "02295e8b-8a73-493f-b26c-efac82b13a15",
            "28a40a67-ecd3-432a-be2f-51490a7743ec",
            "167e1cd2-4a9e-4f34-bcda-2e0acf0a1797",
            "3fa7095b-4447-465e-a784-14b07789d7a1",
            "a33f1f9a-b4ec-497d-a0c4-cfe57ff9a25f",
            "b4065fe7-a1b0-46d9-ae7f-ae0f80c7975a",
            "4cc51547-88ae-49a2-bf7e-0ef65ee7a94c",
            "39b22a9e-59dd-412b-ac3c-0725c807c72b",
            "9c0acf12-0699-476d-9d51-25094e957f16",
            "0aac51db-d89e-420b-a2e4-515ca763eadd",
            "585fee48-98c7-45b4-a47c-78d629b773b8",
            "2fa0d3ac-b64c-401a-b0a1-4915ba6cc157",
            "4f9a4dec-2a55-47c6-9b8c-289e4d482787",
            "321fdfbb-426b-43f7-8295-fa9aca6348d9",
            "35595cc9-3350-4ccb-8691-4bab8ccd874c",
            "20aee940-3b65-4d04-8768-9a5918db2973",
            "b4691384-50c3-4afd-9988-51d3ec5db65d",
            "cded13bc-c3da-4b14-9c87-79ac91b23efd",
            "7b51c615-954c-4d47-b9da-384d6a78f10f",
            "f6114721-d8a2-4000-a31f-5c1a41787d08",
            "1921c28c-ec61-4725-8e35-38dd656f7923",
            "0bf8b6a0-8ae4-42f7-ba7a-d66d343c73da",
            "d8f0f6ac-a0a7-47bd-9786-f9106d7bdd11",
            "eb5f1f04-0174-4534-996f-e8d944ed2a77",
            "929ca8c3-5df3-4fe9-bc59-f8d603780bce",
            "3a052c99-8c18-484a-8beb-9873b4fb3106",
            "9e2cde4a-3241-45df-b122-f23ffcce7093",
            "012151a8-0f9a-44c9-997f-ebd68b5389f9",
            "60d1d22b-e9b0-4c8b-b4c5-91c0868be66a",
            "27b5db5e-31e5-4ab2-ba35-e19f58c1f591",
            "99efca32-eea1-45fb-92cb-8798976a9769",
            "d553e89c-3c2a-4f10-9ce1-9eaa74de0129",
            "e3e0abcd-7671-4482-a9d8-462f5acc9be5",
            "eab76c9f-ff91-4431-b6dd-3b976c598020",
            "0a5c92c7-4aa7-4324-82ab-8e8e733507cb",
            "c175f8b3-47f8-46d4-a4cf-cb92fe7a37ae",
            "26358fa2-80c2-47b0-a08b-33817caca7e8",
            "ca891d65-d9b0-4258-89f7-e6ba29d83767",
            "b27f61b3-7599-46ea-a385-e150bf0b5b95",
            "a2361c7d-ddb6-41c1-a9a0-be09fbbb8d21",
            "e7ae37b1-624f-47b9-bf4f-53b52ef19528",
            "202d588f-f92b-49f3-b04a-8adb3d02d6b4",
            "b9545342-1e6d-4dae-84ac-013374ad8d7c",
            "9c0acf12-0699-476d-9d51-25094e957f16",
            "4d9b3443-0954-4b85-a34e-e1330ae3abcf",
            "ff6e677f-91dd-4986-a174-8db0474b1799",
            "e5257dc5-1edd-4fca-b7e6-1158e00522c8",
            "1df15ee0-b52b-4315-9cb9-bc5a27a685e9",
            "f24c0db6-f902-4f37-9fee-efb9b384ff18",
            "83735edd-f2a3-41d0-a31d-652bc3cadb3e",
            "1c27d44c-6c21-43bd-b826-51ccb9528100",
            "5ff6314c-5e85-48c8-8083-6572dc8e9b66",
            "ebee61b4-bbdd-4087-9bcb-d5aa099088ec",
            "88a8d8a9-7c9b-4f7b-8700-7f0f7a503688",
            "500df185-4a22-40a5-baf6-bdcabab5ed22",
            "49afd610-0265-4ab1-9e13-f0cc98e33e1d",
            "e4f92153-dd32-4c81-98bd-e0ad9a1b9672",
            "b27e3181-f3d2-4c87-a7d8-20928744b5c6",
            "e03cf5b6-d2ec-4465-adee-226b518bcfcd",
            "b553be52-78f3-4b07-8b6b-ca802ced388b",
            "f82bcf78-5b69-4622-a5ef-73800768d9ac",
            "b504f625-4ef6-4a5a-81e8-870a61e8dc9c",
            "9a3a03d7-d6c2-46fb-ba78-2b9a7d6bb4b6",
            "86e2e2ad-6d1b-44fd-9463-b6683718a1cc",
            "5bb50026-3b58-405c-9a7d-0f046108f675",
            "b0e84e70-f294-43ab-8025-abc0cd2f5339",
            "1c009a08-74d1-4682-bc56-8bfbe9e66b62",
            "d24fb461-dee8-41fc-bb15-2f13bb2644a6",
            "83efe4b3-3514-4e3c-abf4-5348a8619bd0",
            "fdfc7c9b-e1a2-427c-99ec-c03fcdab0a75",
            "f0602f55-1770-483d-89bd-4bae0d0ac086",
            "18f719e7-e9b4-4216-8869-9083ebc23f7d",
            "fe37acd4-893c-4b2c-8ad2-7fd394280354",
            "0b930019-7d30-4bb5-8907-fe5d6c44fffa",
            "368be566-989d-48dc-8c14-f87d33ce9c3b",
            "79e1bb77-fd8b-42ab-8043-892af5370f0b",
            "c6f5969f-1f65-465c-8603-ec2d1e31e39d",
            "4d5447d7-c61c-4120-ba1b-d7f471d385b9",
            "144ef525-85e9-40c3-8335-02c32d0861f3",
            "d43d12a1-2dc9-4257-a2fd-0a3bb1081b86",
            "3ff0f713-0232-4997-a6e3-a42ae30eca9c",
            "17678771-5799-4017-851a-319f25b6948d",
            "80d77777-8456-4686-94a6-754c9e50bdff",
            "29762c82-bb92-4acd-b1fb-09cc4da250d2",
            "e3489fd7-e93e-4232-bccb-f4261e3361d8",
            "fde548d0-4dc4-4331-8f1c-ca342911e5ea",
            "3c418647-3aa0-4f0b-b043-306f47855f52",
            "61388717-2809-47e8-91cf-4c7f722a4c02",
            "373b3663-ecc3-40c4-9241-838ae8ca34d0",
            "8b0f05ce-354e-4121-9e0b-8b4732ea844f",
            "1ff72e8a-15a0-40a1-800e-b56241738827",
            "bea235a0-db63-44b1-881e-264d25791f5a",
            "4757df70-6c3e-46b8-99c0-a68644595c9a",
            "e0140a67-e4d1-4f13-8a01-364355bee46e",
            "1def2cdc-a6ec-4972-8614-204e13301650",
            "e783857a-203c-45cd-8ff3-dba745238be6",
            "52722de9-8e80-45dd-becc-74ffb913e205",
            "164f0d73-1234-4e2c-8743-d77bf2191051",
            "03647192-f55b-42b2-9a74-db28fcae8fd1",
            "3313f634-1405-481c-ada7-aef1980ac961",
            "466cbab7-12c4-48d8-a0bd-5ae85ed4e96e",
            "9bc6c32f-aeb8-4639-88e2-a7851dfffef5",
            "c2c81a72-4f8d-40f1-8cca-cfe31a3ac319",
            "7473425a-05ff-41d2-b375-9b213b8bbde8",
            "ddd4c4bc-a4ae-4946-b59c-a86aea7fa4f0",
            "d5199c98-612a-479c-8257-1768662c11fe",
            "5441c29d-3602-4898-b1a1-b77fa23b8e50",
            "f45da029-7b00-4bf3-962c-0eeb20309cc4",
            "1239d1bc-cc09-43e0-bcd0-374f60346138",
            "95813764-958a-4591-bd51-8b949e9d520e",
            "381086ea-f511-4aba-bdf9-71c753dc5077",
            "b76c616a-ec0d-4f0c-b986-f249c4a04d77",
            "f45e686a-6360-4214-bb40-66ba24b6e7b5",
            "2a0cce30-071b-4ba9-bf78-ae76c9eb7316",
            "ef73e6ed-9096-4ddb-9799-b94874d0ce33",
            "e3e90633-b6f1-4376-b15b-2492c94b4cf7",
            "e0e1db18-f7ba-4dee-95ff-7ae8cf545460",
            "31c0df3c-2d23-41d3-a772-ec3cfc3cc625",
            "95e1ead9-4d31-4808-a7ac-32c3614c116b",
            "08790934-4001-4c01-86ea-475a6734d02f",
            "4b462375-c508-432a-8c88-ceeec38b16ae",
            "e1f1e33e-2e4c-4d43-b91b-7064068d3283",
            "13c9c494-09aa-4518-8572-9f41dbdff461",
            "bf710b71-48e5-4e15-9bd6-96debb2e4e98",
            "adb4e8ea-0932-4e4b-9e69-f48feee90ce1",
            "8882b956-0406-494e-a05c-416322d90f66",
            "ac579536-1398-44db-a37b-9d5963a46929",
            "30baa5b8-d299-4a0c-918e-9b713785a0e3",
            "cab251f1-ff3b-4e08-8b0f-be4d740568c9",
            "0eedfc95-e79a-4fd9-832a-cd816a0b3fda",
            "650e7db6-b795-4eb5-a702-5ea2fc46c848",
            "b7539c32-53e7-4908-bda3-81449c367da6",
            "4c8571fc-17ea-4eae-8a31-8d09997011e6",
            "3cb25fb2-5547-4b05-adec-1a5e37830d46",
            "7e3f7bff-eb80-40a9-a335-956d74bee54c",
            "713e751f-3ddb-4b77-b3b1-9e6f2e953ad5",
            "8e494408-8620-4c6a-82c2-c2ca4a1e4f12",
            "88d1360a-bc2d-47df-90d1-d2de285560aa",
            "2e547c75-36c1-49d0-984e-b14498c936f0",
            "349291c5-a650-4156-bbc9-af646bea7b71",
            "16c5bb7a-35b7-418d-880e-7ed3399f1b40",
            "47685be0-926f-4be9-b1ae-e32da47a3b99",
            "9c0acf12-0699-476d-9d51-25094e957f16",
            "efdbd3b1-2d20-4cea-af46-dffbc1e7daba",
            "f8ffb812-99e2-4e5b-91e4-e608095d1348",
            "77fafce8-a32f-4d42-bdce-266bbf913cee",
            "c33d9d64-a760-43cd-bad3-520ed37bb004",
            "bc1b5c95-e6d6-46b5-957a-5e8908b02c1e",
            "330e00e4-7991-4b47-b2be-3881aa5afed6",
            "ac9a487a-d9d2-4f27-bb23-0f4686488345",
            "a668565b-41b8-44a8-9d5c-8e609dbf69fc",
            "925c7673-0e85-410f-b7e4-d9705a7aa619",
            "ed5d9086-e8cd-473a-b96c-d81ad6c98f0d",
            "028e1863-cab4-4a3d-9dd9-91c682c91005",
            "9d93fcb8-f66a-4576-9bdc-04dd4a1b27c6",
            "ddf2c2b9-b368-4a13-8171-ffa8122a62ed",
            "0638ba22-040f-438d-83a5-9b670c4adaf5",
            "aab35942-f176-4f77-bbf9-1d6aa98ccf3f",
            "dc06730e-7330-40a8-9c84-4fe3b10c9250",
            "bfcb6630-9b31-4e63-b11f-7b0363be72b5",
            "e7ab70fc-ae7b-4321-a9d1-4c2e9440e0f5",
            "8f9d6bb2-dba4-4cca-9967-cc02b9f4820c",
            "18599b97-e547-4c6b-9b59-bd48e80ca9c3",
            "cb2b9e04-260f-4c64-8456-d73f28258e55",
            "ed667cac-2fdb-4401-973b-81c5b4a1717d",
            "a82dce6e-f178-4b59-ba4b-b835d3f55cfa",
            "c3b4e25b-977f-4cb6-96d7-f68afbac732f",
            "f5e17326-eb32-457f-a986-1e0532507f32",
            "79239441-bfd5-4981-a70c-55c3f15c1287",
            "603b536b-d9d5-4236-acca-4436f4c76e26",
            "3abca171-d700-4a1f-aa0f-d683c37ef74d",
            "34dc70df-8b2c-4bb0-a132-0958671a509c",
            "ec09ccd3-a20f-4033-846b-5c42fc6d4dc9",
            "6d244142-dac5-4631-b773-02bc15169423",
            "8c1f7395-61b6-43bf-bb62-55d2c669f0e0",
            "20f033b7-d258-49d3-8600-30f3dbcba410",
            "e09e2e95-275e-47ef-9d2e-7750e5a05a12",
            "8a51cac0-9326-4c40-a820-4560124d18a8",
            "3e1f2ee4-16be-4406-bf18-6173840cf2b1",
            "06db73fd-57e2-4a6f-bcd3-699fb7bb7af4",
            "79887c09-b424-4076-92c5-bd390a3d4c85",
            "03f2f28f-53ab-4d88-a659-0b8dfa0bfd70",
            "31b6b7f8-d5d6-4915-9567-b158525e8948",
            "494e8d09-f85b-4543-892f-a5096aed1cd4",
            "3fd173ef-8647-45ab-80b5-6135c422bfee",
            "5dfdca28-9ddc-4853-933c-8bc97d87beec",
            "0ab49580-c84f-44d4-875f-d83760ea2cfe",
            "cb4d890a-8255-47a8-b819-fee5aa525336",
            "854fbd52-9d01-4ce6-ac3e-8324e3ad753d",
            "d7bcfcb3-9dab-4897-8c47-25132eb48a88",
            "6781af9a-175c-4b27-917d-da89060aa15d",
            "692915bd-bc68-4db7-af7a-4e2b091a264c",
            "db3ed2cd-ede2-472e-ae20-b4aeae16e5f8",
            "22e39ab1-bb7a-4c9d-8254-9d68c627808d",
            "c890419c-5ae8-453c-8338-2cdde2bcf44e",
            "b134d1bf-c7c7-4427-93ac-9fdbc2b59ef1",
            "375a3c4c-7898-47f0-ad0e-443a75148c7a",
            "4439c2fd-a754-4f6a-b3a6-791b47726156",
            "209e47f9-df65-47bd-9a40-4fb4c5c9c349",
            "b3ae82c2-e60b-4551-a76d-6620f1b456aa",
            "c47267ed-7482-40bb-a4ea-e1399cc8ce04",
            "94dbfe2e-ca48-4e08-a5a8-e1e74136c63d",
            "a9044915-8be3-4c7e-b11f-9e2d2ea0a91e",
            "65f4f0c5-ef9e-490c-aee3-909e7ae6b2ab",
            "09830e79-cc8d-422f-ae25-6efde4320b73",
            "7cf0ea9d-86b9-4dad-ba9e-2355a64899ea",
            "f27ec8db-af05-4f36-916e-3d57f91ecf5e",
            "2e956f4c-8564-4430-a8f3-9319d0f9481a",
            "0221734a-35a8-40f7-b5c5-2f61a200bc7c",
            "98ad7a28-1949-4786-b1f6-4fa05b9b440c",
            "6011bcce-9f6b-4aae-adae-68727eaef7e0",
            "8a9ac1cb-faae-434e-8d60-b139a3707dfc",
            "5b64e344-b2fb-47bd-bd7b-4c793b17d472",
            "3a7149ba-cbdc-4477-9208-ae8966fe4018",
            "7e9bd05a-117f-4cce-87bc-e011527a8b18",
            "1bfa27e3-0376-4206-a772-4586e25a64f5",
            "63ba8239-cac4-402c-bef6-f26da4881da4",
            "5676c373-0569-4e64-9ac7-1ece03891334",
            "1590c940-cee0-4a85-a068-4b1c173c1d0f",
            "23c9a850-f1bf-4f28-8b45-70c12fd28a45",
            "585fee48-98c7-45b4-a47c-78d629b773b8",
            "57f73e51-5b95-485b-9102-bc7bd23584f7",
            "9c9f1380-2516-4fc9-a3e6-f9f61941d090",
            "6e755d2d-0b47-449d-b03f-fcacec33aab2",
            "5b254de2-1322-4644-8f0b-777a3b65b4c9",
            "d6d98600-a879-4ce4-a9c3-e6e8f7c0211e",
            "7c5e39c3-7645-4e37-968d-a4e45cd38c5d",
            "18b23026-ed29-445a-9bb4-4e86598ab5a9",
            "593bee5f-36b9-401d-bbfe-996339961285",
            "216a7b44-3846-494c-93f5-f2d4d9b95b36",
            "702ce746-83b9-47e4-a8c9-2d54a3853c41",
            "0e39ba2f-03eb-4bdf-9947-72c19692a130",
            "cfbc0924-0035-4d6c-8197-f024653af823",
            "03b33dce-6a0b-4ce6-a084-89771743ff8d",
            "2ceb4e66-4eaa-4dba-ad3a-30df3b742557",
            "418fe547-4bec-48fe-8df0-ed25e27f4570",
            "bc2ed01e-bca4-410c-a081-e12cf1f0b567",
            "61783f55-23be-4199-b944-e322840a1f10",
            "a4a01f5d-18e7-4571-8c3a-76ec0e24e2d7",
            "811900b2-68fc-4d41-8bad-69b7a1f4d628",
            "13655113-cd16-4b43-9dca-cadbbf26ee05",
            "16243662-8538-4746-a0fb-0d15b5828b8e",
            "9cd4c125-20e9-4e13-a2b2-95c5d9141e41",
            "0f7534a6-dc5f-46ca-a2e0-13d214cdd52b",
            "4aae17a7-9f0c-487b-b60e-f8eafb410b1d",
            "bc710bcf-8815-42cf-bad2-3f1d12246aeb",
            "1036b808-f58c-4a3e-b461-a2c4492ecf1b",
            "24845bf0-2140-4ca2-92bb-de817ac96268",
            "0f7534a6-dc5f-46ca-a2e0-13d214cdd52b",
            "00a9f935-ba93-4fc8-a33a-993abe9c936b",
            "b7ffd2af-418f-4be2-bdd1-22f8b48613da",
            "a0c5737e-da6d-468f-a78e-19146494f1db",
            "dfe96a23-6e85-4523-a324-637bf993e293",
            "3575a514-ef96-41a0-adc2-c5ed5827d8e7",
            "08053aff-d56f-4753-bcfa-38b7ce9ffd1c",
            "dcaa4f81-bfb7-44eb-8594-4e74f004b6e4",
            "d5d97b2b-b83b-4976-814a-056d9076c8c3",
            "cacb7214-2881-44f3-9dfc-053e22449acb",
            "3776162e-5d56-4eda-89dc-075a49332b90",
            "9e103f85-7af7-41d7-b83b-49ba8f0c5abf",
            "aa2c5e55-57f5-42a7-a0e4-4a02cd9399b1",
            "166bc1cb-a2b7-412d-bcd5-5f439d2cf5f1",
            "c33c2065-b1c3-4406-b066-d33a9e2ea71a",
            "d82ba5f4-da09-479a-ab18-4b1a122c4345",
            "15674cab-ca9c-4704-b15f-c601d2f4409b",
            "882728bd-a6b9-464f-beab-23d3e66143b5",
            "23a03e33-a603-404e-bcbf-2c00159d7067",
            "5d400869-0471-42ee-afda-3addd73d0418",
            "ad279295-653f-42e1-9aaa-b731df2e78ba",
            "5b5b5410-29d7-478a-94ca-bffa06c73579",
            "57e79d57-b795-475e-9fa2-5dd9d5513b8c",
            "c5eb9407-caeb-4303-b383-6929aa94021c",
            "01ff95ee-0e52-4809-b67a-d6c26a944747",
            "30df1299-811b-4333-9f40-463bc13e9d36",
            "ba550d0e-adac-4864-b88b-407cab5e76af",
            "db703302-dd01-4535-b35c-e608c4dd82b0",
            "e59b2cdc-378b-42e8-b87a-a022b5f9a549",
            "5938c629-1d06-480b-9780-859b153af11e",
            "d80cfb78-51ee-446d-8b3d-578d50a7ce2e",
            "be540c02-7898-4b79-9acc-c8122c7d9e83",
            "32a83250-7e26-422d-b9ac-f4564343e9ce",
            "122d63fc-8671-43e4-9752-34e846d62a9c",
            "01e6cd5d-9487-4a12-bffa-0b68aa82e27e",
            "77de9077-5074-4a07-9fe7-049414715ea9",
            "486067ad-56d6-48b5-957b-d6cfe3e1af73",
            "dfe78af2-779e-4137-826a-3073a16e3278",
            "401c3991-b76b-499d-8082-9f2df958ef78",
            "83d91898-7763-47d7-b03b-b92132375c47",
            "4c101f69-7b46-4f9d-8025-26bb7b4cf7da",
            "176706f4-edc7-4f58-90c8-b1f81162b725",
            "9e0e2b01-41db-4008-bd8b-988977d6019a",
            "0b6cbf4e-d051-470d-8ef8-7c5f0c226a0f",
            "b1e26560-60e5-4236-bbdb-9aa5a8d5ee19",
            "1fda852b-92e9-4562-82fa-c52820a77b23",
            "20c7090f-3813-43e5-8535-7fcfd6fdf6e6",
            "f5b8ea5f-c269-45dd-9936-1fedf3c56851",
            "ef2e5ca3-d264-4f63-b411-e9eee88c7202",
            "b925eff0-4190-454e-a2e9-0c6f3f4aaaed",
            "f99b7d67-4e63-4678-aa66-4c6ac0f7d24a",
            "0383dadf-2a4e-4d10-a46a-e9e041da8eb3",
            "7dc8f5bd-9d0b-4087-9f73-dc164950bbd8",
            "deeea939-7f89-4762-b09f-79269cd70d3b",
            "b52e99bd-e49d-4371-9fbd-cf1a0c2512ce",
            "c27cac8e-4c4a-48c0-a4ba-41399b9c176d",
            "e881c88c-c318-4ff4-b4e3-c04447a7563c",
            "6f500293-7396-4903-b4fd-118127d06f9e",
            "c78c3026-426b-4580-ab23-08490bb8b515",
            "e3cb4543-210f-499a-b0d1-3882c312dfb9",
            "d5c5de35-c065-4e8d-8c72-2515934cd9fe",
            "b2d122f9-eadb-4930-a196-8f221eeb0c66",
            "d6ed7887-a401-47a8-893c-34b967444d26",
            "da7bb7d8-557d-4635-9ca1-e6e985525bd5",
            "c4efd92a-5692-41d5-91bb-b23d4b75e735",
            "cb606c37-f715-40d4-b525-f5b67b6911c9",
            "f2cb0435-d643-4fab-9587-fdb0279330a7",
            "3ec17e85-9284-4f4c-8831-4e56c2354cdb",
            "44bedd0a-64b4-4e3a-a5d7-efe1a556a549",
            "1f1f6737-b930-46fc-8d25-110bb99f7490",
            "8bfac288-ccc5-448d-9573-c33ea2aa5c30",
            "4f0cb3b7-6c06-4317-ae35-ddf3106a17ee",
            "8ce64b67-8535-45cf-9caf-87734a09b3fd",
            "6514b0d2-54c1-47a1-affd-d1ab6e03d778",
            "db92a151-1ac2-438b-bc43-b82e149ddd50",
            "13bcb2bb-db37-4397-baf5-e0f085be2d64",
            "2b9c3601-17ca-420a-ab30-10db51e474b6",
            "73e5e69d-3554-40d8-8516-00cb38737a1c",
            "f5b7825d-5878-420a-acda-73dab0fa6fde",
            "300c4c73-33ac-4255-9d57-4e32627f5e13",
            "606bf117-494f-4864-891f-09d63ff6aa4b",
            "2cfdba23-ef78-4302-adaa-474395527539",
            "c995a379-60b9-404b-bd97-a7e2de0751d3",
            "db4624cf-0e44-481e-a9dc-2142b833ec2f",
            "d5f46b3c-fd81-4ce3-a36a-378b8f668a51",
            "5a8e07d5-d932-4484-a7f7-e700793a9c94",
            "a35237a0-4f47-40a6-b6f3-1e786db23402",
            "ff065ab1-bcf2-4c76-9851-e416b3914fba",
            "bbc8d6b5-a3e3-4d51-9f4e-565e9ef94967",
            "f52fa002-e926-4e45-b229-b048b91f2c1d",
            "d8530921-e972-4263-9f52-9992d1ff4b28",
            "2e1e84d0-2ec3-4438-b917-4ffc9b45d035",
            "0bc6d6e7-0858-4b73-a079-7aa681095f98",
            "15a6f792-8fb4-425b-82c9-dfac4fa845b9",
            "78d99fbf-743b-4360-bbb7-4c174667f901",
            "d0b1ec96-5839-484e-858a-1fdca63f9e45",
            "9e9f6751-db79-4c7e-8e1f-fc1456704ff8",
            "5a85c140-dcf9-4dd2-b2c8-aff0471549f3",
            "08d86aab-8e58-4d9f-90e4-cfc3d2f0b867",
            "08d86aab-8e58-4d9f-90e4-cfc3d2f0b867",
            "d268408c-d635-4e76-b7f7-e4e0fe959e52",
            "017f0e35-690f-4b7c-be18-e0e2dfc094be",
            "ebf48614-6b24-41bd-9ebb-a90af8e473b7",
            "04b61dcd-28c9-4a3a-89af-4c290535845b",
            "8eed05a5-e9a1-4dda-8b33-e354c4ecc8b6",
            "e64fe830-fb77-462d-85d2-1d3265ae6ade",
            "6b41d8f3-e8c5-4fe7-b5be-d1cb60a2aa80",
            "83e59f23-3b0b-4304-834d-5bcafd5df6d2",
            "c3cceeed-3332-4cf0-8c4c-bbde425147b6",
            "441cc2e9-f07c-4c31-a6dc-749d993012cc",
            "c3da3346-2643-48a7-93cd-011f6834b3d7",
            "8d38a7cf-9423-4602-a0de-f157234a751f",
            "fbcd7b29-455f-49e6-9c4f-8249d20a055e",
            "b21ef19b-c6aa-4775-90d3-3cc3e067ce6d",
            "208ec32e-f776-4b94-af14-ae97515d7863",
            "765dc449-9ab0-4a8e-aaba-463f992d2a13",
            "e7d458f6-e006-4d83-ba86-bf7d4d8985b0",
            "fc63d806-ca89-4ea3-a404-ee6de695743f",
            "bf24ca37-25f4-4e34-9aec-460b94364cfc",
            "9094ecdf-8995-4af1-86be-3810140a1e2c",
            "faabb55d-3c9e-4c23-8779-732ac2ee2c0d",
            "72a0d9de-f3dc-419d-af80-b76810c02afc",
            "b7d92248-97e3-4450-8057-6fe06738f735",
            "70e5098b-c4ae-4cd7-9799-3c1b9b57c753",
            "cfb2b49e-a921-4171-b089-853d9fc16d2c",
            "2f548675-008d-4332-876c-108b0c7ab9c5",
            "89ec6f82-1ad7-42d5-983e-ebf90f6868c8",
            "73183948-2489-41cb-9a2d-8be5071971a5",
            "636736ef-df33-48ed-bdbc-e8f8d1f964b3",
            "2944824d-4c26-476f-a981-be849081942f",
            "f41490ce-fe39-435d-86c0-ab5ce098b423",
            "b345af35-205e-4eca-8006-029e5c20127e",
            "bcf6637d-a789-49c1-b2b2-dc789fb7df02",
            "9582db88-6f4f-4394-98f1-652df565ee5b",
            "e4bc69e2-a064-4f93-ada1-f7f209cc1cc3",
            "891abb2e-0156-411b-bf60-f4104e71ddfa",
            "5e7a7026-dfc5-4aba-8496-95140716f3db",
            "bdacc37b-8633-4bf8-9dd5-4662ee651aec",
            "944e1036-8a03-4611-8aa0-31515a05c848",
            "a66999a7-ae5c-460e-ba94-1a01143ae847",
            "319b1175-ced9-438f-986b-9239c3edd92d",
            "6e17ea5a-0b00-4be1-aeb0-fc518fcb1174",
            "29eead4d-3793-4625-8727-c03edbb38b8b",
            "1ee18fb3-18a6-4c7f-8ba0-bc41cdd0462e",
            "934cc2a7-822e-4117-8e82-8e663d7d2daf",
            "f87b740a-c22b-4fae-9987-1f3e16f840c4",
            "92f29d03-1d89-42a6-9ea7-ed17bc5d6dc1",
            "bf0caafc-2b20-4e07-ab85-87e14ff430ce",
            "c27fb8a7-396f-4727-8101-3e8c91df8982",
            "d1c46cfb-3a72-46d6-b6cc-7d26775b81a4",
            "885f90ef-6bd9-409a-b2df-e165e553c68e",
            "7944ed53-2a58-4035-9b93-140a71e41c34",
            "315c4b00-1b16-4419-89e9-4d6a6aa766f3",
            "f82927e4-b905-4e3b-a82e-5184fbb68b29",
            "ab2528d9-719f-4261-8098-21849222a0f2",
            "f2eef649-a6d5-4114-afba-e50ab26254d2",
            "a13898e2-e488-498e-a89c-d0e920f74d4d",
            "b54ddb7a-8d7f-4111-9cb9-1b70337856ce",
            "d2ff6b6b-fc30-48dc-8952-06f9d8fc64f8",
            "0d4c8428-9355-44db-af56-ec8523f20258",
            "0a8cf9e2-28b8-4014-878c-c8e981cc7cc5",
            "a17ce9c3-8f6f-4dcc-a1b7-2a04ab9e31f0",
            "272989c8-5535-492d-a25c-9f58803e027f",
            "357e6ff9-403a-448e-b149-7b30bde71dcc",
            "4103d05e-da2a-4744-81ae-f8dc3e81728c",
            "34810b67-37e1-4b29-8123-17567441b74a",
            "e7fd6685-38da-4b3b-9796-09a2562e3cd7",
            "ba7d2626-38ce-4859-8495-bdb5732715c4",
            "6d666c8a-1fe0-41b6-8fe0-cff8423f7ccf",
            "24d2505b-388c-46cc-8a64-48223ea6d78d",
            "ffb5f70c-cd10-48a5-92d0-cea440e6fd40",
            "1ffc0b16-0891-443f-89ff-e815be2c7c54",
            "05b3b6b0-a3ea-4d06-8c22-1f1cf0373d74",
            "1fd8c24b-eaf3-4ee2-9931-b8130099d789",
            "20244d07-534f-4eff-b4d4-930878889970",
            "7c7f9c94-dee8-4903-892b-6cf44652e2de",
            "ffbfc446-f717-4c63-9103-587defe6cf8a",
            "c7eb03c1-f8cb-4815-afc8-46df3b253129",
            "d8354b38-e942-4c89-ba93-29323432abc3",
            "dc8134c5-46dd-4d97-8851-354d52b91954",
            "870e8ee5-79c4-4c09-906f-19eca13557cf",
            "aabb1d9f-be12-45b3-a84d-a1fc3e8181fd",
            "3ee75a28-8740-4d97-80d6-fe4305f5083e",
            "7e5cfc9a-e9e1-46f1-b81a-861b12049488",
            "1c02b14c-7501-48ca-b744-d2e55c808d93",
            "9e2990ab-4d3d-4fb5-bd9b-1252440f043a",
            "d12b05b0-a0af-4c2c-8c8c-ab8bcf49439e",
            "ebb22c2a-0722-480a-a6ce-14996ed90ba6",
            "3c8a8696-e176-4c46-a2d3-48b6b1525c7f",
            "462a85b4-83ac-4164-86b3-e5ac6a7ec040",
            "3dc66525-d359-406d-9cdf-cdd3a7de289c",
            "ec62e8b1-a9b4-4e75-8bd8-7e03a0661ab2",
            "390ff98c-0614-4927-8b94-db7b40a92bbe",
            "e4b87494-a5eb-439d-b3bf-5f1b46d4dc6b",
            "56756959-1e78-429c-b897-e1d056cb0225",
            "8032cf05-d916-4b2a-9c53-6e75d4a24bd8",
            "e5712ceb-c37a-4c49-a11c-ccf4e21852d4",
            "7c20f558-d664-42bd-b6f1-81acf9dbb72d",
            "e86ab653-bec8-46f3-b4b6-a1a866919ef6",
            "cc03a7ff-3fbd-422f-ba96-0069c626f7a1",
            "71f3b410-cd33-44a9-8adb-3f5461c00870",
            "ce09ea31-3d4a-4487-a797-e315175457a0",
            "31ea2407-438c-4d23-af46-a329bba1d451",
            "fc61ac29-d1fc-4e4d-85aa-dcbba9e485c4",
            "c130b0fb-5dce-449d-9f40-1437f889f7fe",
            "a3cb23fc-acd3-4ce0-8f36-1e5aa6a18432",
            "0038bcbd-5f12-4a05-9f77-324652334345",
            "cb0f37ca-9833-4b78-8192-c436b6fc72e4",
            "3a6888b1-d520-406e-afc0-bd2e8b289ce7",
            "57fca0e2-f9ad-4ae6-af9d-6a6f50cbcd5f",
            "b665b768-0d83-4363-950c-31ed39317c15",
            "c1a61bb0-e4fe-4064-bc8d-954a2dafda79",
            "b3349cf9-5cbb-4be2-9d6e-f1208a5608a6",
            "d2ad8774-9173-4970-8427-06b04df201c1",
            "ec37ecfe-65b4-49a4-83c7-ee1ccaeec2e3",
            "4753fcb7-9270-493a-974d-8daca4e49125",
            "e34e41f2-f480-45d3-8190-a3ce5ab34fab",
            "47c8a452-4efb-45b4-a0d3-df506dbe42b2",
            "682567af-d24e-4656-8435-c5f90320bc47",
            "1309cfb5-9322-4fe7-888d-6c5e1ffc761c",
            "6b8acafe-784e-433e-b2e5-0720568ea225",
            "c8b03190-306c-4120-bb0b-6f2ebfc06ea9",
            "6fe07aa5-fec0-4eca-a456-f29bff451b04",
            "5f000e69-3cfd-4871-8f1b-faa7f0d4bcbc",
            "9fdaa16b-a6c4-4831-b87c-bc9ca8ce7eaa",
            "6a6eea03-b435-446c-bab1-312b45580aee",
            "f0c8f75f-8736-4b1d-b312-9349fcff321d",
            "4f29ecd7-21a5-4c03-b9ba-d0cfe9488f8c",
            "9a1d9dbe-5034-498d-ae0c-68fe298f8c1e",
            "d8881868-8099-43a4-b591-3ffb6b91c267",
            "d574c9bd-46f6-440a-8d6a-8412a283eeb1",
            "eace2373-31c8-4aba-9a5c-7bce22dd140a",
            "f5dfa020-ad69-41cd-b3d4-fd7af0414e94",
            "fcc7e9c8-3474-4221-b83a-27890982e0fa",
            "4fdef2b4-b4a1-4dc8-96a9-139f8d89b70b",
            "99af78a1-6180-4827-b424-7ae18fe856e6",
            "adb4e8ea-0932-4e4b-9e69-f48feee90ce1",
            "cf07508b-4762-4650-990a-23376e023f55",
            "451a05a4-4997-4da4-a15f-2aeaa1236ef9",
            "6041bca6-d070-4894-8019-da9538f2c33d",
            "584c04d2-4acc-491b-8a0a-e63133f4bfc4",
            "9f23b7c3-baa6-4e38-b1a9-5c38359ad982",
            "f43d43c8-eedf-4628-99b0-04120e7124c8",
            "ac5af671-1df0-4312-8b7b-e61992ecc883",
            "8fa5d80d-37e8-4133-9d5c-6bad446c63f0",
            "a94ddea5-ef4a-4c26-bc57-b5b21cd78166",
            "b0b33754-a664-43b7-ba00-be0dc4ec2396",
            "dcad99e7-3c3e-4c78-bf8a-68203e17da48",
            "aa53342c-f171-4f79-8116-e04c1c09984d",
            "df0bee37-b152-45e6-9b4f-60c322633658",
            "0d27f48b-c8d7-464b-85e5-5a2b823436c9",
            "4cebcf7e-2bca-4793-8c7b-499d8f58cb9c",
            "d0440ef0-bb45-46a2-aa89-7cc661604781",
            "567edee0-c229-4aed-bea8-11d6844644e4",
            "65f2d0e7-d55b-4155-b791-0b820642564f",
            "afc99b75-f453-4123-8bd7-3aeea65cb521",
            "5b946a83-b395-4016-b67f-c71690f9a866",
            "00ed154e-8679-42f0-8f42-e59bd7e185af"};

public NamesUtils(Context c){
        DaoSession daoSession = ((TBApplication)c).getDaoSession();
        if(daoSession.getArtistDao().loadAll().size()==0)
            for(String s:names){
                Artist a = new Artist();
                a.setName(s);
                a.setPicURL(s);
                daoSession.getArtistDao().save(a);
            }
    }
}
