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

@ABIMarker(INavigationViewAutomationPeer.ABI::class)
@Signature("{72013eae-b015-550d-ba8d-a05112b62731}")
@Guid("72013eaeb015550dba8da05112b62731")
@WinRTInterface("72013eaeb015550dba8da05112b62731")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewAutomationPeer.ByReference::class)
public interface INavigationViewAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewAutomationPeer> {
    public override fun getValue() = ABI.makeINavigationViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: INavigationViewAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewAutomationPeer {
    public val __698311371_Ptr: Pointer?

    public val _698311371_VtblPtr: Pointer?
      get() = __698311371_Ptr?.getPointer(0)
  }

  public class INavigationViewAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __698311371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72013eaeb015550dba8da05112b62731")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewAutomationPeer(ptr: Pointer?): WithDefault =
        INavigationViewAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewAutomationPeer {
      val address = segment.toRawLongValue()
      return makeINavigationViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__698311371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewAutomationPeer):
        Array<INavigationViewAutomationPeer?> = (elements as
        Array<INavigationViewAutomationPeer?>).castToImpl<INavigationViewAutomationPeer,INavigationViewAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewAutomationPeer?> =
        arrayOfNulls<INavigationViewAutomationPeer_Impl>(size) as
        Array<INavigationViewAutomationPeer?>
  }
}
