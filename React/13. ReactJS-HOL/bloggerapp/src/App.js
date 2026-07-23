import './App.css';

import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';


function App() {

  return (

    <div>

      <h1>
        Blogger Application
      </h1>


      <BookDetails />

      <hr/>

      <BlogDetails />

      <hr/>

      <CourseDetails />

    </div>

  );
}

export default App;