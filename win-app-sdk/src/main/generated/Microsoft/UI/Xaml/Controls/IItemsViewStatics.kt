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

@ABIMarker(IItemsViewStatics.ABI::class)
@Signature("{c64f1948-77d3-5df5-8d33-c58602d4cfb9}")
@Guid("c64f194877d35df58d33c58602d4cfb9")
@WinRTInterface("c64f194877d35df58d33c58602d4cfb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsViewStatics.ByReference::class)
public interface IItemsViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsItemInvokedEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_LayoutProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SelectionModeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ItemTransitionProviderProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CurrentItemIndexProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ScrollViewProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_VerticalScrollControllerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsViewStatics> {
    public override fun getValue() = ABI.makeIItemsViewStatics(pointer.getPointer(0))

    public fun setValue(value: IItemsViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsViewStatics {
    public val __1321938617_Ptr: Pointer?

    public val _1321938617_VtblPtr: Pointer?
      get() = __1321938617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsItemInvokedEnabledProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LayoutProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SelectionModeProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ItemTransitionProviderProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CurrentItemIndexProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ScrollViewProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_VerticalScrollControllerProperty(): DependencyProperty? {
      val fnPtr = _1321938617_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1321938617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1321938617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c64f194877d35df58d33c58602d4cfb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsViewStatics(ptr: Pointer?): WithDefault = IItemsViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsViewStatics {
      val address = segment.toRawLongValue()
      return makeIItemsViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IItemsViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1321938617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsViewStatics): Array<IItemsViewStatics?> = (elements
        as Array<IItemsViewStatics?>).castToImpl<IItemsViewStatics,IItemsViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsViewStatics?> =
        arrayOfNulls<IItemsViewStatics_Impl>(size) as Array<IItemsViewStatics?>
  }
}
