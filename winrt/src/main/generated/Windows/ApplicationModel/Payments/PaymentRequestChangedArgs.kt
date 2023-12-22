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

@ABIMarker(PaymentRequestChangedArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentRequestChangedArgs;{c6145e44-cd8b-4be4-b555-27c99194c0c5})")
@WinRTByReference(brClass = PaymentRequestChangedArgs.ByReference::class)
public class PaymentRequestChangedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentRequestChangedArgs.WithDefault, IWinRTObject {
  private val __2142726966_Interface: IPaymentRequestChangedArgs.WithDefault by lazy {
    as_2142726966()
  }


  public override val __2142726966_Ptr: JNAPointer? by lazy {
    __2142726966_Interface.__2142726966_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2142726966_Interface)

  private fun as_2142726966(): IPaymentRequestChangedArgs.WithDefault {
    if(pointer == NULL) {
      return(IPaymentRequestChangedArgs.ABI.makeIPaymentRequestChangedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentRequestChangedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentRequestChangedArgs.ABI.makeIPaymentRequestChangedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentRequestChangedArgs> {
    public override fun getValue() = PaymentRequestChangedArgs(pointer.getPointer(0))

    public fun setValue(value: PaymentRequestChangedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentRequestChangedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PaymentRequestChangedArgs {
      val address = segment.toRawLongValue()
      return PaymentRequestChangedArgs(Pointer(address))
    }

    public override fun toNative(obj: PaymentRequestChangedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
