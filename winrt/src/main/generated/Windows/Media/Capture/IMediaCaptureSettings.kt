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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaCaptureSettings.ABI::class)
@Signature("{1d83aafe-6d45-4477-8dc4-ac5bc01c4091}")
@Guid("1d83aafe6d4544778dc4ac5bc01c4091")
@WinRTInterface("1d83aafe6d4544778dc4ac5bc01c4091")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureSettings.ByReference::class)
public interface IMediaCaptureSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioDeviceId(): String?

  @InterfaceMethod(1)
  public fun get_VideoDeviceId(): String?

  @InterfaceMethod(2)
  public fun get_StreamingCaptureMode(): StreamingCaptureMode?

  @InterfaceMethod(3)
  public fun get_PhotoCaptureSource(): PhotoCaptureSource?

  @InterfaceMethod(4)
  public fun get_VideoDeviceCharacteristic(): VideoDeviceCharacteristic?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureSettings> {
    public override fun getValue() = ABI.makeIMediaCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureSettings {
    public val __1030992675_Ptr: Pointer?

    public val _1030992675_VtblPtr: Pointer?
      get() = __1030992675_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioDeviceId(): String? {
      val fnPtr = _1030992675_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1030992675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoDeviceId(): String? {
      val fnPtr = _1030992675_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1030992675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_StreamingCaptureMode(): StreamingCaptureMode? {
      val fnPtr = _1030992675_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamingCaptureMode>()
      val hr = fn.invokeHR(arrayOf(__1030992675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamingCaptureMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhotoCaptureSource(): PhotoCaptureSource? {
      val fnPtr = _1030992675_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoCaptureSource>()
      val hr = fn.invokeHR(arrayOf(__1030992675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoCaptureSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VideoDeviceCharacteristic(): VideoDeviceCharacteristic? {
      val fnPtr = _1030992675_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceCharacteristic>()
      val hr = fn.invokeHR(arrayOf(__1030992675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoDeviceCharacteristic>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030992675_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d83aafe6d4544778dc4ac5bc01c4091")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureSettings(ptr: Pointer?): WithDefault =
        IMediaCaptureSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureSettings {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030992675_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureSettings): Array<IMediaCaptureSettings?> =
        (elements as
        Array<IMediaCaptureSettings?>).castToImpl<IMediaCaptureSettings,IMediaCaptureSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureSettings?> =
        arrayOfNulls<IMediaCaptureSettings_Impl>(size) as Array<IMediaCaptureSettings?>
  }
}
