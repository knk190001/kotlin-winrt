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

@ABIMarker(IProgressRingAutomationPeer.ABI::class)
@Signature("{3b6952da-9e44-52b0-91df-39da9dc1d8b0}")
@Guid("3b6952da9e4452b091df39da9dc1d8b0")
@WinRTInterface("3b6952da9e4452b091df39da9dc1d8b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingAutomationPeer.ByReference::class)
public interface IProgressRingAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressRingAutomationPeer> {
    public override fun getValue() = ABI.makeIProgressRingAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IProgressRingAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRingAutomationPeer {
    public val __1078534631_Ptr: Pointer?

    public val _1078534631_VtblPtr: Pointer?
      get() = __1078534631_Ptr?.getPointer(0)
  }

  public class IProgressRingAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1078534631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b6952da9e4452b091df39da9dc1d8b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingAutomationPeer(ptr: Pointer?): WithDefault =
        IProgressRingAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIProgressRingAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1078534631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRingAutomationPeer):
        Array<IProgressRingAutomationPeer?> = (elements as
        Array<IProgressRingAutomationPeer?>).castToImpl<IProgressRingAutomationPeer,IProgressRingAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRingAutomationPeer?> =
        arrayOfNulls<IProgressRingAutomationPeer_Impl>(size) as Array<IProgressRingAutomationPeer?>
  }
}
