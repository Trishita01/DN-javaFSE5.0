import React from "react";

function CourseDetails(){

    const courses = [
        {
            id:1,
            name:"React JS",
            duration:"30 Hours"
        },
        {
            id:2,
            name:"Spring Boot",
            duration:"40 Hours"
        },
        {
            id:3,
            name:"MongoDB",
            duration:"20 Hours"
        }
    ];


    return(

        <div>

            <h2>Course Details</h2>

            {
                courses.map(course =>

                    <div key={course.id}>

                        <h3>
                            {course.name}
                        </h3>

                        <p>
                            Duration:
                            {course.duration}
                        </p>

                    </div>

                )
            }

        </div>
    );
}

export default CourseDetails;