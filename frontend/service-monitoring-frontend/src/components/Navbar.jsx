import { NavLink } from "react-router-dom";

const Navbar = () => {
  return (
    <nav>
      <NavLink to="/">Home</NavLink>
      <NavLink to="/status">System check</NavLink>
    </nav>
  );
};

export default Navbar;
