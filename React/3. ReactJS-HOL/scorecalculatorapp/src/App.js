import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {

  return (
    <div>

      <CalculateScore
        name="Trishita Podder"
        school="IEM Kolkata"
        total={475}
        goal={5}
      />

    </div>
  );
}

export default App;