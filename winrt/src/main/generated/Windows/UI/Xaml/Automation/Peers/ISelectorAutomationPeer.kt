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

@ABIMarker(ISelectorAutomationPeer.ABI::class)
@Signature("{162ac829-7115-43ec-b383-a7b71644069d}")
@Guid("162ac829711543ecb383a7b71644069d")
@WinRTInterface("162ac829711543ecb383a7b71644069d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorAutomationPeer.ByReference::class)
public interface ISelectorAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorAutomationPeer> {
    public override fun getValue() = ABI.makeISelectorAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISelectorAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorAutomationPeer {
    public val __196211088_Ptr: Pointer?

    public val _196211088_VtblPtr: Pointer?
      get() = __196211088_Ptr?.getPointer(0)
  }

  public class ISelectorAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __196211088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("162ac829711543ecb383a7b71644069d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorAutomationPeer(ptr: Pointer?): WithDefault =
        ISelectorAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISelectorAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISelectorAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__196211088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorAutomationPeer): Array<ISelectorAutomationPeer?>
        = (elements as
        Array<ISelectorAutomationPeer?>).castToImpl<ISelectorAutomationPeer,ISelectorAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorAutomationPeer?> =
        arrayOfNulls<ISelectorAutomationPeer_Impl>(size) as Array<ISelectorAutomationPeer?>
  }
}
