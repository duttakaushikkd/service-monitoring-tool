import './App.css'
import Home from './pages/home.jsx'
import Monitor from './pages/monitor.jsx'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Navbar from './components/Navbar.jsx'

function App() {
  return (
    <>
      <div>
        <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/status" element={<Monitor />} />
          </Routes>
        </BrowserRouter>
      </div>

    </>
  )
}

export default App
