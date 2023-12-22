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

@ABIMarker(IMonochromaticOverlayPresenterFactory.ABI::class)
@Signature("{4997847b-b558-5c8c-8298-be1532e898ec}")
@Guid("4997847bb5585c8c8298be1532e898ec")
@WinRTInterface("4997847bb5585c8c8298be1532e898ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMonochromaticOverlayPresenterFactory.ByReference::class)
public interface IMonochromaticOverlayPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MonochromaticOverlayPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMonochromaticOverlayPresenterFactory> {
    public override fun getValue() =
        ABI.makeIMonochromaticOverlayPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IMonochromaticOverlayPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMonochromaticOverlayPresenterFactory {
    public val __1971515666_Ptr: Pointer?

    public val _1971515666_VtblPtr: Pointer?
      get() = __1971515666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MonochromaticOverlayPresenter? {
      val fnPtr = _1971515666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MonochromaticOverlayPresenter>()
      val hr = fn.invokeHR(arrayOf(__1971515666_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MonochromaticOverlayPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IMonochromaticOverlayPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1971515666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMonochromaticOverlayPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4997847bb5585c8c8298be1532e898ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMonochromaticOverlayPresenterFactory(ptr: Pointer?): WithDefault =
        IMonochromaticOverlayPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMonochromaticOverlayPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIMonochromaticOverlayPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IMonochromaticOverlayPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1971515666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMonochromaticOverlayPresenterFactory):
        Array<IMonochromaticOverlayPresenterFactory?> = (elements as
        Array<IMonochromaticOverlayPresenterFactory?>).castToImpl<IMonochromaticOverlayPresenterFactory,IMonochromaticOverlayPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMonochromaticOverlayPresenterFactory?> =
        arrayOfNulls<IMonochromaticOverlayPresenterFactory_Impl>(size) as
        Array<IMonochromaticOverlayPresenterFactory?>
  }
}
