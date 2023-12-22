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

@ABIMarker(IDatePickerFlyoutStatics.ABI::class)
@Signature("{cd570377-5845-4c12-8c10-592d9fcc7cd9}")
@Guid("cd57037758454c128c10592d9fcc7cd9")
@WinRTInterface("cd57037758454c128c10592d9fcc7cd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutStatics.ByReference::class)
public interface IDatePickerFlyoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CalendarIdentifierProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DayVisibleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MonthVisibleProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_YearVisibleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MinYearProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_MaxYearProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutStatics> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutStatics(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutStatics {
    public val __575308494_Ptr: Pointer?

    public val _575308494_VtblPtr: Pointer?
      get() = __575308494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIdentifierProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DateProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DayVisibleProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MonthVisibleProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_YearVisibleProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MinYearProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MaxYearProperty(): DependencyProperty? {
      val fnPtr = _575308494_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__575308494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __575308494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd57037758454c128c10592d9fcc7cd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutStatics(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutStatics {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__575308494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutStatics):
        Array<IDatePickerFlyoutStatics?> = (elements as
        Array<IDatePickerFlyoutStatics?>).castToImpl<IDatePickerFlyoutStatics,IDatePickerFlyoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutStatics?> =
        arrayOfNulls<IDatePickerFlyoutStatics_Impl>(size) as Array<IDatePickerFlyoutStatics?>
  }
}
