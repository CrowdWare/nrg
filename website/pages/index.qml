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
There is a guy in Germany who had invented &lt;a href=&quot;http://www.minutocash.org&quot;&gt;minutos&lt;/a&gt;.
&lt;/p&gt;
&lt;p&gt;
Minutos are a new kind of money everbody is able to create on his own.
Just take a sheet of paper, write what you are able and willing to do if someone wants to give this paper back to you,
mention who many minutes you want to do the service and sign the paper and you can use it as money.
This kind of money is worth more than a couple of bank notes because you will get at least a service or goods from the signer.
In a financial crisis you are only able to use the bank notes to heat your home.
&lt;/p&gt;
&lt;h4&gt;Drawbacks&lt;/h4&gt;
&lt;p&gt;
The minutos are still working as money, but they have some drawbacks.
Do you want to travel more then one hour to get the service from a signer who is living that far away?
I guess not. So you only accept minutos from people you know who live near by.
It&#x27;s also not possible to cut a minuto into peaces in case you have to pay 3 minutos and you only have got a 60 minutos paper.
Another problem is when a student signs a paper with 60 minutos and a master with 30 years experience signs a paper with 60 minutos.
They are not compareable because they have got a different value.
&lt;/p&gt;
&lt;h4&gt;Solution&lt;/h4&gt;
&lt;p&gt;
To avoid the above problems we luckily have got our computers and smartphones.
My idea is to create a new crypto currency called NRG (Energy) and a wallet for your smatphone and computers called NRG-exchange.
With this app you are able to create your own money and will be able to pay to someone with the same app.
The app is able to split minutos into smaller peaces and there is also a solution for the different services with different values.
&lt;/p&gt;
&lt;h4&gt;Categories&lt;/h4&gt;
&lt;p&gt;
When a student creates an NRG-contract it will become the categorie 1 which gives it a factor of 1 and when a master creates an NRG-contract it will become the category 10 with a factor of 10.
Now we have got the following formula:&lt;br/&gt;
&lt;font style=&quot;font-family: Courier;&quot;&gt;energy = time * power&lt;/font&gt;&lt;br/&gt;
&lt;font style=&quot;font-family: Courier;&quot;&gt;NRG = minutes * category.factor&lt;/font&gt;&lt;br/&gt;
Example:&lt;br/&gt;
A student works 60 minutes * factor 1 = 60 NRG&lt;br/&gt;
A bachelor works 60 minutes * factor 5 = 300 NRG&lt;br/&gt;
A master works 60 minutes * factor 10 = 600 NRG&lt;br/&gt;
And if you want to calculate it into € just divide by 10.
But we should not start to calculate it back to other currencies all the time.
We don&#x27;t want the NRG be avaiable on the financial market because this would make the price unstable.
This is also the reason why NRG is based on time.
That makes it possible to be very fair.
For example will a student in Finland earn the same amount of NRG than a student in Indonesia in an hour.
This makes it also possible to be traded all over the world.
&lt;/p&gt;
&lt;h4&gt;WebOfTrust&lt;/h4&gt;
&lt;p&gt;
If you want to use NRG exchange all over the world we need to implement a little trick which is called the web of trust.
&lt;/p&gt;
&lt;p&gt;
We have person A who knows and trusts person B. They are able to exchange NRG.
Then there is person C who knows and trusts person B. They are also able to exchange NRG.
But if person A wants to pay person C we don&#x27;t have this trust.&lt;br&gt;
But this is not a problem in the computer age ;-)&lt;br/&gt;
Because the whole system is hosted on servers we are able to exchange NRG even when the person are not online.
In this specific scenario A could prior to pay person C exchange NRG with person B.
After this exchange person A hold NRG from person B and can use this NRG to pay person C.
&lt;/p&gt;
&lt;p&gt;
If person B looks into his wallet the very next day he will not notice that this exchange has happened at all because he only sees the total amount of NRG.
&lt;/p&gt;
&lt;h4&gt;Paying over a Distance&lt;/h4&gt;
&lt;p&gt;
If we assume that there are many people all over the country are using NRG exchange then it will be possible to pay over higher distances.
For example a person in Hamburg wants to pay a person in Munich.
The NRG from the person in Hamburg first will be exchanged with someones NRG in Hannover where the trust each other. Then the NRG from the person from Hannover will be exchanged with someones NRG in Kassel. Then the NRG from the person in Kassel will be exchanged with someones NRG in Würzburg. Then the NRG from the person in Würzburg will be exchanged with someones NRG in Nürnberg and then the person in Munich will be payed with the NRG from the one in Nürnberg.
And one day we will hopefully be able to use NRG all over the world.
&lt;/p&gt;"
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
