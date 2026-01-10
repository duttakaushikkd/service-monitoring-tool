import React from "react";

function Home() {
    const [serviceStatus, setServiceStatus] = React.useState("All systems operational");
  return (
    <div>
      <h1>Welcome to the Service Monitoring Tool</h1>
    </div>
  );
}

export default Home;
