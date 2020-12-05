import React, { Component } from 'react';
import './App.css';
import Person from './Component/Person';

class App extends Component {
  state = {
    persons: [
      { name:'Max', age:24},
      {name: 'Many',age:25},
      {name: 'pies',age:25}
    ]
  }
  switchNameHandler = () => {
    console.log('was clicked');
    this.setState({persons:[0].name='pie'});
  }
  render() {
    return (
      <div className="App">
        <h1>I am a app</h1>
        <button onClick={this.switchNameHandler}>Switch names</button>
        <Person name={this.state.persons[0].name} age ={this.state.persons[0].age}/>
        <Person name={this.state.persons[1].name} age={this.state.persons[1].age}>testing childern</Person>
        <Person name={this.state.persons[2].name} age={this.state.persons[2].age}/> 
      </div>
    );
    
  }
}

export default App;
