package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(IControlStatics3.ABI::class)
@Signature("{aad15e61-e4b9-4d72-b653-934149aa5003}")
@Guid("aad15e61e4b94d72b653934149aa5003")
@WinRTInterface("aad15e61e4b94d72b653934149aa5003")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlStatics3.ByReference::class)
public interface IControlStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseSystemFocusVisualsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsTemplateFocusTargetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun GetIsTemplateFocusTarget(element: FrameworkElement?): Boolean

  @InterfaceMethod(3)
  public fun SetIsTemplateFocusTarget(element: FrameworkElement?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlStatics3> {
    public override fun getValue() = ABI.makeIControlStatics3(pointer.getPointer(0))

    public fun setValue(value: IControlStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlStatics3 {
    public val __2067758575_Ptr: Pointer?

    public val _2067758575_VtblPtr: Pointer?
      get() = __2067758575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseSystemFocusVisualsProperty(): DependencyProperty? {
      val fnPtr = _2067758575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsTemplateFocusTargetProperty(): DependencyProperty? {
      val fnPtr = _2067758575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsTemplateFocusTarget(element: FrameworkElement?): Boolean {
      val fnPtr = _2067758575_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067758575_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetIsTemplateFocusTarget(element: FrameworkElement?, value: Boolean): Unit {
      val fnPtr = _2067758575_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067758575_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067758575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aad15e61e4b94d72b653934149aa5003")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlStatics3(ptr: Pointer?): WithDefault = IControlStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlStatics3 {
      val address = segment.toRawLongValue()
      return makeIControlStatics3(Pointer(address))
    }

    public override fun toNative(obj: IControlStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067758575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlStatics3): Array<IControlStatics3?> = (elements as
        Array<IControlStatics3?>).castToImpl<IControlStatics3,IControlStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlStatics3?> =
        arrayOfNulls<IControlStatics3_Impl>(size) as Array<IControlStatics3?>
  }
}
