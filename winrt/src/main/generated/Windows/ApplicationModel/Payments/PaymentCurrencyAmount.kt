package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentCurrencyAmountFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PaymentCurrencyAmount.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentCurrencyAmount;{e3a3e9e0-b41f-4987-bdcb-071331f2daa4})")
@WinRTByReference(brClass = PaymentCurrencyAmount.ByReference::class)
public class PaymentCurrencyAmount(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentCurrencyAmount.WithDefault, IWinRTObject {
  private val __757493085_Interface: IPaymentCurrencyAmount.WithDefault by lazy {
    as_757493085()
  }


  public override val __757493085_Ptr: JNAPointer? by lazy {
    __757493085_Interface.__757493085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__757493085_Interface)

  public constructor(value: String, currency: String) : this(ABI.activate(value, currency))

  public constructor(
    value: String,
    currency: String,
    currencySystem: String
  ) : this(ABI.activate(value, currency, currencySystem))

  private fun as_757493085(): IPaymentCurrencyAmount.WithDefault {
    if(pointer == NULL) {
      return(IPaymentCurrencyAmount.ABI.makeIPaymentCurrencyAmount(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentCurrencyAmount>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentCurrencyAmount.ABI.makeIPaymentCurrencyAmount(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentCurrencyAmount> {
    public override fun getValue() = PaymentCurrencyAmount(pointer.getPointer(0))

    public fun setValue(value: PaymentCurrencyAmount): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentCurrencyAmount, MemoryAddress> {
    public val IPaymentCurrencyAmountFactory_Instance: IPaymentCurrencyAmountFactory by lazy {
      createIPaymentCurrencyAmountFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentCurrencyAmountFactory(): IPaymentCurrencyAmountFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentCurrencyAmount".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentCurrencyAmountFactory.ABI.makeIPaymentCurrencyAmountFactory(factoryActivatorPtr.value))
    }

    public fun activate(value: String, currency: String): JNAPointer? =
        IPaymentCurrencyAmountFactory_Instance.Create(value, currency)?.pointer

    public fun activate(
      value: String,
      currency: String,
      currencySystem: String
    ): JNAPointer? = IPaymentCurrencyAmountFactory_Instance.CreateWithCurrencySystem(value,
        currency, currencySystem)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentCurrencyAmount {
      val address = segment.toRawLongValue()
      return PaymentCurrencyAmount(Pointer(address))
    }

    public override fun toNative(obj: PaymentCurrencyAmount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
