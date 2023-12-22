package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IConversationalAgentSessionStatics.ABI::class)
@Signature("{a005166e-e954-576e-be04-11b8ed10f37b}")
@Guid("a005166ee954576ebe0411b8ed10f37b")
@WinRTInterface("a005166ee954576ebe0411b8ed10f37b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSessionStatics.ByReference::class)
public interface IConversationalAgentSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentSessionAsync(): IAsyncOperation<ConversationalAgentSession?>?

  @InterfaceMethod(1)
  public fun GetCurrentSessionSync(): ConversationalAgentSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSessionStatics> {
    public override fun getValue() =
        ABI.makeIConversationalAgentSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSessionStatics {
    public val __1549485066_Ptr: Pointer?

    public val _1549485066_VtblPtr: Pointer?
      get() = __1549485066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentSessionAsync(): IAsyncOperation<ConversationalAgentSession?>? {
      val fnPtr = _1549485066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConversationalAgentSession?>>()
      val hr = fn.invokeHR(arrayOf(__1549485066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConversationalAgentSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentSessionSync(): ConversationalAgentSession? {
      val fnPtr = _1549485066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSession>()
      val hr = fn.invokeHR(arrayOf(__1549485066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConversationalAgentSession>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1549485066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a005166ee954576ebe0411b8ed10f37b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSessionStatics(ptr: Pointer?): WithDefault =
        IConversationalAgentSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentSessionStatics {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1549485066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSessionStatics):
        Array<IConversationalAgentSessionStatics?> = (elements as
        Array<IConversationalAgentSessionStatics?>).castToImpl<IConversationalAgentSessionStatics,IConversationalAgentSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSessionStatics?> =
        arrayOfNulls<IConversationalAgentSessionStatics_Impl>(size) as
        Array<IConversationalAgentSessionStatics?>
  }
}
