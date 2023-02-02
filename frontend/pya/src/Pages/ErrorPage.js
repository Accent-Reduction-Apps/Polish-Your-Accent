import { useRouteError } from "react-router-dom";

export default function ErrorPage() {
    const error = useRouteError();
    console.error(error);

    return (
        <div id="error-page">
            <h1>Oops!</h1>
            <p>Sorry, an unexpected error has occurred.</p>
            <p>
                <i>{error.statusText || error.message}</i>
            </p>
        </div>
    );
}



// import { useRouteError } from "react-router-dom";
//
// const NoPage = () => {
//     const error = useRouteError();
//     return <div id="error-page">
//         <h1>Oopsie!</h1>
//         <p>Sorry, an unexpected error has occurred.</p>
//         <p>
//             <i>{error.statusText || error.message}</i>
//         </p>
//     </div>
// };
//
// export default NoPage;

//
// import { useRouteError } from "react-router-dom";
//
// export default function ErrorPage() {
//     const error = useRouteError();
//     console.error(error);
//
//     return (
//         <div id="error-page">
//             <h1>Oopsie!</h1>
//             <p>Sorry, an unexpected error has occurred.</p>
//             <p>
//                 <i>{error.statusText || error.message}</i>
//             </p>
//         </div>
//     );
// }