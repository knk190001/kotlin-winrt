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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILowLagPhotoControl.ABI::class)
@Signature("{6d5c4dd0-fadf-415d-aee6-3baa529300c9}")
@Guid("6d5c4dd0fadf415daee63baa529300c9")
@WinRTInterface("6d5c4dd0fadf415daee63baa529300c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagPhotoControl.ByReference::class)
public interface ILowLagPhotoControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties?):
      MediaRatio?

  @InterfaceMethod(1)
  public fun GetCurrentFrameRate(): MediaRatio?

  @InterfaceMethod(2)
  public fun get_ThumbnailEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_ThumbnailEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ThumbnailFormat(): MediaThumbnailFormat?

  @InterfaceMethod(5)
  public fun put_ThumbnailFormat(value: MediaThumbnailFormat?): Unit

  @InterfaceMethod(6)
  public fun get_DesiredThumbnailSize(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_DesiredThumbnailSize(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_HardwareAcceleratedThumbnailSupported(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagPhotoControl> {
    public override fun getValue() = ABI.makeILowLagPhotoControl(pointer.getPointer(0))

    public fun setValue(value: ILowLagPhotoControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagPhotoControl {
    public val __958530966_Ptr: Pointer?

    public val _958530966_VtblPtr: Pointer?
      get() = __958530966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties?):
        MediaRatio? {
      val fnPtr = _958530966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr, marshalToNative(captureProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentFrameRate(): MediaRatio? {
      val fnPtr = _958530966_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ThumbnailEnabled(): Boolean {
      val fnPtr = _958530966_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ThumbnailEnabled(value: Boolean): Unit {
      val fnPtr = _958530966_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ThumbnailFormat(): MediaThumbnailFormat? {
      val fnPtr = _958530966_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaThumbnailFormat>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaThumbnailFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ThumbnailFormat(value: MediaThumbnailFormat?): Unit {
      val fnPtr = _958530966_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DesiredThumbnailSize(): WinDef.UINT {
      val fnPtr = _958530966_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DesiredThumbnailSize(value: WinDef.UINT): Unit {
      val fnPtr = _958530966_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HardwareAcceleratedThumbnailSupported(): WinDef.UINT {
      val fnPtr = _958530966_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__958530966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ILowLagPhotoControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __958530966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagPhotoControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d5c4dd0fadf415daee63baa529300c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagPhotoControl(ptr: Pointer?): WithDefault = ILowLagPhotoControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagPhotoControl {
      val address = segment.toRawLongValue()
      return makeILowLagPhotoControl(Pointer(address))
    }

    public override fun toNative(obj: ILowLagPhotoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__958530966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagPhotoControl): Array<ILowLagPhotoControl?> =
        (elements as
        Array<ILowLagPhotoControl?>).castToImpl<ILowLagPhotoControl,ILowLagPhotoControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagPhotoControl?> =
        arrayOfNulls<ILowLagPhotoControl_Impl>(size) as Array<ILowLagPhotoControl?>
  }
}
