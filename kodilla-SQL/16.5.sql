INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "Greetings!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "Hey!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, "How are u?");

UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 2;

DELETE FROM POSTS
WHERE ID = 7;

COMMIT;