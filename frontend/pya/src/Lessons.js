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
            <h1>Lesson list:</h1>
            <table>
                <tbody>
                <tr>
                    <td>ID</td>
                    <td>Title</td>
                    <td>Text</td>
                </tr>
                {lessons.map((item, i) =>
                    <tr key={i}>
                        <td>{item.lessonId}</td>
                        <td>{item.topic}</td>
                        <td>{item.text}</td>
                    </tr>
                )
                }
                </tbody>
            </table>
        </div>
    )


}
export default Lessons