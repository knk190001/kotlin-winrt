package Windows.Media.Capture.Frames

import Windows.Media.AudioFrame
import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IAudioMediaFrame.ABI::class)
@Signature("{a3a9feff-8021-441b-9a46-e7f0137b7981}")
@Guid("a3a9feff8021441b9a46e7f0137b7981")
@WinRTInterface("a3a9feff8021441b9a46e7f0137b7981")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioMediaFrame.ByReference::class)
public interface IAudioMediaFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameReference(): MediaFrameReference?

  @InterfaceMethod(1)
  public fun get_AudioEncodingProperties(): AudioEncodingProperties?

  @InterfaceMethod(2)
  public fun GetAudioFrame(): AudioFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioMediaFrame> {
    public override fun getValue() = ABI.makeIAudioMediaFrame(pointer.getPointer(0))

    public fun setValue(value: IAudioMediaFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioMediaFrame {
    public val __1982695047_Ptr: Pointer?

    public val _1982695047_VtblPtr: Pointer?
      get() = __1982695047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameReference(): MediaFrameReference? {
      val fnPtr = _1982695047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReference>()
      val hr = fn.invokeHR(arrayOf(__1982695047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AudioEncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _1982695047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1982695047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAudioFrame(): AudioFrame? {
      val fnPtr = _1982695047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__1982695047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }
  }

  public class IAudioMediaFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1982695047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioMediaFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3a9feff8021441b9a46e7f0137b7981")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioMediaFrame(ptr: Pointer?): WithDefault = IAudioMediaFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioMediaFrame {
      val address = segment.toRawLongValue()
      return makeIAudioMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: IAudioMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1982695047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioMediaFrame): Array<IAudioMediaFrame?> = (elements as
        Array<IAudioMediaFrame?>).castToImpl<IAudioMediaFrame,IAudioMediaFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioMediaFrame?> =
        arrayOfNulls<IAudioMediaFrame_Impl>(size) as Array<IAudioMediaFrame?>
  }
}
