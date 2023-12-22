package Windows.UI.Xaml.Input

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IFocusManagerStatics4.ABI::class)
@Signature("{29276e9c-1c6c-414a-ba1c-96efd5962bcd}")
@Guid("29276e9c1c6c414aba1c96efd5962bcd")
@WinRTInterface("29276e9c1c6c414aba1c96efd5962bcd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics4.ByReference::class)
public interface IFocusManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): Boolean

  @InterfaceMethod(1)
  public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?): DependencyObject?

  @InterfaceMethod(2)
  public fun FindFirstFocusableElement(searchScope: DependencyObject?): DependencyObject?

  @InterfaceMethod(3)
  public fun FindLastFocusableElement(searchScope: DependencyObject?): DependencyObject?

  @InterfaceMethod(4)
  public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics4> {
    public override fun getValue() = ABI.makeIFocusManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics4 {
    public val __687728570_Ptr: Pointer?

    public val _687728570_VtblPtr: Pointer?
      get() = __687728570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): Boolean {
      val fnPtr = _687728570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__687728570_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?):
        DependencyObject? {
      val fnPtr = _687728570_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__687728570_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindFirstFocusableElement(searchScope: DependencyObject?):
        DependencyObject? {
      val fnPtr = _687728570_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__687728570_Ptr, marshalToNative(searchScope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindLastFocusableElement(searchScope: DependencyObject?):
        DependencyObject? {
      val fnPtr = _687728570_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__687728570_Ptr, marshalToNative(searchScope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): DependencyObject? {
      val fnPtr = _687728570_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__687728570_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687728570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29276e9c1c6c414aba1c96efd5962bcd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics4(ptr: Pointer?): WithDefault =
        IFocusManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687728570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics4): Array<IFocusManagerStatics4?> =
        (elements as
        Array<IFocusManagerStatics4?>).castToImpl<IFocusManagerStatics4,IFocusManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics4?> =
        arrayOfNulls<IFocusManagerStatics4_Impl>(size) as Array<IFocusManagerStatics4?>
  }
}
