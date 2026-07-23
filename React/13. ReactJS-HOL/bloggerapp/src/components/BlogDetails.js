import React from "react";

function BlogDetails() {

    let isPublished = true;

    return (
        <div>

            <h2>Blog Details</h2>

            <p>
                Blog Title:
                React Conditional Rendering
            </p>

            <p>
                Status:
                {
                    isPublished 
                    ? " Published"
                    : " Draft"
                }
            </p>

        </div>
    );
}

export default BlogDetails;