package Windows.Media.Playback

import Windows.Foundation.Numerics.Quaternion
import Windows.Media.MediaProperties.SphericalVideoFrameFormat
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackSphericalVideoProjection.ABI::class)
@Signature("{d405b37c-6f0e-4661-b8ee-d487ba9752d5}")
@Guid("d405b37c6f0e4661b8eed487ba9752d5")
@WinRTInterface("d405b37c6f0e4661b8eed487ba9752d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSphericalVideoProjection.ByReference::class)
public interface IMediaPlaybackSphericalVideoProjection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_FrameFormat(): SphericalVideoFrameFormat?

  @InterfaceMethod(3)
  public fun put_FrameFormat(value: SphericalVideoFrameFormat?): Unit

  @InterfaceMethod(4)
  public fun get_HorizontalFieldOfViewInDegrees(): Double

  @InterfaceMethod(5)
  public fun put_HorizontalFieldOfViewInDegrees(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ViewOrientation(): Quaternion?

  @InterfaceMethod(7)
  public fun put_ViewOrientation(value: Quaternion?): Unit

  @InterfaceMethod(8)
  public fun get_ProjectionMode(): SphericalVideoProjectionMode?

  @InterfaceMethod(9)
  public fun put_ProjectionMode(value: SphericalVideoProjectionMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSphericalVideoProjection> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackSphericalVideoProjection(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSphericalVideoProjection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSphericalVideoProjection {
    public val __129289325_Ptr: Pointer?

    public val _129289325_VtblPtr: Pointer?
      get() = __129289325_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _129289325_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _129289325_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FrameFormat(): SphericalVideoFrameFormat? {
      val fnPtr = _129289325_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SphericalVideoFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SphericalVideoFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FrameFormat(value: SphericalVideoFrameFormat?): Unit {
      val fnPtr = _129289325_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HorizontalFieldOfViewInDegrees(): Double {
      val fnPtr = _129289325_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HorizontalFieldOfViewInDegrees(value: Double): Unit {
      val fnPtr = _129289325_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ViewOrientation(): Quaternion? {
      val fnPtr = _129289325_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ViewOrientation(value: Quaternion?): Unit {
      val fnPtr = _129289325_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ProjectionMode(): SphericalVideoProjectionMode? {
      val fnPtr = _129289325_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SphericalVideoProjectionMode>()
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SphericalVideoProjectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ProjectionMode(value: SphericalVideoProjectionMode?): Unit {
      val fnPtr = _129289325_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129289325_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackSphericalVideoProjection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129289325_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSphericalVideoProjection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d405b37c6f0e4661b8eed487ba9752d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSphericalVideoProjection(ptr: Pointer?): WithDefault =
        IMediaPlaybackSphericalVideoProjection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackSphericalVideoProjection {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSphericalVideoProjection(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSphericalVideoProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129289325_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSphericalVideoProjection):
        Array<IMediaPlaybackSphericalVideoProjection?> = (elements as
        Array<IMediaPlaybackSphericalVideoProjection?>).castToImpl<IMediaPlaybackSphericalVideoProjection,IMediaPlaybackSphericalVideoProjection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackSphericalVideoProjection?> =
        arrayOfNulls<IMediaPlaybackSphericalVideoProjection_Impl>(size) as
        Array<IMediaPlaybackSphericalVideoProjection?>
  }
}
