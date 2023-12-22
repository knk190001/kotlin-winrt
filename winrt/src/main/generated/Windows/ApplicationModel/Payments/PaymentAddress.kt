package Windows.ApplicationModel.Payments

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PaymentAddress.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentAddress;{5f2264e9-6f3a-4166-a018-0a0b06bb32b5})")
@WinRTByReference(brClass = PaymentAddress.ByReference::class)
public class PaymentAddress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentAddress.WithDefault, IWinRTObject {
  private val __2136090848_Interface: IPaymentAddress.WithDefault by lazy {
    as_2136090848()
  }


  public override val __2136090848_Ptr: JNAPointer? by lazy {
    __2136090848_Interface.__2136090848_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2136090848_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2136090848(): IPaymentAddress.WithDefault {
    if(pointer == NULL) {
      return(IPaymentAddress.ABI.makeIPaymentAddress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentAddress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentAddress.ABI.makeIPaymentAddress(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentAddress>
      {
    public override fun getValue() = PaymentAddress(pointer.getPointer(0))

    public fun setValue(value: PaymentAddress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentAddress, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentAddress".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PaymentAddress {
      val address = segment.toRawLongValue()
      return PaymentAddress(Pointer(address))
    }

    public override fun toNative(obj: PaymentAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
