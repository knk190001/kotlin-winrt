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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoiceCommandCompletedEventArgs.ABI::class)
@Signature("{c85e675d-fe42-432c-9907-09df9fcf64e8}")
@Guid("c85e675dfe42432c990709df9fcf64e8")
@WinRTInterface("c85e675dfe42432c990709df9fcf64e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandCompletedEventArgs.ByReference::class)
public interface IVoiceCommandCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): VoiceCommandCompletionReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandCompletedEventArgs> {
    public override fun getValue() = ABI.makeIVoiceCommandCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandCompletedEventArgs {
    public val __1310078334_Ptr: Pointer?

    public val _1310078334_VtblPtr: Pointer?
      get() = __1310078334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): VoiceCommandCompletionReason? {
      val fnPtr = _1310078334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandCompletionReason>()
      val hr = fn.invokeHR(arrayOf(__1310078334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandCompletionReason>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1310078334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c85e675dfe42432c990709df9fcf64e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandCompletedEventArgs(ptr: Pointer?): WithDefault =
        IVoiceCommandCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1310078334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandCompletedEventArgs):
        Array<IVoiceCommandCompletedEventArgs?> = (elements as
        Array<IVoiceCommandCompletedEventArgs?>).castToImpl<IVoiceCommandCompletedEventArgs,IVoiceCommandCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandCompletedEventArgs?> =
        arrayOfNulls<IVoiceCommandCompletedEventArgs_Impl>(size) as
        Array<IVoiceCommandCompletedEventArgs?>
  }
}
