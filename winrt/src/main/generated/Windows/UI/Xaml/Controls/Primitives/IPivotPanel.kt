package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPivotPanel.ABI::class)
@Signature("{ad4ebe80-22a9-4ca3-9212-2773b6359ff3}")
@Guid("ad4ebe8022a94ca392122773b6359ff3")
@WinRTInterface("ad4ebe8022a94ca392122773b6359ff3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotPanel.ByReference::class)
public interface IPivotPanel : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivotPanel> {
    public override fun getValue() = ABI.makeIPivotPanel(pointer.getPointer(0))

    public fun setValue(value: IPivotPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotPanel {
    public val __1588825790_Ptr: Pointer?

    public val _1588825790_VtblPtr: Pointer?
      get() = __1588825790_Ptr?.getPointer(0)
  }

  public class IPivotPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1588825790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad4ebe8022a94ca392122773b6359ff3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotPanel(ptr: Pointer?): WithDefault = IPivotPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotPanel {
      val address = segment.toRawLongValue()
      return makeIPivotPanel(Pointer(address))
    }

    public override fun toNative(obj: IPivotPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1588825790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotPanel): Array<IPivotPanel?> = (elements as
        Array<IPivotPanel?>).castToImpl<IPivotPanel,IPivotPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotPanel?> =
        arrayOfNulls<IPivotPanel_Impl>(size) as Array<IPivotPanel?>
  }
}
