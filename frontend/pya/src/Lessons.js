import React, {useEffect, useState} from 'react';

import './Lessons.css';

function Lessons() {
    const [lessons, setLessons] = useState([]);
    useEffect(() => {
        fetch("http://localhost:8080/lessons").then((result) => {
            result.json().then((respond) => {
                setLessons(respond)
            })
        })
    }, [])
    console.warn(lessons)

    return (<div className={"lessonList"}>
            <h1>Lesson List</h1>
            <table class="table table-stripped">
                <tbody>
                <thead className="thread">
                <td>
                    <th className="Id" scope="col">ID</th>
                    <th className="Topic" scope="col">Title</th>
                    <th className="Text" scope="col">Text</th>
                </td>
                {lessons.map((item, i) =>
                    <tr key={i}>
                        <th className="IdT">{item.lessonId}</th>
                        <td className="TopicT">{item.topic}</td>
                        <td className="TextT">{item.text}</td>
                    </tr>
                )
                }
                </thead>
                </tbody>
            </table>
        </div>
    )


}
export default Lessons