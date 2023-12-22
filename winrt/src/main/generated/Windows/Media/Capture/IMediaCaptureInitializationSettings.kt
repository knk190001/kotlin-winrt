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

@ABIMarker(IMediaCaptureInitializationSettings.ABI::class)
@Signature("{9782ba70-ea65-4900-9356-8ca887726884}")
@Guid("9782ba70ea65490093568ca887726884")
@WinRTInterface("9782ba70ea65490093568ca887726884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureInitializationSettings.ByReference::class)
public interface IMediaCaptureInitializationSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AudioDeviceId(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_AudioDeviceId(): String?

  @InterfaceMethod(2)
  public fun put_VideoDeviceId(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_VideoDeviceId(): String?

  @InterfaceMethod(4)
  public fun put_StreamingCaptureMode(value: StreamingCaptureMode?): Unit

  @InterfaceMethod(5)
  public fun get_StreamingCaptureMode(): StreamingCaptureMode?

  @InterfaceMethod(6)
  public fun put_PhotoCaptureSource(value: PhotoCaptureSource?): Unit

  @InterfaceMethod(7)
  public fun get_PhotoCaptureSource(): PhotoCaptureSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureInitializationSettings> {
    public override fun getValue() =
        ABI.makeIMediaCaptureInitializationSettings(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureInitializationSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureInitializationSettings {
    public val __1466123235_Ptr: Pointer?

    public val _1466123235_VtblPtr: Pointer?
      get() = __1466123235_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AudioDeviceId(value: String?): Unit {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AudioDeviceId(): String? {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_VideoDeviceId(value: String?): Unit {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_VideoDeviceId(): String? {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_StreamingCaptureMode(value: StreamingCaptureMode?): Unit {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_StreamingCaptureMode(): StreamingCaptureMode? {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamingCaptureMode>()
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamingCaptureMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PhotoCaptureSource(value: PhotoCaptureSource?): Unit {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PhotoCaptureSource(): PhotoCaptureSource? {
      val fnPtr = _1466123235_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoCaptureSource>()
      val hr = fn.invokeHR(arrayOf(__1466123235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoCaptureSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureInitializationSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466123235_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureInitializationSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9782ba70ea65490093568ca887726884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureInitializationSettings(ptr: Pointer?): WithDefault =
        IMediaCaptureInitializationSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureInitializationSettings {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureInitializationSettings(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureInitializationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466123235_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureInitializationSettings):
        Array<IMediaCaptureInitializationSettings?> = (elements as
        Array<IMediaCaptureInitializationSettings?>).castToImpl<IMediaCaptureInitializationSettings,IMediaCaptureInitializationSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureInitializationSettings?> =
        arrayOfNulls<IMediaCaptureInitializationSettings_Impl>(size) as
        Array<IMediaCaptureInitializationSettings?>
  }
}
