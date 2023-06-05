# NRG EXCHANGE
NRG EXCHANGE is the idea to create a new kind medium which we can use for energy exchanges. Like showing gratitude to someone who gave us a service, so that we don't have to pay this one. 
In smaller circles like the family we are not asking for money or for any kind of energy exchange, but when we make the circle a bit wider to also reach the neighbourhood then we start to think that we want something back. Typically we bring apples or bread to someone who will cut our hair, or we just remember that we should ask for an exchange later. One hand washes the other.  
But if the circle gets much wider, we can not handle that anymore and we use money instead.  
Using money for energy exchange has the drawback that someday the financial department knocks on your door and asks for some taxes.  
Don't get e wrong. Taxes have been a good things many many years ago, but nowadays they are way to high (if you live outside of Switzerland) and we all know that they use our taxes for wars and other criminal activities.  

We are creating an app for the mobile phone where we can use NRG to show gratitude.  

The process started for me when I quit to work for the banksters in Zürich (Switzerland) 2014 after a burnout and has ended in a few tries without success. Sometimes I was distracted from other things, sometimes I tried to crowdfund a project without resonance and the last attempt was the project SHIFT where I was almost ready to release the first alpha version.  
Unfortunately this project is now laid on ice. I found a security leak and had to fix that, but before fixing it I found out that the p2p library (IPv8) I have used had no license attached. So I made the decision to rethink the whole project. Wait for them grant me a license or build the internet protocol on my own. I also was thinking about how to get consensus when creating NRG (minting coins). Then I remembered that I solved that problem already in my project NRG and here I am working further on this solution.  
This approach only needs a camera enabled on the device. No internet needed. No security risks regarding internet connections.
And btw, all transactions are stored in a tamper proof local blockchain.

# Base
NRG is based on the [Minuto](https://www.minuto.wiki) invented by Konstantin Kirsch. Minuto is technically a bearer bond. Someone creates a peace of paper writing on it a value like 100 EUR and states what he will do if someone wants to exchange the Minuto back to him. Maybe: "For his 100 EUR I will give the giver an oil massage for 100 minutes.". The minuto must be signed by two other people, they guarantee with their signature that the bond will be paid back in case the initiator is unavailable.
So, you can hear it in he name, Minuto is time based. Which is essential.
The Minuto is a legal currency so to say.

# Implementation  
The NRG app will connect people. First four users have to meet in person, two men and two women.   
On first start the app will generate a cryptograhic key pair (private and public key).  
Then A generates a QR code based on his public key. Then B scans that QR code and knows the public key now.   
Next B is showing a QR code and let A scan it.  
All of these four people have to scan eachother.  
They area now able to make safe transactions using PK encryption.  

Now A is creating a bond with the app for 60 minutes for example. Then he needs two people, a man and a woman, with the same app, signing his bond.  
After signing he is now able to pay with this bond. The bond is signed with PK encrypion and is added to a local blockchain.  
In the circle of four, two men and two women, everyone is able to let his bond be signed by men and woman. So everybody in this circle has now a new kind of currency.  

When using the original Minuto it was not possible to split it up. So you could not split a 60 Minuto into 2 x 30 Minutos.  
This changes when using a computer like your mobile. So you are able to split every minuto into full amounts, so the smalles part is 1 Minuto.
This split will be stated as a transaction in the blockchain.  

## Demurrage
There is another difference to the Original Minuto. The original Minuto could not be spent after 3 years. Our NRG looses value over a period of time, which is called demurrage invented by Sylvio Gesell and approved in Wörgl (Austria). The NRG is loosing 0.28 % of value each day, so that it's getting worthless after 7 years. This is handled automatically in the app.  

## Transparency
The app is able to show the source for each individual NRG, who created it and who signed it at what date.  
You can also see, how much NRG a user has already created and how many NRG he has accepted. Comparing these values might indicate if a user is trustworthy a all. So when a user is creating thousands of NRG but did not accept any others NRG, we know that this user is not really giving something to the circle, we might not accept his NRG.  

