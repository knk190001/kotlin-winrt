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

@ABIMarker(ITeachingTipTemplateSettingsStatics.ABI::class)
@Signature("{fa9acf9a-9743-51ee-8db9-8abd063edfea}")
@Guid("fa9acf9a974351ee8db98abd063edfea")
@WinRTInterface("fa9acf9a974351ee8db98abd063edfea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipTemplateSettingsStatics.ByReference::class)
public interface ITeachingTipTemplateSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopRightHighlightMarginProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TopLeftHighlightMarginProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IconElementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipTemplateSettingsStatics> {
    public override fun getValue() =
        ABI.makeITeachingTipTemplateSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipTemplateSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipTemplateSettingsStatics {
    public val __320962463_Ptr: Pointer?

    public val _320962463_VtblPtr: Pointer?
      get() = __320962463_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopRightHighlightMarginProperty(): DependencyProperty? {
      val fnPtr = _320962463_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__320962463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TopLeftHighlightMarginProperty(): DependencyProperty? {
      val fnPtr = _320962463_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__320962463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IconElementProperty(): DependencyProperty? {
      val fnPtr = _320962463_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__320962463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipTemplateSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __320962463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipTemplateSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa9acf9a974351ee8db98abd063edfea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipTemplateSettingsStatics(ptr: Pointer?): WithDefault =
        ITeachingTipTemplateSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipTemplateSettingsStatics {
      val address = segment.toRawLongValue()
      return makeITeachingTipTemplateSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipTemplateSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__320962463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipTemplateSettingsStatics):
        Array<ITeachingTipTemplateSettingsStatics?> = (elements as
        Array<ITeachingTipTemplateSettingsStatics?>).castToImpl<ITeachingTipTemplateSettingsStatics,ITeachingTipTemplateSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipTemplateSettingsStatics?> =
        arrayOfNulls<ITeachingTipTemplateSettingsStatics_Impl>(size) as
        Array<ITeachingTipTemplateSettingsStatics?>
  }
}
