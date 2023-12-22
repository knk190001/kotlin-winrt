package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.ItemsChangedEventArgs
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IVirtualizingPanelOverrides.ABI::class)
@Signature("{3ffe2108-0382-50c8-b295-21bd8bee04d7}")
@Guid("3ffe2108038250c8b29521bd8bee04d7")
@WinRTInterface("3ffe2108038250c8b29521bd8bee04d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingPanelOverrides.ByReference::class)
public interface IVirtualizingPanelOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnItemsChanged(sender: IUnknown?, args: ItemsChangedEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnClearChildren(): Unit

  @InterfaceMethod(2)
  public fun BringIndexIntoView(index: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingPanelOverrides> {
    public override fun getValue() = ABI.makeIVirtualizingPanelOverrides(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingPanelOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingPanelOverrides {
    public val __457339376_Ptr: Pointer?

    public val _457339376_VtblPtr: Pointer?
      get() = __457339376_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnItemsChanged(sender: IUnknown?, args: ItemsChangedEventArgs?): Unit {
      val fnPtr = _457339376_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__457339376_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnClearChildren(): Unit {
      val fnPtr = _457339376_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__457339376_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun BringIndexIntoView(index: Int): Unit {
      val fnPtr = _457339376_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__457339376_Ptr, index,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingPanelOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __457339376_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingPanelOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ffe2108038250c8b29521bd8bee04d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingPanelOverrides(ptr: Pointer?): WithDefault =
        IVirtualizingPanelOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingPanelOverrides {
      val address = segment.toRawLongValue()
      return makeIVirtualizingPanelOverrides(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingPanelOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__457339376_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingPanelOverrides):
        Array<IVirtualizingPanelOverrides?> = (elements as
        Array<IVirtualizingPanelOverrides?>).castToImpl<IVirtualizingPanelOverrides,IVirtualizingPanelOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingPanelOverrides?> =
        arrayOfNulls<IVirtualizingPanelOverrides_Impl>(size) as Array<IVirtualizingPanelOverrides?>
  }
}
