package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISwapChainBackgroundPanel.ABI::class)
@Signature("{095a213f-ffea-55ff-b875-e698254ba6df}")
@Guid("095a213fffea55ffb875e698254ba6df")
@WinRTInterface("095a213fffea55ffb875e698254ba6df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainBackgroundPanel.ByReference::class)
public interface ISwapChainBackgroundPanel : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainBackgroundPanel> {
    public override fun getValue() = ABI.makeISwapChainBackgroundPanel(pointer.getPointer(0))

    public fun setValue(value: ISwapChainBackgroundPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainBackgroundPanel {
    public val __888955025_Ptr: Pointer?

    public val _888955025_VtblPtr: Pointer?
      get() = __888955025_Ptr?.getPointer(0)
  }

  public class ISwapChainBackgroundPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __888955025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainBackgroundPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("095a213fffea55ffb875e698254ba6df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainBackgroundPanel(ptr: Pointer?): WithDefault =
        ISwapChainBackgroundPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainBackgroundPanel {
      val address = segment.toRawLongValue()
      return makeISwapChainBackgroundPanel(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainBackgroundPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__888955025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainBackgroundPanel):
        Array<ISwapChainBackgroundPanel?> = (elements as
        Array<ISwapChainBackgroundPanel?>).castToImpl<ISwapChainBackgroundPanel,ISwapChainBackgroundPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainBackgroundPanel?> =
        arrayOfNulls<ISwapChainBackgroundPanel_Impl>(size) as Array<ISwapChainBackgroundPanel?>
  }
}
