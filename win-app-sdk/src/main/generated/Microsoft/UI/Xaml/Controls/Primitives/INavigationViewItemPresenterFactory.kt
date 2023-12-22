package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(INavigationViewItemPresenterFactory.ABI::class)
@Signature("{b28b0160-022c-593c-ab9a-7b3ded2c0754}")
@Guid("b28b0160022c593cab9a7b3ded2c0754")
@WinRTInterface("b28b0160022c593cab9a7b3ded2c0754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenterFactory.ByReference::class)
public interface INavigationViewItemPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationViewItemPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenterFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewItemPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenterFactory {
    public val __1610241281_Ptr: Pointer?

    public val _1610241281_VtblPtr: Pointer?
      get() = __1610241281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationViewItemPresenter? {
      val fnPtr = _1610241281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemPresenter>()
      val hr = fn.invokeHR(arrayOf(__1610241281_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemPresenter>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1610241281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b28b0160022c593cab9a7b3ded2c0754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenterFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemPresenterFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1610241281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenterFactory):
        Array<INavigationViewItemPresenterFactory?> = (elements as
        Array<INavigationViewItemPresenterFactory?>).castToImpl<INavigationViewItemPresenterFactory,INavigationViewItemPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemPresenterFactory?> =
        arrayOfNulls<INavigationViewItemPresenterFactory_Impl>(size) as
        Array<INavigationViewItemPresenterFactory?>
  }
}
