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

@ABIMarker(IInfoBadgeTemplateSettingsFactory.ABI::class)
@Signature("{5d366775-1f6e-558c-aab4-667704b3070c}")
@Guid("5d3667751f6e558caab4667704b3070c")
@WinRTInterface("5d3667751f6e558caab4667704b3070c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadgeTemplateSettingsFactory.ByReference::class)
public interface IInfoBadgeTemplateSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InfoBadgeTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBadgeTemplateSettingsFactory> {
    public override fun getValue() =
        ABI.makeIInfoBadgeTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBadgeTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadgeTemplateSettingsFactory {
    public val __766076415_Ptr: Pointer?

    public val _766076415_VtblPtr: Pointer?
      get() = __766076415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InfoBadgeTemplateSettings? {
      val fnPtr = _766076415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBadgeTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__766076415_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBadgeTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBadgeTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __766076415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadgeTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d3667751f6e558caab4667704b3070c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadgeTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        IInfoBadgeTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadgeTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBadgeTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadgeTemplateSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__766076415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadgeTemplateSettingsFactory):
        Array<IInfoBadgeTemplateSettingsFactory?> = (elements as
        Array<IInfoBadgeTemplateSettingsFactory?>).castToImpl<IInfoBadgeTemplateSettingsFactory,IInfoBadgeTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadgeTemplateSettingsFactory?> =
        arrayOfNulls<IInfoBadgeTemplateSettingsFactory_Impl>(size) as
        Array<IInfoBadgeTemplateSettingsFactory?>
  }
}
