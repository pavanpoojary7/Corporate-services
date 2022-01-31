import React from 'react';//write javascriptxml content in javascript file
import Create from './Create';
// import ReactDOM from 'react-dom';//map interaction with other components

import List from './list';

//function
// const style=()=>{
 
//     alert(
//         "mouse entered"
//     );

// }
// //data for styling
// const style1={
//  color:'white',
//  backgroundColor:'blue'
// }

// function App(){
//     return(
// <>

// <h1 style={style1}> functional components are new to me</h1>
// <hr color='blue'/>{/*  hr elements,color properties*/}
// {/* style prop in jsx */}
// <ol style={{backgroundColor:'red'}}>
//     <li>html</li>
//     <li>css</li>
//     <li onMouseEnter={style}>js</li>
// </ol>

// </>
//     );
// }

const App=()=>{
    return(
        <>
            <List/>
            {/* <Create/> */}
        </>
    );
}


export default App;