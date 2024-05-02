import { Route, Routes } from "react-router-dom";
import { Home } from "./views/Home";

export const ApplicationRoutes = () =>(
    <>
        <Routes>
            <Route exact path="/" Component={Home}></Route>{/*Tela Inicial*/}
            <Route path="/about"></Route> {/*Tela sobre */}
        </Routes>
    </>
)