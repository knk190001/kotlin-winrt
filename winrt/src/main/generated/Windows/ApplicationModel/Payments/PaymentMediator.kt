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

@ABIMarker(PaymentMediator.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentMediator;{fb0ee829-ec0c-449a-83da-7ae3073365a2})")
@WinRTByReference(brClass = PaymentMediator.ByReference::class)
public class PaymentMediator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentMediator.WithDefault, IPaymentMediator2.WithDefault, IWinRTObject {
  private val __2112268167_Interface: IPaymentMediator.WithDefault by lazy {
    as_2112268167()
  }


  private val __1055803787_Interface: IPaymentMediator2.WithDefault by lazy {
    as_1055803787()
  }


  public override val __2112268167_Ptr: JNAPointer? by lazy {
    __2112268167_Interface.__2112268167_Ptr
  }


  public override val __1055803787_Ptr: JNAPointer? by lazy {
    __1055803787_Interface.__1055803787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2112268167_Interface, __1055803787_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2112268167(): IPaymentMediator.WithDefault {
    if(pointer == NULL) {
      return(IPaymentMediator.ABI.makeIPaymentMediator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentMediator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentMediator.ABI.makeIPaymentMediator(ref.value))
  }

  private fun as_1055803787(): IPaymentMediator2.WithDefault {
    if(pointer == NULL) {
      return(IPaymentMediator2.ABI.makeIPaymentMediator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentMediator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentMediator2.ABI.makeIPaymentMediator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentMediator> {
    public override fun getValue() = PaymentMediator(pointer.getPointer(0))

    public fun setValue(value: PaymentMediator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentMediator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentMediator".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PaymentMediator {
      val address = segment.toRawLongValue()
      return PaymentMediator(Pointer(address))
    }

    public override fun toNative(obj: PaymentMediator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
