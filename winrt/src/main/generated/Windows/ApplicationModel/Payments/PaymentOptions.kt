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

@ABIMarker(PaymentOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentOptions;{aaa30854-1f2b-4365-8251-01b58915a5bc})")
@WinRTByReference(brClass = PaymentOptions.ByReference::class)
public class PaymentOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentOptions.WithDefault, IWinRTObject {
  private val __2034307978_Interface: IPaymentOptions.WithDefault by lazy {
    as_2034307978()
  }


  public override val __2034307978_Ptr: JNAPointer? by lazy {
    __2034307978_Interface.__2034307978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2034307978_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2034307978(): IPaymentOptions.WithDefault {
    if(pointer == NULL) {
      return(IPaymentOptions.ABI.makeIPaymentOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentOptions.ABI.makeIPaymentOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentOptions>
      {
    public override fun getValue() = PaymentOptions(pointer.getPointer(0))

    public fun setValue(value: PaymentOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PaymentOptions {
      val address = segment.toRawLongValue()
      return PaymentOptions(Pointer(address))
    }

    public override fun toNative(obj: PaymentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
