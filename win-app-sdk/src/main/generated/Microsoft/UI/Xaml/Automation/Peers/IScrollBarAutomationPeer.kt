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

@ABIMarker(IScrollBarAutomationPeer.ABI::class)
@Signature("{028a26c4-05f7-58b2-a81e-a7ac032f756f}")
@Guid("028a26c405f758b2a81ea7ac032f756f")
@WinRTInterface("028a26c405f758b2a81ea7ac032f756f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollBarAutomationPeer.ByReference::class)
public interface IScrollBarAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollBarAutomationPeer> {
    public override fun getValue() = ABI.makeIScrollBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IScrollBarAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollBarAutomationPeer {
    public val __142365180_Ptr: Pointer?

    public val _142365180_VtblPtr: Pointer?
      get() = __142365180_Ptr?.getPointer(0)
  }

  public class IScrollBarAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142365180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollBarAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("028a26c405f758b2a81ea7ac032f756f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollBarAutomationPeer(ptr: Pointer?): WithDefault =
        IScrollBarAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollBarAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIScrollBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IScrollBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142365180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollBarAutomationPeer):
        Array<IScrollBarAutomationPeer?> = (elements as
        Array<IScrollBarAutomationPeer?>).castToImpl<IScrollBarAutomationPeer,IScrollBarAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollBarAutomationPeer?> =
        arrayOfNulls<IScrollBarAutomationPeer_Impl>(size) as Array<IScrollBarAutomationPeer?>
  }
}
