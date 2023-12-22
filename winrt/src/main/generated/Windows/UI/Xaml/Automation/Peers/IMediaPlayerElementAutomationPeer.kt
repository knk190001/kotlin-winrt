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

@ABIMarker(IMediaPlayerElementAutomationPeer.ABI::class)
@Signature("{02bed209-3f65-4fdd-b5ca-c4750d4e6ea4}")
@Guid("02bed2093f654fddb5cac4750d4e6ea4")
@WinRTInterface("02bed2093f654fddb5cac4750d4e6ea4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerElementAutomationPeer.ByReference::class)
public interface IMediaPlayerElementAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerElementAutomationPeer> {
    public override fun getValue() =
        ABI.makeIMediaPlayerElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerElementAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerElementAutomationPeer {
    public val __7338744_Ptr: Pointer?

    public val _7338744_VtblPtr: Pointer?
      get() = __7338744_Ptr?.getPointer(0)
  }

  public class IMediaPlayerElementAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7338744_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerElementAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02bed2093f654fddb5cac4750d4e6ea4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerElementAutomationPeer(ptr: Pointer?): WithDefault =
        IMediaPlayerElementAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerElementAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7338744_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerElementAutomationPeer):
        Array<IMediaPlayerElementAutomationPeer?> = (elements as
        Array<IMediaPlayerElementAutomationPeer?>).castToImpl<IMediaPlayerElementAutomationPeer,IMediaPlayerElementAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerElementAutomationPeer?> =
        arrayOfNulls<IMediaPlayerElementAutomationPeer_Impl>(size) as
        Array<IMediaPlayerElementAutomationPeer?>
  }
}
