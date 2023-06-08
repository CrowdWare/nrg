# ToDo
Bluetooth is not really a good option.
First of all the own MAC address is not available any more.
Then I was not able to scan devices on an emulator.
Nor was I able to scan devices with my phone, only my tablet could scan my phone.


How to protect the app against attackers who reuse the code and try to alter the balance?
They could have a higher start balance. They could mint more coins. They could just pay without booking the payment.
The only way I see is by using an API key.
But it could be easy to find that API key in the code, because bytecode can be recompiled. Even when I would use the checksum of the APK file to create an API key its not safe enough, because one can compute the key with the original APK.

Just saw the secret key in the classes.dex inside the APK when decompile.

So we should make it obsolete to use an API key.



## New ideas
Create an NRG bond.  
Let this NRG bond be signed by a man and a woman using the same app.
Now that its signed you can pay with it.  

(We have to specify which legal data should be saved for each bond. Maybe Name and address. Maybe a photo of an id card or driver license. Maybe just the public key to stay anonymous.)

All transactions are stored in a blockchain like file on the mobile.
Bonds without a value left will be erased (after 7 years).

When signing a bond we could use a relay server to make this transaction be safe.
So in that case the creator and the signers have to meet where there is WLAN.
The server can verify if all three apps are original.

# Security
We are now putting all business logic into a Go lib.
With Go a main goal will be TDD (test driven development).
So all API keys and DB passwords are safer than in JVM classes.
Additionally we close the source (private repo).