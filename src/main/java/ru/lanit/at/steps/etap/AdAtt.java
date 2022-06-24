package ru.lanit.at.steps.etap;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public interface AdAtt extends TestWatcher {
    void testSuccessful(ExtensionContext context, Throwable throwable);

    @Override
    void testDisabled(ExtensionContext context, Optional<String> reason);

    @Override
    void testSuccessful(ExtensionContext context);

    @Override
    void testAborted(ExtensionContext context, Throwable cause);
}
