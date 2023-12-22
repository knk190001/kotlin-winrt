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

@ABIMarker(IAppBarButtonFactory.ABI::class)
@Signature("{4168a40a-d11f-5aeb-974e-bb43a6e7f9b2}")
@Guid("4168a40ad11f5aeb974ebb43a6e7f9b2")
@WinRTInterface("4168a40ad11f5aeb974ebb43a6e7f9b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButtonFactory.ByReference::class)
public interface IAppBarButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AppBarButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarButtonFactory> {
    public override fun getValue() = ABI.makeIAppBarButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButtonFactory {
    public val __562576577_Ptr: Pointer?

    public val _562576577_VtblPtr: Pointer?
      get() = __562576577_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AppBarButton? {
      val fnPtr = _562576577_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarButton>()
      val hr = fn.invokeHR(arrayOf(__562576577_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarButton>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __562576577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4168a40ad11f5aeb974ebb43a6e7f9b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButtonFactory(ptr: Pointer?): WithDefault = IAppBarButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButtonFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__562576577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButtonFactory): Array<IAppBarButtonFactory?> =
        (elements as
        Array<IAppBarButtonFactory?>).castToImpl<IAppBarButtonFactory,IAppBarButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButtonFactory?> =
        arrayOfNulls<IAppBarButtonFactory_Impl>(size) as Array<IAppBarButtonFactory?>
  }
}
