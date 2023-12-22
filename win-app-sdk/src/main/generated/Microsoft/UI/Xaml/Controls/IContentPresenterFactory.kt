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

@ABIMarker(IContentPresenterFactory.ABI::class)
@Signature("{730b1d5e-2540-5a3d-a6c7-888aa8614610}")
@Guid("730b1d5e25405a3da6c7888aa8614610")
@WinRTInterface("730b1d5e25405a3da6c7888aa8614610")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenterFactory.ByReference::class)
public interface IContentPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ContentPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenterFactory> {
    public override fun getValue() = ABI.makeIContentPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IContentPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenterFactory {
    public val __1270627788_Ptr: Pointer?

    public val _1270627788_VtblPtr: Pointer?
      get() = __1270627788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ContentPresenter? {
      val fnPtr = _1270627788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentPresenter>()
      val hr = fn.invokeHR(arrayOf(__1270627788_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IContentPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270627788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("730b1d5e25405a3da6c7888aa8614610")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenterFactory(ptr: Pointer?): WithDefault =
        IContentPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIContentPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270627788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenterFactory):
        Array<IContentPresenterFactory?> = (elements as
        Array<IContentPresenterFactory?>).castToImpl<IContentPresenterFactory,IContentPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenterFactory?> =
        arrayOfNulls<IContentPresenterFactory_Impl>(size) as Array<IContentPresenterFactory?>
  }
}
