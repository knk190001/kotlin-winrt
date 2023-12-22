package Windows.UI.Xaml.Media

import Windows.Foundation.Point
import Windows.Foundation.Size
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IArcSegment.ABI::class)
@Signature("{07940c5f-63fb-4469-91be-f1097c168052}")
@Guid("07940c5f63fb446991bef1097c168052")
@WinRTInterface("07940c5f63fb446991bef1097c168052")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IArcSegment.ByReference::class)
public interface IArcSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Point?

  @InterfaceMethod(1)
  public fun put_Point(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_Size(): Size?

  @InterfaceMethod(3)
  public fun put_Size(value: Size?): Unit

  @InterfaceMethod(4)
  public fun get_RotationAngle(): Double

  @InterfaceMethod(5)
  public fun put_RotationAngle(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_IsLargeArc(): Boolean

  @InterfaceMethod(7)
  public fun put_IsLargeArc(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_SweepDirection(): SweepDirection?

  @InterfaceMethod(9)
  public fun put_SweepDirection(value: SweepDirection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IArcSegment> {
    public override fun getValue() = ABI.makeIArcSegment(pointer.getPointer(0))

    public fun setValue(value: IArcSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IArcSegment {
    public val __779967619_Ptr: Pointer?

    public val _779967619_VtblPtr: Pointer?
      get() = __779967619_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Point? {
      val fnPtr = _779967619_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Point(value: Point?): Unit {
      val fnPtr = _779967619_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Size(): Size? {
      val fnPtr = _779967619_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Size(value: Size?): Unit {
      val fnPtr = _779967619_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RotationAngle(): Double {
      val fnPtr = _779967619_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RotationAngle(value: Double): Unit {
      val fnPtr = _779967619_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsLargeArc(): Boolean {
      val fnPtr = _779967619_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsLargeArc(value: Boolean): Unit {
      val fnPtr = _779967619_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SweepDirection(): SweepDirection? {
      val fnPtr = _779967619_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SweepDirection>()
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SweepDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SweepDirection(value: SweepDirection?): Unit {
      val fnPtr = _779967619_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779967619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IArcSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __779967619_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IArcSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07940c5f63fb446991bef1097c168052")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIArcSegment(ptr: Pointer?): WithDefault = IArcSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IArcSegment {
      val address = segment.toRawLongValue()
      return makeIArcSegment(Pointer(address))
    }

    public override fun toNative(obj: IArcSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__779967619_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IArcSegment): Array<IArcSegment?> = (elements as
        Array<IArcSegment?>).castToImpl<IArcSegment,IArcSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IArcSegment?> =
        arrayOfNulls<IArcSegment_Impl>(size) as Array<IArcSegment?>
  }
}
