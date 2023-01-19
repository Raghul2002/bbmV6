package bbm.dataManager;

import bbm.Factory.InstanceFactory;
import bbm.database.IDatabase;
import bbm.SalesRecord.SalesRecord;
import bbm.model.account.Customer;
import bbm.model.account.Manager;
import bbm.model.account.Owner;
import bbm.model.account.SalesExecutive;
import bbm.model.bike.EBike;
import bbm.model.bike.MBike;

import java.util.List;

public final class DataManager implements IDataManager {
    private static DataManager dataManager;

    private DataManager() {}
    public static DataManager getInstance() {
        if (dataManager == null) dataManager = new DataManager();
        return dataManager;
    }
    IDatabase db = InstanceFactory.getIDatabaseInstance();

    @Override
    public void addUser(Manager manager) {
        db.addUser(manager);
    }

    @Override
    public void addUser(SalesExecutive salesExecutive) {
        db.addUser(salesExecutive);
    }

    @Override
    public void addUser(Customer customer) {
        db.addUser(customer);
    }

    @Override
    public void addBike(EBike eBike, Manager manager) {
        db.addBike(eBike);
    }

    @Override
    public void addBike(MBike mBike, Manager manager) {
        db.addBike(mBike);
    }

    @Override
    public void removeUser(SalesExecutive salesExecutive) {
        db.removeUser(salesExecutive);
    }

    @Override
    public void removeUser(Manager manager) {
        db.removeUser(manager);
    }

    @Override
    public void removeBike(EBike eBike, Manager manager) {
        db.removeBike(eBike);
    }

    @Override
    public void removeBike(MBike mBike, Manager manager) {
        db.removeBike(mBike);
    }

    @Override
    public List<Customer> getCustomerList() {
        return db.getCustomerList();
    }

    @Override
    public List<SalesExecutive> getSalesExecutiveList() {
        return db.getSalesExecutiveList();
    }

    @Override
    public List<Manager> getManagerList() {
        return db.getManagerList();
    }

    @Override
    public List<EBike> getEBikeList() {
        return db.getEBikeList();
    }

    @Override
    public List<MBike> getMBikeList() {
        return db.getMBikeList();
    }

    @Override
    public void addOrderDetails(SalesRecord salesRecord) {
        db.addOrderDetails(salesRecord);
    }

    @Override
    public List<SalesRecord> getOrderDetailsList() {
        return db.getOrderDetailsList();
    }

    @Override
    public List<Owner> getOwnerList() {
        return db.getOwnerList();
    }


}