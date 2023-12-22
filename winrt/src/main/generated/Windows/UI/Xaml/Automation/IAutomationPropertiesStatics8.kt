package Windows.UI.Xaml.Automation

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPropertiesStatics8.ABI::class)
@Signature("{432eca20-171a-560d-8524-3e651d3ad6ca}")
@Guid("432eca20171a560d85243e651d3ad6ca")
@WinRTInterface("432eca20171a560d85243e651d3ad6ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics8.ByReference::class)
public interface IAutomationPropertiesStatics8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDialogProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetIsDialog(element: DependencyObject?): Boolean

  @InterfaceMethod(2)
  public fun SetIsDialog(element: DependencyObject?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics8> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics8(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics8 {
    public val __445074936_Ptr: Pointer?

    public val _445074936_VtblPtr: Pointer?
      get() = __445074936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDialogProperty(): DependencyProperty? {
      val fnPtr = _445074936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIsDialog(element: DependencyObject?): Boolean {
      val fnPtr = _445074936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__445074936_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetIsDialog(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _445074936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074936_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("432eca20171a560d85243e651d3ad6ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics8(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics8 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics8(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics8):
        Array<IAutomationPropertiesStatics8?> = (elements as
        Array<IAutomationPropertiesStatics8?>).castToImpl<IAutomationPropertiesStatics8,IAutomationPropertiesStatics8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics8?> =
        arrayOfNulls<IAutomationPropertiesStatics8_Impl>(size) as
        Array<IAutomationPropertiesStatics8?>
  }
}
