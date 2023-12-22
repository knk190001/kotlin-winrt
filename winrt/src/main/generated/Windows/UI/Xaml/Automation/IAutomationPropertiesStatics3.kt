package Windows.UI.Xaml.Automation

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IAutomationPropertiesStatics3.ABI::class)
@Signature("{7b75d735-5cb1-42ad-9b57-5faba8c1867f}")
@Guid("7b75d7355cb142ad9b575faba8c1867f")
@WinRTInterface("7b75d7355cb142ad9b575faba8c1867f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics3.ByReference::class)
public interface IAutomationPropertiesStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PositionInSetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetPositionInSet(element: DependencyObject?): Int

  @InterfaceMethod(2)
  public fun SetPositionInSet(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(3)
  public fun get_SizeOfSetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetSizeOfSet(element: DependencyObject?): Int

  @InterfaceMethod(5)
  public fun SetSizeOfSet(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(6)
  public fun get_LevelProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetLevel(element: DependencyObject?): Int

  @InterfaceMethod(8)
  public fun SetLevel(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(9)
  public fun get_AnnotationsProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetAnnotations(element: DependencyObject?): IVector<AutomationAnnotation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics3> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics3(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics3 {
    public val __445074931_Ptr: Pointer?

    public val _445074931_VtblPtr: Pointer?
      get() = __445074931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PositionInSetProperty(): DependencyProperty? {
      val fnPtr = _445074931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPositionInSet(element: DependencyObject?): Int {
      val fnPtr = _445074931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetPositionInSet(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _445074931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SizeOfSetProperty(): DependencyProperty? {
      val fnPtr = _445074931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSizeOfSet(element: DependencyObject?): Int {
      val fnPtr = _445074931_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetSizeOfSet(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _445074931_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LevelProperty(): DependencyProperty? {
      val fnPtr = _445074931_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetLevel(element: DependencyObject?): Int {
      val fnPtr = _445074931_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun SetLevel(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _445074931_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AnnotationsProperty(): DependencyProperty? {
      val fnPtr = _445074931_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetAnnotations(element: DependencyObject?):
        IVector<AutomationAnnotation?>? {
      val fnPtr = _445074931_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__445074931_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationAnnotation?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPropertiesStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b75d7355cb142ad9b575faba8c1867f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics3(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics3 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics3):
        Array<IAutomationPropertiesStatics3?> = (elements as
        Array<IAutomationPropertiesStatics3?>).castToImpl<IAutomationPropertiesStatics3,IAutomationPropertiesStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics3?> =
        arrayOfNulls<IAutomationPropertiesStatics3_Impl>(size) as
        Array<IAutomationPropertiesStatics3?>
  }
}
