package Windows.Devices.Perception

import Windows.Foundation.IAsyncAction
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Point
import Windows.Foundation.Rect
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

@ABIMarker(IPerceptionDepthCorrelatedCameraIntrinsics.ABI::class)
@Signature("{6548ca01-86de-5be1-6582-807fcf4c95cf}")
@Guid("6548ca0186de5be16582807fcf4c95cf")
@WinRTInterface("6548ca0186de5be16582807fcf4c95cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthCorrelatedCameraIntrinsics.ByReference::class)
public interface IPerceptionDepthCorrelatedCameraIntrinsics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UnprojectPixelAtCorrelatedDepth(pixelCoordinate: Point?,
      depthFrame: PerceptionDepthFrame?): Vector3?

  @InterfaceMethod(1)
  public fun UnprojectPixelsAtCorrelatedDepth(
    sourceCoordinates: Array<Point?>,
    depthFrame: PerceptionDepthFrame?,
    results: Array<Vector3?>
  ): Unit

  @InterfaceMethod(2)
  public fun UnprojectRegionPixelsAtCorrelatedDepthAsync(
    region: Rect?,
    depthFrame: PerceptionDepthFrame?,
    results: Array<Vector3?>
  ): IAsyncAction?

  @InterfaceMethod(3)
  public fun UnprojectAllPixelsAtCorrelatedDepthAsync(depthFrame: PerceptionDepthFrame?,
      results: Array<Vector3?>): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthCorrelatedCameraIntrinsics> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthCorrelatedCameraIntrinsics(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthCorrelatedCameraIntrinsics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthCorrelatedCameraIntrinsics {
    public val __1858866354_Ptr: Pointer?

    public val _1858866354_VtblPtr: Pointer?
      get() = __1858866354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnprojectPixelAtCorrelatedDepth(pixelCoordinate: Point?,
        depthFrame: PerceptionDepthFrame?): Vector3? {
      val fnPtr = _1858866354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1858866354_Ptr, marshalToNative(pixelCoordinate),
          marshalToNative(depthFrame), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnprojectPixelsAtCorrelatedDepth(
      sourceCoordinates: Array<Point?>,
      depthFrame: PerceptionDepthFrame?,
      results: Array<Vector3?>
    ): Unit {
      val fnPtr = _1858866354_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1858866354_Ptr,
          sourceCoordinates.size,marshalToNative(sourceCoordinates), marshalToNative(depthFrame),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UnprojectRegionPixelsAtCorrelatedDepthAsync(
      region: Rect?,
      depthFrame: PerceptionDepthFrame?,
      results: Array<Vector3?>
    ): IAsyncAction? {
      val fnPtr = _1858866354_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1858866354_Ptr, marshalToNative(region),
          marshalToNative(depthFrame), results.size,marshalToNative(results), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UnprojectAllPixelsAtCorrelatedDepthAsync(depthFrame: PerceptionDepthFrame?,
        results: Array<Vector3?>): IAsyncAction? {
      val fnPtr = _1858866354_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1858866354_Ptr, marshalToNative(depthFrame),
          results.size,marshalToNative(results), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthCorrelatedCameraIntrinsics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1858866354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthCorrelatedCameraIntrinsics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6548ca0186de5be16582807fcf4c95cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthCorrelatedCameraIntrinsics(ptr: Pointer?): WithDefault =
        IPerceptionDepthCorrelatedCameraIntrinsics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionDepthCorrelatedCameraIntrinsics {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthCorrelatedCameraIntrinsics(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthCorrelatedCameraIntrinsics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1858866354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthCorrelatedCameraIntrinsics):
        Array<IPerceptionDepthCorrelatedCameraIntrinsics?> = (elements as
        Array<IPerceptionDepthCorrelatedCameraIntrinsics?>).castToImpl<IPerceptionDepthCorrelatedCameraIntrinsics,IPerceptionDepthCorrelatedCameraIntrinsics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthCorrelatedCameraIntrinsics?> =
        arrayOfNulls<IPerceptionDepthCorrelatedCameraIntrinsics_Impl>(size) as
        Array<IPerceptionDepthCorrelatedCameraIntrinsics?>
  }
}
