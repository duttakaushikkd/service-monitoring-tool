import React from "react";

function Home() {
    const [serviceStatus, setServiceStatus] = React.useState("All systems operational");
  return (
    <div>
      <h1>Welcome to the Service Monitoring Tool</h1>
      <div>
        <nav>
          <nav>System check</nav>
        </nav>
      </div>
      <p>Current Service Status: {serviceStatus}</p>
      <button onClick={() => setServiceStatus("Degraded Performance")}>Simulate Issue</button>
      <button onClick={() => setServiceStatus("All systems operational")}>Resolve Issue</button>
    </div>
  );
}

export default Home;
