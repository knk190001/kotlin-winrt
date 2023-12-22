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

@ABIMarker(IInfoBarStatics.ABI::class)
@Signature("{5fb1e80d-ea5d-57ba-9915-b6782b982aca}")
@Guid("5fb1e80dea5d57ba9915b6782b982aca")
@WinRTInterface("5fb1e80dea5d57ba9915b6782b982aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarStatics.ByReference::class)
public interface IInfoBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TitleProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MessageProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SeverityProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsIconVisibleProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsClosableProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_CloseButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_CloseButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_CloseButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_ActionButtonProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_ContentTemplateProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarStatics> {
    public override fun getValue() = ABI.makeIInfoBarStatics(pointer.getPointer(0))

    public fun setValue(value: IInfoBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarStatics {
    public val __97889017_Ptr: Pointer?

    public val _97889017_VtblPtr: Pointer?
      get() = __97889017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TitleProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MessageProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SeverityProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsIconVisibleProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsClosableProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CloseButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CloseButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CloseButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ActionButtonProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_ContentTemplateProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _97889017_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97889017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97889017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fb1e80dea5d57ba9915b6782b982aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarStatics(ptr: Pointer?): WithDefault = IInfoBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarStatics {
      val address = segment.toRawLongValue()
      return makeIInfoBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97889017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarStatics): Array<IInfoBarStatics?> = (elements as
        Array<IInfoBarStatics?>).castToImpl<IInfoBarStatics,IInfoBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarStatics?> =
        arrayOfNulls<IInfoBarStatics_Impl>(size) as Array<IInfoBarStatics?>
  }
}
