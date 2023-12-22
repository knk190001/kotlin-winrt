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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastGlobalSettings.ABI::class)
@Signature("{b2cb27a5-70fc-4e17-80bd-6ba0fd3ff3a0}")
@Guid("b2cb27a570fc4e1780bd6ba0fd3ff3a0")
@WinRTInterface("b2cb27a570fc4e1780bd6ba0fd3ff3a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastGlobalSettings.ByReference::class)
public interface IAppBroadcastGlobalSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBroadcastEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsDisabledByPolicy(): Boolean

  @InterfaceMethod(2)
  public fun get_IsGpuConstrained(): Boolean

  @InterfaceMethod(3)
  public fun get_HasHardwareEncoder(): Boolean

  @InterfaceMethod(4)
  public fun put_IsAudioCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsAudioCaptureEnabled(): Boolean

  @InterfaceMethod(6)
  public fun put_IsMicrophoneCaptureEnabledByDefault(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_IsMicrophoneCaptureEnabledByDefault(): Boolean

  @InterfaceMethod(8)
  public fun put_IsEchoCancellationEnabled(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_IsEchoCancellationEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_SystemAudioGain(value: Double): Unit

  @InterfaceMethod(11)
  public fun get_SystemAudioGain(): Double

  @InterfaceMethod(12)
  public fun put_MicrophoneGain(value: Double): Unit

  @InterfaceMethod(13)
  public fun get_MicrophoneGain(): Double

  @InterfaceMethod(14)
  public fun put_IsCameraCaptureEnabledByDefault(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_IsCameraCaptureEnabledByDefault(): Boolean

  @InterfaceMethod(16)
  public fun put_SelectedCameraId(value: String?): Unit

  @InterfaceMethod(17)
  public fun get_SelectedCameraId(): String?

  @InterfaceMethod(18)
  public fun put_CameraOverlayLocation(value: AppBroadcastCameraOverlayLocation?): Unit

  @InterfaceMethod(19)
  public fun get_CameraOverlayLocation(): AppBroadcastCameraOverlayLocation?

  @InterfaceMethod(20)
  public fun put_CameraOverlaySize(value: AppBroadcastCameraOverlaySize?): Unit

  @InterfaceMethod(21)
  public fun get_CameraOverlaySize(): AppBroadcastCameraOverlaySize?

  @InterfaceMethod(22)
  public fun put_IsCursorImageCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(23)
  public fun get_IsCursorImageCaptureEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastGlobalSettings> {
    public override fun getValue() = ABI.makeIAppBroadcastGlobalSettings(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastGlobalSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastGlobalSettings {
    public val __1478028926_Ptr: Pointer?

    public val _1478028926_VtblPtr: Pointer?
      get() = __1478028926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBroadcastEnabled(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsDisabledByPolicy(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsGpuConstrained(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_HasHardwareEncoder(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsAudioCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsAudioCaptureEnabled(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_IsMicrophoneCaptureEnabledByDefault(value: Boolean): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsMicrophoneCaptureEnabledByDefault(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_IsEchoCancellationEnabled(value: Boolean): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsEchoCancellationEnabled(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_SystemAudioGain(value: Double): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_SystemAudioGain(): Double {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_MicrophoneGain(value: Double): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MicrophoneGain(): Double {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IsCameraCaptureEnabledByDefault(value: Boolean): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IsCameraCaptureEnabledByDefault(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_SelectedCameraId(value: String?): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_SelectedCameraId(): String? {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_CameraOverlayLocation(value: AppBroadcastCameraOverlayLocation?): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_CameraOverlayLocation(): AppBroadcastCameraOverlayLocation? {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastCameraOverlayLocation>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastCameraOverlayLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_CameraOverlaySize(value: AppBroadcastCameraOverlaySize?): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_CameraOverlaySize(): AppBroadcastCameraOverlaySize? {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastCameraOverlaySize>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastCameraOverlaySize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_IsCursorImageCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_IsCursorImageCaptureEnabled(): Boolean {
      val fnPtr = _1478028926_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1478028926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastGlobalSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1478028926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastGlobalSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2cb27a570fc4e1780bd6ba0fd3ff3a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastGlobalSettings(ptr: Pointer?): WithDefault =
        IAppBroadcastGlobalSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastGlobalSettings {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastGlobalSettings(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastGlobalSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1478028926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastGlobalSettings):
        Array<IAppBroadcastGlobalSettings?> = (elements as
        Array<IAppBroadcastGlobalSettings?>).castToImpl<IAppBroadcastGlobalSettings,IAppBroadcastGlobalSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastGlobalSettings?> =
        arrayOfNulls<IAppBroadcastGlobalSettings_Impl>(size) as Array<IAppBroadcastGlobalSettings?>
  }
}
