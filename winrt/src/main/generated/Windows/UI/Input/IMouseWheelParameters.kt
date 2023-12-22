package Windows.UI.Input

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMouseWheelParameters.ABI::class)
@Signature("{ead0ca44-9ded-4037-8149-5e4cc2564468}")
@Guid("ead0ca449ded403781495e4cc2564468")
@WinRTInterface("ead0ca449ded403781495e4cc2564468")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMouseWheelParameters.ByReference::class)
public interface IMouseWheelParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CharTranslation(): Point?

  @InterfaceMethod(1)
  public fun put_CharTranslation(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_DeltaScale(): Float

  @InterfaceMethod(3)
  public fun put_DeltaScale(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_DeltaRotationAngle(): Float

  @InterfaceMethod(5)
  public fun put_DeltaRotationAngle(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_PageTranslation(): Point?

  @InterfaceMethod(7)
  public fun put_PageTranslation(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMouseWheelParameters> {
    public override fun getValue() = ABI.makeIMouseWheelParameters(pointer.getPointer(0))

    public fun setValue(value: IMouseWheelParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMouseWheelParameters {
    public val __1144863246_Ptr: Pointer?

    public val _1144863246_VtblPtr: Pointer?
      get() = __1144863246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CharTranslation(): Point? {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CharTranslation(value: Point?): Unit {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeltaScale(): Float {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DeltaScale(value: Float): Unit {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DeltaRotationAngle(): Float {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DeltaRotationAngle(value: Float): Unit {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PageTranslation(): Point? {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PageTranslation(value: Point?): Unit {
      val fnPtr = _1144863246_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1144863246_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMouseWheelParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1144863246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMouseWheelParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ead0ca449ded403781495e4cc2564468")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMouseWheelParameters(ptr: Pointer?): WithDefault =
        IMouseWheelParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMouseWheelParameters {
      val address = segment.toRawLongValue()
      return makeIMouseWheelParameters(Pointer(address))
    }

    public override fun toNative(obj: IMouseWheelParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1144863246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMouseWheelParameters): Array<IMouseWheelParameters?> =
        (elements as
        Array<IMouseWheelParameters?>).castToImpl<IMouseWheelParameters,IMouseWheelParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMouseWheelParameters?> =
        arrayOfNulls<IMouseWheelParameters_Impl>(size) as Array<IMouseWheelParameters?>
  }
}
