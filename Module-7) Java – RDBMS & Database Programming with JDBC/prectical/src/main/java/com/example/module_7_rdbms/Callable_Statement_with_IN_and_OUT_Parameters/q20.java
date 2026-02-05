package com.example.module_7_rdbms.Callable_Statement_with_IN_and_OUT_Parameters;

//Create a stored procedure in MySQL with IN and OUT parameters (e.g., a procedure
//that takes an employee ID as input and returns the employee's full name as output).

public class q20 {
//	DELIMITER //
//
//	CREATE
//
//	PROCEDURE getEmployeeName(
//	    IN empId INT,
//	    OUT fullName VARCHAR(100)
//	)
//	BEGIN
//
//	SELECT CONCAT(fname, ' ', lname)
//	    INTO fullName
//	    FROM employee
//	    WHERE id = empId;
//	END //

	// DELIMITER ;

	// CALL getEmployeeName(1, @name);
	// SELECT @name;
}
