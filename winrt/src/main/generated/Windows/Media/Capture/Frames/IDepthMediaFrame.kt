package Windows.Media.Capture.Frames

import Windows.Media.Devices.Core.CameraIntrinsics
import Windows.Media.Devices.Core.DepthCorrelatedCoordinateMapper
import Windows.Perception.Spatial.SpatialCoordinateSystem
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDepthMediaFrame.ABI::class)
@Signature("{47135e4f-8549-45c0-925b-80d35efdb10a}")
@Guid("47135e4f854945c0925b80d35efdb10a")
@WinRTInterface("47135e4f854945c0925b80d35efdb10a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDepthMediaFrame.ByReference::class)
public interface IDepthMediaFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameReference(): MediaFrameReference?

  @InterfaceMethod(1)
  public fun get_VideoMediaFrame(): VideoMediaFrame?

  @InterfaceMethod(2)
  public fun get_DepthFormat(): DepthMediaFrameFormat?

  @InterfaceMethod(3)
  public fun TryCreateCoordinateMapper(cameraIntrinsics: CameraIntrinsics?,
      coordinateSystem: SpatialCoordinateSystem?): DepthCorrelatedCoordinateMapper?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDepthMediaFrame> {
    public override fun getValue() = ABI.makeIDepthMediaFrame(pointer.getPointer(0))

    public fun setValue(value: IDepthMediaFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDepthMediaFrame {
    public val __368204762_Ptr: Pointer?

    public val _368204762_VtblPtr: Pointer?
      get() = __368204762_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameReference(): MediaFrameReference? {
      val fnPtr = _368204762_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReference>()
      val hr = fn.invokeHR(arrayOf(__368204762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoMediaFrame(): VideoMediaFrame? {
      val fnPtr = _368204762_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoMediaFrame>()
      val hr = fn.invokeHR(arrayOf(__368204762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoMediaFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DepthFormat(): DepthMediaFrameFormat? {
      val fnPtr = _368204762_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DepthMediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__368204762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DepthMediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryCreateCoordinateMapper(cameraIntrinsics: CameraIntrinsics?,
        coordinateSystem: SpatialCoordinateSystem?): DepthCorrelatedCoordinateMapper? {
      val fnPtr = _368204762_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DepthCorrelatedCoordinateMapper>()
      val hr = fn.invokeHR(arrayOf(__368204762_Ptr, marshalToNative(cameraIntrinsics),
          marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DepthCorrelatedCoordinateMapper>(result.getValue())
      return resultValue
    }
  }

  public class IDepthMediaFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368204762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDepthMediaFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47135e4f854945c0925b80d35efdb10a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDepthMediaFrame(ptr: Pointer?): WithDefault = IDepthMediaFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDepthMediaFrame {
      val address = segment.toRawLongValue()
      return makeIDepthMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: IDepthMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368204762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDepthMediaFrame): Array<IDepthMediaFrame?> = (elements as
        Array<IDepthMediaFrame?>).castToImpl<IDepthMediaFrame,IDepthMediaFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDepthMediaFrame?> =
        arrayOfNulls<IDepthMediaFrame_Impl>(size) as Array<IDepthMediaFrame?>
  }
}
