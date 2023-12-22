package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRatingControl.ABI::class)
@Signature("{5488193b-ea4b-52c6-8544-c063219bcd90}")
@Guid("5488193bea4b52c68544c063219bcd90")
@WinRTInterface("5488193bea4b52c68544c063219bcd90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingControl.ByReference::class)
public interface IRatingControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Caption(): String?

  @InterfaceMethod(1)
  public fun put_Caption(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_InitialSetValue(): Int

  @InterfaceMethod(3)
  public fun put_InitialSetValue(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_IsClearEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsClearEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(7)
  public fun put_IsReadOnly(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_MaxRating(): Int

  @InterfaceMethod(9)
  public fun put_MaxRating(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_PlaceholderValue(): Double

  @InterfaceMethod(11)
  public fun put_PlaceholderValue(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_ItemInfo(): RatingItemInfo?

  @InterfaceMethod(13)
  public fun put_ItemInfo(value: RatingItemInfo?): Unit

  @InterfaceMethod(14)
  public fun get_Value(): Double

  @InterfaceMethod(15)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(16)
  public fun add_ValueChanged(handler: TypedEventHandler<RatingControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_ValueChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRatingControl>
      {
    public override fun getValue() = ABI.makeIRatingControl(pointer.getPointer(0))

    public fun setValue(value: IRatingControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingControl {
    public val __1229897369_Ptr: Pointer?

    public val _1229897369_VtblPtr: Pointer?
      get() = __1229897369_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Caption(): String? {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Caption(value: String?): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialSetValue(): Int {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_InitialSetValue(value: Int): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsClearEnabled(): Boolean {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsClearEnabled(value: Boolean): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsReadOnly(value: Boolean): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MaxRating(): Int {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MaxRating(value: Int): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PlaceholderValue(): Double {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_PlaceholderValue(value: Double): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ItemInfo(): RatingItemInfo? {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatingItemInfo>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatingItemInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ItemInfo(value: RatingItemInfo?): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Value(): Double {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_ValueChanged(handler: TypedEventHandler<RatingControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_ValueChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1229897369_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229897369_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRatingControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1229897369_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5488193bea4b52c68544c063219bcd90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingControl(ptr: Pointer?): WithDefault = IRatingControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingControl {
      val address = segment.toRawLongValue()
      return makeIRatingControl(Pointer(address))
    }

    public override fun toNative(obj: IRatingControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1229897369_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingControl): Array<IRatingControl?> = (elements as
        Array<IRatingControl?>).castToImpl<IRatingControl,IRatingControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingControl?> =
        arrayOfNulls<IRatingControl_Impl>(size) as Array<IRatingControl?>
  }
}
