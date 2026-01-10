import React from "react";

function Registration() {
    async function handleRegistration(companyName, companyId, registeredAddress, serviceUrl) {
        console.log(`Company Name: ${companyName}, Company ID: ${companyId}, Registered Address: ${registeredAddress}, Service URL: ${serviceUrl}`);
        try {
          const response = await fetch('http://localhost:5000/api/register', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ companyName, companyId, registeredAddress, serviceUrl }),
          });
    
          if (!response.ok) {
            throw new Error('Network response was not ok');
          }
    
          const data = await response.json();
          console.log('Success:', data);
          // handle success (e.g., show a message to the user)
        } catch (error) {
          console.error('Error:', error);
          // handle error (e.g., show an error message to the user)
        }
      }
      
  return (
    <div>
      <h1>Service Registration</h1>
      <form
          onSubmit={(e) => {
            e.preventDefault();
            const form = e.target;
            const companyName = form.companyName.value;
            const companyId = form.companyId.value;
            const registeredAddress = form.registeredAddress.value;
            const serviceUrl = form.serviceUrl.value;
            handleRegistration(companyName, companyId, registeredAddress, serviceUrl);
          }}
        >
        <label>Company Name:</label>
        <input type="text" name="companyName" />
        <br />
        <label>Company ID:</label>
        <input type="text" name="companyId" />
        <br />
        <label>Registered Address:</label>
        <input type="text" name="registeredAddress" />
        <br />
        <label>Service URL:</label>
        <input type="text" name="serviceUrl" />
        <br />
        <button type="submit">Register Service</button>
      </form>
    </div>
  );
}

export default Registration;
