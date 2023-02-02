import React, {useState} from 'react';

import './Lessons.css';

const Lessons = () => {
    const [lessons, getLesson] = useState([""])

    const fetchData = e => {
        const query = e.target.value
        fetch("http://localhost:8080/lessons")
            .then(response => {
                return response.json()
            })
            .then(data => {
                getLesson(data)
            })
    }

    return (
        <div className={"lessonList"}>
            <button className={"fetchButton"} onClick={fetchData}>Nie klikać!!!</button>
            {/*<input onChange={fetchData}/>*/}
            {lessons.length > 0 && (
                <ul>
                    {lessons.map(lesson => (
                        <li key={lesson.id}>
                            {lesson.title}
                            {lesson.text}
                        </li>
                    ))}
                </ul>
            )}
        </div>
    )
}


export default Lessons