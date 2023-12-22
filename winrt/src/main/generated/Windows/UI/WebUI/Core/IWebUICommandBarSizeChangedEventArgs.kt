package Windows.UI.WebUI.Core

import Windows.Foundation.Size
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

@ABIMarker(IWebUICommandBarSizeChangedEventArgs.ABI::class)
@Signature("{fbf1e2f6-3029-4719-8378-92f82b87af1e}")
@Guid("fbf1e2f630294719837892f82b87af1e")
@WinRTInterface("fbf1e2f630294719837892f82b87af1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarSizeChangedEventArgs.ByReference::class)
public interface IWebUICommandBarSizeChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarSizeChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebUICommandBarSizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarSizeChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarSizeChangedEventArgs {
    public val __1185595969_Ptr: Pointer?

    public val _1185595969_VtblPtr: Pointer?
      get() = __1185595969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): Size? {
      val fnPtr = _1185595969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1185595969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class IWebUICommandBarSizeChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1185595969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarSizeChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbf1e2f630294719837892f82b87af1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarSizeChangedEventArgs(ptr: Pointer?): WithDefault =
        IWebUICommandBarSizeChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarSizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarSizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarSizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1185595969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarSizeChangedEventArgs):
        Array<IWebUICommandBarSizeChangedEventArgs?> = (elements as
        Array<IWebUICommandBarSizeChangedEventArgs?>).castToImpl<IWebUICommandBarSizeChangedEventArgs,IWebUICommandBarSizeChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarSizeChangedEventArgs?> =
        arrayOfNulls<IWebUICommandBarSizeChangedEventArgs_Impl>(size) as
        Array<IWebUICommandBarSizeChangedEventArgs?>
  }
}
