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

@ABIMarker(IDatePickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("{752aed38-c2bf-4880-82b2-a6c05e90c135}")
@Guid("752aed38c2bf488082b2a6c05e90c135")
@WinRTInterface("752aed38c2bf488082b2a6c05e90c135")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenterAutomationPeer.ByReference::class)
public interface IDatePickerFlyoutPresenterAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() =
        ABI.makeIDatePickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenterAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenterAutomationPeer {
    public val __1137320242_Ptr: Pointer?

    public val _1137320242_VtblPtr: Pointer?
      get() = __1137320242_Ptr?.getPointer(0)
  }

  public class IDatePickerFlyoutPresenterAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1137320242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("752aed38c2bf488082b2a6c05e90c135")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenterAutomationPeer(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenterAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDatePickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1137320242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenterAutomationPeer):
        Array<IDatePickerFlyoutPresenterAutomationPeer?> = (elements as
        Array<IDatePickerFlyoutPresenterAutomationPeer?>).castToImpl<IDatePickerFlyoutPresenterAutomationPeer,IDatePickerFlyoutPresenterAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenterAutomationPeer?> =
        arrayOfNulls<IDatePickerFlyoutPresenterAutomationPeer_Impl>(size) as
        Array<IDatePickerFlyoutPresenterAutomationPeer?>
  }
}
