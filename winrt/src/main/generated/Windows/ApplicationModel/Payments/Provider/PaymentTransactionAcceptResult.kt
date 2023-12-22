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

@ABIMarker(PaymentTransactionAcceptResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.Provider.PaymentTransactionAcceptResult;{060e3276-d30c-4817-95a2-df7ae9273b56})")
@WinRTByReference(brClass = PaymentTransactionAcceptResult.ByReference::class)
public class PaymentTransactionAcceptResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentTransactionAcceptResult.WithDefault, IWinRTObject {
  private val __139902430_Interface: IPaymentTransactionAcceptResult.WithDefault by lazy {
    as_139902430()
  }


  public override val __139902430_Ptr: JNAPointer? by lazy {
    __139902430_Interface.__139902430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__139902430_Interface)

  private fun as_139902430(): IPaymentTransactionAcceptResult.WithDefault {
    if(pointer == NULL) {
      return(IPaymentTransactionAcceptResult.ABI.makeIPaymentTransactionAcceptResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentTransactionAcceptResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentTransactionAcceptResult.ABI.makeIPaymentTransactionAcceptResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentTransactionAcceptResult> {
    public override fun getValue() = PaymentTransactionAcceptResult(pointer.getPointer(0))

    public fun setValue(value: PaymentTransactionAcceptResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentTransactionAcceptResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PaymentTransactionAcceptResult {
      val address = segment.toRawLongValue()
      return PaymentTransactionAcceptResult(Pointer(address))
    }

    public override fun toNative(obj: PaymentTransactionAcceptResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
