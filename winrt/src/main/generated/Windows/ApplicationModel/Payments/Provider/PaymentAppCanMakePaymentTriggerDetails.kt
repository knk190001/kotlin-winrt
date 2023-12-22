package Windows.ApplicationModel.Payments.Provider

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

@ABIMarker(PaymentAppCanMakePaymentTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.Provider.PaymentAppCanMakePaymentTriggerDetails;{0ce201f0-8b93-4eb6-8c46-2e4a6c6a26f6})")
@WinRTByReference(brClass = PaymentAppCanMakePaymentTriggerDetails.ByReference::class)
public class PaymentAppCanMakePaymentTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentAppCanMakePaymentTriggerDetails.WithDefault, IWinRTObject {
  private val __908570158_Interface: IPaymentAppCanMakePaymentTriggerDetails.WithDefault by lazy {
    as_908570158()
  }


  public override val __908570158_Ptr: JNAPointer? by lazy {
    __908570158_Interface.__908570158_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__908570158_Interface)

  private fun as_908570158(): IPaymentAppCanMakePaymentTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPaymentAppCanMakePaymentTriggerDetails.ABI.makeIPaymentAppCanMakePaymentTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentAppCanMakePaymentTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentAppCanMakePaymentTriggerDetails.ABI.makeIPaymentAppCanMakePaymentTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentAppCanMakePaymentTriggerDetails> {
    public override fun getValue() = PaymentAppCanMakePaymentTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PaymentAppCanMakePaymentTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentAppCanMakePaymentTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PaymentAppCanMakePaymentTriggerDetails {
      val address = segment.toRawLongValue()
      return PaymentAppCanMakePaymentTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PaymentAppCanMakePaymentTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
