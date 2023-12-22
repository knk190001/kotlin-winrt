package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IInfoBarTemplateSettingsFactory.ABI::class)
@Signature("{29517daf-c763-56ce-8d54-eefcaf7f2e01}")
@Guid("29517dafc76356ce8d54eefcaf7f2e01")
@WinRTInterface("29517dafc76356ce8d54eefcaf7f2e01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarTemplateSettingsFactory.ByReference::class)
public interface IInfoBarTemplateSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InfoBarTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarTemplateSettingsFactory> {
    public override fun getValue() = ABI.makeIInfoBarTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBarTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarTemplateSettingsFactory {
    public val __582457137_Ptr: Pointer?

    public val _582457137_VtblPtr: Pointer?
      get() = __582457137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InfoBarTemplateSettings? {
      val fnPtr = _582457137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__582457137_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __582457137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29517dafc76356ce8d54eefcaf7f2e01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        IInfoBarTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBarTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarTemplateSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__582457137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarTemplateSettingsFactory):
        Array<IInfoBarTemplateSettingsFactory?> = (elements as
        Array<IInfoBarTemplateSettingsFactory?>).castToImpl<IInfoBarTemplateSettingsFactory,IInfoBarTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarTemplateSettingsFactory?> =
        arrayOfNulls<IInfoBarTemplateSettingsFactory_Impl>(size) as
        Array<IInfoBarTemplateSettingsFactory?>
  }
}
