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
