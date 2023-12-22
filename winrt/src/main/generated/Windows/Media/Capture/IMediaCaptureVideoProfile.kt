package Windows.Media.Capture

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMediaCaptureVideoProfile.ABI::class)
@Signature("{21a073bf-a3ee-4ecf-9ef6-50b0bc4e1305}")
@Guid("21a073bfa3ee4ecf9ef650b0bc4e1305")
@WinRTInterface("21a073bfa3ee4ecf9ef650b0bc4e1305")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureVideoProfile.ByReference::class)
public interface IMediaCaptureVideoProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_VideoDeviceId(): String?

  @InterfaceMethod(2)
  public fun get_SupportedPreviewMediaDescription():
      IVectorView<MediaCaptureVideoProfileMediaDescription?>?

  @InterfaceMethod(3)
  public fun get_SupportedRecordMediaDescription():
      IVectorView<MediaCaptureVideoProfileMediaDescription?>?

  @InterfaceMethod(4)
  public fun get_SupportedPhotoMediaDescription():
      IVectorView<MediaCaptureVideoProfileMediaDescription?>?

  @InterfaceMethod(5)
  public fun GetConcurrency(): IVectorView<MediaCaptureVideoProfile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureVideoProfile> {
    public override fun getValue() = ABI.makeIMediaCaptureVideoProfile(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureVideoProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureVideoProfile {
    public val __1664630680_Ptr: Pointer?

    public val _1664630680_VtblPtr: Pointer?
      get() = __1664630680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoDeviceId(): String? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedPreviewMediaDescription():
        IVectorView<MediaCaptureVideoProfileMediaDescription?>? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfileMediaDescription?>>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MediaCaptureVideoProfileMediaDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SupportedRecordMediaDescription():
        IVectorView<MediaCaptureVideoProfileMediaDescription?>? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfileMediaDescription?>>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MediaCaptureVideoProfileMediaDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SupportedPhotoMediaDescription():
        IVectorView<MediaCaptureVideoProfileMediaDescription?>? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfileMediaDescription?>>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MediaCaptureVideoProfileMediaDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetConcurrency(): IVectorView<MediaCaptureVideoProfile?>? {
      val fnPtr = _1664630680_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1664630680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaCaptureVideoProfile?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureVideoProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1664630680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureVideoProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21a073bfa3ee4ecf9ef650b0bc4e1305")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureVideoProfile(ptr: Pointer?): WithDefault =
        IMediaCaptureVideoProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureVideoProfile {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureVideoProfile(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureVideoProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1664630680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureVideoProfile):
        Array<IMediaCaptureVideoProfile?> = (elements as
        Array<IMediaCaptureVideoProfile?>).castToImpl<IMediaCaptureVideoProfile,IMediaCaptureVideoProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureVideoProfile?> =
        arrayOfNulls<IMediaCaptureVideoProfile_Impl>(size) as Array<IMediaCaptureVideoProfile?>
  }
}
