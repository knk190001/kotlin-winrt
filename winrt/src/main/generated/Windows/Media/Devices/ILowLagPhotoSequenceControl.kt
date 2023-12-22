package Windows.Media.Devices

import Windows.Media.MediaProperties.IMediaEncodingProperties
import Windows.Media.MediaProperties.MediaRatio
import Windows.Media.MediaProperties.MediaThumbnailFormat
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILowLagPhotoSequenceControl.ABI::class)
@Signature("{3dcf909d-6d16-409c-bafe-b9a594c6fde6}")
@Guid("3dcf909d6d16409cbafeb9a594c6fde6")
@WinRTInterface("3dcf909d6d16409cbafeb9a594c6fde6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagPhotoSequenceControl.ByReference::class)
public interface ILowLagPhotoSequenceControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_MaxPastPhotos(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxPhotosPerSecond(): Float

  @InterfaceMethod(3)
  public fun get_PastPhotoLimit(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_PastPhotoLimit(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_PhotosPerSecondLimit(): Float

  @InterfaceMethod(6)
  public fun put_PhotosPerSecondLimit(value: Float): Unit

  @InterfaceMethod(7)
  public fun GetHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties?):
      MediaRatio?

  @InterfaceMethod(8)
  public fun GetCurrentFrameRate(): MediaRatio?

  @InterfaceMethod(9)
  public fun get_ThumbnailEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_ThumbnailEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_ThumbnailFormat(): MediaThumbnailFormat?

  @InterfaceMethod(12)
  public fun put_ThumbnailFormat(value: MediaThumbnailFormat?): Unit

  @InterfaceMethod(13)
  public fun get_DesiredThumbnailSize(): WinDef.UINT

  @InterfaceMethod(14)
  public fun put_DesiredThumbnailSize(value: WinDef.UINT): Unit

  @InterfaceMethod(15)
  public fun get_HardwareAcceleratedThumbnailSupported(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagPhotoSequenceControl> {
    public override fun getValue() = ABI.makeILowLagPhotoSequenceControl(pointer.getPointer(0))

    public fun setValue(value: ILowLagPhotoSequenceControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagPhotoSequenceControl {
    public val __1314501225_Ptr: Pointer?

    public val _1314501225_VtblPtr: Pointer?
      get() = __1314501225_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxPastPhotos(): WinDef.UINT {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxPhotosPerSecond(): Float {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PastPhotoLimit(): WinDef.UINT {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_PastPhotoLimit(value: WinDef.UINT): Unit {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PhotosPerSecondLimit(): Float {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_PhotosPerSecondLimit(value: Float): Unit {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties?):
        MediaRatio? {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, marshalToNative(captureProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetCurrentFrameRate(): MediaRatio? {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ThumbnailEnabled(): Boolean {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_ThumbnailEnabled(value: Boolean): Unit {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ThumbnailFormat(): MediaThumbnailFormat? {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaThumbnailFormat>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaThumbnailFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ThumbnailFormat(value: MediaThumbnailFormat?): Unit {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_DesiredThumbnailSize(): WinDef.UINT {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_DesiredThumbnailSize(value: WinDef.UINT): Unit {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_HardwareAcceleratedThumbnailSupported(): WinDef.UINT {
      val fnPtr = _1314501225_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1314501225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ILowLagPhotoSequenceControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314501225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagPhotoSequenceControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3dcf909d6d16409cbafeb9a594c6fde6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagPhotoSequenceControl(ptr: Pointer?): WithDefault =
        ILowLagPhotoSequenceControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagPhotoSequenceControl {
      val address = segment.toRawLongValue()
      return makeILowLagPhotoSequenceControl(Pointer(address))
    }

    public override fun toNative(obj: ILowLagPhotoSequenceControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314501225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagPhotoSequenceControl):
        Array<ILowLagPhotoSequenceControl?> = (elements as
        Array<ILowLagPhotoSequenceControl?>).castToImpl<ILowLagPhotoSequenceControl,ILowLagPhotoSequenceControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagPhotoSequenceControl?> =
        arrayOfNulls<ILowLagPhotoSequenceControl_Impl>(size) as Array<ILowLagPhotoSequenceControl?>
  }
}
