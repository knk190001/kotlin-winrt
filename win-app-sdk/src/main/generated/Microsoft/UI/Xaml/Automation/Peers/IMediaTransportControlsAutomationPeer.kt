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

@ABIMarker(IMediaTransportControlsAutomationPeer.ABI::class)
@Signature("{da850d4e-8715-5ae7-81a9-abd10d17c1ed}")
@Guid("da850d4e87155ae781a9abd10d17c1ed")
@WinRTInterface("da850d4e87155ae781a9abd10d17c1ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsAutomationPeer.ByReference::class)
public interface IMediaTransportControlsAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsAutomationPeer> {
    public override fun getValue() =
        ABI.makeIMediaTransportControlsAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsAutomationPeer {
    public val __147961175_Ptr: Pointer?

    public val _147961175_VtblPtr: Pointer?
      get() = __147961175_Ptr?.getPointer(0)
  }

  public class IMediaTransportControlsAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __147961175_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da850d4e87155ae781a9abd10d17c1ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsAutomationPeer(ptr: Pointer?): WithDefault =
        IMediaTransportControlsAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControlsAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__147961175_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsAutomationPeer):
        Array<IMediaTransportControlsAutomationPeer?> = (elements as
        Array<IMediaTransportControlsAutomationPeer?>).castToImpl<IMediaTransportControlsAutomationPeer,IMediaTransportControlsAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsAutomationPeer?> =
        arrayOfNulls<IMediaTransportControlsAutomationPeer_Impl>(size) as
        Array<IMediaTransportControlsAutomationPeer?>
  }
}
