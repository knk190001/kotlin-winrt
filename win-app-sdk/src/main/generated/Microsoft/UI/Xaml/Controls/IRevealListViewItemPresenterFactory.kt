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

@ABIMarker(IRevealListViewItemPresenterFactory.ABI::class)
@Signature("{e730c53b-8f94-55b3-8bc1-98f77c5766bd}")
@Guid("e730c53b8f9455b38bc198f77c5766bd")
@WinRTInterface("e730c53b8f9455b38bc198f77c5766bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealListViewItemPresenterFactory.ByReference::class)
public interface IRevealListViewItemPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RevealListViewItemPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealListViewItemPresenterFactory> {
    public override fun getValue() =
        ABI.makeIRevealListViewItemPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IRevealListViewItemPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealListViewItemPresenterFactory {
    public val __612038164_Ptr: Pointer?

    public val _612038164_VtblPtr: Pointer?
      get() = __612038164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RevealListViewItemPresenter? {
      val fnPtr = _612038164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevealListViewItemPresenter>()
      val hr = fn.invokeHR(arrayOf(__612038164_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevealListViewItemPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IRevealListViewItemPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __612038164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealListViewItemPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e730c53b8f9455b38bc198f77c5766bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealListViewItemPresenterFactory(ptr: Pointer?): WithDefault =
        IRevealListViewItemPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealListViewItemPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIRevealListViewItemPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRevealListViewItemPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__612038164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealListViewItemPresenterFactory):
        Array<IRevealListViewItemPresenterFactory?> = (elements as
        Array<IRevealListViewItemPresenterFactory?>).castToImpl<IRevealListViewItemPresenterFactory,IRevealListViewItemPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealListViewItemPresenterFactory?> =
        arrayOfNulls<IRevealListViewItemPresenterFactory_Impl>(size) as
        Array<IRevealListViewItemPresenterFactory?>
  }
}
