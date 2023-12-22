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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPropertiesStatics5.ABI::class)
@Signature("{0be35b26-c8f9-41a2-b4db-e6a7a32b0c34}")
@Guid("0be35b26c8f941a2b4dbe6a7a32b0c34")
@WinRTInterface("0be35b26c8f941a2b4dbe6a7a32b0c34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics5.ByReference::class)
public interface IAutomationPropertiesStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPeripheralProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetIsPeripheral(element: DependencyObject?): Boolean

  @InterfaceMethod(2)
  public fun SetIsPeripheral(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsDataValidForFormProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetIsDataValidForForm(element: DependencyObject?): Boolean

  @InterfaceMethod(5)
  public fun SetIsDataValidForForm(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_FullDescriptionProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetFullDescription(element: DependencyObject?): String?

  @InterfaceMethod(8)
  public fun SetFullDescription(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(9)
  public fun get_LocalizedControlTypeProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetLocalizedControlType(element: DependencyObject?): String?

  @InterfaceMethod(11)
  public fun SetLocalizedControlType(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(12)
  public fun get_DescribedByProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetDescribedBy(element: DependencyObject?): IVector<DependencyObject?>?

  @InterfaceMethod(14)
  public fun get_FlowsToProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun GetFlowsTo(element: DependencyObject?): IVector<DependencyObject?>?

  @InterfaceMethod(16)
  public fun get_FlowsFromProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun GetFlowsFrom(element: DependencyObject?): IVector<DependencyObject?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics5> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics5(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics5 {
    public val __445074933_Ptr: Pointer?

    public val _445074933_VtblPtr: Pointer?
      get() = __445074933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPeripheralProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIsPeripheral(element: DependencyObject?): Boolean {
      val fnPtr = _445074933_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetIsPeripheral(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _445074933_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsDataValidForFormProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetIsDataValidForForm(element: DependencyObject?): Boolean {
      val fnPtr = _445074933_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetIsDataValidForForm(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _445074933_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FullDescriptionProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetFullDescription(element: DependencyObject?): String? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetFullDescription(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _445074933_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_LocalizedControlTypeProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetLocalizedControlType(element: DependencyObject?): String? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetLocalizedControlType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _445074933_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_DescribedByProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetDescribedBy(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_FlowsToProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetFlowsTo(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_FlowsFromProperty(): DependencyProperty? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetFlowsFrom(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _445074933_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__445074933_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPropertiesStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0be35b26c8f941a2b4dbe6a7a32b0c34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics5(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics5 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics5(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics5):
        Array<IAutomationPropertiesStatics5?> = (elements as
        Array<IAutomationPropertiesStatics5?>).castToImpl<IAutomationPropertiesStatics5,IAutomationPropertiesStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics5?> =
        arrayOfNulls<IAutomationPropertiesStatics5_Impl>(size) as
        Array<IAutomationPropertiesStatics5?>
  }
}
