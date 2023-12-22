package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGridView.ABI::class)
@Signature("{026ae934-b67e-4d80-8f72-8aa64b4d827b}")
@Guid("026ae934b67e4d808f728aa64b4d827b")
@WinRTInterface("026ae934b67e4d808f728aa64b4d827b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridView.ByReference::class)
public interface IGridView : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridView> {
    public override fun getValue() = ABI.makeIGridView(pointer.getPointer(0))

    public fun setValue(value: IGridView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridView {
    public val __170612953_Ptr: Pointer?

    public val _170612953_VtblPtr: Pointer?
      get() = __170612953_Ptr?.getPointer(0)
  }

  public class IGridView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170612953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("026ae934b67e4d808f728aa64b4d827b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridView(ptr: Pointer?): WithDefault = IGridView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridView {
      val address = segment.toRawLongValue()
      return makeIGridView(Pointer(address))
    }

    public override fun toNative(obj: IGridView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170612953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridView): Array<IGridView?> = (elements as
        Array<IGridView?>).castToImpl<IGridView,IGridView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridView?> = arrayOfNulls<IGridView_Impl>(size)
        as Array<IGridView?>
  }
}
