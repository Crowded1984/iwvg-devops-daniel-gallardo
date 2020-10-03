package es.upm.miw.iwvg_devops.practice;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper))
                .map(user -> user.getFamilyName().substring(0, 1));
    }

    public Stream<Double> findDecimalImproperFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user-> user.getName().matches(name))
                .flatMap(user -> user.getFractions().stream())
                .filter(Fraction::isImproper)
                .map(Fraction::decimal);
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().allMatch(Fraction::isProper))
                .map(User::getId);
    }
}
