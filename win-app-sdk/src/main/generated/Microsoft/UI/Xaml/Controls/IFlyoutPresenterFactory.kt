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

@ABIMarker(IFlyoutPresenterFactory.ABI::class)
@Signature("{e9539a80-74ed-5158-9f93-893669cb046f}")
@Guid("e9539a8074ed51589f93893669cb046f")
@WinRTInterface("e9539a8074ed51589f93893669cb046f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenterFactory.ByReference::class)
public interface IFlyoutPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FlyoutPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenterFactory> {
    public override fun getValue() = ABI.makeIFlyoutPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenterFactory {
    public val __215269348_Ptr: Pointer?

    public val _215269348_VtblPtr: Pointer?
      get() = __215269348_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FlyoutPresenter? {
      val fnPtr = _215269348_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutPresenter>()
      val hr = fn.invokeHR(arrayOf(__215269348_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __215269348_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9539a8074ed51589f93893669cb046f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenterFactory(ptr: Pointer?): WithDefault =
        IFlyoutPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__215269348_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenterFactory): Array<IFlyoutPresenterFactory?>
        = (elements as
        Array<IFlyoutPresenterFactory?>).castToImpl<IFlyoutPresenterFactory,IFlyoutPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenterFactory?> =
        arrayOfNulls<IFlyoutPresenterFactory_Impl>(size) as Array<IFlyoutPresenterFactory?>
  }
}
