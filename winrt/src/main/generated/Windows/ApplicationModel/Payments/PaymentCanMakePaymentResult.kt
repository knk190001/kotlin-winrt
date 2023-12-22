package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentCanMakePaymentResultFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PaymentCanMakePaymentResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentCanMakePaymentResult;{7696fe55-d5d3-4d3d-b345-45591759c510})")
@WinRTByReference(brClass = PaymentCanMakePaymentResult.ByReference::class)
public class PaymentCanMakePaymentResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentCanMakePaymentResult.WithDefault, IWinRTObject {
  private val __32787687_Interface: IPaymentCanMakePaymentResult.WithDefault by lazy {
    as_32787687()
  }


  public override val __32787687_Ptr: JNAPointer? by lazy {
    __32787687_Interface.__32787687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__32787687_Interface)

  public constructor(value: PaymentCanMakePaymentResultStatus) : this(ABI.activate(value))

  private fun as_32787687(): IPaymentCanMakePaymentResult.WithDefault {
    if(pointer == NULL) {
      return(IPaymentCanMakePaymentResult.ABI.makeIPaymentCanMakePaymentResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentCanMakePaymentResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentCanMakePaymentResult.ABI.makeIPaymentCanMakePaymentResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentCanMakePaymentResult> {
    public override fun getValue() = PaymentCanMakePaymentResult(pointer.getPointer(0))

    public fun setValue(value: PaymentCanMakePaymentResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentCanMakePaymentResult, MemoryAddress> {
    public val IPaymentCanMakePaymentResultFactory_Instance: IPaymentCanMakePaymentResultFactory by
        lazy {
      createIPaymentCanMakePaymentResultFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentCanMakePaymentResultFactory(): IPaymentCanMakePaymentResultFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentCanMakePaymentResult".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentCanMakePaymentResultFactory.ABI.makeIPaymentCanMakePaymentResultFactory(factoryActivatorPtr.value))
    }

    public fun activate(value: PaymentCanMakePaymentResultStatus): JNAPointer? =
        IPaymentCanMakePaymentResultFactory_Instance.Create(value)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentCanMakePaymentResult {
      val address = segment.toRawLongValue()
      return PaymentCanMakePaymentResult(Pointer(address))
    }

    public override fun toNative(obj: PaymentCanMakePaymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
