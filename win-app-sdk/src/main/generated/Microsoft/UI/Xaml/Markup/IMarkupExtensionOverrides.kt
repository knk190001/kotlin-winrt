package Microsoft.UI.Xaml.Markup

import Microsoft.UI.Xaml.IXamlServiceProvider
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

@ABIMarker(IMarkupExtensionOverrides.ABI::class)
@Signature("{a12aa575-5d31-5b68-a30f-8495412a351d}")
@Guid("a12aa5755d315b68a30f8495412a351d")
@WinRTInterface("a12aa5755d315b68a30f8495412a351d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMarkupExtensionOverrides.ByReference::class)
public interface IMarkupExtensionOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProvideValue(): IUnknown?

  @InterfaceMethod(1)
  public fun ProvideValue(serviceProvider: IXamlServiceProvider?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMarkupExtensionOverrides> {
    public override fun getValue() = ABI.makeIMarkupExtensionOverrides(pointer.getPointer(0))

    public fun setValue(value: IMarkupExtensionOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMarkupExtensionOverrides {
    public val __1296323461_Ptr: Pointer?

    public val _1296323461_VtblPtr: Pointer?
      get() = __1296323461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProvideValue(): IUnknown? {
      val fnPtr = _1296323461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1296323461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ProvideValue(serviceProvider: IXamlServiceProvider?): IUnknown? {
      val fnPtr = _1296323461_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1296323461_Ptr, marshalToNative(serviceProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IMarkupExtensionOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1296323461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMarkupExtensionOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a12aa5755d315b68a30f8495412a351d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMarkupExtensionOverrides(ptr: Pointer?): WithDefault =
        IMarkupExtensionOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMarkupExtensionOverrides {
      val address = segment.toRawLongValue()
      return makeIMarkupExtensionOverrides(Pointer(address))
    }

    public override fun toNative(obj: IMarkupExtensionOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1296323461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMarkupExtensionOverrides):
        Array<IMarkupExtensionOverrides?> = (elements as
        Array<IMarkupExtensionOverrides?>).castToImpl<IMarkupExtensionOverrides,IMarkupExtensionOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMarkupExtensionOverrides?> =
        arrayOfNulls<IMarkupExtensionOverrides_Impl>(size) as Array<IMarkupExtensionOverrides?>
  }
}
