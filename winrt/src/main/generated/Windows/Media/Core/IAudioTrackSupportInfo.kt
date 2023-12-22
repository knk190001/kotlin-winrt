package Windows.Media.Core

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

@ABIMarker(IAudioTrackSupportInfo.ABI::class)
@Signature("{178beff7-cc39-44a6-b951-4a5653f073fa}")
@Guid("178beff7cc3944a6b9514a5653f073fa")
@WinRTInterface("178beff7cc3944a6b9514a5653f073fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioTrackSupportInfo.ByReference::class)
public interface IAudioTrackSupportInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DecoderStatus(): MediaDecoderStatus?

  @InterfaceMethod(1)
  public fun get_Degradation(): AudioDecoderDegradation?

  @InterfaceMethod(2)
  public fun get_DegradationReason(): AudioDecoderDegradationReason?

  @InterfaceMethod(3)
  public fun get_MediaSourceStatus(): MediaSourceStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioTrackSupportInfo> {
    public override fun getValue() = ABI.makeIAudioTrackSupportInfo(pointer.getPointer(0))

    public fun setValue(value: IAudioTrackSupportInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioTrackSupportInfo {
    public val __2009990931_Ptr: Pointer?

    public val _2009990931_VtblPtr: Pointer?
      get() = __2009990931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DecoderStatus(): MediaDecoderStatus? {
      val fnPtr = _2009990931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDecoderStatus>()
      val hr = fn.invokeHR(arrayOf(__2009990931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDecoderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Degradation(): AudioDecoderDegradation? {
      val fnPtr = _2009990931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDecoderDegradation>()
      val hr = fn.invokeHR(arrayOf(__2009990931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDecoderDegradation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DegradationReason(): AudioDecoderDegradationReason? {
      val fnPtr = _2009990931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDecoderDegradationReason>()
      val hr = fn.invokeHR(arrayOf(__2009990931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDecoderDegradationReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MediaSourceStatus(): MediaSourceStatus? {
      val fnPtr = _2009990931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceStatus>()
      val hr = fn.invokeHR(arrayOf(__2009990931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAudioTrackSupportInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2009990931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioTrackSupportInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("178beff7cc3944a6b9514a5653f073fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioTrackSupportInfo(ptr: Pointer?): WithDefault =
        IAudioTrackSupportInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioTrackSupportInfo {
      val address = segment.toRawLongValue()
      return makeIAudioTrackSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: IAudioTrackSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2009990931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioTrackSupportInfo): Array<IAudioTrackSupportInfo?> =
        (elements as
        Array<IAudioTrackSupportInfo?>).castToImpl<IAudioTrackSupportInfo,IAudioTrackSupportInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioTrackSupportInfo?> =
        arrayOfNulls<IAudioTrackSupportInfo_Impl>(size) as Array<IAudioTrackSupportInfo?>
  }
}
