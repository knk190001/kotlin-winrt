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

@ABIMarker(IMediaElementAutomationPeer.ABI::class)
@Signature("{ba0b9fc2-a6e2-41a5-b17a-d1594613efba}")
@Guid("ba0b9fc2a6e241a5b17ad1594613efba")
@WinRTInterface("ba0b9fc2a6e241a5b17ad1594613efba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaElementAutomationPeer.ByReference::class)
public interface IMediaElementAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaElementAutomationPeer> {
    public override fun getValue() = ABI.makeIMediaElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMediaElementAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaElementAutomationPeer {
    public val __1664434281_Ptr: Pointer?

    public val _1664434281_VtblPtr: Pointer?
      get() = __1664434281_Ptr?.getPointer(0)
  }

  public class IMediaElementAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1664434281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaElementAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba0b9fc2a6e241a5b17ad1594613efba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaElementAutomationPeer(ptr: Pointer?): WithDefault =
        IMediaElementAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaElementAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMediaElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMediaElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1664434281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaElementAutomationPeer):
        Array<IMediaElementAutomationPeer?> = (elements as
        Array<IMediaElementAutomationPeer?>).castToImpl<IMediaElementAutomationPeer,IMediaElementAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaElementAutomationPeer?> =
        arrayOfNulls<IMediaElementAutomationPeer_Impl>(size) as Array<IMediaElementAutomationPeer?>
  }
}
