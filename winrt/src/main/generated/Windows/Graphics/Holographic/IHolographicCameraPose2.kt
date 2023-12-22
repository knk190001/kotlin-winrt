package Windows.Graphics.Holographic

import Windows.Foundation.Rect
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

@ABIMarker(IHolographicCameraPose2.ABI::class)
@Signature("{232be073-5d2d-4560-814e-2697c4fce16b}")
@Guid("232be0735d2d4560814e2697c4fce16b")
@WinRTInterface("232be0735d2d4560814e2697c4fce16b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraPose2.ByReference::class)
public interface IHolographicCameraPose2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OverrideViewTransform(coordinateSystem: SpatialCoordinateSystem?,
      coordinateSystemToViewTransform: HolographicStereoTransform?): Unit

  @InterfaceMethod(1)
  public fun OverrideProjectionTransform(projectionTransform: HolographicStereoTransform?): Unit

  @InterfaceMethod(2)
  public fun OverrideViewport(leftViewport: Rect?, rightViewport: Rect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraPose2> {
    public override fun getValue() = ABI.makeIHolographicCameraPose2(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraPose2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraPose2 {
    public val __2126883361_Ptr: Pointer?

    public val _2126883361_VtblPtr: Pointer?
      get() = __2126883361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OverrideViewTransform(coordinateSystem: SpatialCoordinateSystem?,
        coordinateSystemToViewTransform: HolographicStereoTransform?): Unit {
      val fnPtr = _2126883361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126883361_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(coordinateSystemToViewTransform),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun OverrideProjectionTransform(projectionTransform: HolographicStereoTransform?): Unit {
      val fnPtr = _2126883361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126883361_Ptr, marshalToNative(projectionTransform),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OverrideViewport(leftViewport: Rect?, rightViewport: Rect?): Unit {
      val fnPtr = _2126883361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126883361_Ptr, marshalToNative(leftViewport),
          marshalToNative(rightViewport),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCameraPose2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2126883361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraPose2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("232be0735d2d4560814e2697c4fce16b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraPose2(ptr: Pointer?): WithDefault =
        IHolographicCameraPose2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraPose2 {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraPose2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraPose2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2126883361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraPose2): Array<IHolographicCameraPose2?>
        = (elements as
        Array<IHolographicCameraPose2?>).castToImpl<IHolographicCameraPose2,IHolographicCameraPose2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraPose2?> =
        arrayOfNulls<IHolographicCameraPose2_Impl>(size) as Array<IHolographicCameraPose2?>
  }
}
