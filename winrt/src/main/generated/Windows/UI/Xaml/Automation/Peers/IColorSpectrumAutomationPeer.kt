package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IColorSpectrumAutomationPeer.ABI::class)
@Signature("{15d5ba03-010d-4ff7-9087-f4dd09f831b7}")
@Guid("15d5ba03010d4ff79087f4dd09f831b7")
@WinRTInterface("15d5ba03010d4ff79087f4dd09f831b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorSpectrumAutomationPeer.ByReference::class)
public interface IColorSpectrumAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorSpectrumAutomationPeer> {
    public override fun getValue() = ABI.makeIColorSpectrumAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IColorSpectrumAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorSpectrumAutomationPeer {
    public val __2077408981_Ptr: Pointer?

    public val _2077408981_VtblPtr: Pointer?
      get() = __2077408981_Ptr?.getPointer(0)
  }

  public class IColorSpectrumAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2077408981_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrumAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15d5ba03010d4ff79087f4dd09f831b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrumAutomationPeer(ptr: Pointer?): WithDefault =
        IColorSpectrumAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrumAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIColorSpectrumAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrumAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2077408981_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorSpectrumAutomationPeer):
        Array<IColorSpectrumAutomationPeer?> = (elements as
        Array<IColorSpectrumAutomationPeer?>).castToImpl<IColorSpectrumAutomationPeer,IColorSpectrumAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorSpectrumAutomationPeer?> =
        arrayOfNulls<IColorSpectrumAutomationPeer_Impl>(size) as
        Array<IColorSpectrumAutomationPeer?>
  }
}
