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

@ABIMarker(IPaymentCanMakePaymentResult.ABI::class)
@Signature("{7696fe55-d5d3-4d3d-b345-45591759c510}")
@Guid("7696fe55d5d34d3db34545591759c510")
@WinRTInterface("7696fe55d5d34d3db34545591759c510")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentCanMakePaymentResult.ByReference::class)
public interface IPaymentCanMakePaymentResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PaymentCanMakePaymentResultStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentCanMakePaymentResult> {
    public override fun getValue() = ABI.makeIPaymentCanMakePaymentResult(pointer.getPointer(0))

    public fun setValue(value: IPaymentCanMakePaymentResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentCanMakePaymentResult {
    public val __32787687_Ptr: Pointer?

    public val _32787687_VtblPtr: Pointer?
      get() = __32787687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PaymentCanMakePaymentResultStatus? {
      val fnPtr = _32787687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentCanMakePaymentResultStatus>()
      val hr = fn.invokeHR(arrayOf(__32787687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentCanMakePaymentResultStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentCanMakePaymentResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __32787687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentCanMakePaymentResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7696fe55d5d34d3db34545591759c510")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentCanMakePaymentResult(ptr: Pointer?): WithDefault =
        IPaymentCanMakePaymentResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentCanMakePaymentResult {
      val address = segment.toRawLongValue()
      return makeIPaymentCanMakePaymentResult(Pointer(address))
    }

    public override fun toNative(obj: IPaymentCanMakePaymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__32787687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentCanMakePaymentResult):
        Array<IPaymentCanMakePaymentResult?> = (elements as
        Array<IPaymentCanMakePaymentResult?>).castToImpl<IPaymentCanMakePaymentResult,IPaymentCanMakePaymentResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentCanMakePaymentResult?> =
        arrayOfNulls<IPaymentCanMakePaymentResult_Impl>(size) as
        Array<IPaymentCanMakePaymentResult?>
  }
}
