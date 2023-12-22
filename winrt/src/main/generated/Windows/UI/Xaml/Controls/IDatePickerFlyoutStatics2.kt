package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IDatePickerFlyoutStatics2.ABI::class)
@Signature("{afd3e569-81e6-4b54-84a9-68079b73e34e}")
@Guid("afd3e56981e64b5484a968079b73e34e")
@WinRTInterface("afd3e56981e64b5484a968079b73e34e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutStatics2.ByReference::class)
public interface IDatePickerFlyoutStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DayFormatProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MonthFormatProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_YearFormatProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutStatics2> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutStatics2(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutStatics2 {
    public val __654694080_Ptr: Pointer?

    public val _654694080_VtblPtr: Pointer?
      get() = __654694080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DayFormatProperty(): DependencyProperty? {
      val fnPtr = _654694080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__654694080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MonthFormatProperty(): DependencyProperty? {
      val fnPtr = _654694080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__654694080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_YearFormatProperty(): DependencyProperty? {
      val fnPtr = _654694080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__654694080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyoutStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654694080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afd3e56981e64b5484a968079b73e34e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutStatics2(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutStatics2 {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654694080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutStatics2):
        Array<IDatePickerFlyoutStatics2?> = (elements as
        Array<IDatePickerFlyoutStatics2?>).castToImpl<IDatePickerFlyoutStatics2,IDatePickerFlyoutStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutStatics2?> =
        arrayOfNulls<IDatePickerFlyoutStatics2_Impl>(size) as Array<IDatePickerFlyoutStatics2?>
  }
}
