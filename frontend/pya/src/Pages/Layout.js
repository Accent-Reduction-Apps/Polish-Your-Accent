import { Outlet, Link } from "react-router-dom";

const Layout = () => {
    return (
        <>
            <nav>
                <p>to by byla strona glowna z logo apki</p>
                <ul>
                    <li>
                        <Link to="/">HOME</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/contact">Team</Link>
                    </li>
                    <li>
                        <Link to="/registration">Register here</Link>
                    </li>
                    <li>
                        <Link to="/demo">Demo</Link>
                    </li>
                </ul>
            </nav>

            <Outlet />
        </>
    )
};

export default Layout;