package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentShippingOptionFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PaymentShippingOption.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentShippingOption;{13372ada-9753-4574-8966-93145a76c7f9})")
@WinRTByReference(brClass = PaymentShippingOption.ByReference::class)
public class PaymentShippingOption(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentShippingOption.WithDefault, IWinRTObject {
  private val __800205143_Interface: IPaymentShippingOption.WithDefault by lazy {
    as_800205143()
  }


  public override val __800205143_Ptr: JNAPointer? by lazy {
    __800205143_Interface.__800205143_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__800205143_Interface)

  public constructor(label: String, amount: PaymentCurrencyAmount) : this(ABI.activate(label,
      amount))

  public constructor(
    label: String,
    amount: PaymentCurrencyAmount,
    selected: Boolean
  ) : this(ABI.activate(label, amount, selected))

  public constructor(
    label: String,
    amount: PaymentCurrencyAmount,
    selected: Boolean,
    tag: String
  ) : this(ABI.activate(label, amount, selected, tag))

  private fun as_800205143(): IPaymentShippingOption.WithDefault {
    if(pointer == NULL) {
      return(IPaymentShippingOption.ABI.makeIPaymentShippingOption(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentShippingOption>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentShippingOption.ABI.makeIPaymentShippingOption(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentShippingOption> {
    public override fun getValue() = PaymentShippingOption(pointer.getPointer(0))

    public fun setValue(value: PaymentShippingOption): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentShippingOption, MemoryAddress> {
    public val IPaymentShippingOptionFactory_Instance: IPaymentShippingOptionFactory by lazy {
      createIPaymentShippingOptionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentShippingOptionFactory(): IPaymentShippingOptionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentShippingOption".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentShippingOptionFactory.ABI.makeIPaymentShippingOptionFactory(factoryActivatorPtr.value))
    }

    public fun activate(label: String, amount: PaymentCurrencyAmount): JNAPointer? =
        IPaymentShippingOptionFactory_Instance.Create(label, amount)?.pointer

    public fun activate(
      label: String,
      amount: PaymentCurrencyAmount,
      selected: Boolean
    ): JNAPointer? = IPaymentShippingOptionFactory_Instance.CreateWithSelected(label, amount,
        selected)?.pointer

    public fun activate(
      label: String,
      amount: PaymentCurrencyAmount,
      selected: Boolean,
      tag: String
    ): JNAPointer? = IPaymentShippingOptionFactory_Instance.CreateWithSelectedAndTag(label, amount,
        selected, tag)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentShippingOption {
      val address = segment.toRawLongValue()
      return PaymentShippingOption(Pointer(address))
    }

    public override fun toNative(obj: PaymentShippingOption): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
