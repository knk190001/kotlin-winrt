package Windows.Devices.Perception

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IPerceptionDepthCorrelatedCoordinateMapper.ABI::class)
@Signature("{5b4d9d1d-b5f6-469c-b8c2-b97a45e6863b}")
@Guid("5b4d9d1db5f6469cb8c2b97a45e6863b")
@WinRTInterface("5b4d9d1db5f6469cb8c2b97a45e6863b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthCorrelatedCoordinateMapper.ByReference::class)
public interface IPerceptionDepthCorrelatedCoordinateMapper : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MapPixelToTarget(sourcePixelCoordinate: Point?, depthFrame: PerceptionDepthFrame?):
      Point?

  @InterfaceMethod(1)
  public fun MapPixelsToTarget(
    sourceCoordinates: Array<Point?>,
    depthFrame: PerceptionDepthFrame?,
    results: Array<Point?>
  ): Unit

  @InterfaceMethod(2)
  public fun MapRegionOfPixelsToTargetAsync(
    region: Rect?,
    depthFrame: PerceptionDepthFrame?,
    targetCoordinates: Array<Point?>
  ): IAsyncAction?

  @InterfaceMethod(3)
  public fun MapAllPixelsToTargetAsync(depthFrame: PerceptionDepthFrame?,
      targetCoordinates: Array<Point?>): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthCorrelatedCoordinateMapper> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthCorrelatedCoordinateMapper(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthCorrelatedCoordinateMapper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthCorrelatedCoordinateMapper {
    public val __2113389588_Ptr: Pointer?

    public val _2113389588_VtblPtr: Pointer?
      get() = __2113389588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MapPixelToTarget(sourcePixelCoordinate: Point?,
        depthFrame: PerceptionDepthFrame?): Point? {
      val fnPtr = _2113389588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__2113389588_Ptr, marshalToNative(sourcePixelCoordinate),
          marshalToNative(depthFrame), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun MapPixelsToTarget(
      sourceCoordinates: Array<Point?>,
      depthFrame: PerceptionDepthFrame?,
      results: Array<Point?>
    ): Unit {
      val fnPtr = _2113389588_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2113389588_Ptr,
          sourceCoordinates.size,marshalToNative(sourceCoordinates), marshalToNative(depthFrame),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun MapRegionOfPixelsToTargetAsync(
      region: Rect?,
      depthFrame: PerceptionDepthFrame?,
      targetCoordinates: Array<Point?>
    ): IAsyncAction? {
      val fnPtr = _2113389588_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2113389588_Ptr, marshalToNative(region),
          marshalToNative(depthFrame), targetCoordinates.size,marshalToNative(targetCoordinates),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun MapAllPixelsToTargetAsync(depthFrame: PerceptionDepthFrame?,
        targetCoordinates: Array<Point?>): IAsyncAction? {
      val fnPtr = _2113389588_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2113389588_Ptr, marshalToNative(depthFrame),
          targetCoordinates.size,marshalToNative(targetCoordinates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthCorrelatedCoordinateMapper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2113389588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthCorrelatedCoordinateMapper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b4d9d1db5f6469cb8c2b97a45e6863b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthCorrelatedCoordinateMapper(ptr: Pointer?): WithDefault =
        IPerceptionDepthCorrelatedCoordinateMapper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionDepthCorrelatedCoordinateMapper {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthCorrelatedCoordinateMapper(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthCorrelatedCoordinateMapper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2113389588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthCorrelatedCoordinateMapper):
        Array<IPerceptionDepthCorrelatedCoordinateMapper?> = (elements as
        Array<IPerceptionDepthCorrelatedCoordinateMapper?>).castToImpl<IPerceptionDepthCorrelatedCoordinateMapper,IPerceptionDepthCorrelatedCoordinateMapper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthCorrelatedCoordinateMapper?> =
        arrayOfNulls<IPerceptionDepthCorrelatedCoordinateMapper_Impl>(size) as
        Array<IPerceptionDepthCorrelatedCoordinateMapper?>
  }
}
