DECLARE
    CURSOR loan_cursor IS
        SELECT c.Name,
               l.LoanID,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || loan_rec.LoanID
            || ' for customer '
            || loan_rec.Name
            || ' is due on '
            || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/