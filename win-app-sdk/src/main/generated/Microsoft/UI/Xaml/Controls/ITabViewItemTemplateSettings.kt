package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITabViewItemTemplateSettings.ABI::class)
@Signature("{cc5c99ec-c9d1-55f5-bc81-7612ff4e2b77}")
@Guid("cc5c99ecc9d155f5bc817612ff4e2b77")
@WinRTInterface("cc5c99ecc9d155f5bc817612ff4e2b77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemTemplateSettings.ByReference::class)
public interface ITabViewItemTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconElement(): IconElement?

  @InterfaceMethod(1)
  public fun put_IconElement(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemTemplateSettings> {
    public override fun getValue() = ABI.makeITabViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemTemplateSettings {
    public val __927844157_Ptr: Pointer?

    public val _927844157_VtblPtr: Pointer?
      get() = __927844157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconElement(): IconElement? {
      val fnPtr = _927844157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__927844157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IconElement(value: IconElement?): Unit {
      val fnPtr = _927844157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927844157_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITabViewItemTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __927844157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc5c99ecc9d155f5bc817612ff4e2b77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemTemplateSettings(ptr: Pointer?): WithDefault =
        ITabViewItemTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return makeITabViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__927844157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemTemplateSettings):
        Array<ITabViewItemTemplateSettings?> = (elements as
        Array<ITabViewItemTemplateSettings?>).castToImpl<ITabViewItemTemplateSettings,ITabViewItemTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemTemplateSettings?> =
        arrayOfNulls<ITabViewItemTemplateSettings_Impl>(size) as
        Array<ITabViewItemTemplateSettings?>
  }
}
