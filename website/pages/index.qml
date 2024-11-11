import FlatSiteBuilder 2.0
import RevolutionSlider 1.0
import TextEditor 1.0

Content {
    title: "NRG Exchange"
    menu: "default-en"
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
                    text: "&lt;h1&gt;&lt;strong&gt;Welcome&lt;/strong&gt; to NRG-exchange&lt;span class=&quot;subtitle&quot;&gt;WE ARE VERY HAPPY THAT YOU FOUND US&lt;/span&gt;
&lt;/h1&gt;
&lt;p class=&quot;lead&quot;&gt;We have the following situation?&lt;/p&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;&lt;div class=&quot;col-md-12&quot;&gt;	&lt;h4&gt;&lt;i class=&quot;fa fa-tag&quot;&gt;&lt;/i&gt; Small Business&lt;/h4&gt;	&lt;p&gt;	You have created a small business but you don't have got enough customers.	Your potential customers do not have got enough money to pay for your services.	&lt;/p&gt;&lt;/div&gt;
&lt;/div&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;&lt;div class=&quot;col-md-12&quot;&gt;	&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Neighborhood&lt;/h4&gt;	&lt;p&gt;	In your neighborhood everybody is helping each other.	You can remember who owes you a favor and by whom you can claim it.	Somehow, you lose the overview or someone moves away and the energies can no longer be balanced.	&lt;/p&gt;&lt;/div&gt;
&lt;/div&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;&lt;div class=&quot;col-md-12&quot;&gt;	&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Other Issues with Neighborhood&lt;/h4&gt;	&lt;p&gt;	Lets think about about a hair stylist and assume she is styling the hair of a car mechanic.	Maybe she does not drive a car at all so the mechanic is not able to balance the energies repairing her car.	The mechanic has to pay with cash in this case.	This might make it necessary to pay taxes for the hair styler.	&lt;/p&gt;&lt;/div&gt;
&lt;/div&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;&lt;div class=&quot;col-md-12&quot;&gt;	&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Paying Taxes&lt;/h4&gt;	&lt;p&gt;	Don't get we wrong. I am not against paying taxes.	But let me tell you something.	Each year the governments have to make more debts and guess who is paying for that.	You are paying for that. And therefore we have to pay more taxes each year.	In Denmark for example you have to pay about 51% income taxes plus additional 25% value added taxes.	So there are only 24% left for you. Most of your salary goes into paying interest rates for the debts.	&lt;/p&gt;&lt;/div&gt;
&lt;/div&gt;
&lt;div class=&quot;row featured-box-minimal&quot;&gt;&lt;div class=&quot;col-md-12&quot;&gt;	&lt;h4&gt;&lt;i class=&quot;fa fa-users&quot;&gt;&lt;/i&gt; Financial Crisis&lt;/h4&gt;	&lt;p&gt;	But there is another big problem.	Do you remember Cyprus in 2013?	They have expropriated the money from the rich people.	And also the banks where not able to pay out money to there customers.	&lt;/p&gt;&lt;/div&gt;
&lt;/div&gt;

&lt;p class=&quot;lead&quot;&gt;Do you want to know how to solve this situation? Then keep on reading.&lt;/p&gt;"
                    adminlabel: "Welcome"
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
&lt;p class=&quot;lead&quot;&gt;a new currency created by yourself.&lt;/p&gt;		
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
                    text: "&lt;h3&gt;&lt;strong&gt;Solution&lt;/strong&gt;&lt;/h3&gt;
&lt;p class=&quot;lead&quot;&gt;
	In Germany, a man developed the idea of &lt;a href=&quot;http://www.minutocash.org&quot;&gt;Minutos&lt;/a&gt;.
&lt;/p&gt;
&lt;p&gt;
	Minutos are a form of money that anyone can create themselves. Simply take a sheet of paper and write down the service you are offering and how many minutes you are willing to provide it for. Sign the sheet. This money has real value since it is backed by a specific service. In a financial crisis, banknotes would have little value, while Minutos represent real services.
&lt;/p&gt;
&lt;h4&gt;Drawbacks&lt;/h4&gt;
&lt;p&gt;
	Minutos are already being used as a form of payment, but they have some drawbacks. Would you travel several hours to redeem one of these Minutos if the issuer lives far away? Probably not. As a result, Minutos are generally accepted only by trusted people nearby. Additionally, Minutos cannot be split; for example, if you need to pay 3 Minutos but only have a 60-Minuto note, there is no smaller denomination.
&lt;/p&gt;
&lt;h4&gt;Solution&lt;/h4&gt;
&lt;p&gt;
	To overcome these challenges, we can use modern technologies like computers and smartphones. The idea is to create a cryptocurrency called NRG (Energy), along with an app called NRG-Exchange. This app would allow people to create their own money and use it for payments. It also allows Minutos to be divided into smaller units.
&lt;/p&gt;
&lt;h4&gt;Counterargument&lt;/h4&gt;
&lt;p&gt;
	One could argue that by allowing people to create new Minutos anytime, they could theoretically accumulate a debt burden. After all, it could happen that at some point no one accepts the Minutos anymore, and the holders want to redeem them, which would result in a large obligation to work.&lt;br&gt;&lt;br&gt;
	The problem does exist, but...&lt;br&gt;
	...why would one create so many Minutos in the first place? Suppose you do not receive wages or unemployment benefits because you do not wish to participate in the current labor market. One plausible reason could be that you do not want to finance the political decisions of your government by paying taxes, as this indirectly supports wars.&lt;br&gt;&lt;br&gt;
In this situation, you could proceed as follows: First, create a Minuto to secure financial resources for your basic needs over the coming weeks. Use this time to think about which services you can offer to others in your area. Examples could be massages, art, music, or assistance for the elderly. The aim is to use and offer your skills and talents. When you know what you want to do, you can post an ad in a network like &lt;a target=&quot;_blank&quot; href=&quot;https://www.kleinanzeigen.de/&quot;&gt;Kleinanzeigen&lt;/a&gt; or a regional portal and offer your services in exchange for NRG (or Minutos).

It is important to emphasize that you do not issue invoices, sell products, or give gifts. This private, non-commercial form of assistance should be tax-neutral.

Once you start receiving NRG (or Minutos) from other friends, there is no need to create new Minutos. This way, you save on taxes, interest, and credit fees and can offer your services at a lower price than commercial providers. Additionally, you will need to work less since your lifestyle is based on self-sufficiency and minimalism.
&lt;/p&gt;

&lt;div class=&quot;panel-group&quot; id=&quot;exampleAccordion&quot;&gt;
    &lt;div class=&quot;panel panel-default&quot;&gt;
      &lt;div class=&quot;panel-heading&quot;&gt;
        &lt;h4 class=&quot;panel-title&quot;&gt;
          &lt;a data-toggle=&quot;collapse&quot; data-parent=&quot;#exampleAccordion&quot; href=&quot;#collapseOne&quot; class=&quot;collapsed&quot;&gt;
            &lt;i class=&quot;fa fa-chevron-down toggle-icon&quot;&gt;&lt;/i&gt;
            Calculation Example: How Little Money Is Really Needed
          &lt;/a&gt;
        &lt;/h4&gt;
      &lt;/div&gt;
      &lt;div id=&quot;collapseOne&quot; class=&quot;panel-collapse collapse&quot;&gt;
        &lt;div class=&quot;panel-body&quot;&gt;
&lt;p&gt;
          Let’s imagine how much less money one actually needs to live if one focuses on the essentials. 
		Many expenses only arise because people try to maintain an expensive lifestyle with luxury cars, big houses, and constant consumer desires. 
		But what if we asked ourselves: How much is truly needed to live a good, worry-free life?
        &lt;/p&gt;
        &lt;p&gt;
          An example: I only pay 320€ per month for rent because I don&#x27;t need to live in an expensive downtown location. This not only saves me rent, 
		but I can also forgo owning a car and instead use a bicycle, which saves money and is better for the environment. 
		My food expenses are about 300€ per month because I focus on local products and quality. 
		For all necessary expenses, I spend about 700€ per month.
        &lt;/p&gt;
        &lt;p&gt;
          So, if I earn 30€ per hour, for instance, by offering a massage, I only need to work about 23 hours per month 
			to cover my living costs. This leaves me more time for things that truly bring me joy and that I do out of conviction, 
			without constantly feeling the need to work for consumer goods or status symbols.
        &lt;/p&gt;
        &lt;p&gt;
        This calculation may seem unusual at first glance, but it shows that a good, fulfilling life does not have to be expensive. 
		By deliberately reducing my expenses, I need less money and have more freedom. Imagine what that could mean for your own quality of life!
        &lt;/p&gt;
        &lt;/div&gt;
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/div&gt;

&lt;h4&gt;Web of Trust&lt;/h4&gt;
&lt;p&gt;
	If you want to use NRG globally, a &quot;Web of Trust&quot; will be necessary. Imagine that Person A knows and trusts Person B, and B knows and trusts Person C. 
	A and C cannot trade directly because they do not know each other. However, with the help of the app, an indirect exchange can still occur. 
	NRG from A could first go to B and then from B to C. This way, the system allows payments without direct trust relationships.
&lt;/p&gt;
&lt;h4&gt;Paying Over Distances&lt;/h4&gt;
&lt;p&gt;
	If NRG becomes widely used, it could also enable payments over long distances. For example, 
	a person in Hamburg wants to pay someone in Munich. The NRG could be transferred step-by-step through acquaintances in cities like Hannover, 
	Kassel, Würzburg, and Nuremberg until it reaches the person in Munich. This could one day enable global exchange.
&lt;/p&gt;


"
                    adminlabel: "Solution"
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
                    text: "&lt;div class=&quot;container&quot;&gt;&lt;div class=&quot;row animation_fade_in&quot;&gt;	&lt;div class=&quot;col-md-6&quot;&gt;&lt;/div&gt;	&lt;div class=&quot;col-md-6&quot;&gt;		&lt;div class=&quot;white-row&quot;&gt;			&lt;h3&gt;&lt;strong&gt;NRG-Exchange&lt;/strong&gt;,&lt;/h3&gt;			&lt;p class=&quot;lead&quot;&gt;				a solution to avoid the financial crisis.			&lt;/p&gt;		&lt;/div&gt;	&lt;/div&gt;&lt;/div&gt;
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
                    text: "&lt;h3&gt;&lt;strong&gt;Do you like to help?&lt;/strong&gt;&lt;/h3&gt;
&lt;p class=&quot;lead&quot;&gt;
At the moment this is just an idea.
We have just startet to think about this solution.
If you want to help please let us know.
We need people with new ideas, software developers, people who like to spread the word about this project, people who want to test the solution, people who can help with donations etc.
&lt;/p&gt;"
                    adminlabel: "Do you like to help?"
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
&lt;div class=&quot;bs-callout text-center styleBackground&quot;&gt;&lt;h3&gt;I want to &lt;strong&gt;help&lt;/strong&gt; to bring NRG into this world.&lt;a href=&quot;mailto:artanidos@gmail.com&quot; target=&quot;_self&quot; class=&quot;btn btn-primary btn-lg&quot;&gt;Send us an email&lt;/a&gt;&lt;/h3&gt;
&lt;/div&gt;
&lt;!-- /CALLOUT --&gt;"
                }
            }
        }
    }
}
