package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Style
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

@ABIMarker(IGroupStyle.ABI::class)
@Signature("{a77d937e-0188-584c-ab1d-9df1916edc75}")
@Guid("a77d937e0188584cab1d9df1916edc75")
@WinRTInterface("a77d937e0188584cab1d9df1916edc75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyle.ByReference::class)
public interface IGroupStyle : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Panel(): ItemsPanelTemplate?

  @InterfaceMethod(1)
  public fun put_Panel(value: ItemsPanelTemplate?): Unit

  @InterfaceMethod(2)
  public fun get_ContainerStyle(): Style?

  @InterfaceMethod(3)
  public fun put_ContainerStyle(value: Style?): Unit

  @InterfaceMethod(4)
  public fun get_HeaderContainerStyle(): Style?

  @InterfaceMethod(5)
  public fun put_HeaderContainerStyle(value: Style?): Unit

  @InterfaceMethod(6)
  public fun get_ContainerStyleSelector(): StyleSelector?

  @InterfaceMethod(7)
  public fun put_ContainerStyleSelector(value: StyleSelector?): Unit

  @InterfaceMethod(8)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(9)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(10)
  public fun get_HeaderTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(11)
  public fun put_HeaderTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(12)
  public fun get_HidesIfEmpty(): Boolean

  @InterfaceMethod(13)
  public fun put_HidesIfEmpty(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGroupStyle> {
    public override fun getValue() = ABI.makeIGroupStyle(pointer.getPointer(0))

    public fun setValue(value: IGroupStyle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyle {
    public val __389738361_Ptr: Pointer?

    public val _389738361_VtblPtr: Pointer?
      get() = __389738361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Panel(): ItemsPanelTemplate? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsPanelTemplate>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsPanelTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Panel(value: ItemsPanelTemplate?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContainerStyle(): Style? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContainerStyle(value: Style?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HeaderContainerStyle(): Style? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderContainerStyle(value: Style?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContainerStyleSelector(): StyleSelector? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSelector>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContainerStyleSelector(value: StyleSelector?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_HeaderTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _389738361_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_HeaderTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_HidesIfEmpty(): Boolean {
      val fnPtr = _389738361_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_HidesIfEmpty(value: Boolean): Unit {
      val fnPtr = _389738361_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__389738361_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGroupStyle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __389738361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a77d937e0188584cab1d9df1916edc75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyle(ptr: Pointer?): WithDefault = IGroupStyle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyle {
      val address = segment.toRawLongValue()
      return makeIGroupStyle(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__389738361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyle): Array<IGroupStyle?> = (elements as
        Array<IGroupStyle?>).castToImpl<IGroupStyle,IGroupStyle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyle?> =
        arrayOfNulls<IGroupStyle_Impl>(size) as Array<IGroupStyle?>
  }
}
