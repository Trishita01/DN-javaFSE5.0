import officeImage from "./officeimg.jpg";

function App() {

  const office = {
    name: "DBS",
    rent: 55000,
    address: "Chennai"
  };

  const officeList = [
    {
      name: "DBS",
      rent: 55000,
      address: "Chennai"
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "WeWork",
      rent: 65000,
      address: "Hyderabad"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Single Office Details</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> {office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Office List</h2>

      {
        officeList.map((item, index) => (

          <div key={index}>

            <h3>{item.name}</h3>

            <p
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              Rent : {item.rent}
            </p>

            <p>
              Address : {item.address}
            </p>

            <hr />

          </div>

        ))
      }

    </div>
  );

}

export default App;