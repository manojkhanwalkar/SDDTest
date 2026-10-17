# SDDTest

A Java 25 Maven sandbox for spec-driven development.

## Build and test

```bash
./mvnw test
java -cp target/classes com.example.sddtest.App
```

## Spec-driven workflow

- **OpenSpec** (`openspec/`): propose a change with `/opsx:propose`, implement it with
  `/opsx:apply`, and archive it with `/opsx:archive`. Current specs live in `openspec/specs/`.
- **Spec Buddy** (`specs/`): write a spec with `/spec-buddy:new`, plan it into
  `specs/plans/` with `/spec-buddy:plan`, and run steps with `/spec-buddy:execute`.
