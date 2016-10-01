import absractfactorypattern.AbstractFactoryPattern;
import adapterpattern.AdapterPattern;
import bridgepattern.BridgePattern;
import builderpattern.BuilderPatternDemo;
import compositepattern.CompositePattern;
import decoratorpattern.DecoratorPattern;
import factorypattern.FactoryPattern;
import fascadepattern.FascadePattern;
import filterpattern.FilterPattern;
import partitioning.Partitioning;
import primenum.PrimeNumberGenerator;
import primenum.PrimeNumberSieve;
import prototypepattern.PrototypePattern;
import singletonpattern.SingletonPattern;

public class Main {

    public static void main(String[] args) {

        switch (args[0].toUpperCase()){
            case "FACTORY":
                FactoryPattern factoryPattern = new FactoryPattern();
                factoryPattern.runFactoryDemo();
                break;
            case "ABSTRACTFACTORY":
                AbstractFactoryPattern abstractFactoryPattern = new AbstractFactoryPattern();
                abstractFactoryPattern.runAbstractFactoryDemo();
                break;
            case "PRIMETHREAD":
                PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
                primeNumberGenerator.generate();
                break;
            case "PRIMESIEVE":
                PrimeNumberSieve primeNumberSieve = new PrimeNumberSieve();
                primeNumberSieve.generate();
                break;
            case "SINGLETON":
                SingletonPattern singletonPattern = new SingletonPattern();
                singletonPattern.generate();
                break;
            case "PARTITIONARRAY":
                Partitioning partitioning = new Partitioning(10);
                partitioning.generateRandomArray();
                partitioning.partitionArray(35);
                break;
            case "QUICKSORT":
                Partitioning quickSort = new Partitioning(10);
                quickSort.generateRandomArray();
                quickSort.runQuicksort();
                break;
            case "BUILDER":
                BuilderPatternDemo builderPatternDemo = new BuilderPatternDemo();
                builderPatternDemo.run();
                break;
            case "PROTOTYPE":
                PrototypePattern prototypePattern = new PrototypePattern();
                prototypePattern.run();
                break;
            case "ADAPTER":
                AdapterPattern adapterPattern = new AdapterPattern();
                adapterPattern.run();
                break;
            case "BRIDGE":
                BridgePattern bridgePattern = new BridgePattern();
                bridgePattern.run();
                break;
            case "FILTER":
                FilterPattern filterPattern = new FilterPattern();
                filterPattern.run();
                break;
            case "COMPOSITE":
                CompositePattern compositePattern = new CompositePattern();
                compositePattern.run();
                break;
            case "DECORATOR":
                DecoratorPattern decoratorPattern = new DecoratorPattern();
                decoratorPattern.run();
                break;
            case "FASCADE":
                FascadePattern fascadePattern = new FascadePattern();
                fascadePattern.run();
                break;
        }
    }
}
