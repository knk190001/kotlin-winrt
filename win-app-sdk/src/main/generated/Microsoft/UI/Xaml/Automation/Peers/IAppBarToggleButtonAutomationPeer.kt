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

@ABIMarker(IAppBarToggleButtonAutomationPeer.ABI::class)
@Signature("{17d28eb5-4635-5e2d-af01-8dcd23a608c4}")
@Guid("17d28eb546355e2daf018dcd23a608c4")
@WinRTInterface("17d28eb546355e2daf018dcd23a608c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonAutomationPeer.ByReference::class)
public interface IAppBarToggleButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonAutomationPeer> {
    public override fun getValue() =
        ABI.makeIAppBarToggleButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonAutomationPeer {
    public val __121723500_Ptr: Pointer?

    public val _121723500_VtblPtr: Pointer?
      get() = __121723500_Ptr?.getPointer(0)
  }

  public class IAppBarToggleButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __121723500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17d28eb546355e2daf018dcd23a608c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__121723500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonAutomationPeer):
        Array<IAppBarToggleButtonAutomationPeer?> = (elements as
        Array<IAppBarToggleButtonAutomationPeer?>).castToImpl<IAppBarToggleButtonAutomationPeer,IAppBarToggleButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonAutomationPeer?> =
        arrayOfNulls<IAppBarToggleButtonAutomationPeer_Impl>(size) as
        Array<IAppBarToggleButtonAutomationPeer?>
  }
}
