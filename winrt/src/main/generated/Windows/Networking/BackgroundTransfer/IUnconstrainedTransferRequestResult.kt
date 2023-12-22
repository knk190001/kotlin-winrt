package Windows.Networking.BackgroundTransfer

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUnconstrainedTransferRequestResult.ABI::class)
@Signature("{4c24b81f-d944-4112-a98e-6a69522b7ebb}")
@Guid("4c24b81fd9444112a98e6a69522b7ebb")
@WinRTInterface("4c24b81fd9444112a98e6a69522b7ebb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnconstrainedTransferRequestResult.ByReference::class)
public interface IUnconstrainedTransferRequestResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsUnconstrained(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnconstrainedTransferRequestResult> {
    public override fun getValue() =
        ABI.makeIUnconstrainedTransferRequestResult(pointer.getPointer(0))

    public fun setValue(value: IUnconstrainedTransferRequestResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnconstrainedTransferRequestResult {
    public val __1262870597_Ptr: Pointer?

    public val _1262870597_VtblPtr: Pointer?
      get() = __1262870597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsUnconstrained(): Boolean {
      val fnPtr = _1262870597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1262870597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUnconstrainedTransferRequestResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1262870597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnconstrainedTransferRequestResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c24b81fd9444112a98e6a69522b7ebb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnconstrainedTransferRequestResult(ptr: Pointer?): WithDefault =
        IUnconstrainedTransferRequestResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnconstrainedTransferRequestResult {
      val address = segment.toRawLongValue()
      return makeIUnconstrainedTransferRequestResult(Pointer(address))
    }

    public override fun toNative(obj: IUnconstrainedTransferRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1262870597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnconstrainedTransferRequestResult):
        Array<IUnconstrainedTransferRequestResult?> = (elements as
        Array<IUnconstrainedTransferRequestResult?>).castToImpl<IUnconstrainedTransferRequestResult,IUnconstrainedTransferRequestResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnconstrainedTransferRequestResult?> =
        arrayOfNulls<IUnconstrainedTransferRequestResult_Impl>(size) as
        Array<IUnconstrainedTransferRequestResult?>
  }
}
