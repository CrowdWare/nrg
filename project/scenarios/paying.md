# Paying

A is showing an encrypted QR code with payment details (amount).
B is scanning the QR code, verifies visually the amount and press accept button, then the app generate a QR code with an agreement and let A scan that QR code.
In terms of SQL this is not a full transaction but, its all about trust and no additional tokens will be created.
In worst case only one party looses a few tokens.

When B is accepting the payment it will be booked as paid, even if A is not accepting the transaction anymore.
When A scans the QR code the amount will be booked onto his account.
The agreement QR code from B is only valid to be booked on A's account to protect against reply attacks. 
It can be reproduced by B every time in case A wants to scan it again.
Also A can use this QR code only once. 

## Encryption
The QR codes are encrypted using PK, so only A and B can read the QR codes.