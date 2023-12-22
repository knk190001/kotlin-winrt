package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.CornerRadius
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

@ABIMarker(IInfoBadgeTemplateSettings.ABI::class)
@Signature("{ce810f86-d4bb-51bd-bf7d-dfd1e6c85f4a}")
@Guid("ce810f86d4bb51bdbf7ddfd1e6c85f4a")
@WinRTInterface("ce810f86d4bb51bdbf7ddfd1e6c85f4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadgeTemplateSettings.ByReference::class)
public interface IInfoBadgeTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoBadgeCornerRadius(): CornerRadius?

  @InterfaceMethod(1)
  public fun put_InfoBadgeCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(2)
  public fun get_IconElement(): IconElement?

  @InterfaceMethod(3)
  public fun put_IconElement(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBadgeTemplateSettings> {
    public override fun getValue() = ABI.makeIInfoBadgeTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IInfoBadgeTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadgeTemplateSettings {
    public val __633716875_Ptr: Pointer?

    public val _633716875_VtblPtr: Pointer?
      get() = __633716875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoBadgeCornerRadius(): CornerRadius? {
      val fnPtr = _633716875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__633716875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InfoBadgeCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _633716875_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__633716875_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IconElement(): IconElement? {
      val fnPtr = _633716875_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__633716875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_IconElement(value: IconElement?): Unit {
      val fnPtr = _633716875_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__633716875_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInfoBadgeTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __633716875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadgeTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce810f86d4bb51bdbf7ddfd1e6c85f4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadgeTemplateSettings(ptr: Pointer?): WithDefault =
        IInfoBadgeTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadgeTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIInfoBadgeTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadgeTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__633716875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadgeTemplateSettings):
        Array<IInfoBadgeTemplateSettings?> = (elements as
        Array<IInfoBadgeTemplateSettings?>).castToImpl<IInfoBadgeTemplateSettings,IInfoBadgeTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadgeTemplateSettings?> =
        arrayOfNulls<IInfoBadgeTemplateSettings_Impl>(size) as Array<IInfoBadgeTemplateSettings?>
  }
}
