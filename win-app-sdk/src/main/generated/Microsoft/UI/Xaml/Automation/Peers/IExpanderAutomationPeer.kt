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

@ABIMarker(IExpanderAutomationPeer.ABI::class)
@Signature("{f7527408-cc89-5b65-bbde-eae6d66dc3e5}")
@Guid("f7527408cc895b65bbdeeae6d66dc3e5")
@WinRTInterface("f7527408cc895b65bbdeeae6d66dc3e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpanderAutomationPeer.ByReference::class)
public interface IExpanderAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpanderAutomationPeer> {
    public override fun getValue() = ABI.makeIExpanderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IExpanderAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpanderAutomationPeer {
    public val __2004445411_Ptr: Pointer?

    public val _2004445411_VtblPtr: Pointer?
      get() = __2004445411_Ptr?.getPointer(0)
  }

  public class IExpanderAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2004445411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpanderAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7527408cc895b65bbdeeae6d66dc3e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpanderAutomationPeer(ptr: Pointer?): WithDefault =
        IExpanderAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpanderAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIExpanderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IExpanderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2004445411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpanderAutomationPeer): Array<IExpanderAutomationPeer?>
        = (elements as
        Array<IExpanderAutomationPeer?>).castToImpl<IExpanderAutomationPeer,IExpanderAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpanderAutomationPeer?> =
        arrayOfNulls<IExpanderAutomationPeer_Impl>(size) as Array<IExpanderAutomationPeer?>
  }
}
