import React from "react";

function BookDetails() {

    let bookAvailable = true;

    if(bookAvailable) {
        return (
            <div>
                <h2>Book Details</h2>
                <p>Book Name: React Fundamentals</p>
                <p>Author: Dan Abramov</p>
                <p>Status: Available</p>
            </div>
        );
    }
    else {
        return (
            <div>
                <h2>Book Details</h2>
                <p>Book is currently unavailable</p>
            </div>
        );
    }
}

export default BookDetails;