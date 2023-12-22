package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewItemStatics2.ABI::class)
@Signature("{d49d016f-abd0-51f3-acf0-118ecceea760}")
@Guid("d49d016fabd051f3acf0118ecceea760")
@WinRTInterface("d49d016fabd051f3acf0118ecceea760")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemStatics2.ByReference::class)
public interface INavigationViewItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectsOnInvokedProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsExpandedProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HasUnrealizedChildrenProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsChildSelectedProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MenuItemsProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MenuItemsSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemStatics2> {
    public override fun getValue() = ABI.makeINavigationViewItemStatics2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemStatics2 {
    public val __589893056_Ptr: Pointer?

    public val _589893056_VtblPtr: Pointer?
      get() = __589893056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectsOnInvokedProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsExpandedProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasUnrealizedChildrenProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsChildSelectedProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MenuItemsProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MenuItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _589893056_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589893056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d49d016fabd051f3acf0118ecceea760")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemStatics2(ptr: Pointer?): WithDefault =
        INavigationViewItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemStatics2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589893056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemStatics2):
        Array<INavigationViewItemStatics2?> = (elements as
        Array<INavigationViewItemStatics2?>).castToImpl<INavigationViewItemStatics2,INavigationViewItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemStatics2?> =
        arrayOfNulls<INavigationViewItemStatics2_Impl>(size) as Array<INavigationViewItemStatics2?>
  }
}
