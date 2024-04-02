
import './App.css';
import { MainHeader } from './MainHeader';
import { MainHeaderClass } from './MainHeaderClass';

function App() {
  return (
    <div className="App">
      <MainHeader message="Olá mundo"/>
      <MainHeaderClass message="Olá Mundo da class"/>
    </div>
  );
}

export default App;
