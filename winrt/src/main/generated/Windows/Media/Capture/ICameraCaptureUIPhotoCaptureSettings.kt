package Windows.Media.Capture

import Windows.Foundation.Size
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICameraCaptureUIPhotoCaptureSettings.ABI::class)
@Signature("{b9f5be97-3472-46a8-8a9e-04ce42ccc97d}")
@Guid("b9f5be97347246a88a9e04ce42ccc97d")
@WinRTInterface("b9f5be97347246a88a9e04ce42ccc97d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraCaptureUIPhotoCaptureSettings.ByReference::class)
public interface ICameraCaptureUIPhotoCaptureSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Format(): CameraCaptureUIPhotoFormat?

  @InterfaceMethod(1)
  public fun put_Format(value: CameraCaptureUIPhotoFormat?): Unit

  @InterfaceMethod(2)
  public fun get_MaxResolution(): CameraCaptureUIMaxPhotoResolution?

  @InterfaceMethod(3)
  public fun put_MaxResolution(value: CameraCaptureUIMaxPhotoResolution?): Unit

  @InterfaceMethod(4)
  public fun get_CroppedSizeInPixels(): Size?

  @InterfaceMethod(5)
  public fun put_CroppedSizeInPixels(value: Size?): Unit

  @InterfaceMethod(6)
  public fun get_CroppedAspectRatio(): Size?

  @InterfaceMethod(7)
  public fun put_CroppedAspectRatio(value: Size?): Unit

  @InterfaceMethod(8)
  public fun get_AllowCropping(): Boolean

  @InterfaceMethod(9)
  public fun put_AllowCropping(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraCaptureUIPhotoCaptureSettings> {
    public override fun getValue() =
        ABI.makeICameraCaptureUIPhotoCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: ICameraCaptureUIPhotoCaptureSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraCaptureUIPhotoCaptureSettings {
    public val __368667532_Ptr: Pointer?

    public val _368667532_VtblPtr: Pointer?
      get() = __368667532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Format(): CameraCaptureUIPhotoFormat? {
      val fnPtr = _368667532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIPhotoFormat>()
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIPhotoFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Format(value: CameraCaptureUIPhotoFormat?): Unit {
      val fnPtr = _368667532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxResolution(): CameraCaptureUIMaxPhotoResolution? {
      val fnPtr = _368667532_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIMaxPhotoResolution>()
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIMaxPhotoResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxResolution(value: CameraCaptureUIMaxPhotoResolution?): Unit {
      val fnPtr = _368667532_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CroppedSizeInPixels(): Size? {
      val fnPtr = _368667532_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CroppedSizeInPixels(value: Size?): Unit {
      val fnPtr = _368667532_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CroppedAspectRatio(): Size? {
      val fnPtr = _368667532_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CroppedAspectRatio(value: Size?): Unit {
      val fnPtr = _368667532_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AllowCropping(): Boolean {
      val fnPtr = _368667532_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AllowCropping(value: Boolean): Unit {
      val fnPtr = _368667532_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368667532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraCaptureUIPhotoCaptureSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368667532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraCaptureUIPhotoCaptureSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9f5be97347246a88a9e04ce42ccc97d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraCaptureUIPhotoCaptureSettings(ptr: Pointer?): WithDefault =
        ICameraCaptureUIPhotoCaptureSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraCaptureUIPhotoCaptureSettings {
      val address = segment.toRawLongValue()
      return makeICameraCaptureUIPhotoCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: ICameraCaptureUIPhotoCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368667532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraCaptureUIPhotoCaptureSettings):
        Array<ICameraCaptureUIPhotoCaptureSettings?> = (elements as
        Array<ICameraCaptureUIPhotoCaptureSettings?>).castToImpl<ICameraCaptureUIPhotoCaptureSettings,ICameraCaptureUIPhotoCaptureSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraCaptureUIPhotoCaptureSettings?> =
        arrayOfNulls<ICameraCaptureUIPhotoCaptureSettings_Impl>(size) as
        Array<ICameraCaptureUIPhotoCaptureSettings?>
  }
}
