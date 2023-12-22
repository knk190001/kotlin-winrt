package Windows.Media.Devices.Core

import Windows.Foundation.Numerics.Matrix4x4
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

@ABIMarker(ICameraIntrinsics2.ABI::class)
@Signature("{0cdaa447-0798-4b4d-839f-c5ec414db27a}")
@Guid("0cdaa44707984b4d839fc5ec414db27a")
@WinRTInterface("0cdaa44707984b4d839fc5ec414db27a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraIntrinsics2.ByReference::class)
public interface ICameraIntrinsics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UndistortedProjectionTransform(): Matrix4x4?

  @InterfaceMethod(1)
  public fun DistortPoint(input: Point?): Point?

  @InterfaceMethod(2)
  public fun DistortPoints(inputs: Array<Point?>, results: Array<Point?>): Unit

  @InterfaceMethod(3)
  public fun UndistortPoint(input: Point?): Point?

  @InterfaceMethod(4)
  public fun UndistortPoints(inputs: Array<Point?>, results: Array<Point?>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraIntrinsics2> {
    public override fun getValue() = ABI.makeICameraIntrinsics2(pointer.getPointer(0))

    public fun setValue(value: ICameraIntrinsics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraIntrinsics2 {
    public val __191215259_Ptr: Pointer?

    public val _191215259_VtblPtr: Pointer?
      get() = __191215259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UndistortedProjectionTransform(): Matrix4x4? {
      val fnPtr = _191215259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__191215259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DistortPoint(input: Point?): Point? {
      val fnPtr = _191215259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__191215259_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DistortPoints(inputs: Array<Point?>, results: Array<Point?>): Unit {
      val fnPtr = _191215259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__191215259_Ptr, inputs.size,marshalToNative(inputs),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun UndistortPoint(input: Point?): Point? {
      val fnPtr = _191215259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__191215259_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun UndistortPoints(inputs: Array<Point?>, results: Array<Point?>): Unit {
      val fnPtr = _191215259_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__191215259_Ptr, inputs.size,marshalToNative(inputs),
          results.size,marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraIntrinsics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __191215259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraIntrinsics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cdaa44707984b4d839fc5ec414db27a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraIntrinsics2(ptr: Pointer?): WithDefault = ICameraIntrinsics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraIntrinsics2 {
      val address = segment.toRawLongValue()
      return makeICameraIntrinsics2(Pointer(address))
    }

    public override fun toNative(obj: ICameraIntrinsics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__191215259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraIntrinsics2): Array<ICameraIntrinsics2?> =
        (elements as
        Array<ICameraIntrinsics2?>).castToImpl<ICameraIntrinsics2,ICameraIntrinsics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraIntrinsics2?> =
        arrayOfNulls<ICameraIntrinsics2_Impl>(size) as Array<ICameraIntrinsics2?>
  }
}
