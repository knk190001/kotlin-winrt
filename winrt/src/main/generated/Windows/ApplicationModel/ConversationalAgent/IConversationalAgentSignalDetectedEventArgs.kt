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

@ABIMarker(IConversationalAgentSignalDetectedEventArgs.ABI::class)
@Signature("{4d57eb8f-f88a-599b-91d3-d604876708bc}")
@Guid("4d57eb8ff88a599b91d3d604876708bc")
@WinRTInterface("4d57eb8ff88a599b91d3d604876708bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSignalDetectedEventArgs.ByReference::class)
public interface IConversationalAgentSignalDetectedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSignalDetectedEventArgs> {
    public override fun getValue() =
        ABI.makeIConversationalAgentSignalDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSignalDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSignalDetectedEventArgs {
    public val __1590236398_Ptr: Pointer?

    public val _1590236398_VtblPtr: Pointer?
      get() = __1590236398_Ptr?.getPointer(0)
  }

  public class IConversationalAgentSignalDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1590236398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSignalDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d57eb8ff88a599b91d3d604876708bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSignalDetectedEventArgs(ptr: Pointer?): WithDefault =
        IConversationalAgentSignalDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IConversationalAgentSignalDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSignalDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSignalDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1590236398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSignalDetectedEventArgs):
        Array<IConversationalAgentSignalDetectedEventArgs?> = (elements as
        Array<IConversationalAgentSignalDetectedEventArgs?>).castToImpl<IConversationalAgentSignalDetectedEventArgs,IConversationalAgentSignalDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSignalDetectedEventArgs?> =
        arrayOfNulls<IConversationalAgentSignalDetectedEventArgs_Impl>(size) as
        Array<IConversationalAgentSignalDetectedEventArgs?>
  }
}
