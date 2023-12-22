package Windows.ApplicationModel.Payments

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

@ABIMarker(PaymentResponse.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentResponse;{e1389457-8bd2-4888-9fa8-97985545108e})")
@WinRTByReference(brClass = PaymentResponse.ByReference::class)
public class PaymentResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentResponse.WithDefault, IWinRTObject {
  private val __1622268715_Interface: IPaymentResponse.WithDefault by lazy {
    as_1622268715()
  }


  public override val __1622268715_Ptr: JNAPointer? by lazy {
    __1622268715_Interface.__1622268715_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1622268715_Interface)

  private fun as_1622268715(): IPaymentResponse.WithDefault {
    if(pointer == NULL) {
      return(IPaymentResponse.ABI.makeIPaymentResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentResponse.ABI.makeIPaymentResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentResponse> {
    public override fun getValue() = PaymentResponse(pointer.getPointer(0))

    public fun setValue(value: PaymentResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentResponse, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PaymentResponse {
      val address = segment.toRawLongValue()
      return PaymentResponse(Pointer(address))
    }

    public override fun toNative(obj: PaymentResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
