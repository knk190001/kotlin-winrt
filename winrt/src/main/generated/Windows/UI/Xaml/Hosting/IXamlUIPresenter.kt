package Windows.UI.Xaml.Hosting

import Windows.UI.Xaml.UIElement
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlUIPresenter.ABI::class)
@Signature("{a714944a-1619-4fc6-b31b-89512ef022a2}")
@Guid("a714944a16194fc6b31b89512ef022a2")
@WinRTInterface("a714944a16194fc6b31b89512ef022a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenter.ByReference::class)
public interface IXamlUIPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RootElement(): UIElement?

  @InterfaceMethod(1)
  public fun put_RootElement(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_ThemeKey(): String?

  @InterfaceMethod(3)
  public fun put_ThemeKey(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ThemeResourcesXaml(): String?

  @InterfaceMethod(5)
  public fun put_ThemeResourcesXaml(value: String?): Unit

  @InterfaceMethod(6)
  public fun SetSize(width: Int, height: Int): Unit

  @InterfaceMethod(7)
  public fun Render(): Unit

  @InterfaceMethod(8)
  public fun Present(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenter> {
    public override fun getValue() = ABI.makeIXamlUIPresenter(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenter {
    public val __51056838_Ptr: Pointer?

    public val _51056838_VtblPtr: Pointer?
      get() = __51056838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RootElement(): UIElement? {
      val fnPtr = _51056838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RootElement(value: UIElement?): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ThemeKey(): String? {
      val fnPtr = _51056838_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ThemeKey(value: String?): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ThemeResourcesXaml(): String? {
      val fnPtr = _51056838_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ThemeResourcesXaml(value: String?): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetSize(width: Int, height: Int): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, width, height,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Render(): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Present(): Unit {
      val fnPtr = _51056838_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51056838_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlUIPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __51056838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a714944a16194fc6b31b89512ef022a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenter(ptr: Pointer?): WithDefault = IXamlUIPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenter {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenter(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__51056838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenter): Array<IXamlUIPresenter?> = (elements as
        Array<IXamlUIPresenter?>).castToImpl<IXamlUIPresenter,IXamlUIPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenter?> =
        arrayOfNulls<IXamlUIPresenter_Impl>(size) as Array<IXamlUIPresenter?>
  }
}
