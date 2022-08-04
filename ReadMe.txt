user-service: 2 kind of users Librarian/Admin and normal user
Registration
Login

book-service:
Add - can be performed by a librarian
Edit - can be performed by a librarian only
Delete - can be performed by librarian only
fetch book (based on some params)- can be performed by both librarian and normal user.

Substricption-service:
reserve a book
renew a book
return a book


DB Tables-
User
userid emailid firstname lastname mobile_no password role_id(for librarian and user)

Book
bookid bookName title author price NumberOfCopiesAvailable

Subscription
subid subscribed_on vaild_till userid reference user bookid refrences book







