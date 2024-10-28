SELECT 
    Users.username,
    AVG(LENGTH(Messages.content)) AS average_message_length
FROM Users
JOIN Messages ON Users.user_id = Messages.user_id
GROUP BY Users.username
HAVING AVG(LENGTH(Messages.content)) > 50;
