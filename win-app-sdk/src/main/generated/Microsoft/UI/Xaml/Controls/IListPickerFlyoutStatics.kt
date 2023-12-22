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

@ABIMarker(IListPickerFlyoutStatics.ABI::class)
@Signature("{9e485154-489d-5542-8e62-3c91a11814b5}")
@Guid("9e485154489d55428e623c91a11814b5")
@WinRTInterface("9e485154489d55428e623c91a11814b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListPickerFlyoutStatics.ByReference::class)
public interface IListPickerFlyoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DisplayMemberPathProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SelectionModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SelectedIndexProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_SelectedValueProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SelectedValuePathProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListPickerFlyoutStatics> {
    public override fun getValue() = ABI.makeIListPickerFlyoutStatics(pointer.getPointer(0))

    public fun setValue(value: IListPickerFlyoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListPickerFlyoutStatics {
    public val __695954377_Ptr: Pointer?

    public val _695954377_VtblPtr: Pointer?
      get() = __695954377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayMemberPathProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectionModeProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SelectedIndexProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SelectedValueProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectedValuePathProperty(): DependencyProperty? {
      val fnPtr = _695954377_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__695954377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListPickerFlyoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __695954377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListPickerFlyoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e485154489d55428e623c91a11814b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListPickerFlyoutStatics(ptr: Pointer?): WithDefault =
        IListPickerFlyoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListPickerFlyoutStatics {
      val address = segment.toRawLongValue()
      return makeIListPickerFlyoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IListPickerFlyoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__695954377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListPickerFlyoutStatics):
        Array<IListPickerFlyoutStatics?> = (elements as
        Array<IListPickerFlyoutStatics?>).castToImpl<IListPickerFlyoutStatics,IListPickerFlyoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListPickerFlyoutStatics?> =
        arrayOfNulls<IListPickerFlyoutStatics_Impl>(size) as Array<IListPickerFlyoutStatics?>
  }
}
