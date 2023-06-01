# NRG EXCHANGE
NRG EXCHANGE is the idea to create a new kind medium which we can use for energy exchanges. Like showing gratitude to someone who gave us a service, so that we don't have to pay this one. 
In smaller circles like the family we are not asking for money or for any kind of energy exchange, but when we make the circle a bit wider to also reach the neighbourhood then we start to think that we want something back. Typically we bring apples or bread to someone who will cut our hair, or we just remember that we should ask for an exchange later. One hand washes the other.  
But if the circle gets much wider, we can not handle that anymore and we use money instead.  
Using money for energy exchange has the drawback that someday the financial department knocks on your door and asks for some taxes.  
Don't get e wrong. Taxes have been a good things many many years ago, but nowadays they are way to high (if you live outside of Switzerland) and we all know that they use our taxes for wars and other criminal activities.  

We are creating an app for the mobile phone where we collect energy (NRG) which we can then use for NRG Exchange to show gratitude.  

The process started for me when I quit to work for the banksters in Zürich (Switzerland) 2014 after a burnout and has ended in a few tries without success. Sometimes I was distracted from other things, sometimes I tried to crowdfund a project without resonance and the last attempt was the project SHIFT where I was almost ready to release the first alpha version.  
Unfortunately this project is now laid on ice. I found a security leak and had to fix that, but before fixing it I found out that the p2p library (IPv8) I have used had no license attached. So I made the decision to rethink the whole project. Wait for them grant me a license or build the internet protocol on my own. I also was thinking about how to get consensus when creating NRG (minting coins). Then I remembered that I solved that problem already in my project NRG and here I am working further on this solution.  
This approach only needs a camera and BT enabled on the device. No internet needed. No security risks regarding internet connections.
And btw, all transactions are stored in a tamper proof local blockchain.

# Base
NRG is based on the Minuto invented by Konstantin Kirsch. Minuto is technically a bearer bond. Someone creates a peace of paper writing on it a value like 100 EUR and states what he will do if someone wants to exchange the Minuto back to him. Maybe: "For his 100 EUR I will give the giver an oil massage for 100 minutes.". The minuto must be signed by two other people, they guarantee with their signature that the bond will be paid back in case the initiator is unavailable.
So, you can hear it in he name, Minuto is time based. Which is essential.
The Minuto is a legal currency so to say.

# Implementation
The NRG app will connect people. First three users have to meet in person. Then A generates a QR code with a public key and a private key which is stored safely on the device. Then B scans that QR code and knows the public key now. Also the MAC address of the phone from A is put in the QR code.  
Now B establishes a BT (BlueTooth) connection to A and starts to check the app if its the original app.  
If everything looks good then B signs an agreement that he trusts A and is willing to transfer NRG with him.  
Then also B is presenting a QR code and A has to sign the agreement.  
When a user was able to connect to two other users, then his app will start to create NRG tokens on a 20 minutes base. These tokens are kind of signed by the other two users, because they agreed to do so.  

Each user is able to create 12 tokens each day, when he finds two people who trusts him and the app he's using. Of course the procedure of exchanging public keys is technically checking the account of the other user to be sure that he's using the original version and no faked app. 
After collecting toker for 10 days you have 12 NRG tokens which are worth 2 hours (2 * 60 minutes) of work.

After creating enough NRG tokens the user is able to transfer tokens to other apps also using QR code technique combined with BT.  

Additionally you are able to create more NRG tokens if you invite other users to the circle. This motivates the users to hopefully to spread the word about this project and the app.  
Maybe one day we can go shopping in a supermarket with this app.

# Plugins
Wouldn't it be nice if someone creates a plugin where he adds the ability to chat with each other? A chat which is secured using public/private key encryption. Or what about a micro blogging system where users may advertise for their services which can be paid with NRG? Or even a marketplace for goods sold for NRG? What about a dating app?

This is all possible with the possibility to create plugins for NRG.
