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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaCaptureStatics.ABI::class)
@Signature("{acef81ff-99ed-4645-965e-1925cfc63834}")
@Guid("acef81ff99ed4645965e1925cfc63834")
@WinRTInterface("acef81ff99ed4645965e1925cfc63834")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureStatics.ByReference::class)
public interface IMediaCaptureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsVideoProfileSupported(videoDeviceId: String?): Boolean

  @InterfaceMethod(1)
  public fun FindAllVideoProfiles(videoDeviceId: String?): IVectorView<MediaCaptureVideoProfile?>?

  @InterfaceMethod(2)
  public fun FindConcurrentProfiles(videoDeviceId: String?): IVectorView<MediaCaptureVideoProfile?>?

  @InterfaceMethod(3)
  public fun FindKnownVideoProfiles(videoDeviceId: String?, name: KnownVideoProfile?):
      IVectorView<MediaCaptureVideoProfile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureStatics> {
    public override fun getValue() = ABI.makeIMediaCaptureStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureStatics {
    public val __1838125109_Ptr: Pointer?

    public val _1838125109_VtblPtr: Pointer?
      get() = __1838125109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsVideoProfileSupported(videoDeviceId: String?): Boolean {
      val fnPtr = _1838125109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1838125109_Ptr, marshalToNative(videoDeviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun FindAllVideoProfiles(videoDeviceId: String?):
        IVectorView<MediaCaptureVideoProfile?>? {
      val fnPtr = _1838125109_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1838125109_Ptr, marshalToNative(videoDeviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaCaptureVideoProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindConcurrentProfiles(videoDeviceId: String?):
        IVectorView<MediaCaptureVideoProfile?>? {
      val fnPtr = _1838125109_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1838125109_Ptr, marshalToNative(videoDeviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaCaptureVideoProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindKnownVideoProfiles(videoDeviceId: String?, name: KnownVideoProfile?):
        IVectorView<MediaCaptureVideoProfile?>? {
      val fnPtr = _1838125109_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1838125109_Ptr, marshalToNative(videoDeviceId),
          marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaCaptureVideoProfile?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1838125109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("acef81ff99ed4645965e1925cfc63834")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureStatics(ptr: Pointer?): WithDefault = IMediaCaptureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureStatics {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1838125109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureStatics): Array<IMediaCaptureStatics?> =
        (elements as
        Array<IMediaCaptureStatics?>).castToImpl<IMediaCaptureStatics,IMediaCaptureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureStatics?> =
        arrayOfNulls<IMediaCaptureStatics_Impl>(size) as Array<IMediaCaptureStatics?>
  }
}
