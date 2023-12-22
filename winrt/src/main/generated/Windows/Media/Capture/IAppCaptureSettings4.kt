package Windows.Media.Capture

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureSettings4.ABI::class)
@Signature("{07c2774c-1a81-482f-a244-049d95f25b0b}")
@Guid("07c2774c1a81482fa244049d95f25b0b")
@WinRTInterface("07c2774c1a81482fa244049d95f25b0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureSettings4.ByReference::class)
public interface IAppCaptureSettings4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsMicrophoneCaptureEnabledByDefault(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsMicrophoneCaptureEnabledByDefault(): Boolean

  @InterfaceMethod(2)
  public fun put_SystemAudioGain(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_SystemAudioGain(): Double

  @InterfaceMethod(4)
  public fun put_MicrophoneGain(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_MicrophoneGain(): Double

  @InterfaceMethod(6)
  public fun put_VideoEncodingFrameRateMode(value: AppCaptureVideoEncodingFrameRateMode?): Unit

  @InterfaceMethod(7)
  public fun get_VideoEncodingFrameRateMode(): AppCaptureVideoEncodingFrameRateMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureSettings4> {
    public override fun getValue() = ABI.makeIAppCaptureSettings4(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureSettings4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureSettings4 {
    public val __1431836364_Ptr: Pointer?

    public val _1431836364_VtblPtr: Pointer?
      get() = __1431836364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsMicrophoneCaptureEnabledByDefault(value: Boolean): Unit {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsMicrophoneCaptureEnabledByDefault(): Boolean {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_SystemAudioGain(value: Double): Unit {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SystemAudioGain(): Double {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_MicrophoneGain(value: Double): Unit {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_MicrophoneGain(): Double {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override
        fun put_VideoEncodingFrameRateMode(value: AppCaptureVideoEncodingFrameRateMode?): Unit {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_VideoEncodingFrameRateMode(): AppCaptureVideoEncodingFrameRateMode? {
      val fnPtr = _1431836364_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureVideoEncodingFrameRateMode>()
      val hr = fn.invokeHR(arrayOf(__1431836364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureVideoEncodingFrameRateMode>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureSettings4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431836364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureSettings4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07c2774c1a81482fa244049d95f25b0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureSettings4(ptr: Pointer?): WithDefault = IAppCaptureSettings4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureSettings4 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureSettings4(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureSettings4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431836364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureSettings4): Array<IAppCaptureSettings4?> =
        (elements as
        Array<IAppCaptureSettings4?>).castToImpl<IAppCaptureSettings4,IAppCaptureSettings4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureSettings4?> =
        arrayOfNulls<IAppCaptureSettings4_Impl>(size) as Array<IAppCaptureSettings4?>
  }
}
