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

@ABIMarker(ITabViewStatics.ABI::class)
@Signature("{f4326c08-1b94-53d7-934f-e6ae0d3d18ab}")
@Guid("f4326c081b9453d7934fe6ae0d3d18ab")
@WinRTInterface("f4326c081b9453d7934fe6ae0d3d18ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewStatics.ByReference::class)
public interface ITabViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TabWidthModeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TabStripHeaderProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TabStripHeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_TabStripFooterProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TabStripFooterTemplateProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsAddTabButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_AddTabButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_AddTabButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_TabItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_TabItemsProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_TabItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_TabItemTemplateSelectorProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_CloseButtonOverlayModeProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_CanDragTabsProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_CanReorderTabsProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_AllowDropTabsProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_SelectedIndexProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_SelectedItemProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewStatics> {
    public override fun getValue() = ABI.makeITabViewStatics(pointer.getPointer(0))

    public fun setValue(value: ITabViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewStatics {
    public val __2023127058_Ptr: Pointer?

    public val _2023127058_VtblPtr: Pointer?
      get() = __2023127058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TabWidthModeProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TabStripHeaderProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TabStripHeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TabStripFooterProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TabStripFooterTemplateProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsAddTabButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AddTabButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AddTabButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TabItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TabItemsProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TabItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_TabItemTemplateSelectorProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CloseButtonOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CanDragTabsProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_CanReorderTabsProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_AllowDropTabsProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_SelectedIndexProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _2023127058_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2023127058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023127058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4326c081b9453d7934fe6ae0d3d18ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewStatics(ptr: Pointer?): WithDefault = ITabViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewStatics {
      val address = segment.toRawLongValue()
      return makeITabViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ITabViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023127058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewStatics): Array<ITabViewStatics?> = (elements as
        Array<ITabViewStatics?>).castToImpl<ITabViewStatics,ITabViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewStatics?> =
        arrayOfNulls<ITabViewStatics_Impl>(size) as Array<ITabViewStatics?>
  }
}
