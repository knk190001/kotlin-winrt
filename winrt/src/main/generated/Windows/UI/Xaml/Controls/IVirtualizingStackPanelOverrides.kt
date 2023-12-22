package Windows.UI.Xaml.Controls

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

@ABIMarker(IVirtualizingStackPanelOverrides.ABI::class)
@Signature("{cbe6f72c-2892-46d1-987f-58ca1081f040}")
@Guid("cbe6f72c289246d1987f58ca1081f040")
@WinRTInterface("cbe6f72c289246d1987f58ca1081f040")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingStackPanelOverrides.ByReference::class)
public interface IVirtualizingStackPanelOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnCleanUpVirtualizedItem(e: CleanUpVirtualizedItemEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingStackPanelOverrides> {
    public override fun getValue() = ABI.makeIVirtualizingStackPanelOverrides(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingStackPanelOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingStackPanelOverrides {
    public val __708131529_Ptr: Pointer?

    public val _708131529_VtblPtr: Pointer?
      get() = __708131529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnCleanUpVirtualizedItem(e: CleanUpVirtualizedItemEventArgs?): Unit {
      val fnPtr = _708131529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__708131529_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingStackPanelOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708131529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingStackPanelOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbe6f72c289246d1987f58ca1081f040")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingStackPanelOverrides(ptr: Pointer?): WithDefault =
        IVirtualizingStackPanelOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingStackPanelOverrides {
      val address = segment.toRawLongValue()
      return makeIVirtualizingStackPanelOverrides(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingStackPanelOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708131529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingStackPanelOverrides):
        Array<IVirtualizingStackPanelOverrides?> = (elements as
        Array<IVirtualizingStackPanelOverrides?>).castToImpl<IVirtualizingStackPanelOverrides,IVirtualizingStackPanelOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingStackPanelOverrides?> =
        arrayOfNulls<IVirtualizingStackPanelOverrides_Impl>(size) as
        Array<IVirtualizingStackPanelOverrides?>
  }
}
