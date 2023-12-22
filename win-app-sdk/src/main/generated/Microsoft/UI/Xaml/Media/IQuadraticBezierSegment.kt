package Microsoft.UI.Xaml.Media

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

@ABIMarker(IQuadraticBezierSegment.ABI::class)
@Signature("{6048abe4-7a12-5195-bd61-71dfd0361c38}")
@Guid("6048abe47a125195bd6171dfd0361c38")
@WinRTInterface("6048abe47a125195bd6171dfd0361c38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQuadraticBezierSegment.ByReference::class)
public interface IQuadraticBezierSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point1(): Point?

  @InterfaceMethod(1)
  public fun put_Point1(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_Point2(): Point?

  @InterfaceMethod(3)
  public fun put_Point2(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IQuadraticBezierSegment> {
    public override fun getValue() = ABI.makeIQuadraticBezierSegment(pointer.getPointer(0))

    public fun setValue(value: IQuadraticBezierSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQuadraticBezierSegment {
    public val __952913779_Ptr: Pointer?

    public val _952913779_VtblPtr: Pointer?
      get() = __952913779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point1(): Point? {
      val fnPtr = _952913779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__952913779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Point1(value: Point?): Unit {
      val fnPtr = _952913779_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__952913779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Point2(): Point? {
      val fnPtr = _952913779_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__952913779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Point2(value: Point?): Unit {
      val fnPtr = _952913779_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__952913779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IQuadraticBezierSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __952913779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQuadraticBezierSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6048abe47a125195bd6171dfd0361c38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQuadraticBezierSegment(ptr: Pointer?): WithDefault =
        IQuadraticBezierSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQuadraticBezierSegment {
      val address = segment.toRawLongValue()
      return makeIQuadraticBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: IQuadraticBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__952913779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQuadraticBezierSegment): Array<IQuadraticBezierSegment?>
        = (elements as
        Array<IQuadraticBezierSegment?>).castToImpl<IQuadraticBezierSegment,IQuadraticBezierSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQuadraticBezierSegment?> =
        arrayOfNulls<IQuadraticBezierSegment_Impl>(size) as Array<IQuadraticBezierSegment?>
  }
}
