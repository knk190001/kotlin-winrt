package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.UIElement
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

@ABIMarker(IVirtualizingPanelProtected.ABI::class)
@Signature("{c9c9ab42-c232-479d-a7c9-5e7611196a45}")
@Guid("c9c9ab42c232479da7c95e7611196a45")
@WinRTInterface("c9c9ab42c232479da7c95e7611196a45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingPanelProtected.ByReference::class)
public interface IVirtualizingPanelProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddInternalChild(child: UIElement?): Unit

  @InterfaceMethod(1)
  public fun InsertInternalChild(index: Int, child: UIElement?): Unit

  @InterfaceMethod(2)
  public fun RemoveInternalChildRange(index: Int, range: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingPanelProtected> {
    public override fun getValue() = ABI.makeIVirtualizingPanelProtected(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingPanelProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingPanelProtected {
    public val __1326922156_Ptr: Pointer?

    public val _1326922156_VtblPtr: Pointer?
      get() = __1326922156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddInternalChild(child: UIElement?): Unit {
      val fnPtr = _1326922156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326922156_Ptr, marshalToNative(child),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertInternalChild(index: Int, child: UIElement?): Unit {
      val fnPtr = _1326922156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326922156_Ptr, index, marshalToNative(child),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RemoveInternalChildRange(index: Int, range: Int): Unit {
      val fnPtr = _1326922156_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326922156_Ptr, index, range,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingPanelProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1326922156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingPanelProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9c9ab42c232479da7c95e7611196a45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingPanelProtected(ptr: Pointer?): WithDefault =
        IVirtualizingPanelProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingPanelProtected {
      val address = segment.toRawLongValue()
      return makeIVirtualizingPanelProtected(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingPanelProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1326922156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingPanelProtected):
        Array<IVirtualizingPanelProtected?> = (elements as
        Array<IVirtualizingPanelProtected?>).castToImpl<IVirtualizingPanelProtected,IVirtualizingPanelProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingPanelProtected?> =
        arrayOfNulls<IVirtualizingPanelProtected_Impl>(size) as Array<IVirtualizingPanelProtected?>
  }
}
