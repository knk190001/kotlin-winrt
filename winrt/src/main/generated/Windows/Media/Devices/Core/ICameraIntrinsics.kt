package Windows.Media.Devices.Core

import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Point
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICameraIntrinsics.ABI::class)
@Signature("{0aa6ed32-6589-49da-afde-594270ca0aac}")
@Guid("0aa6ed32658949daafde594270ca0aac")
@WinRTInterface("0aa6ed32658949daafde594270ca0aac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraIntrinsics.ByReference::class)
public interface ICameraIntrinsics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FocalLength(): Vector2?

  @InterfaceMethod(1)
  public fun get_PrincipalPoint(): Vector2?

  @InterfaceMethod(2)
  public fun get_RadialDistortion(): Vector3?

  @InterfaceMethod(3)
  public fun get_TangentialDistortion(): Vector2?

  @InterfaceMethod(4)
  public fun get_ImageWidth(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_ImageHeight(): WinDef.UINT

  @InterfaceMethod(6)
  public fun ProjectOntoFrame(coordinate: Vector3?): Point?

  @InterfaceMethod(7)
  public fun UnprojectAtUnitDepth(pixelCoordinate: Point?): Vector2?

  @InterfaceMethod(8)
  public fun ProjectManyOntoFrame(coordinates: Array<Vector3?>, results: Array<Point?>): Unit

  @InterfaceMethod(9)
  public fun UnprojectPixelsAtUnitDepth(pixelCoordinates: Array<Point?>, results: Array<Vector2?>):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraIntrinsics> {
    public override fun getValue() = ABI.makeICameraIntrinsics(pointer.getPointer(0))

    public fun setValue(value: ICameraIntrinsics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraIntrinsics {
    public val __1656399753_Ptr: Pointer?

    public val _1656399753_VtblPtr: Pointer?
      get() = __1656399753_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FocalLength(): Vector2? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrincipalPoint(): Vector2? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RadialDistortion(): Vector3? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TangentialDistortion(): Vector2? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ImageWidth(): WinDef.UINT {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ImageHeight(): WinDef.UINT {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun ProjectOntoFrame(coordinate: Vector3?): Point? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr, marshalToNative(coordinate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun UnprojectAtUnitDepth(pixelCoordinate: Point?): Vector2? {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr, marshalToNative(pixelCoordinate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ProjectManyOntoFrame(coordinates: Array<Vector3?>, results: Array<Point?>):
        Unit {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr, coordinates.size,marshalToNative(coordinates),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun UnprojectPixelsAtUnitDepth(pixelCoordinates: Array<Point?>,
        results: Array<Vector2?>): Unit {
      val fnPtr = _1656399753_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656399753_Ptr,
          pixelCoordinates.size,marshalToNative(pixelCoordinates),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraIntrinsics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1656399753_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraIntrinsics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0aa6ed32658949daafde594270ca0aac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraIntrinsics(ptr: Pointer?): WithDefault = ICameraIntrinsics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraIntrinsics {
      val address = segment.toRawLongValue()
      return makeICameraIntrinsics(Pointer(address))
    }

    public override fun toNative(obj: ICameraIntrinsics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656399753_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraIntrinsics): Array<ICameraIntrinsics?> = (elements
        as Array<ICameraIntrinsics?>).castToImpl<ICameraIntrinsics,ICameraIntrinsics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraIntrinsics?> =
        arrayOfNulls<ICameraIntrinsics_Impl>(size) as Array<ICameraIntrinsics?>
  }
}
