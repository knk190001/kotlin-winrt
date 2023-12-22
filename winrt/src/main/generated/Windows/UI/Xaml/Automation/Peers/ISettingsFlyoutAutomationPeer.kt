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

@ABIMarker(ISettingsFlyoutAutomationPeer.ABI::class)
@Signature("{d0de0cdb-30cf-47a6-a5eb-9c77f0b0d6dd}")
@Guid("d0de0cdb30cf47a6a5eb9c77f0b0d6dd")
@WinRTInterface("d0de0cdb30cf47a6a5eb9c77f0b0d6dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsFlyoutAutomationPeer.ByReference::class)
public interface ISettingsFlyoutAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsFlyoutAutomationPeer> {
    public override fun getValue() = ABI.makeISettingsFlyoutAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISettingsFlyoutAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsFlyoutAutomationPeer {
    public val __810229103_Ptr: Pointer?

    public val _810229103_VtblPtr: Pointer?
      get() = __810229103_Ptr?.getPointer(0)
  }

  public class ISettingsFlyoutAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810229103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsFlyoutAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0de0cdb30cf47a6a5eb9c77f0b0d6dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsFlyoutAutomationPeer(ptr: Pointer?): WithDefault =
        ISettingsFlyoutAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsFlyoutAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISettingsFlyoutAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISettingsFlyoutAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810229103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsFlyoutAutomationPeer):
        Array<ISettingsFlyoutAutomationPeer?> = (elements as
        Array<ISettingsFlyoutAutomationPeer?>).castToImpl<ISettingsFlyoutAutomationPeer,ISettingsFlyoutAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsFlyoutAutomationPeer?> =
        arrayOfNulls<ISettingsFlyoutAutomationPeer_Impl>(size) as
        Array<ISettingsFlyoutAutomationPeer?>
  }
}
