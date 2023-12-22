package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatePickerFlyout2.ABI::class)
@Signature("{cfb18dbb-9931-4119-8bda-54a86fdfac84}")
@Guid("cfb18dbb993141198bda54a86fdfac84")
@WinRTInterface("cfb18dbb993141198bda54a86fdfac84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyout2.ByReference::class)
public interface IDatePickerFlyout2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DayFormat(): String?

  @InterfaceMethod(1)
  public fun put_DayFormat(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_MonthFormat(): String?

  @InterfaceMethod(3)
  public fun put_MonthFormat(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_YearFormat(): String?

  @InterfaceMethod(5)
  public fun put_YearFormat(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyout2> {
    public override fun getValue() = ABI.makeIDatePickerFlyout2(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyout2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyout2 {
    public val __224088959_Ptr: Pointer?

    public val _224088959_VtblPtr: Pointer?
      get() = __224088959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DayFormat(): String? {
      val fnPtr = _224088959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DayFormat(value: String?): Unit {
      val fnPtr = _224088959_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MonthFormat(): String? {
      val fnPtr = _224088959_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MonthFormat(value: String?): Unit {
      val fnPtr = _224088959_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_YearFormat(): String? {
      val fnPtr = _224088959_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_YearFormat(value: String?): Unit {
      val fnPtr = _224088959_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__224088959_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatePickerFlyout2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __224088959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyout2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfb18dbb993141198bda54a86fdfac84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyout2(ptr: Pointer?): WithDefault = IDatePickerFlyout2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyout2 {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyout2(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyout2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__224088959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyout2): Array<IDatePickerFlyout2?> =
        (elements as
        Array<IDatePickerFlyout2?>).castToImpl<IDatePickerFlyout2,IDatePickerFlyout2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyout2?> =
        arrayOfNulls<IDatePickerFlyout2_Impl>(size) as Array<IDatePickerFlyout2?>
  }
}
