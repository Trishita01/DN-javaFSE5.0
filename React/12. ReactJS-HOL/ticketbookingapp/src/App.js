import React, { useState } from "react";
import "./App.css";

import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (

    <div style={{ textAlign: "center", marginTop: "30px" }}>

      <h1>Ticket Booking App</h1>

      {
        loggedIn ?
          <UserPage />
          :
          <GuestPage />
      }

      <br />

      {
        loggedIn ?

          <button onClick={() => setLoggedIn(false)}>
            Logout
          </button>

          :

          <button onClick={() => setLoggedIn(true)}>
            Login
          </button>

      }

    </div>

  );

}

export default App;