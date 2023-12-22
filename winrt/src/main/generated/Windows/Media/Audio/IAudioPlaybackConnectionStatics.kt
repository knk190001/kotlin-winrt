package Windows.Media.Audio

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

@ABIMarker(IAudioPlaybackConnectionStatics.ABI::class)
@Signature("{e60963a2-69e6-5ffc-9e13-824a85213daf}")
@Guid("e60963a269e65ffc9e13824a85213daf")
@WinRTInterface("e60963a269e65ffc9e13824a85213daf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioPlaybackConnectionStatics.ByReference::class)
public interface IAudioPlaybackConnectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun TryCreateFromId(id: String?): AudioPlaybackConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioPlaybackConnectionStatics> {
    public override fun getValue() = ABI.makeIAudioPlaybackConnectionStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioPlaybackConnectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioPlaybackConnectionStatics {
    public val __1948392578_Ptr: Pointer?

    public val _1948392578_VtblPtr: Pointer?
      get() = __1948392578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1948392578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1948392578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateFromId(id: String?): AudioPlaybackConnection? {
      val fnPtr = _1948392578_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioPlaybackConnection>()
      val hr = fn.invokeHR(arrayOf(__1948392578_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioPlaybackConnection>(result.getValue())
      return resultValue
    }
  }

  public class IAudioPlaybackConnectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1948392578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioPlaybackConnectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e60963a269e65ffc9e13824a85213daf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioPlaybackConnectionStatics(ptr: Pointer?): WithDefault =
        IAudioPlaybackConnectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioPlaybackConnectionStatics {
      val address = segment.toRawLongValue()
      return makeIAudioPlaybackConnectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioPlaybackConnectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1948392578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioPlaybackConnectionStatics):
        Array<IAudioPlaybackConnectionStatics?> = (elements as
        Array<IAudioPlaybackConnectionStatics?>).castToImpl<IAudioPlaybackConnectionStatics,IAudioPlaybackConnectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioPlaybackConnectionStatics?> =
        arrayOfNulls<IAudioPlaybackConnectionStatics_Impl>(size) as
        Array<IAudioPlaybackConnectionStatics?>
  }
}
