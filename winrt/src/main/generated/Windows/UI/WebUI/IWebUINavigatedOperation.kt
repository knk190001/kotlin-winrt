package Windows.UI.WebUI

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

@ABIMarker(IWebUINavigatedOperation.ABI::class)
@Signature("{7a965f08-8182-4a89-ab67-8492e8750d4b}")
@Guid("7a965f0881824a89ab678492e8750d4b")
@WinRTInterface("7a965f0881824a89ab678492e8750d4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUINavigatedOperation.ByReference::class)
public interface IWebUINavigatedOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): WebUINavigatedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUINavigatedOperation> {
    public override fun getValue() = ABI.makeIWebUINavigatedOperation(pointer.getPointer(0))

    public fun setValue(value: IWebUINavigatedOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUINavigatedOperation {
    public val __5710036_Ptr: Pointer?

    public val _5710036_VtblPtr: Pointer?
      get() = __5710036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): WebUINavigatedDeferral? {
      val fnPtr = _5710036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUINavigatedDeferral>()
      val hr = fn.invokeHR(arrayOf(__5710036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUINavigatedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IWebUINavigatedOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __5710036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUINavigatedOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a965f0881824a89ab678492e8750d4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUINavigatedOperation(ptr: Pointer?): WithDefault =
        IWebUINavigatedOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUINavigatedOperation {
      val address = segment.toRawLongValue()
      return makeIWebUINavigatedOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebUINavigatedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__5710036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUINavigatedOperation):
        Array<IWebUINavigatedOperation?> = (elements as
        Array<IWebUINavigatedOperation?>).castToImpl<IWebUINavigatedOperation,IWebUINavigatedOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUINavigatedOperation?> =
        arrayOfNulls<IWebUINavigatedOperation_Impl>(size) as Array<IWebUINavigatedOperation?>
  }
}
