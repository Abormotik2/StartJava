-- querise

SELECT * FROM robots;

SELECT * FROM robots WHERE status = 'Active';

SELECT * FROM robots WHERE mark = 'Mark-1' OR mark = 'Mark-7';

SELECT * FROM robots ORDER BY mark;

SELECT * FROM robots WHERE launch IN(SELECT MAX(launch) From ROBOTS);

SELECT * FROM robots WHERE kaijukill IN(SELECT MAX(kaijukill) From robots);
SELECT * FROM robots WHERE kaijukill IN(SELECT MIN(kaijukill) From robots);
SELECT AVG(weight) as avgWeight FROM Robots;

UPDATE robots SET kaijukill = kaijukill + 1 WHERE status = 'Active';

DELETE FROM robots WHERE status = 'Destroyed';