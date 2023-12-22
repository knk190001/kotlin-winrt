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

@ABIMarker(IHubSectionAutomationPeer.ABI::class)
@Signature("{16d91ff7-7431-4d82-83ce-cfa3192b0f18}")
@Guid("16d91ff774314d8283cecfa3192b0f18")
@WinRTInterface("16d91ff774314d8283cecfa3192b0f18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubSectionAutomationPeer.ByReference::class)
public interface IHubSectionAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubSectionAutomationPeer> {
    public override fun getValue() = ABI.makeIHubSectionAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IHubSectionAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubSectionAutomationPeer {
    public val __1552924127_Ptr: Pointer?

    public val _1552924127_VtblPtr: Pointer?
      get() = __1552924127_Ptr?.getPointer(0)
  }

  public class IHubSectionAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1552924127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubSectionAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16d91ff774314d8283cecfa3192b0f18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubSectionAutomationPeer(ptr: Pointer?): WithDefault =
        IHubSectionAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubSectionAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIHubSectionAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IHubSectionAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1552924127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubSectionAutomationPeer):
        Array<IHubSectionAutomationPeer?> = (elements as
        Array<IHubSectionAutomationPeer?>).castToImpl<IHubSectionAutomationPeer,IHubSectionAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubSectionAutomationPeer?> =
        arrayOfNulls<IHubSectionAutomationPeer_Impl>(size) as Array<IHubSectionAutomationPeer?>
  }
}
