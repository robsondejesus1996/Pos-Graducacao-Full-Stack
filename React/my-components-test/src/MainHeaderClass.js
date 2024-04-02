import logo from "./logo.svg";


import { Component } from "react";

export class MainHeaderClass extends Component {
    state = {
        count: 0,
    }

  render() {
    return (
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Componente de class</h1>

        <p>Voce clicoum {this.state.count} vezes no botao</p>
        <button onClick={() => this.setState({ count: this.state.count + 1 })}>Incrementar</button>
        <h1>{this.props.message}</h1>
      </header>
    );
  }
}
