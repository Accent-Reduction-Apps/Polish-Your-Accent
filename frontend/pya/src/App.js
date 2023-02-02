import ReactDOM from "react-dom/client";
import React from 'react';
import './App.css';
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Home from "./Pages/Home";
import Layout from "./Pages/Layout";
import Demo from "./Pages/Demo";
import About from "./Pages/About";
import Contact from "./Pages/Contact";
import NoPage from "./Pages/NoPage";
import RegisterHere from "./Pages/RegisterHere";
import ErrorPage from "./Pages/ErrorPage";


export default function App() {
    return (
        <Router>
            <Routes>

                <Route path="/" element={<Layout/>}>
                    <Route index element={<Home/>}/>
                    <Route path="about" element={<About/>}/>
                    <Route path="contact" element={<Contact/>}/>
                    <Route path="registration" element={<RegisterHere/>}/>
                    <Route path="registration" element={<RegisterHere/>}/>
                    <Route path="demo" element={<Demo/>}/>
                    <Route path="*" element={<NoPage/>}/>
                    <Route errorElement={<ErrorPage/>}/>
                </Route>
            </Routes>
        </Router>
    );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App/>);