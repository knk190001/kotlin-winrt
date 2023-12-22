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

@ABIMarker(ITabViewItemTemplateSettingsStatics.ABI::class)
@Signature("{eb62dd88-fc12-5338-8e88-788be72d07d6}")
@Guid("eb62dd88fc1253388e88788be72d07d6")
@WinRTInterface("eb62dd88fc1253388e88788be72d07d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemTemplateSettingsStatics.ByReference::class)
public interface ITabViewItemTemplateSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconElementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemTemplateSettingsStatics> {
    public override fun getValue() =
        ABI.makeITabViewItemTemplateSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemTemplateSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemTemplateSettingsStatics {
    public val __1081569918_Ptr: Pointer?

    public val _1081569918_VtblPtr: Pointer?
      get() = __1081569918_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconElementProperty(): DependencyProperty? {
      val fnPtr = _1081569918_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081569918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewItemTemplateSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1081569918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemTemplateSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb62dd88fc1253388e88788be72d07d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemTemplateSettingsStatics(ptr: Pointer?): WithDefault =
        ITabViewItemTemplateSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemTemplateSettingsStatics {
      val address = segment.toRawLongValue()
      return makeITabViewItemTemplateSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemTemplateSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1081569918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemTemplateSettingsStatics):
        Array<ITabViewItemTemplateSettingsStatics?> = (elements as
        Array<ITabViewItemTemplateSettingsStatics?>).castToImpl<ITabViewItemTemplateSettingsStatics,ITabViewItemTemplateSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemTemplateSettingsStatics?> =
        arrayOfNulls<ITabViewItemTemplateSettingsStatics_Impl>(size) as
        Array<ITabViewItemTemplateSettingsStatics?>
  }
}
