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

@ABIMarker(ICheckBoxAutomationPeer.ABI::class)
@Signature("{9b449814-2c1a-5bdc-9524-1df91c06e992}")
@Guid("9b4498142c1a5bdc95241df91c06e992")
@WinRTInterface("9b4498142c1a5bdc95241df91c06e992")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICheckBoxAutomationPeer.ByReference::class)
public interface ICheckBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICheckBoxAutomationPeer> {
    public override fun getValue() = ABI.makeICheckBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ICheckBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICheckBoxAutomationPeer {
    public val __785460927_Ptr: Pointer?

    public val _785460927_VtblPtr: Pointer?
      get() = __785460927_Ptr?.getPointer(0)
  }

  public class ICheckBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __785460927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICheckBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b4498142c1a5bdc95241df91c06e992")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICheckBoxAutomationPeer(ptr: Pointer?): WithDefault =
        ICheckBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICheckBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeICheckBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ICheckBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__785460927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICheckBoxAutomationPeer): Array<ICheckBoxAutomationPeer?>
        = (elements as
        Array<ICheckBoxAutomationPeer?>).castToImpl<ICheckBoxAutomationPeer,ICheckBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICheckBoxAutomationPeer?> =
        arrayOfNulls<ICheckBoxAutomationPeer_Impl>(size) as Array<ICheckBoxAutomationPeer?>
  }
}
