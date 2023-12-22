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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoiceCommandConfirmationResult.ABI::class)
@Signature("{a022593e-8221-4526-b083-840972262247}")
@Guid("a022593e82214526b083840972262247")
@WinRTInterface("a022593e82214526b083840972262247")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandConfirmationResult.ByReference::class)
public interface IVoiceCommandConfirmationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Confirmed(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandConfirmationResult> {
    public override fun getValue() = ABI.makeIVoiceCommandConfirmationResult(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandConfirmationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandConfirmationResult {
    public val __1923624540_Ptr: Pointer?

    public val _1923624540_VtblPtr: Pointer?
      get() = __1923624540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Confirmed(): Boolean {
      val fnPtr = _1923624540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1923624540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVoiceCommandConfirmationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923624540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandConfirmationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a022593e82214526b083840972262247")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandConfirmationResult(ptr: Pointer?): WithDefault =
        IVoiceCommandConfirmationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandConfirmationResult {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandConfirmationResult(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandConfirmationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923624540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandConfirmationResult):
        Array<IVoiceCommandConfirmationResult?> = (elements as
        Array<IVoiceCommandConfirmationResult?>).castToImpl<IVoiceCommandConfirmationResult,IVoiceCommandConfirmationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandConfirmationResult?> =
        arrayOfNulls<IVoiceCommandConfirmationResult_Impl>(size) as
        Array<IVoiceCommandConfirmationResult?>
  }
}
