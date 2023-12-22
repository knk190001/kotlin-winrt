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

@ABIMarker(IDatePickerAutomationPeer.ABI::class)
@Signature("{d07d357f-a0b9-45dc-991a-76c505e7d0f5}")
@Guid("d07d357fa0b945dc991a76c505e7d0f5")
@WinRTInterface("d07d357fa0b945dc991a76c505e7d0f5")
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
    public val __1019796173_Ptr: Pointer?

    public val _1019796173_VtblPtr: Pointer?
      get() = __1019796173_Ptr?.getPointer(0)
  }

  public class IDatePickerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1019796173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d07d357fa0b945dc991a76c505e7d0f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerAutomationPeer(ptr: Pointer?): WithDefault =
        IDatePickerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIDatePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1019796173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerAutomationPeer):
        Array<IDatePickerAutomationPeer?> = (elements as
        Array<IDatePickerAutomationPeer?>).castToImpl<IDatePickerAutomationPeer,IDatePickerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerAutomationPeer?> =
        arrayOfNulls<IDatePickerAutomationPeer_Impl>(size) as Array<IDatePickerAutomationPeer?>
  }
}
