// ...existing code...
import React from "react";

function Monitor() {
  const [serviceStatus, setServiceStatus] = React.useState("All systems operational");

  async function handleSubmit(serviceName, status) {
    console.log(`Service Name: ${serviceName}, Status: ${status}`);
    try {
      const response = await fetch('http://localhost:5000/api/monitor', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ serviceName, status }),
      });

      if (!response.ok) {
        throw new Error('Network response was not ok');
      }

      const data = await response.json();
      console.log('Success:', data);
      // update local UI state if needed
      setServiceStatus(data.message ?? `Status for ${serviceName}: ${status}`);
    } catch (error) {
      console.error('Error:', error);
      setServiceStatus('Error fetching status');
    }
  }

  return (
    <div>
      <h1>Service Monitoring Dashboard</h1>
      <div>
        <p>Here you can monitor the status of various services.</p>
        <form
          onSubmit={(e) => {
            e.preventDefault();
            const form = e.target;
            const serviceName = form.serviceName.value;
            const status = form.status.value;
            handleSubmit(serviceName, status);
          }}
        >
          <label>Service Name:</label>
          <input type="text" name="serviceName" />
          <br />
          <label>Status:</label>
          <select name="status">
            <option value="operational">Operational</option>
            <option value="degraded">Degraded Performance</option>
            <option value="down">Down</option>
          </select>
          <br />
          <button type="submit">Get Status</button>
        </form>
        <div>{serviceStatus}</div>
      </div>
    </div>
  );
}

export default Monitor;
// ...existing code...