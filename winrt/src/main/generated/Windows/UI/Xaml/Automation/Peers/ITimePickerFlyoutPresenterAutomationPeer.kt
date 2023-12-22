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

@ABIMarker(ITimePickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("{da93ee27-82f1-4701-8706-be297bf06043}")
@Guid("da93ee2782f147018706be297bf06043")
@WinRTInterface("da93ee2782f147018706be297bf06043")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyoutPresenterAutomationPeer.ByReference::class)
public interface ITimePickerFlyoutPresenterAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() =
        ABI.makeITimePickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyoutPresenterAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyoutPresenterAutomationPeer {
    public val __1423421875_Ptr: Pointer?

    public val _1423421875_VtblPtr: Pointer?
      get() = __1423421875_Ptr?.getPointer(0)
  }

  public class ITimePickerFlyoutPresenterAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1423421875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da93ee2782f147018706be297bf06043")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyoutPresenterAutomationPeer(ptr: Pointer?): WithDefault =
        ITimePickerFlyoutPresenterAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITimePickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1423421875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyoutPresenterAutomationPeer):
        Array<ITimePickerFlyoutPresenterAutomationPeer?> = (elements as
        Array<ITimePickerFlyoutPresenterAutomationPeer?>).castToImpl<ITimePickerFlyoutPresenterAutomationPeer,ITimePickerFlyoutPresenterAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyoutPresenterAutomationPeer?> =
        arrayOfNulls<ITimePickerFlyoutPresenterAutomationPeer_Impl>(size) as
        Array<ITimePickerFlyoutPresenterAutomationPeer?>
  }
}
