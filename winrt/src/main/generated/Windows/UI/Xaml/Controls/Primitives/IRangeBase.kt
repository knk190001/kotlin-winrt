package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IRangeBase.ABI::class)
@Signature("{fa002c1a-494e-46cf-91d4-e14a8d798675}")
@Guid("fa002c1a494e46cf91d4e14a8d798675")
@WinRTInterface("fa002c1a494e46cf91d4e14a8d798675")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBase.ByReference::class)
public interface IRangeBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Minimum(): Double

  @InterfaceMethod(1)
  public fun put_Minimum(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Maximum(): Double

  @InterfaceMethod(3)
  public fun put_Maximum(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_SmallChange(): Double

  @InterfaceMethod(5)
  public fun put_SmallChange(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_LargeChange(): Double

  @InterfaceMethod(7)
  public fun put_LargeChange(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_Value(): Double

  @InterfaceMethod(9)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(10)
  public fun add_ValueChanged(handler: RangeBaseValueChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ValueChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRangeBase> {
    public override fun getValue() = ABI.makeIRangeBase(pointer.getPointer(0))

    public fun setValue(value: IRangeBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBase {
    public val __1613068882_Ptr: Pointer?

    public val _1613068882_VtblPtr: Pointer?
      get() = __1613068882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Minimum(): Double {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Minimum(value: Double): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Maximum(): Double {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Maximum(value: Double): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SmallChange(): Double {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_SmallChange(value: Double): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LargeChange(): Double {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_LargeChange(value: Double): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Value(): Double {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ValueChanged(handler: RangeBaseValueChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ValueChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1613068882_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1613068882_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRangeBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1613068882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa002c1a494e46cf91d4e14a8d798675")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBase(ptr: Pointer?): WithDefault = IRangeBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBase {
      val address = segment.toRawLongValue()
      return makeIRangeBase(Pointer(address))
    }

    public override fun toNative(obj: IRangeBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1613068882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBase): Array<IRangeBase?> = (elements as
        Array<IRangeBase?>).castToImpl<IRangeBase,IRangeBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBase?> = arrayOfNulls<IRangeBase_Impl>(size)
        as Array<IRangeBase?>
  }
}
