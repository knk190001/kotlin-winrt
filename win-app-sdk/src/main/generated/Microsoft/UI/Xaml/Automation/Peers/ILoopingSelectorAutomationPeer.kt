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

@ABIMarker(ILoopingSelectorAutomationPeer.ABI::class)
@Signature("{00b612f4-8faf-5c0c-92e4-4396e0f7b8d8}")
@Guid("00b612f48faf5c0c92e44396e0f7b8d8")
@WinRTInterface("00b612f48faf5c0c92e44396e0f7b8d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorAutomationPeer.ByReference::class)
public interface ILoopingSelectorAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorAutomationPeer> {
    public override fun getValue() = ABI.makeILoopingSelectorAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorAutomationPeer {
    public val __602706253_Ptr: Pointer?

    public val _602706253_VtblPtr: Pointer?
      get() = __602706253_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __602706253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00b612f48faf5c0c92e44396e0f7b8d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorAutomationPeer(ptr: Pointer?): WithDefault =
        ILoopingSelectorAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorAutomationPeer {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__602706253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorAutomationPeer):
        Array<ILoopingSelectorAutomationPeer?> = (elements as
        Array<ILoopingSelectorAutomationPeer?>).castToImpl<ILoopingSelectorAutomationPeer,ILoopingSelectorAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorAutomationPeer?> =
        arrayOfNulls<ILoopingSelectorAutomationPeer_Impl>(size) as
        Array<ILoopingSelectorAutomationPeer?>
  }
}
