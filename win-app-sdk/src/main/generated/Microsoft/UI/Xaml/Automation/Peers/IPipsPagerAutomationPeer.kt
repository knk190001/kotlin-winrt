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

@ABIMarker(IPipsPagerAutomationPeer.ABI::class)
@Signature("{93de1bc2-cf84-5b5f-91be-a7c781b2021a}")
@Guid("93de1bc2cf845b5f91bea7c781b2021a")
@WinRTInterface("93de1bc2cf845b5f91bea7c781b2021a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPipsPagerAutomationPeer.ByReference::class)
public interface IPipsPagerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPipsPagerAutomationPeer> {
    public override fun getValue() = ABI.makeIPipsPagerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPipsPagerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPipsPagerAutomationPeer {
    public val __340556189_Ptr: Pointer?

    public val _340556189_VtblPtr: Pointer?
      get() = __340556189_Ptr?.getPointer(0)
  }

  public class IPipsPagerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __340556189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPipsPagerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93de1bc2cf845b5f91bea7c781b2021a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPipsPagerAutomationPeer(ptr: Pointer?): WithDefault =
        IPipsPagerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPipsPagerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPipsPagerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPipsPagerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340556189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPipsPagerAutomationPeer):
        Array<IPipsPagerAutomationPeer?> = (elements as
        Array<IPipsPagerAutomationPeer?>).castToImpl<IPipsPagerAutomationPeer,IPipsPagerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPipsPagerAutomationPeer?> =
        arrayOfNulls<IPipsPagerAutomationPeer_Impl>(size) as Array<IPipsPagerAutomationPeer?>
  }
}
