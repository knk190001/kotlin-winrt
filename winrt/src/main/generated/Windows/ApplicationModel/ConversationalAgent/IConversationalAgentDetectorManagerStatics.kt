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

@ABIMarker(IConversationalAgentDetectorManagerStatics.ABI::class)
@Signature("{36a8d283-fa0e-5693-8489-0fb2f0ab40d3}")
@Guid("36a8d283fa0e569384890fb2f0ab40d3")
@WinRTInterface("36a8d283fa0e569384890fb2f0ab40d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentDetectorManagerStatics.ByReference::class)
public interface IConversationalAgentDetectorManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Default(): ConversationalAgentDetectorManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentDetectorManagerStatics> {
    public override fun getValue() =
        ABI.makeIConversationalAgentDetectorManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentDetectorManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentDetectorManagerStatics {
    public val __155122311_Ptr: Pointer?

    public val _155122311_VtblPtr: Pointer?
      get() = __155122311_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Default(): ConversationalAgentDetectorManager? {
      val fnPtr = _155122311_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentDetectorManager>()
      val hr = fn.invokeHR(arrayOf(__155122311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConversationalAgentDetectorManager>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentDetectorManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155122311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentDetectorManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36a8d283fa0e569384890fb2f0ab40d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentDetectorManagerStatics(ptr: Pointer?): WithDefault =
        IConversationalAgentDetectorManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IConversationalAgentDetectorManagerStatics {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentDetectorManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentDetectorManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155122311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentDetectorManagerStatics):
        Array<IConversationalAgentDetectorManagerStatics?> = (elements as
        Array<IConversationalAgentDetectorManagerStatics?>).castToImpl<IConversationalAgentDetectorManagerStatics,IConversationalAgentDetectorManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentDetectorManagerStatics?> =
        arrayOfNulls<IConversationalAgentDetectorManagerStatics_Impl>(size) as
        Array<IConversationalAgentDetectorManagerStatics?>
  }
}
