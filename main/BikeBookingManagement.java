package bbm.main;

import bbm.Factory.enumeration.DatabaseTypes;
import bbm.Factory.InstanceFactory;
import bbm.application.BBMAccess;
import bbm.database.Database;
import bbm.model.account.*;
import bbm.model.bike.EBike;
import bbm.model.bike.MBike;

public final class BikeBookingManagement {
    static {
        Database db = InstanceFactory.getDatabaseInstance(DatabaseTypes.ListDatabase);
        assert db != null;
        db.addUser(new Manager("m", "m", "manager", "r", "@gmail", "3456234234L"));
        db.addUser(new Owner("m", "m", "owner", "t", "@gmail", "3456234234L"));
        db.addUser(new Customer("m", "m", "customer", "h", "@gmail", "3456234234L"));
        db.addUser(new SalesExecutive("m", "m", "sales", "x", "@gmail", "3456234234L"));
        db.addBike(new MBike(1, 2, 3, 4, 5, "1", "2", "3", "4", 5, 1, "2", "3", "4", "5", "3"));
        db.addBike(new MBike(1, 2, 3, 4, 5, "1", "2", "3", "4", 5, 1, "2", "3", "4", "5", "3"));
        db.addBike(new EBike(5, 4, 3, 2, 1, "5", "4", "3", "2", 1, 5, 4, 3, 2));
        db.addBike(new EBike(5, 4, 3, 2, 1, "5", "4", "3", "2", 1, 5, 4, 3, 2));
    }

    public static void main(String[] args) {
        BBMAccess bbmAccess = InstanceFactory.getBBMAccessInstance();
        IBBMController bbmController = InstanceFactory.getBBMControllerInstance(bbmAccess);
        IBBMView bbmView = InstanceFactory.getBBMViewInstance(bbmController);
        bbmView.renderMainView();
    }
}