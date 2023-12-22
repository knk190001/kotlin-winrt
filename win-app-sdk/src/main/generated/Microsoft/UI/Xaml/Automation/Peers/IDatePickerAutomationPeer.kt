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

@ABIMarker(IDatePickerAutomationPeer.ABI::class)
@Signature("{f3d7c3e5-c817-58a5-bb47-d9eb228f3ba0}")
@Guid("f3d7c3e5c81758a5bb47d9eb228f3ba0")
@WinRTInterface("f3d7c3e5c81758a5bb47d9eb228f3ba0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerAutomationPeer.ByReference::class)
public interface IDatePickerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerAutomationPeer> {
    public override fun getValue() = ABI.makeIDatePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IDatePickerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerAutomationPeer {
    public val __945233800_Ptr: Pointer?

    public val _945233800_VtblPtr: Pointer?
      get() = __945233800_Ptr?.getPointer(0)
  }

  public class IDatePickerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945233800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3d7c3e5c81758a5bb47d9eb228f3ba0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerAutomationPeer(ptr: Pointer?): WithDefault =
        IDatePickerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIDatePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945233800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerAutomationPeer):
        Array<IDatePickerAutomationPeer?> = (elements as
        Array<IDatePickerAutomationPeer?>).castToImpl<IDatePickerAutomationPeer,IDatePickerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerAutomationPeer?> =
        arrayOfNulls<IDatePickerAutomationPeer_Impl>(size) as Array<IDatePickerAutomationPeer?>
  }
}
