-- querise

SELECT * FROM Robots;

SELECT * FROM Robots WHERE status = 'Active';

SELECT * FROM Robots WHERE mark = 'Mark-1' OR mark = 'Mark-7';

SELECT * FROM Robots ORDER BY mark;

SELECT * FROM Robots WHERE launch IN(SELECT MAX(launch) from ROBOTS);

SELECT * FROM Robots WHERE kaijukill IN(SELECT MAX(kaijukill) from ROBOTS);
SELECT * FROM Robots WHERE kaijukill IN(SELECT MIN(kaijukill) from ROBOTS);
SELECT AVG(weight) as avgWeight FROM Robots;

UPDATE ROBOTS SET kaijukill = kaijukill + 1 WHERE status = 'Active';

DELETE FROM ROBOTS WHERE status = 'Destroyed';