import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './pages/Home'
import Monitor from './pages/Monitor'

function App() {
  return (
    <>
      <div>
          <Navbar />
          <Routes>
             <Route path="/" element={<Home />} />
             <Route path="/monitoring" element={<Monitor />} />
          </Routes>
      </div>

    </>
  )
}

export default App
