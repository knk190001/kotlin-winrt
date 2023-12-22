package Windows.ApplicationModel.ConversationalAgent

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConversationalAgentSystemStateChangedEventArgs.ABI::class)
@Signature("{1c2c6e3e-2785-59a7-8e71-38adeef79928}")
@Guid("1c2c6e3e278559a78e7138adeef79928")
@WinRTInterface("1c2c6e3e278559a78e7138adeef79928")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSystemStateChangedEventArgs.ByReference::class)
public interface IConversationalAgentSystemStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemStateChangeType(): ConversationalAgentSystemStateChangeType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSystemStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIConversationalAgentSystemStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSystemStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSystemStateChangedEventArgs {
    public val __887131690_Ptr: Pointer?

    public val _887131690_VtblPtr: Pointer?
      get() = __887131690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemStateChangeType(): ConversationalAgentSystemStateChangeType? {
      val fnPtr = _887131690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSystemStateChangeType>()
      val hr = fn.invokeHR(arrayOf(__887131690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ConversationalAgentSystemStateChangeType>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentSystemStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __887131690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSystemStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c2c6e3e278559a78e7138adeef79928")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSystemStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IConversationalAgentSystemStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IConversationalAgentSystemStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSystemStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSystemStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__887131690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSystemStateChangedEventArgs):
        Array<IConversationalAgentSystemStateChangedEventArgs?> = (elements as
        Array<IConversationalAgentSystemStateChangedEventArgs?>).castToImpl<IConversationalAgentSystemStateChangedEventArgs,IConversationalAgentSystemStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSystemStateChangedEventArgs?>
        = arrayOfNulls<IConversationalAgentSystemStateChangedEventArgs_Impl>(size) as
        Array<IConversationalAgentSystemStateChangedEventArgs?>
  }
}
