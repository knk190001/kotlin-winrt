package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IImageAutomationPeer.ABI::class)
@Signature("{1f6eb184-8765-5455-bd1d-93c251c17f9b}")
@Guid("1f6eb18487655455bd1d93c251c17f9b")
@WinRTInterface("1f6eb18487655455bd1d93c251c17f9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageAutomationPeer.ByReference::class)
public interface IImageAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageAutomationPeer> {
    public override fun getValue() = ABI.makeIImageAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IImageAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageAutomationPeer {
    public val __106652911_Ptr: Pointer?

    public val _106652911_VtblPtr: Pointer?
      get() = __106652911_Ptr?.getPointer(0)
  }

  public class IImageAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106652911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f6eb18487655455bd1d93c251c17f9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageAutomationPeer(ptr: Pointer?): WithDefault = IImageAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIImageAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IImageAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106652911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageAutomationPeer): Array<IImageAutomationPeer?> =
        (elements as
        Array<IImageAutomationPeer?>).castToImpl<IImageAutomationPeer,IImageAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageAutomationPeer?> =
        arrayOfNulls<IImageAutomationPeer_Impl>(size) as Array<IImageAutomationPeer?>
  }
}
