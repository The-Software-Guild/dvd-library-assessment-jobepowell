/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author powel
 */
import com.jobep.dvdlibrary.controller.DVDLibraryController;
import com.jobep.dvdlibrary.dao.*;
import com.jobep.dvdlibrary.ui.*;
public class App {
    public static void main(String[] args) throws Exception{
        UserIO io = new UserIOConsoleImpl();
        DVDLibraryView view = new DVDLibraryView(io);
        DVDLibraryDao dao = new DVDLibraryDaoImpl();
        DVDLibraryController controller = new DVDLibraryController(dao,view);
        controller.run();
    }
}
