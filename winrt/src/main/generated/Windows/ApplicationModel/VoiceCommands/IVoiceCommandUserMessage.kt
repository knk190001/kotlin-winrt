package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(IVoiceCommandUserMessage.ABI::class)
@Signature("{674eb3c0-44f6-4f07-b979-4c723fc08597}")
@Guid("674eb3c044f64f07b9794c723fc08597")
@WinRTInterface("674eb3c044f64f07b9794c723fc08597")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandUserMessage.ByReference::class)
public interface IVoiceCommandUserMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayMessage(): String?

  @InterfaceMethod(1)
  public fun put_DisplayMessage(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_SpokenMessage(): String?

  @InterfaceMethod(3)
  public fun put_SpokenMessage(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandUserMessage> {
    public override fun getValue() = ABI.makeIVoiceCommandUserMessage(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandUserMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandUserMessage {
    public val __1917427446_Ptr: Pointer?

    public val _1917427446_VtblPtr: Pointer?
      get() = __1917427446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayMessage(): String? {
      val fnPtr = _1917427446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1917427446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayMessage(value: String?): Unit {
      val fnPtr = _1917427446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917427446_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SpokenMessage(): String? {
      val fnPtr = _1917427446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1917427446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SpokenMessage(value: String?): Unit {
      val fnPtr = _1917427446_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917427446_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoiceCommandUserMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1917427446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandUserMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("674eb3c044f64f07b9794c723fc08597")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandUserMessage(ptr: Pointer?): WithDefault =
        IVoiceCommandUserMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandUserMessage {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandUserMessage(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandUserMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1917427446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandUserMessage):
        Array<IVoiceCommandUserMessage?> = (elements as
        Array<IVoiceCommandUserMessage?>).castToImpl<IVoiceCommandUserMessage,IVoiceCommandUserMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandUserMessage?> =
        arrayOfNulls<IVoiceCommandUserMessage_Impl>(size) as Array<IVoiceCommandUserMessage?>
  }
}
