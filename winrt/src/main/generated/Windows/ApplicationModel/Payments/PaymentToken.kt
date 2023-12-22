package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentTokenFactory.ABI.IID
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

@ABIMarker(PaymentToken.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentToken;{bbcac013-ccd0-41f2-b2a1-0a2e4b5dce25})")
@WinRTByReference(brClass = PaymentToken.ByReference::class)
public class PaymentToken(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentToken.WithDefault, IWinRTObject {
  private val __1423470107_Interface: IPaymentToken.WithDefault by lazy {
    as_1423470107()
  }


  public override val __1423470107_Ptr: JNAPointer? by lazy {
    __1423470107_Interface.__1423470107_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1423470107_Interface)

  public constructor(paymentMethodId: String) : this(ABI.activate(paymentMethodId))

  public constructor(paymentMethodId: String, jsonDetails: String) :
      this(ABI.activate(paymentMethodId, jsonDetails))

  private fun as_1423470107(): IPaymentToken.WithDefault {
    if(pointer == NULL) {
      return(IPaymentToken.ABI.makeIPaymentToken(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentToken>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentToken.ABI.makeIPaymentToken(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentToken> {
    public override fun getValue() = PaymentToken(pointer.getPointer(0))

    public fun setValue(value: PaymentToken): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentToken, MemoryAddress> {
    public val IPaymentTokenFactory_Instance: IPaymentTokenFactory by lazy {
      createIPaymentTokenFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentTokenFactory(): IPaymentTokenFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentToken".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentTokenFactory.ABI.makeIPaymentTokenFactory(factoryActivatorPtr.value))
    }

    public fun activate(paymentMethodId: String): JNAPointer? =
        IPaymentTokenFactory_Instance.Create(paymentMethodId)?.pointer

    public fun activate(paymentMethodId: String, jsonDetails: String): JNAPointer? =
        IPaymentTokenFactory_Instance.CreateWithJsonDetails(paymentMethodId, jsonDetails)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentToken {
      val address = segment.toRawLongValue()
      return PaymentToken(Pointer(address))
    }

    public override fun toNative(obj: PaymentToken): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
