import { Route, Routes } from "react-router-dom";
import { Home } from "./views/Home";
import { MovieDetail } from "./views/MovieDetail"

export const ApplicationRoutes = () =>(
    <>
        <Routes>
            <Route exact path="/" Component={Home}></Route>{/*Tela Inicial*/}
            <Route path="/about"></Route> {/*Tela sobre */}
            <Route exact path="/movie/:id" Component={MovieDetail}></Route>
        </Routes>
    </>
)