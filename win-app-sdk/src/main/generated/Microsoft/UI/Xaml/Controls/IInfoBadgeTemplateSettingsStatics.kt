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

@ABIMarker(IInfoBadgeTemplateSettingsStatics.ABI::class)
@Signature("{10959133-64ce-586f-a252-9e26fc1ad9ba}")
@Guid("1095913364ce586fa2529e26fc1ad9ba")
@WinRTInterface("1095913364ce586fa2529e26fc1ad9ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadgeTemplateSettingsStatics.ByReference::class)
public interface IInfoBadgeTemplateSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoBadgeCornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IconElementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBadgeTemplateSettingsStatics> {
    public override fun getValue() =
        ABI.makeIInfoBadgeTemplateSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IInfoBadgeTemplateSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadgeTemplateSettingsStatics {
    public val __39177030_Ptr: Pointer?

    public val _39177030_VtblPtr: Pointer?
      get() = __39177030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoBadgeCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _39177030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__39177030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IconElementProperty(): DependencyProperty? {
      val fnPtr = _39177030_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__39177030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBadgeTemplateSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39177030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadgeTemplateSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1095913364ce586fa2529e26fc1ad9ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadgeTemplateSettingsStatics(ptr: Pointer?): WithDefault =
        IInfoBadgeTemplateSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadgeTemplateSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIInfoBadgeTemplateSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadgeTemplateSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__39177030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadgeTemplateSettingsStatics):
        Array<IInfoBadgeTemplateSettingsStatics?> = (elements as
        Array<IInfoBadgeTemplateSettingsStatics?>).castToImpl<IInfoBadgeTemplateSettingsStatics,IInfoBadgeTemplateSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadgeTemplateSettingsStatics?> =
        arrayOfNulls<IInfoBadgeTemplateSettingsStatics_Impl>(size) as
        Array<IInfoBadgeTemplateSettingsStatics?>
  }
}
