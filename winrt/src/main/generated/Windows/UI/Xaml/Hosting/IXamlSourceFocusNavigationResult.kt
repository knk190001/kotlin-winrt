package Windows.UI.Xaml.Hosting

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

@ABIMarker(IXamlSourceFocusNavigationResult.ABI::class)
@Signature("{88d55a5f-9603-5d8f-9cc7-d1c4070d9801}")
@Guid("88d55a5f96035d8f9cc7d1c4070d9801")
@WinRTInterface("88d55a5f96035d8f9cc7d1c4070d9801")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlSourceFocusNavigationResult.ByReference::class)
public interface IXamlSourceFocusNavigationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WasFocusMoved(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlSourceFocusNavigationResult> {
    public override fun getValue() = ABI.makeIXamlSourceFocusNavigationResult(pointer.getPointer(0))

    public fun setValue(value: IXamlSourceFocusNavigationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlSourceFocusNavigationResult {
    public val __233671392_Ptr: Pointer?

    public val _233671392_VtblPtr: Pointer?
      get() = __233671392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WasFocusMoved(): Boolean {
      val fnPtr = _233671392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__233671392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IXamlSourceFocusNavigationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __233671392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlSourceFocusNavigationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88d55a5f96035d8f9cc7d1c4070d9801")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlSourceFocusNavigationResult(ptr: Pointer?): WithDefault =
        IXamlSourceFocusNavigationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlSourceFocusNavigationResult {
      val address = segment.toRawLongValue()
      return makeIXamlSourceFocusNavigationResult(Pointer(address))
    }

    public override fun toNative(obj: IXamlSourceFocusNavigationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__233671392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlSourceFocusNavigationResult):
        Array<IXamlSourceFocusNavigationResult?> = (elements as
        Array<IXamlSourceFocusNavigationResult?>).castToImpl<IXamlSourceFocusNavigationResult,IXamlSourceFocusNavigationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlSourceFocusNavigationResult?> =
        arrayOfNulls<IXamlSourceFocusNavigationResult_Impl>(size) as
        Array<IXamlSourceFocusNavigationResult?>
  }
}
