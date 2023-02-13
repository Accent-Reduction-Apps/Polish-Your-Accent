import React, {useEffect, useState} from 'react';
import './GetLessons.css';

const GetLessonsTable = () => {
    const [data, setData] = useState([]);
    const [error, setError] = useState(null);
    const [isLoading, setIsLoading] = useState(false);

    useEffect(() => {
        async function fetchData() {
            setIsLoading(true);
            setError(null);

            try {
                const response = await fetch('http://localhost:8080/lessons'); //todo: wydzielić komponenty/obszary - funkcja js wołająca fetch - odwoł

                if (!response.ok) {
                    throw new Error(response.statusText);
                }

                const json = await response.json();
                setData(json);
            } catch (e) {
                setError(e.message);
            } finally {
                setIsLoading(false);
            }
        }
        fetchData();
    }, []);

    if (isLoading) {
        return <p>Loading...</p>;
    }

    if (error) {
        return <p>An error occurred: {error}</p>;
    }

    return (
        <table className="table">
            <thead>
            <tr>
                <th>Lesson Id</th>
                <th>Topic</th>
                <th>Text</th>
            </tr>
            </thead>
            <tbody>
            {data.map(item => (
                <tr key={item.lessonId}>
                    <td>{item.lessonId}</td>
                    <td>{item.topic}</td>
                    <td>{item.text}</td>
                </tr>
            ))}
            </tbody>
        </table>
    );
};

export default GetLessonsTable;
