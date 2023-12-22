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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConversationalAgentSignal2.ABI::class)
@Signature("{d0cc7ba9-9a7b-5c34-880e-b6146c904ecb}")
@Guid("d0cc7ba99a7b5c34880eb6146c904ecb")
@WinRTInterface("d0cc7ba99a7b5c34880eb6146c904ecb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSignal2.ByReference::class)
public interface IConversationalAgentSignal2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DetectorId(): String?

  @InterfaceMethod(1)
  public fun get_DetectorKind(): ActivationSignalDetectorKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSignal2> {
    public override fun getValue() = ABI.makeIConversationalAgentSignal2(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSignal2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSignal2 {
    public val __1048325935_Ptr: Pointer?

    public val _1048325935_VtblPtr: Pointer?
      get() = __1048325935_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DetectorId(): String? {
      val fnPtr = _1048325935_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1048325935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DetectorKind(): ActivationSignalDetectorKind? {
      val fnPtr = _1048325935_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectorKind>()
      val hr = fn.invokeHR(arrayOf(__1048325935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationSignalDetectorKind>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentSignal2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1048325935_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSignal2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0cc7ba99a7b5c34880eb6146c904ecb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSignal2(ptr: Pointer?): WithDefault =
        IConversationalAgentSignal2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentSignal2 {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSignal2(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSignal2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048325935_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSignal2):
        Array<IConversationalAgentSignal2?> = (elements as
        Array<IConversationalAgentSignal2?>).castToImpl<IConversationalAgentSignal2,IConversationalAgentSignal2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSignal2?> =
        arrayOfNulls<IConversationalAgentSignal2_Impl>(size) as Array<IConversationalAgentSignal2?>
  }
}
