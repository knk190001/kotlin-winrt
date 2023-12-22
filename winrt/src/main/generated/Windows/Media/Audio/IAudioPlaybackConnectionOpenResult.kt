package Windows.Media.Audio

import Windows.Foundation.HResult
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

@ABIMarker(IAudioPlaybackConnectionOpenResult.ABI::class)
@Signature("{4e656aef-39f9-5fc9-a519-a5bbfd9fe921}")
@Guid("4e656aef39f95fc9a519a5bbfd9fe921")
@WinRTInterface("4e656aef39f95fc9a519a5bbfd9fe921")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioPlaybackConnectionOpenResult.ByReference::class)
public interface IAudioPlaybackConnectionOpenResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AudioPlaybackConnectionOpenResultStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioPlaybackConnectionOpenResult> {
    public override fun getValue() =
        ABI.makeIAudioPlaybackConnectionOpenResult(pointer.getPointer(0))

    public fun setValue(value: IAudioPlaybackConnectionOpenResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioPlaybackConnectionOpenResult {
    public val __1959604050_Ptr: Pointer?

    public val _1959604050_VtblPtr: Pointer?
      get() = __1959604050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AudioPlaybackConnectionOpenResultStatus? {
      val fnPtr = _1959604050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioPlaybackConnectionOpenResultStatus>()
      val hr = fn.invokeHR(arrayOf(__1959604050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AudioPlaybackConnectionOpenResultStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1959604050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1959604050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IAudioPlaybackConnectionOpenResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1959604050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioPlaybackConnectionOpenResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e656aef39f95fc9a519a5bbfd9fe921")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioPlaybackConnectionOpenResult(ptr: Pointer?): WithDefault =
        IAudioPlaybackConnectionOpenResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioPlaybackConnectionOpenResult {
      val address = segment.toRawLongValue()
      return makeIAudioPlaybackConnectionOpenResult(Pointer(address))
    }

    public override fun toNative(obj: IAudioPlaybackConnectionOpenResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1959604050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioPlaybackConnectionOpenResult):
        Array<IAudioPlaybackConnectionOpenResult?> = (elements as
        Array<IAudioPlaybackConnectionOpenResult?>).castToImpl<IAudioPlaybackConnectionOpenResult,IAudioPlaybackConnectionOpenResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioPlaybackConnectionOpenResult?> =
        arrayOfNulls<IAudioPlaybackConnectionOpenResult_Impl>(size) as
        Array<IAudioPlaybackConnectionOpenResult?>
  }
}
