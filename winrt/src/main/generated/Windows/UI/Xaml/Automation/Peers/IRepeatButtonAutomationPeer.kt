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

@ABIMarker(IRepeatButtonAutomationPeer.ABI::class)
@Signature("{29e41ad5-a8ac-4e8a-83d8-09e37e054257}")
@Guid("29e41ad5a8ac4e8a83d809e37e054257")
@WinRTInterface("29e41ad5a8ac4e8a83d809e37e054257")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatButtonAutomationPeer.ByReference::class)
public interface IRepeatButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIRepeatButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRepeatButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatButtonAutomationPeer {
    public val __508346846_Ptr: Pointer?

    public val _508346846_VtblPtr: Pointer?
      get() = __508346846_Ptr?.getPointer(0)
  }

  public class IRepeatButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508346846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29e41ad5a8ac4e8a83d809e37e054257")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IRepeatButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRepeatButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRepeatButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__508346846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatButtonAutomationPeer):
        Array<IRepeatButtonAutomationPeer?> = (elements as
        Array<IRepeatButtonAutomationPeer?>).castToImpl<IRepeatButtonAutomationPeer,IRepeatButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatButtonAutomationPeer?> =
        arrayOfNulls<IRepeatButtonAutomationPeer_Impl>(size) as Array<IRepeatButtonAutomationPeer?>
  }
}
