package Windows.Graphics.Holographic

import Windows.Foundation.IReference
import Windows.Foundation.Rect
import Windows.Perception.Spatial.SpatialBoundingFrustum
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicCameraPose.ABI::class)
@Signature("{0d7d7e30-12de-45bd-912b-c7f6561599d1}")
@Guid("0d7d7e3012de45bd912bc7f6561599d1")
@WinRTInterface("0d7d7e3012de45bd912bc7f6561599d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraPose.ByReference::class)
public interface IHolographicCameraPose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HolographicCamera(): HolographicCamera?

  @InterfaceMethod(1)
  public fun get_Viewport(): Rect?

  @InterfaceMethod(2)
  public fun TryGetViewTransform(coordinateSystem: SpatialCoordinateSystem?):
      IReference<HolographicStereoTransform?>?

  @InterfaceMethod(3)
  public fun get_ProjectionTransform(): HolographicStereoTransform?

  @InterfaceMethod(4)
  public fun TryGetCullingFrustum(coordinateSystem: SpatialCoordinateSystem?):
      IReference<SpatialBoundingFrustum?>?

  @InterfaceMethod(5)
  public fun TryGetVisibleFrustum(coordinateSystem: SpatialCoordinateSystem?):
      IReference<SpatialBoundingFrustum?>?

  @InterfaceMethod(6)
  public fun get_NearPlaneDistance(): Double

  @InterfaceMethod(7)
  public fun get_FarPlaneDistance(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraPose> {
    public override fun getValue() = ABI.makeIHolographicCameraPose(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraPose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraPose {
    public val __2146819121_Ptr: Pointer?

    public val _2146819121_VtblPtr: Pointer?
      get() = __2146819121_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HolographicCamera(): HolographicCamera? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCamera>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Viewport(): Rect? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryGetViewTransform(coordinateSystem: SpatialCoordinateSystem?):
        IReference<HolographicStereoTransform?>? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<HolographicStereoTransform?>>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<HolographicStereoTransform?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProjectionTransform(): HolographicStereoTransform? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicStereoTransform>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicStereoTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryGetCullingFrustum(coordinateSystem: SpatialCoordinateSystem?):
        IReference<SpatialBoundingFrustum?>? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SpatialBoundingFrustum?>>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SpatialBoundingFrustum?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryGetVisibleFrustum(coordinateSystem: SpatialCoordinateSystem?):
        IReference<SpatialBoundingFrustum?>? {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SpatialBoundingFrustum?>>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SpatialBoundingFrustum?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_NearPlaneDistance(): Double {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_FarPlaneDistance(): Double {
      val fnPtr = _2146819121_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2146819121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IHolographicCameraPose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2146819121_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraPose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d7d7e3012de45bd912bc7f6561599d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraPose(ptr: Pointer?): WithDefault =
        IHolographicCameraPose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraPose {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraPose(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2146819121_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraPose): Array<IHolographicCameraPose?> =
        (elements as
        Array<IHolographicCameraPose?>).castToImpl<IHolographicCameraPose,IHolographicCameraPose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraPose?> =
        arrayOfNulls<IHolographicCameraPose_Impl>(size) as Array<IHolographicCameraPose?>
  }
}
