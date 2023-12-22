package Windows.ApplicationModel.Payments

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

@ABIMarker(IPaymentRequestSubmitResult.ABI::class)
@Signature("{7b9c3912-30f2-4e90-b249-8ce7d78ffe56}")
@Guid("7b9c391230f24e90b2498ce7d78ffe56")
@WinRTInterface("7b9c391230f24e90b2498ce7d78ffe56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequestSubmitResult.ByReference::class)
public interface IPaymentRequestSubmitResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PaymentRequestStatus?

  @InterfaceMethod(1)
  public fun get_Response(): PaymentResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequestSubmitResult> {
    public override fun getValue() = ABI.makeIPaymentRequestSubmitResult(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequestSubmitResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequestSubmitResult {
    public val __1367935632_Ptr: Pointer?

    public val _1367935632_VtblPtr: Pointer?
      get() = __1367935632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PaymentRequestStatus? {
      val fnPtr = _1367935632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequestStatus>()
      val hr = fn.invokeHR(arrayOf(__1367935632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequestStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Response(): PaymentResponse? {
      val fnPtr = _1367935632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentResponse>()
      val hr = fn.invokeHR(arrayOf(__1367935632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentResponse>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequestSubmitResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1367935632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequestSubmitResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b9c391230f24e90b2498ce7d78ffe56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequestSubmitResult(ptr: Pointer?): WithDefault =
        IPaymentRequestSubmitResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequestSubmitResult {
      val address = segment.toRawLongValue()
      return makeIPaymentRequestSubmitResult(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequestSubmitResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1367935632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequestSubmitResult):
        Array<IPaymentRequestSubmitResult?> = (elements as
        Array<IPaymentRequestSubmitResult?>).castToImpl<IPaymentRequestSubmitResult,IPaymentRequestSubmitResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequestSubmitResult?> =
        arrayOfNulls<IPaymentRequestSubmitResult_Impl>(size) as Array<IPaymentRequestSubmitResult?>
  }
}
