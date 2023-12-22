package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
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

@ABIMarker(IContentPresenterOverrides.ABI::class)
@Signature("{a76339ed-32ff-438b-aad5-1d68fae93426}")
@Guid("a76339ed32ff438baad51d68fae93426")
@WinRTInterface("a76339ed32ff438baad51d68fae93426")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenterOverrides.ByReference::class)
public interface IContentPresenterOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnContentTemplateChanged(oldContentTemplate: DataTemplate?,
      newContentTemplate: DataTemplate?): Unit

  @InterfaceMethod(1)
  public fun OnContentTemplateSelectorChanged(oldContentTemplateSelector: DataTemplateSelector?,
      newContentTemplateSelector: DataTemplateSelector?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenterOverrides> {
    public override fun getValue() = ABI.makeIContentPresenterOverrides(pointer.getPointer(0))

    public fun setValue(value: IContentPresenterOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenterOverrides {
    public val __1821579292_Ptr: Pointer?

    public val _1821579292_VtblPtr: Pointer?
      get() = __1821579292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnContentTemplateChanged(oldContentTemplate: DataTemplate?,
        newContentTemplate: DataTemplate?): Unit {
      val fnPtr = _1821579292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821579292_Ptr, marshalToNative(oldContentTemplate),
          marshalToNative(newContentTemplate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun OnContentTemplateSelectorChanged(oldContentTemplateSelector: DataTemplateSelector?,
        newContentTemplateSelector: DataTemplateSelector?): Unit {
      val fnPtr = _1821579292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821579292_Ptr, marshalToNative(oldContentTemplateSelector),
          marshalToNative(newContentTemplateSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenterOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821579292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenterOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a76339ed32ff438baad51d68fae93426")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenterOverrides(ptr: Pointer?): WithDefault =
        IContentPresenterOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenterOverrides {
      val address = segment.toRawLongValue()
      return makeIContentPresenterOverrides(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenterOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821579292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenterOverrides):
        Array<IContentPresenterOverrides?> = (elements as
        Array<IContentPresenterOverrides?>).castToImpl<IContentPresenterOverrides,IContentPresenterOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenterOverrides?> =
        arrayOfNulls<IContentPresenterOverrides_Impl>(size) as Array<IContentPresenterOverrides?>
  }
}
