package Windows.Media.Devices.Core

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Point
import Windows.Perception.Spatial.SpatialCoordinateSystem
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IDepthCorrelatedCoordinateMapper.ABI::class)
@Signature("{f95d89fb-8af0-4cb0-926d-696866e5046a}")
@Guid("f95d89fb8af04cb0926d696866e5046a")
@WinRTInterface("f95d89fb8af04cb0926d696866e5046a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDepthCorrelatedCoordinateMapper.ByReference::class)
public interface IDepthCorrelatedCoordinateMapper : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun UnprojectPoint(sourcePoint: Point?, targetCoordinateSystem: SpatialCoordinateSystem?):
      Vector3?

  @InterfaceMethod(1)
  public fun UnprojectPoints(
    sourcePoints: Array<Point?>,
    targetCoordinateSystem: SpatialCoordinateSystem?,
    results: Array<Vector3?>
  ): Unit

  @InterfaceMethod(2)
  public fun MapPoint(
    sourcePoint: Point?,
    targetCoordinateSystem: SpatialCoordinateSystem?,
    targetCameraIntrinsics: CameraIntrinsics?
  ): Point?

  @InterfaceMethod(3)
  public fun MapPoints(
    sourcePoints: Array<Point?>,
    targetCoordinateSystem: SpatialCoordinateSystem?,
    targetCameraIntrinsics: CameraIntrinsics?,
    results: Array<Point?>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDepthCorrelatedCoordinateMapper> {
    public override fun getValue() = ABI.makeIDepthCorrelatedCoordinateMapper(pointer.getPointer(0))

    public fun setValue(value: IDepthCorrelatedCoordinateMapper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDepthCorrelatedCoordinateMapper, IClosable.WithDefault {
    public val __507287267_Ptr: Pointer?

    public val _507287267_VtblPtr: Pointer?
      get() = __507287267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnprojectPoint(sourcePoint: Point?,
        targetCoordinateSystem: SpatialCoordinateSystem?): Vector3? {
      val fnPtr = _507287267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__507287267_Ptr, marshalToNative(sourcePoint),
          marshalToNative(targetCoordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnprojectPoints(
      sourcePoints: Array<Point?>,
      targetCoordinateSystem: SpatialCoordinateSystem?,
      results: Array<Vector3?>
    ): Unit {
      val fnPtr = _507287267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__507287267_Ptr, sourcePoints.size,marshalToNative(sourcePoints),
          marshalToNative(targetCoordinateSystem), results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun MapPoint(
      sourcePoint: Point?,
      targetCoordinateSystem: SpatialCoordinateSystem?,
      targetCameraIntrinsics: CameraIntrinsics?
    ): Point? {
      val fnPtr = _507287267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__507287267_Ptr, marshalToNative(sourcePoint),
          marshalToNative(targetCoordinateSystem), marshalToNative(targetCameraIntrinsics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun MapPoints(
      sourcePoints: Array<Point?>,
      targetCoordinateSystem: SpatialCoordinateSystem?,
      targetCameraIntrinsics: CameraIntrinsics?,
      results: Array<Point?>
    ): Unit {
      val fnPtr = _507287267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__507287267_Ptr, sourcePoints.size,marshalToNative(sourcePoints),
          marshalToNative(targetCoordinateSystem), marshalToNative(targetCameraIntrinsics),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDepthCorrelatedCoordinateMapper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_507287267_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __507287267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDepthCorrelatedCoordinateMapper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f95d89fb8af04cb0926d696866e5046a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDepthCorrelatedCoordinateMapper(ptr: Pointer?): WithDefault =
        IDepthCorrelatedCoordinateMapper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDepthCorrelatedCoordinateMapper {
      val address = segment.toRawLongValue()
      return makeIDepthCorrelatedCoordinateMapper(Pointer(address))
    }

    public override fun toNative(obj: IDepthCorrelatedCoordinateMapper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__507287267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDepthCorrelatedCoordinateMapper):
        Array<IDepthCorrelatedCoordinateMapper?> = (elements as
        Array<IDepthCorrelatedCoordinateMapper?>).castToImpl<IDepthCorrelatedCoordinateMapper,IDepthCorrelatedCoordinateMapper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDepthCorrelatedCoordinateMapper?> =
        arrayOfNulls<IDepthCorrelatedCoordinateMapper_Impl>(size) as
        Array<IDepthCorrelatedCoordinateMapper?>
  }
}
