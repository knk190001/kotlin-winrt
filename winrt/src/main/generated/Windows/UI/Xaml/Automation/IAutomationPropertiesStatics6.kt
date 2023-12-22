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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPropertiesStatics6.ABI::class)
@Signature("{c61e030f-eb49-4e5d-b012-4c1c96c3901b}")
@Guid("c61e030feb494e5db0124c1c96c3901b")
@WinRTInterface("c61e030feb494e5db0124c1c96c3901b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics6.ByReference::class)
public interface IAutomationPropertiesStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CultureProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetCulture(element: DependencyObject?): Int

  @InterfaceMethod(2)
  public fun SetCulture(element: DependencyObject?, value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics6> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics6(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics6 {
    public val __445074934_Ptr: Pointer?

    public val _445074934_VtblPtr: Pointer?
      get() = __445074934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CultureProperty(): DependencyProperty? {
      val fnPtr = _445074934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCulture(element: DependencyObject?): Int {
      val fnPtr = _445074934_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__445074934_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetCulture(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _445074934_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074934_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c61e030feb494e5db0124c1c96c3901b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics6(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics6 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics6(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics6):
        Array<IAutomationPropertiesStatics6?> = (elements as
        Array<IAutomationPropertiesStatics6?>).castToImpl<IAutomationPropertiesStatics6,IAutomationPropertiesStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics6?> =
        arrayOfNulls<IAutomationPropertiesStatics6_Impl>(size) as
        Array<IAutomationPropertiesStatics6?>
  }
}
