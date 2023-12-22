package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(ISpatialStageFrameOfReference.ABI::class)
@Signature("{7a8a3464-ad0d-4590-ab86-33062b674926}")
@Guid("7a8a3464ad0d4590ab8633062b674926")
@WinRTInterface("7a8a3464ad0d4590ab8633062b674926")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialStageFrameOfReference.ByReference::class)
public interface ISpatialStageFrameOfReference : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CoordinateSystem(): SpatialCoordinateSystem?

  @InterfaceMethod(1)
  public fun get_MovementRange(): SpatialMovementRange?

  @InterfaceMethod(2)
  public fun get_LookDirectionRange(): SpatialLookDirectionRange?

  @InterfaceMethod(3)
  public fun GetCoordinateSystemAtCurrentLocation(locator: SpatialLocator?):
      SpatialCoordinateSystem?

  @InterfaceMethod(4)
  public fun TryGetMovementBounds(coordinateSystem: SpatialCoordinateSystem?): Array<Vector3?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialStageFrameOfReference> {
    public override fun getValue() = ABI.makeISpatialStageFrameOfReference(pointer.getPointer(0))

    public fun setValue(value: ISpatialStageFrameOfReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialStageFrameOfReference {
    public val __512692092_Ptr: Pointer?

    public val _512692092_VtblPtr: Pointer?
      get() = __512692092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _512692092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__512692092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MovementRange(): SpatialMovementRange? {
      val fnPtr = _512692092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialMovementRange>()
      val hr = fn.invokeHR(arrayOf(__512692092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialMovementRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LookDirectionRange(): SpatialLookDirectionRange? {
      val fnPtr = _512692092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLookDirectionRange>()
      val hr = fn.invokeHR(arrayOf(__512692092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLookDirectionRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCoordinateSystemAtCurrentLocation(locator: SpatialLocator?):
        SpatialCoordinateSystem? {
      val fnPtr = _512692092_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__512692092_Ptr, marshalToNative(locator), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryGetMovementBounds(coordinateSystem: SpatialCoordinateSystem?):
        Array<Vector3?>? {
      val fnPtr = _512692092_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<Vector3>()
      val hr = fn.invokeHR(arrayOf(__512692092_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<Vector3?>
      return resultValue
    }
  }

  public class ISpatialStageFrameOfReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __512692092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialStageFrameOfReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a8a3464ad0d4590ab8633062b674926")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialStageFrameOfReference(ptr: Pointer?): WithDefault =
        ISpatialStageFrameOfReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialStageFrameOfReference {
      val address = segment.toRawLongValue()
      return makeISpatialStageFrameOfReference(Pointer(address))
    }

    public override fun toNative(obj: ISpatialStageFrameOfReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__512692092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialStageFrameOfReference):
        Array<ISpatialStageFrameOfReference?> = (elements as
        Array<ISpatialStageFrameOfReference?>).castToImpl<ISpatialStageFrameOfReference,ISpatialStageFrameOfReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialStageFrameOfReference?> =
        arrayOfNulls<ISpatialStageFrameOfReference_Impl>(size) as
        Array<ISpatialStageFrameOfReference?>
  }
}
