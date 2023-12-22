package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentItemFactory.ABI.IID
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

@ABIMarker(PaymentItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentItem;{685ac88b-79b2-4b76-9e03-a876223dfe72})")
@WinRTByReference(brClass = PaymentItem.ByReference::class)
public class PaymentItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentItem.WithDefault, IWinRTObject {
  private val __1016072793_Interface: IPaymentItem.WithDefault by lazy {
    as_1016072793()
  }


  public override val __1016072793_Ptr: JNAPointer? by lazy {
    __1016072793_Interface.__1016072793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1016072793_Interface)

  public constructor(label: String, amount: PaymentCurrencyAmount) : this(ABI.activate(label,
      amount))

  private fun as_1016072793(): IPaymentItem.WithDefault {
    if(pointer == NULL) {
      return(IPaymentItem.ABI.makeIPaymentItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentItem.ABI.makeIPaymentItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentItem> {
    public override fun getValue() = PaymentItem(pointer.getPointer(0))

    public fun setValue(value: PaymentItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentItem, MemoryAddress> {
    public val IPaymentItemFactory_Instance: IPaymentItemFactory by lazy {
      createIPaymentItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentItemFactory(): IPaymentItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentItemFactory.ABI.makeIPaymentItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(label: String, amount: PaymentCurrencyAmount): JNAPointer? =
        IPaymentItemFactory_Instance.Create(label, amount)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentItem {
      val address = segment.toRawLongValue()
      return PaymentItem(Pointer(address))
    }

    public override fun toNative(obj: PaymentItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
