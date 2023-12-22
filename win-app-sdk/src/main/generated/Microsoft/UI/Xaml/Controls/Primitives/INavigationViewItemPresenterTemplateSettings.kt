package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewItemPresenterTemplateSettings.ABI::class)
@Signature("{a5119750-fa71-56f2-bfa4-799d9f304cb8}")
@Guid("a5119750fa7156f2bfa4799d9f304cb8")
@WinRTInterface("a5119750fa7156f2bfa4799d9f304cb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenterTemplateSettings.ByReference::class)
public interface INavigationViewItemPresenterTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconWidth(): Double

  @InterfaceMethod(1)
  public fun get_SmallerIconWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenterTemplateSettings> {
    public override fun getValue() =
        ABI.makeINavigationViewItemPresenterTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenterTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenterTemplateSettings {
    public val __1634747288_Ptr: Pointer?

    public val _1634747288_VtblPtr: Pointer?
      get() = __1634747288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconWidth(): Double {
      val fnPtr = _1634747288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1634747288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SmallerIconWidth(): Double {
      val fnPtr = _1634747288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1634747288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewItemPresenterTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1634747288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenterTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5119750fa7156f2bfa4799d9f304cb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenterTemplateSettings(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenterTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewItemPresenterTemplateSettings {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenterTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenterTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1634747288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenterTemplateSettings):
        Array<INavigationViewItemPresenterTemplateSettings?> = (elements as
        Array<INavigationViewItemPresenterTemplateSettings?>).castToImpl<INavigationViewItemPresenterTemplateSettings,INavigationViewItemPresenterTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemPresenterTemplateSettings?> =
        arrayOfNulls<INavigationViewItemPresenterTemplateSettings_Impl>(size) as
        Array<INavigationViewItemPresenterTemplateSettings?>
  }
}
