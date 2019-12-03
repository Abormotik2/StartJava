-- querise

SELECT * FROM robots;

SELECT * FROM robots WHERE status = 'Active';

SELECT * FROM robots WHERE mark IN('Mark-1','Mark-7');

SELECT * FROM robots ORDER BY mark;

SELECT * FROM robots WHERE launch IN(SELECT MAX(launch) FROM ROBOTS);

SELECT * FROM robots WHERE kaijukill = (SELECT MAX(kaijukill) FROM robots);
SELECT * FROM robots WHERE kaijukill = (SELECT MIN(kaijukill) FROM robots);
SELECT AVG(weight) as avgWeight FROM Robots;

UPDATE robots SET kaijukill = kaijukill + 1 WHERE status = 'Active';

DELETE FROM robots WHERE status = 'Destroyed';