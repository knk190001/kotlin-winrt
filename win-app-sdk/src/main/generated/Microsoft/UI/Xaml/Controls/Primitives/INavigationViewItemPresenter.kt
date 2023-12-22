package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.IconElement
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

@ABIMarker(INavigationViewItemPresenter.ABI::class)
@Signature("{64939df5-760c-5b0b-af4d-d8dd4ee50278}")
@Guid("64939df5760c5b0baf4dd8dd4ee50278")
@WinRTInterface("64939df5760c5b0baf4dd8dd4ee50278")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenter.ByReference::class)
public interface INavigationViewItemPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(1)
  public fun put_Icon(value: IconElement?): Unit

  @InterfaceMethod(2)
  public fun get_TemplateSettings(): NavigationViewItemPresenterTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenter> {
    public override fun getValue() = ABI.makeINavigationViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenter {
    public val __1383930763_Ptr: Pointer?

    public val _1383930763_VtblPtr: Pointer?
      get() = __1383930763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _1383930763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1383930763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _1383930763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383930763_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TemplateSettings(): NavigationViewItemPresenterTemplateSettings? {
      val fnPtr = _1383930763_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemPresenterTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1383930763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NavigationViewItemPresenterTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383930763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64939df5760c5b0baf4dd8dd4ee50278")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenter(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemPresenter {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383930763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenter):
        Array<INavigationViewItemPresenter?> = (elements as
        Array<INavigationViewItemPresenter?>).castToImpl<INavigationViewItemPresenter,INavigationViewItemPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemPresenter?> =
        arrayOfNulls<INavigationViewItemPresenter_Impl>(size) as
        Array<INavigationViewItemPresenter?>
  }
}
