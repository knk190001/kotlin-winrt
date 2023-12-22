package Windows.Media.Audio

import Windows.Media.Capture.MediaCategory
import Windows.Media.Devices.AudioDeviceRole
import Windows.Media.Render.AudioRenderCategory
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

@ABIMarker(IAudioStateMonitorStatics.ABI::class)
@Signature("{6374ea4c-1b3b-4001-94d9-dd225330fa40}")
@Guid("6374ea4c1b3b400194d9dd225330fa40")
@WinRTInterface("6374ea4c1b3b400194d9dd225330fa40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStateMonitorStatics.ByReference::class)
public interface IAudioStateMonitorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForRenderMonitoring(): AudioStateMonitor?

  @InterfaceMethod(1)
  public fun CreateForRenderMonitoring(category: AudioRenderCategory?): AudioStateMonitor?

  @InterfaceMethod(2)
  public fun CreateForRenderMonitoring(category: AudioRenderCategory?, role: AudioDeviceRole?):
      AudioStateMonitor?

  @InterfaceMethod(3)
  public fun CreateForRenderMonitoringWithCategoryAndDeviceId(category: AudioRenderCategory?,
      deviceId: String?): AudioStateMonitor?

  @InterfaceMethod(4)
  public fun CreateForCaptureMonitoring(): AudioStateMonitor?

  @InterfaceMethod(5)
  public fun CreateForCaptureMonitoring(category: MediaCategory?): AudioStateMonitor?

  @InterfaceMethod(6)
  public fun CreateForCaptureMonitoring(category: MediaCategory?, role: AudioDeviceRole?):
      AudioStateMonitor?

  @InterfaceMethod(7)
  public fun CreateForCaptureMonitoringWithCategoryAndDeviceId(category: MediaCategory?,
      deviceId: String?): AudioStateMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStateMonitorStatics> {
    public override fun getValue() = ABI.makeIAudioStateMonitorStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioStateMonitorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStateMonitorStatics {
    public val __1280590542_Ptr: Pointer?

    public val _1280590542_VtblPtr: Pointer?
      get() = __1280590542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForRenderMonitoring(): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForRenderMonitoring(category: AudioRenderCategory?):
        AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateForRenderMonitoring(category: AudioRenderCategory?,
        role: AudioDeviceRole?): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category),
          marshalToNative(role), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun CreateForRenderMonitoringWithCategoryAndDeviceId(category: AudioRenderCategory?,
        deviceId: String?): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category),
          marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateForCaptureMonitoring(): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateForCaptureMonitoring(category: MediaCategory?): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateForCaptureMonitoring(category: MediaCategory?,
        role: AudioDeviceRole?): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category),
          marshalToNative(role), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateForCaptureMonitoringWithCategoryAndDeviceId(category: MediaCategory?,
        deviceId: String?): AudioStateMonitor? {
      val fnPtr = _1280590542_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1280590542_Ptr, marshalToNative(category),
          marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStateMonitorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1280590542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStateMonitorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6374ea4c1b3b400194d9dd225330fa40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStateMonitorStatics(ptr: Pointer?): WithDefault =
        IAudioStateMonitorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStateMonitorStatics {
      val address = segment.toRawLongValue()
      return makeIAudioStateMonitorStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioStateMonitorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1280590542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStateMonitorStatics):
        Array<IAudioStateMonitorStatics?> = (elements as
        Array<IAudioStateMonitorStatics?>).castToImpl<IAudioStateMonitorStatics,IAudioStateMonitorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStateMonitorStatics?> =
        arrayOfNulls<IAudioStateMonitorStatics_Impl>(size) as Array<IAudioStateMonitorStatics?>
  }
}
