package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentRequestChangedResultFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PaymentRequestChangedResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentRequestChangedResult;{df699e5c-16c4-47ad-9401-8440ec0757db})")
@WinRTByReference(brClass = PaymentRequestChangedResult.ByReference::class)
public class PaymentRequestChangedResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentRequestChangedResult.WithDefault, IWinRTObject {
  private val __1948635082_Interface: IPaymentRequestChangedResult.WithDefault by lazy {
    as_1948635082()
  }


  public override val __1948635082_Ptr: JNAPointer? by lazy {
    __1948635082_Interface.__1948635082_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1948635082_Interface)

  public constructor(changeAcceptedByMerchant: Boolean) :
      this(ABI.activate(changeAcceptedByMerchant))

  public constructor(changeAcceptedByMerchant: Boolean, updatedPaymentDetails: PaymentDetails) :
      this(ABI.activate(changeAcceptedByMerchant, updatedPaymentDetails))

  private fun as_1948635082(): IPaymentRequestChangedResult.WithDefault {
    if(pointer == NULL) {
      return(IPaymentRequestChangedResult.ABI.makeIPaymentRequestChangedResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentRequestChangedResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentRequestChangedResult.ABI.makeIPaymentRequestChangedResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentRequestChangedResult> {
    public override fun getValue() = PaymentRequestChangedResult(pointer.getPointer(0))

    public fun setValue(value: PaymentRequestChangedResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentRequestChangedResult, MemoryAddress> {
    public val IPaymentRequestChangedResultFactory_Instance: IPaymentRequestChangedResultFactory by
        lazy {
      createIPaymentRequestChangedResultFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentRequestChangedResultFactory(): IPaymentRequestChangedResultFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentRequestChangedResult".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentRequestChangedResultFactory.ABI.makeIPaymentRequestChangedResultFactory(factoryActivatorPtr.value))
    }

    public fun activate(changeAcceptedByMerchant: Boolean): JNAPointer? =
        IPaymentRequestChangedResultFactory_Instance.Create(changeAcceptedByMerchant)?.pointer

    public fun activate(changeAcceptedByMerchant: Boolean, updatedPaymentDetails: PaymentDetails):
        JNAPointer? =
        IPaymentRequestChangedResultFactory_Instance.CreateWithPaymentDetails(changeAcceptedByMerchant,
        updatedPaymentDetails)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentRequestChangedResult {
      val address = segment.toRawLongValue()
      return PaymentRequestChangedResult(Pointer(address))
    }

    public override fun toNative(obj: PaymentRequestChangedResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
