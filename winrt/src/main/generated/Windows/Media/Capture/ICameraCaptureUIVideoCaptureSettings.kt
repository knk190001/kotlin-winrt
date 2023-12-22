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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICameraCaptureUIVideoCaptureSettings.ABI::class)
@Signature("{64e92d1f-a28d-425a-b84f-e568335ff24e}")
@Guid("64e92d1fa28d425ab84fe568335ff24e")
@WinRTInterface("64e92d1fa28d425ab84fe568335ff24e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraCaptureUIVideoCaptureSettings.ByReference::class)
public interface ICameraCaptureUIVideoCaptureSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Format(): CameraCaptureUIVideoFormat?

  @InterfaceMethod(1)
  public fun put_Format(value: CameraCaptureUIVideoFormat?): Unit

  @InterfaceMethod(2)
  public fun get_MaxResolution(): CameraCaptureUIMaxVideoResolution?

  @InterfaceMethod(3)
  public fun put_MaxResolution(value: CameraCaptureUIMaxVideoResolution?): Unit

  @InterfaceMethod(4)
  public fun get_MaxDurationInSeconds(): Float

  @InterfaceMethod(5)
  public fun put_MaxDurationInSeconds(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_AllowTrimming(): Boolean

  @InterfaceMethod(7)
  public fun put_AllowTrimming(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraCaptureUIVideoCaptureSettings> {
    public override fun getValue() =
        ABI.makeICameraCaptureUIVideoCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: ICameraCaptureUIVideoCaptureSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraCaptureUIVideoCaptureSettings {
    public val __113032437_Ptr: Pointer?

    public val _113032437_VtblPtr: Pointer?
      get() = __113032437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Format(): CameraCaptureUIVideoFormat? {
      val fnPtr = _113032437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIVideoFormat>()
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIVideoFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Format(value: CameraCaptureUIVideoFormat?): Unit {
      val fnPtr = _113032437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxResolution(): CameraCaptureUIMaxVideoResolution? {
      val fnPtr = _113032437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIMaxVideoResolution>()
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIMaxVideoResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxResolution(value: CameraCaptureUIMaxVideoResolution?): Unit {
      val fnPtr = _113032437_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxDurationInSeconds(): Float {
      val fnPtr = _113032437_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxDurationInSeconds(value: Float): Unit {
      val fnPtr = _113032437_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AllowTrimming(): Boolean {
      val fnPtr = _113032437_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AllowTrimming(value: Boolean): Unit {
      val fnPtr = _113032437_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__113032437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraCaptureUIVideoCaptureSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __113032437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraCaptureUIVideoCaptureSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e92d1fa28d425ab84fe568335ff24e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraCaptureUIVideoCaptureSettings(ptr: Pointer?): WithDefault =
        ICameraCaptureUIVideoCaptureSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraCaptureUIVideoCaptureSettings {
      val address = segment.toRawLongValue()
      return makeICameraCaptureUIVideoCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: ICameraCaptureUIVideoCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__113032437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraCaptureUIVideoCaptureSettings):
        Array<ICameraCaptureUIVideoCaptureSettings?> = (elements as
        Array<ICameraCaptureUIVideoCaptureSettings?>).castToImpl<ICameraCaptureUIVideoCaptureSettings,ICameraCaptureUIVideoCaptureSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraCaptureUIVideoCaptureSettings?> =
        arrayOfNulls<ICameraCaptureUIVideoCaptureSettings_Impl>(size) as
        Array<ICameraCaptureUIVideoCaptureSettings?>
  }
}
