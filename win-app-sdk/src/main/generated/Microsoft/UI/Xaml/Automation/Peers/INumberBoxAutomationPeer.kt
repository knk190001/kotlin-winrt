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

@ABIMarker(INumberBoxAutomationPeer.ABI::class)
@Signature("{235befeb-6c98-5d35-a2e7-001eae342509}")
@Guid("235befeb6c985d35a2e7001eae342509")
@WinRTInterface("235befeb6c985d35a2e7001eae342509")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberBoxAutomationPeer.ByReference::class)
public interface INumberBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberBoxAutomationPeer> {
    public override fun getValue() = ABI.makeINumberBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: INumberBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberBoxAutomationPeer {
    public val __1972896952_Ptr: Pointer?

    public val _1972896952_VtblPtr: Pointer?
      get() = __1972896952_Ptr?.getPointer(0)
  }

  public class INumberBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1972896952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("235befeb6c985d35a2e7001eae342509")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberBoxAutomationPeer(ptr: Pointer?): WithDefault =
        INumberBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeINumberBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: INumberBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1972896952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberBoxAutomationPeer):
        Array<INumberBoxAutomationPeer?> = (elements as
        Array<INumberBoxAutomationPeer?>).castToImpl<INumberBoxAutomationPeer,INumberBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberBoxAutomationPeer?> =
        arrayOfNulls<INumberBoxAutomationPeer_Impl>(size) as Array<INumberBoxAutomationPeer?>
  }
}
