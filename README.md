# PrimeCore Banking Backend

The PrimeCore backend powers the banking services behind the PrimeCore web app. It manages customer records, spending and budgets, credit assessments, loan eligibility, transfers, and the everyday work of bank officers and administrators.

## Who it supports

| User | Main capabilities |
| --- | --- |
| Public customers | Register, provide financial information, track spending, and review self credit assessments. |
| Bank customers | Manage spending, view bank credit assessments, explore loan eligibility, and transfer money. |
| Bank officers | Onboard customers, maintain financial records, review credit information, and manage assigned work. |
| Administrators | Manage users, branches, officers, lending policies, audit records, and support conversations. |

## SpendIQ: spending and budgets

SpendIQ helps customers keep a record of their spending and understand how it compares with their plans.

- Record, update, and review expenses.
- Organize spending into categories.
- Review spending summaries and category breakdowns.
- Set budget limits and monitor spending against them.
- Carry budget limits into a new month through budget rollover.
- Review past activity and generate downloadable spending reports.

## CreditLens: credit health and assessments

CreditLens uses customer financial records to produce credit evaluations and supporting insights.

- Generate self credit assessments for public customers.
- Support bank customer credit evaluations and officer reviews.
- Provide credit scores, risk levels, and explanations of contributing factors.
- Supply dashboard summaries, trends, and financial insights.
- Keep previous evaluations so customers and officers can review changes over time.
- Generate monthly report information and downloadable credit report PDFs.

## LoanSense: borrowing eligibility

LoanSense evaluates borrowing options using financial information, credit assessments, and the bank's lending policies.

- Assess eligibility for personal, vehicle, education, and housing loans.
- Calculate recommended maximum borrowing amounts.
- Provide estimated monthly repayments and applicable repayment periods.
- Consider income, existing commitments, and risk when assessing repayment capacity.
- Explain eligibility outcomes for each loan category.
- Keep assessment history for later review.

## Transact: transfers and payment records

Transact supports customer transfers and keeps the records needed to review completed activity.

- Verify account details during banking workflows.
- Request and verify one-time passwords for transfers.
- Process transfers and record transaction references.
- Add, update, list, and remove beneficiaries.
- Retrieve transaction details and payment history.
- Download individual transaction receipts and transaction statements as PDFs.
- Provide bank officers with transaction review capabilities.

## Customer onboarding and financial records

The backend supports both public customer onboarding and bank officer-assisted customer registration.

- Capture customer details and financial information.
- Record income, loans, credit cards, liabilities, and missed payments.
- Save onboarding steps as drafts and resume incomplete work.
- Track progress through financial information, credit information, and final review steps.
- Look up credit information from the configured CRIB dataset using a customer's national identity number.
- Record credit information request and retrieval status.
- Maintain historical financial snapshots when customer information changes.

## Bank officer operations

- Browse customer portfolios and open customer records.
- Manage onboarding and financial maintenance work.
- Follow customer cases through a work queue.
- Review financial history and credit evaluations.
- Access customer transaction records.

## Administration and oversight

Administrators manage the records and policies that support banking operations.

- Manage user accounts and bank officer records.
- Create and manage branches.
- Maintain lending policies for supported loan categories.
- Configure risk adjustments used in lending assessments.
- Review administrative dashboard information.
- Follow recorded activity through audit logs.
- Oversee support conversations and update their status.

## Account access and profiles

- Registration and sign-in for supported account roles.
- Account activation workflows and related email messages.
- Password recovery with one-time password verification.
- Access checks based on account roles and ownership of customer records.
- Profile updates and profile image storage.

## Notifications and support

- Deliver notifications about relevant account and banking activity.
- Send email messages for supported activation, account, and verification workflows.
- Create support conversations with a subject, category, and message.
- Allow users and support staff to exchange replies.
- Track read status and whether a conversation is open or closed.

## Reports and history

PrimeCore keeps spending, credit, financial, and transaction records available for later review. Downloadable reports include spending reports, credit assessment reports, transaction statements, and payment receipts.

Available features depend on the user's role, customer records, and configured banking and email services.

## Development guide

For the existing development, demo account, email configuration, and deployment notes, see [DEVELOPMENT.md](DEVELOPMENT.md).
