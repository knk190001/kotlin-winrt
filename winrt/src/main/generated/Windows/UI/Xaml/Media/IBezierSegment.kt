package Windows.UI.Xaml.Media

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

@ABIMarker(IBezierSegment.ABI::class)
@Signature("{af4bb9ee-8984-49b7-81df-3f35994b95eb}")
@Guid("af4bb9ee898449b781df3f35994b95eb")
@WinRTInterface("af4bb9ee898449b781df3f35994b95eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBezierSegment.ByReference::class)
public interface IBezierSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point1(): Point?

  @InterfaceMethod(1)
  public fun put_Point1(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_Point2(): Point?

  @InterfaceMethod(3)
  public fun put_Point2(value: Point?): Unit

  @InterfaceMethod(4)
  public fun get_Point3(): Point?

  @InterfaceMethod(5)
  public fun put_Point3(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBezierSegment>
      {
    public override fun getValue() = ABI.makeIBezierSegment(pointer.getPointer(0))

    public fun setValue(value: IBezierSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBezierSegment {
    public val __238070056_Ptr: Pointer?

    public val _238070056_VtblPtr: Pointer?
      get() = __238070056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point1(): Point? {
      val fnPtr = _238070056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Point1(value: Point?): Unit {
      val fnPtr = _238070056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Point2(): Point? {
      val fnPtr = _238070056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Point2(value: Point?): Unit {
      val fnPtr = _238070056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Point3(): Point? {
      val fnPtr = _238070056_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Point3(value: Point?): Unit {
      val fnPtr = _238070056_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238070056_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBezierSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238070056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBezierSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af4bb9ee898449b781df3f35994b95eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBezierSegment(ptr: Pointer?): WithDefault = IBezierSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBezierSegment {
      val address = segment.toRawLongValue()
      return makeIBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: IBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238070056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBezierSegment): Array<IBezierSegment?> = (elements as
        Array<IBezierSegment?>).castToImpl<IBezierSegment,IBezierSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBezierSegment?> =
        arrayOfNulls<IBezierSegment_Impl>(size) as Array<IBezierSegment?>
  }
}
