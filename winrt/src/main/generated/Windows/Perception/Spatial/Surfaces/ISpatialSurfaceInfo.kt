package Windows.Perception.Spatial.Surfaces

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Perception.Spatial.SpatialBoundingOrientedBox
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

@ABIMarker(ISpatialSurfaceInfo.ABI::class)
@Signature("{f8e9ebe7-39b7-3962-bb03-57f56e1fb0a1}")
@Guid("f8e9ebe739b73962bb0357f56e1fb0a1")
@WinRTInterface("f8e9ebe739b73962bb0357f56e1fb0a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceInfo.ByReference::class)
public interface ISpatialSurfaceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_UpdateTime(): DateTime?

  @InterfaceMethod(2)
  public fun TryGetBounds(coordinateSystem: SpatialCoordinateSystem?):
      IReference<SpatialBoundingOrientedBox?>?

  @InterfaceMethod(3)
  public fun TryComputeLatestMeshAsync(maxTrianglesPerCubicMeter: Double):
      IAsyncOperation<SpatialSurfaceMesh?>?

  @InterfaceMethod(4)
  public fun TryComputeLatestMeshAsync(maxTrianglesPerCubicMeter: Double,
      options: SpatialSurfaceMeshOptions?): IAsyncOperation<SpatialSurfaceMesh?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceInfo> {
    public override fun getValue() = ABI.makeISpatialSurfaceInfo(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceInfo {
    public val __496315278_Ptr: Pointer?

    public val _496315278_VtblPtr: Pointer?
      get() = __496315278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _496315278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__496315278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UpdateTime(): DateTime? {
      val fnPtr = _496315278_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__496315278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryGetBounds(coordinateSystem: SpatialCoordinateSystem?):
        IReference<SpatialBoundingOrientedBox?>? {
      val fnPtr = _496315278_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SpatialBoundingOrientedBox?>>()
      val hr = fn.invokeHR(arrayOf(__496315278_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<SpatialBoundingOrientedBox?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryComputeLatestMeshAsync(maxTrianglesPerCubicMeter: Double):
        IAsyncOperation<SpatialSurfaceMesh?>? {
      val fnPtr = _496315278_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialSurfaceMesh?>>()
      val hr = fn.invokeHR(arrayOf(__496315278_Ptr, maxTrianglesPerCubicMeter, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SpatialSurfaceMesh?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryComputeLatestMeshAsync(maxTrianglesPerCubicMeter: Double,
        options: SpatialSurfaceMeshOptions?): IAsyncOperation<SpatialSurfaceMesh?>? {
      val fnPtr = _496315278_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialSurfaceMesh?>>()
      val hr = fn.invokeHR(arrayOf(__496315278_Ptr, maxTrianglesPerCubicMeter,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SpatialSurfaceMesh?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialSurfaceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __496315278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8e9ebe739b73962bb0357f56e1fb0a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceInfo(ptr: Pointer?): WithDefault = ISpatialSurfaceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceInfo {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceInfo(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__496315278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceInfo): Array<ISpatialSurfaceInfo?> =
        (elements as
        Array<ISpatialSurfaceInfo?>).castToImpl<ISpatialSurfaceInfo,ISpatialSurfaceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceInfo?> =
        arrayOfNulls<ISpatialSurfaceInfo_Impl>(size) as Array<ISpatialSurfaceInfo?>
  }
}
