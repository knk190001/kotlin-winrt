package Windows.ApplicationModel.Payments.Provider

import Windows.ApplicationModel.Payments.PaymentRequestCompletionStatus
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentTransactionAcceptResult.ABI::class)
@Signature("{060e3276-d30c-4817-95a2-df7ae9273b56}")
@Guid("060e3276d30c481795a2df7ae9273b56")
@WinRTInterface("060e3276d30c481795a2df7ae9273b56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentTransactionAcceptResult.ByReference::class)
public interface IPaymentTransactionAcceptResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PaymentRequestCompletionStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentTransactionAcceptResult> {
    public override fun getValue() = ABI.makeIPaymentTransactionAcceptResult(pointer.getPointer(0))

    public fun setValue(value: IPaymentTransactionAcceptResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentTransactionAcceptResult {
    public val __139902430_Ptr: Pointer?

    public val _139902430_VtblPtr: Pointer?
      get() = __139902430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PaymentRequestCompletionStatus? {
      val fnPtr = _139902430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequestCompletionStatus>()
      val hr = fn.invokeHR(arrayOf(__139902430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequestCompletionStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentTransactionAcceptResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139902430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentTransactionAcceptResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("060e3276d30c481795a2df7ae9273b56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentTransactionAcceptResult(ptr: Pointer?): WithDefault =
        IPaymentTransactionAcceptResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentTransactionAcceptResult {
      val address = segment.toRawLongValue()
      return makeIPaymentTransactionAcceptResult(Pointer(address))
    }

    public override fun toNative(obj: IPaymentTransactionAcceptResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139902430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentTransactionAcceptResult):
        Array<IPaymentTransactionAcceptResult?> = (elements as
        Array<IPaymentTransactionAcceptResult?>).castToImpl<IPaymentTransactionAcceptResult,IPaymentTransactionAcceptResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentTransactionAcceptResult?> =
        arrayOfNulls<IPaymentTransactionAcceptResult_Impl>(size) as
        Array<IPaymentTransactionAcceptResult?>
  }
}
