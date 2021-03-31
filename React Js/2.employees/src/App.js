import React from 'react';
import './App.css';
import * as ReactBootStrap from 'react-bootstrap';

const App = () => {
  const employees = [
    {name:"Charlie",job:"Janitor"},
    {name:"Mac",job:"Bouncer"},
    {name:"Dee",job:"Aspiring actress"},
    {name:"Dennis",job:"Bartender"}
  ]

  const renderEmployee = (employees , index) => {
    return(
      <tr key={index}>
        <td>{employees.name}</td>
        <td>{employees.job}</td>
      </tr>
    )
  }

  return (
    <div className="App">
      <ReactBootStrap.Table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Job</th>
        </tr>
      </thead>
      <tbody>
        {employees.map(renderEmployee)}
      </tbody>
      </ReactBootStrap.Table>
    </div>
  );
}

export default App;
