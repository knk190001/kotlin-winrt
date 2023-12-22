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

@ABIMarker(ILoopingSelectorPanel.ABI::class)
@Signature("{40a9ba70-1011-4778-87f7-6bfd20d6377d}")
@Guid("40a9ba701011477887f76bfd20d6377d")
@WinRTInterface("40a9ba701011477887f76bfd20d6377d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorPanel.ByReference::class)
public interface ILoopingSelectorPanel : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorPanel> {
    public override fun getValue() = ABI.makeILoopingSelectorPanel(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorPanel {
    public val __701008861_Ptr: Pointer?

    public val _701008861_VtblPtr: Pointer?
      get() = __701008861_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __701008861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40a9ba701011477887f76bfd20d6377d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorPanel(ptr: Pointer?): WithDefault =
        ILoopingSelectorPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorPanel {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorPanel(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__701008861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorPanel): Array<ILoopingSelectorPanel?> =
        (elements as
        Array<ILoopingSelectorPanel?>).castToImpl<ILoopingSelectorPanel,ILoopingSelectorPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorPanel?> =
        arrayOfNulls<ILoopingSelectorPanel_Impl>(size) as Array<ILoopingSelectorPanel?>
  }
}
