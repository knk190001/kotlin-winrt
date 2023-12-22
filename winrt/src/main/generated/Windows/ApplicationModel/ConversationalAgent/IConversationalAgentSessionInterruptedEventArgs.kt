package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(IConversationalAgentSessionInterruptedEventArgs.ABI::class)
@Signature("{9766591f-f63d-5d3e-9bf2-bd0760552686}")
@Guid("9766591ff63d5d3e9bf2bd0760552686")
@WinRTInterface("9766591ff63d5d3e9bf2bd0760552686")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSessionInterruptedEventArgs.ByReference::class)
public interface IConversationalAgentSessionInterruptedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSessionInterruptedEventArgs> {
    public override fun getValue() =
        ABI.makeIConversationalAgentSessionInterruptedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSessionInterruptedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSessionInterruptedEventArgs {
    public val __100054448_Ptr: Pointer?

    public val _100054448_VtblPtr: Pointer?
      get() = __100054448_Ptr?.getPointer(0)
  }

  public class IConversationalAgentSessionInterruptedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __100054448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSessionInterruptedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9766591ff63d5d3e9bf2bd0760552686")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSessionInterruptedEventArgs(ptr: Pointer?): WithDefault =
        IConversationalAgentSessionInterruptedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IConversationalAgentSessionInterruptedEventArgs {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSessionInterruptedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSessionInterruptedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__100054448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSessionInterruptedEventArgs):
        Array<IConversationalAgentSessionInterruptedEventArgs?> = (elements as
        Array<IConversationalAgentSessionInterruptedEventArgs?>).castToImpl<IConversationalAgentSessionInterruptedEventArgs,IConversationalAgentSessionInterruptedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSessionInterruptedEventArgs?>
        = arrayOfNulls<IConversationalAgentSessionInterruptedEventArgs_Impl>(size) as
        Array<IConversationalAgentSessionInterruptedEventArgs?>
  }
}
