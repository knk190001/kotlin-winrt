package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
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

@ABIMarker(IContentControlOverrides.ABI::class)
@Signature("{2504174a-017e-5a2d-9c28-d97c66ae9937}")
@Guid("2504174a017e5a2d9c28d97c66ae9937")
@WinRTInterface("2504174a017e5a2d9c28d97c66ae9937")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentControlOverrides.ByReference::class)
public interface IContentControlOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun OnContentTemplateChanged(oldContentTemplate: DataTemplate?,
      newContentTemplate: DataTemplate?): Unit

  @InterfaceMethod(2)
  public fun OnContentTemplateSelectorChanged(oldContentTemplateSelector: DataTemplateSelector?,
      newContentTemplateSelector: DataTemplateSelector?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentControlOverrides> {
    public override fun getValue() = ABI.makeIContentControlOverrides(pointer.getPointer(0))

    public fun setValue(value: IContentControlOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentControlOverrides {
    public val __812918212_Ptr: Pointer?

    public val _812918212_VtblPtr: Pointer?
      get() = __812918212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit {
      val fnPtr = _812918212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812918212_Ptr, marshalToNative(oldContent),
          marshalToNative(newContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnContentTemplateChanged(oldContentTemplate: DataTemplate?,
        newContentTemplate: DataTemplate?): Unit {
      val fnPtr = _812918212_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812918212_Ptr, marshalToNative(oldContentTemplate),
          marshalToNative(newContentTemplate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun OnContentTemplateSelectorChanged(oldContentTemplateSelector: DataTemplateSelector?,
        newContentTemplateSelector: DataTemplateSelector?): Unit {
      val fnPtr = _812918212_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812918212_Ptr, marshalToNative(oldContentTemplateSelector),
          marshalToNative(newContentTemplateSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentControlOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __812918212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentControlOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2504174a017e5a2d9c28d97c66ae9937")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentControlOverrides(ptr: Pointer?): WithDefault =
        IContentControlOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentControlOverrides {
      val address = segment.toRawLongValue()
      return makeIContentControlOverrides(Pointer(address))
    }

    public override fun toNative(obj: IContentControlOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__812918212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentControlOverrides):
        Array<IContentControlOverrides?> = (elements as
        Array<IContentControlOverrides?>).castToImpl<IContentControlOverrides,IContentControlOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentControlOverrides?> =
        arrayOfNulls<IContentControlOverrides_Impl>(size) as Array<IContentControlOverrides?>
  }
}
