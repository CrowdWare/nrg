import FlatSiteBuilder 2.0
import RevolutionSlider 1.0
import TextEditor 1.0

Content {
    title: "NRG Exchange"
    menu: "default-de"
    author: "Olaf"
    layout: "default"
    date: "2017-09-29"
    logo: "logo.png"

    Section {
        fullwidth: true

        RevolutionSlider {
            fullwidth: true

            Slide {
                src: "/Users/user/SourceCode/Shift/assets/images/happypeople.png"
                adminlabel: "HappyPeople"
            }

            Slide {
                src: "/Users/user/SourceCode/Shift/assets/images/tagcloud.png"
                adminlabel: "Tagcloud"
            }
        }
    }

    Section {
        id:  situation

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;h1&gt;&lt;strong&gt;Willkommen&lt;/strong&gt; bei NRG-Exchange&lt;span class=&quot;subtitle&quot;&gt;WIR SIND SEHR FROH DAS DU UNS GEFUNDEN HAST&lt;/span&gt;&lt;/h1&gt;

&lt;p class=&quot;lead&quot;&gt;Wir haben die folgende Situation?&lt;/p&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;
	&lt;div class=&quot;col-md-12&quot;&gt;	
		&lt;h4&gt;&lt;i class=&quot;fa fa-tag&quot;&gt;&lt;/i&gt; Kleingewerbe&lt;/h4&gt;	
		&lt;p&gt;Du hast dir ein kleines Geschäft aufgebaut, hast aber nicht genug Kunden.	
		Deine potentiellen Kunden haben nicht genug Geld um für deinen Service zu bezahlen.	&lt;/p&gt;
	&lt;/div&gt;	
&lt;/div&gt;

&lt;div class=&quot;row featured-box-minimal&quot;&gt;
	&lt;div class=&quot;col-md-12&quot;&gt;	
		&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Nachbarschaft&lt;/h4&gt;	
		&lt;p&gt;	In der Nachbarschaft hilft man sich ja gegenseitig.	Du kannst dich leicht daran errinnern, 
		wem Du geholfen hast und wer dir noch einen Gefallen schuldet.	
		Aber irgendwann verlierst du den Überblick oder jemand, der dir noch einen Gefallen schuldet oder du ihm, zieht weg.	
		Du hast keine Möglichkeit die Energien noch auszugleichen.	&lt;/p&gt;
	&lt;/div&gt;	
&lt;/div&gt;

&lt;div class=&quot;row featured-box-minimal&quot;&gt;
	&lt;div class=&quot;col-md-12&quot;&gt;
		&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Andere Probleme mit der Nachbarschaft&lt;/h4&gt;	
		&lt;p&gt;	Denken wir einmal an eine Frisörin, die einem Automechaniker die Haare schneidet.	
		Nehmen wir an, sie fährt kein Auto.	Der Automechaniker ist also gar nicht in der Lage die Energien auszugleichen, 
		in dem er ihr Auto repariert.	Er muss die Frisören also bar bezahlen.	Das wiederrum macht es nötig, das die Frisörin 
		das Geld versteuert.&lt;/p&gt;
	&lt;/div&gt;	
&lt;/div&gt;

&lt;div class=&quot;row featured-box-minimal&quot;&gt;
	&lt;div class=&quot;col-md-12&quot;&gt;	
		&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Steuern zahlen&lt;/h4&gt;	
		&lt;p&gt;	Versteh mich nicht falsch. Ich habe nichts gegen das Steuernzahlen.	Aber lass mir dir etwas erzählen.	
		Jedes Jahr muss die Regierung mehr Schulden aufnehmen, weil sie nicht mal die Zinsen zahlen kann.	
		Und dafür müssen wir immer mehr Steuern zahlen.	In Dänemark zahlst man z.B. 51% Einkommenssteuer und zusätzlich noch 25% Mehrwertsteuer.	
		Dem Dänen bleiben also gerade mal 24% seines Einkommens.	
		Der grösste Teil deines Einkommens wird verwendet um Staatsschulden zu begleichen.	&lt;/p&gt;
	&lt;/div&gt;	
&lt;/div&gt;

&lt;div class=&quot;row featured-box-minimal&quot;&gt;
	&lt;div class=&quot;col-md-12&quot;&gt;		
		&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Finanzkrise&lt;/h4&gt;	
		&lt;p&gt;	Aber da sind noch grössere Probleme.	
		Erinnerst du dich an Zypern 2013?	
		Dort wurden die Reichen einfach enteignet.	
		Und auserdem waren die Banken nicht in der Lage, Geld an ihre Kunden auszuzahlen.	&lt;/p&gt;
	&lt;/div&gt;	
&lt;/div&gt;

&lt;p class=&quot;lead&quot;&gt;
	Möchtest du wissen, wie man diese Situation lösen kann? Dann les weiter.
&lt;/p&gt;"
                    adminlabel: "Willkommen"
                }
            }
        }
    }

    Section {
        cssclass: "parallax margin-top80"
        style: "background-image: url('assets/images/natur.jpg');"
        attributes: "data-stellar-background-ratio='0.7'"

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;div class=&quot;container&quot;&gt;
	&lt;div class=&quot;row animation_fade_in&quot;&gt;	
		&lt;div class=&quot;col-md-6&quot;&gt;		
			&lt;div class=&quot;white-row&quot;&gt;			
				&lt;h3&gt;&lt;strong&gt;NRG-Exchange&lt;/strong&gt;,&lt;/h3&gt;			
				&lt;p class=&quot;lead&quot;&gt;eine neue Währung von dir selbst erschaffen.&lt;/p&gt;		
			&lt;/div&gt;
		&lt;/div&gt;
	&lt;/div&gt;
&lt;/div&gt;"
                    adminlabel: "Parallax"
                }
            }
        }
    }

    Section {
        id:  solution
        cssclass: "margin-top100 container"

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;h3&gt;&lt;strong&gt;Lösung&lt;/strong&gt;&lt;/h3&gt;
&lt;p class=&quot;lead&quot;&gt;
Da gibt es einen Mann in Deutschland, der die &lt;a href=&quot;http://www.minutocash.org&quot;&gt;Minutos&lt;/a&gt; erfunden hat.
&lt;/p&gt;
&lt;p&gt;
Minutos sind eine Art Geld, das jeder selber erstellen kann.
Nimm einfach ein Blatt Papier, schreibe auf, was du bereit bist dafür zu tun, wenn jemand diesen Papier bei dir einlösen will,
schreibe auf für wie viel Minuten du diesen Service leisten möchtest und unterschreibe das Papier.
Diese Art Geld ist mehr wert, als alle anderen Banknoten, denn dieses Geld ist mit einer Gegenleistung gedeckt.
In einer Finanzkrise kannst Du Banknoten lediglich zum Heizen benutzen.
&lt;/p&gt;
&lt;h4&gt;Nachteile&lt;/h4&gt;
&lt;p&gt;
Die Minutos funktionieren bereits heute als Zahlungsmittel, aber sie haben einige Nachteile.
Möchtest Du mehrere Stunden reisen um einen dieser Minutos einzulösen, wenn der Unterzeichner weit weg wohnt?
Ich denke nicht. Also wirst du nur Minutos von bekannten Menschen akzeptieren, die in deiner Nähe wohnen.
Ausserdem ist es nicht möglich, Minutos zu zerstückeln, wenn Du z.B. 3 Minutos zahlen sollst, aber nur einen 60 Minuto in der Tasche hast.
&lt;/p&gt;
&lt;h4&gt;Lösung&lt;/h4&gt;
&lt;p&gt;
Um diese Probleme zu umgehen haben wir glücklicherweise unsere Computer und Smartphones.
Unsere Idee ist es also eine neue Krypto-Währung zu erschaffen die wir NRG (Energy) nennen und dazu eine App die wir NRG-Exchange nennen.
Mit dieser App sind wir in der Lage, unser eigenes Geld zu erschaffen und damit jemanden zu bezahlen, der die selbe App benutzt.
Diese App ist in der Lage, Minutos in kleinere Einheiten zu teilen und belegt unterschiedliche Dienstleistungen mit unterschiedlichen Werten.
&lt;/p&gt;

&lt;h4&gt;WebOfTrust&lt;/h4&gt;
&lt;p&gt;
Wenn Du mit NRG auf der ganze Welt handeln willst, benötigen wir allerdings einen kleinen Trick.
&lt;/p&gt;
&lt;p&gt;
Wir haben eine Person A die Person B kennt und vertraut. Diese beiden können NRG austauschen.
Da gibt es dann noch eine Person C, die Person B kennt und vertraut. Auch diese beiden können NRG austauschen.
Aber wenn nun Person A Person C bezahlen möchte, dann gibt es kein Vertrauen, da die beiden sich nicht kennen.
Aber auch dies ist kein Problem im Computer-Zeitalter ;-)&lt;br/&gt;
Da das ganze System auf Servern läuft, können wir sogar NRG auf Konten tauschen, wenn deren Nutzer gar nicht online sind.
Und in diesem spezifischen Szenario könnte Person A zuerst NRG mit Person B tauschen und mit den NRG von B dann Person C bezahlen, denn Person C vertraut ja Person B.  
&lt;/p&gt;
&lt;p&gt;
Wenn Person B danach in seine App schaut, wird er dies gar nicht bemerken, denn er sieht dort nur seinen Kontostand und nicht woraus sich dieser zusammensetzt.
&lt;/p&gt;
&lt;h4&gt;Über Distanzen bezahlen&lt;/h4&gt;
&lt;p&gt;
Wenn wir mal annehmen, dass viele Menschen im ganzen Land diese neue Währung benutzen, dann wird es auch möglich sein, auch über grössere Distanzen zu bezahlen.
Wir haben z.B. eine Person in Hamburg, die eine andere Person in München bezahlen möchte.
Zuerst werden die NRG&#x27;s von dem Hamburger mit einem Bekannten in Hannover getauscht.
Dann werden die NRG&#x27;s von dem Hannoveraner mit jemanden in Kassel getauscht.
Die NRG&#x27;s aus Kassel werden dann mit jemanden in Würzburg getauscht. Diese werden wiederum in Nürnberg getauscht und schliesslich wird der Münchner damit bezahlt.
Irgendwann könnte es sogar möglich sein, dass wir damit weltweit bezahlen können.
&lt;/p&gt;"
                    adminlabel: "Lösung"
                }
            }
        }
    }

    Section {
        cssclass: "parallax margin-top80"
        style: "background-image: url('assets/images/natur2.jpg');"
        attributes: "data-stellar-background-ratio='0.7'"

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;div class=&quot;container&quot;&gt;
&lt;div class=&quot;row animation_fade_in&quot;&gt;	
&lt;div class=&quot;col-md-6&quot;&gt;&lt;/div&gt;	
&lt;div class=&quot;col-md-6&quot;&gt;		
&lt;div class=&quot;white-row&quot;&gt;			
&lt;h3&gt;&lt;strong&gt;NRG-Exchange&lt;/strong&gt;,&lt;/h3&gt;			
&lt;p class=&quot;lead&quot;&gt;eine Lösung um Finanzkrisen zu vermeiden.&lt;/p&gt;		
&lt;/div&gt;
&lt;/div&gt;
&lt;/div&gt;
&lt;/div&gt;"
                    adminlabel: "Parallax"
                }
            }
        }
    }

    Section {
        id:  help
        cssclass: "margin-top100 container"

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;h3&gt;&lt;strong&gt;Möchtest du gerne dabei helfen?&lt;/strong&gt;&lt;/h3&gt;
&lt;p class=&quot;lead&quot;&gt;
Zur Zeit ist dies lediglich nur eine Idee.
Wir haben gerade erst angefangen, darüber nachzudenken.
Wenn du gerne helfen möchtest, dann lass es uns wissen.
Wir brauchen Leute mit Ideen, Softwareentwickler, Menschen die diese Ideen weitergeben möchten, 
Leute die die Lösung später testen, Menschen die mit Spenden helfen wollen usw.
&lt;/p&gt;"
                    adminlabel: "Möchtest du gerne dabei helfen?"
                }
            }
        }
    }

    Section {

        Row {

            Column {
                span: 12

                Text {
                    text: "&lt;!-- CALLOUT --&gt;
&lt;div class=&quot;bs-callout text-center styleBackground&quot;&gt;
&lt;h3&gt;Ich möchte dabei &lt;strong&gt;helfen&lt;/strong&gt;, NRG in die Welt zu bringen.&lt;a href=&quot;mailto:artanidos@gmail.com&quot; target=&quot;_self&quot; class=&quot;btn btn-primary btn-lg&quot;&gt;Sende uns eine Email&lt;/a&gt;&lt;/h3&gt;
&lt;/div&gt;
&lt;!-- /CALLOUT --&gt;"
                }
            }
        }
    }
}
