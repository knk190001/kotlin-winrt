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

@ABIMarker(ICalendarPanel.ABI::class)
@Signature("{fcd55a2d-02d3-4ee6-9a90-9df3ead00994}")
@Guid("fcd55a2d02d34ee69a909df3ead00994")
@WinRTInterface("fcd55a2d02d34ee69a909df3ead00994")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarPanel.ByReference::class)
public interface ICalendarPanel : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICalendarPanel>
      {
    public override fun getValue() = ABI.makeICalendarPanel(pointer.getPointer(0))

    public fun setValue(value: ICalendarPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarPanel {
    public val __1962094602_Ptr: Pointer?

    public val _1962094602_VtblPtr: Pointer?
      get() = __1962094602_Ptr?.getPointer(0)
  }

  public class ICalendarPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1962094602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcd55a2d02d34ee69a909df3ead00994")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarPanel(ptr: Pointer?): WithDefault = ICalendarPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarPanel {
      val address = segment.toRawLongValue()
      return makeICalendarPanel(Pointer(address))
    }

    public override fun toNative(obj: ICalendarPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1962094602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarPanel): Array<ICalendarPanel?> = (elements as
        Array<ICalendarPanel?>).castToImpl<ICalendarPanel,ICalendarPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarPanel?> =
        arrayOfNulls<ICalendarPanel_Impl>(size) as Array<ICalendarPanel?>
  }
}
