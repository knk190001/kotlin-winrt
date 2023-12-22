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

@ABIMarker(IScrollPresenterFactory.ABI::class)
@Signature("{9f5cdc57-d229-52b2-aee4-37c496764ea3}")
@Guid("9f5cdc57d22952b2aee437c496764ea3")
@WinRTInterface("9f5cdc57d22952b2aee437c496764ea3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollPresenterFactory.ByReference::class)
public interface IScrollPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ScrollPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollPresenterFactory> {
    public override fun getValue() = ABI.makeIScrollPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollPresenterFactory {
    public val __1342592960_Ptr: Pointer?

    public val _1342592960_VtblPtr: Pointer?
      get() = __1342592960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ScrollPresenter? {
      val fnPtr = _1342592960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollPresenter>()
      val hr = fn.invokeHR(arrayOf(__1342592960_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IScrollPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1342592960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f5cdc57d22952b2aee437c496764ea3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollPresenterFactory(ptr: Pointer?): WithDefault =
        IScrollPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIScrollPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342592960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollPresenterFactory): Array<IScrollPresenterFactory?>
        = (elements as
        Array<IScrollPresenterFactory?>).castToImpl<IScrollPresenterFactory,IScrollPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollPresenterFactory?> =
        arrayOfNulls<IScrollPresenterFactory_Impl>(size) as Array<IScrollPresenterFactory?>
  }
}
