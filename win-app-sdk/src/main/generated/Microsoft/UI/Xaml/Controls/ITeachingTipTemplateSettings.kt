package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Thickness
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

@ABIMarker(ITeachingTipTemplateSettings.ABI::class)
@Signature("{b081e1e9-c1a5-590a-8049-69ea003b6cf7}")
@Guid("b081e1e9c1a5590a804969ea003b6cf7")
@WinRTInterface("b081e1e9c1a5590a804969ea003b6cf7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipTemplateSettings.ByReference::class)
public interface ITeachingTipTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopRightHighlightMargin(): Thickness?

  @InterfaceMethod(1)
  public fun put_TopRightHighlightMargin(value: Thickness?): Unit

  @InterfaceMethod(2)
  public fun get_TopLeftHighlightMargin(): Thickness?

  @InterfaceMethod(3)
  public fun put_TopLeftHighlightMargin(value: Thickness?): Unit

  @InterfaceMethod(4)
  public fun get_IconElement(): IconElement?

  @InterfaceMethod(5)
  public fun put_IconElement(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipTemplateSettings> {
    public override fun getValue() = ABI.makeITeachingTipTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipTemplateSettings {
    public val __361745724_Ptr: Pointer?

    public val _361745724_VtblPtr: Pointer?
      get() = __361745724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopRightHighlightMargin(): Thickness? {
      val fnPtr = _361745724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TopRightHighlightMargin(value: Thickness?): Unit {
      val fnPtr = _361745724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TopLeftHighlightMargin(): Thickness? {
      val fnPtr = _361745724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TopLeftHighlightMargin(value: Thickness?): Unit {
      val fnPtr = _361745724_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IconElement(): IconElement? {
      val fnPtr = _361745724_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_IconElement(value: IconElement?): Unit {
      val fnPtr = _361745724_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__361745724_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITeachingTipTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __361745724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b081e1e9c1a5590a804969ea003b6cf7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipTemplateSettings(ptr: Pointer?): WithDefault =
        ITeachingTipTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipTemplateSettings {
      val address = segment.toRawLongValue()
      return makeITeachingTipTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__361745724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipTemplateSettings):
        Array<ITeachingTipTemplateSettings?> = (elements as
        Array<ITeachingTipTemplateSettings?>).castToImpl<ITeachingTipTemplateSettings,ITeachingTipTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipTemplateSettings?> =
        arrayOfNulls<ITeachingTipTemplateSettings_Impl>(size) as
        Array<ITeachingTipTemplateSettings?>
  }
}
