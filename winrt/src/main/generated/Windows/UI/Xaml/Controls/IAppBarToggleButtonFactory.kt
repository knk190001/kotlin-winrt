package Windows.UI.Xaml.Controls

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

@ABIMarker(IAppBarToggleButtonFactory.ABI::class)
@Signature("{028aa7d4-8f54-45a6-9f90-13605656d793}")
@Guid("028aa7d48f5445a69f9013605656d793")
@WinRTInterface("028aa7d48f5445a69f9013605656d793")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonFactory.ByReference::class)
public interface IAppBarToggleButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      AppBarToggleButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonFactory> {
    public override fun getValue() = ABI.makeIAppBarToggleButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonFactory {
    public val __2026527318_Ptr: Pointer?

    public val _2026527318_VtblPtr: Pointer?
      get() = __2026527318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AppBarToggleButton? {
      val fnPtr = _2026527318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarToggleButton>()
      val hr = fn.invokeHR(arrayOf(__2026527318_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarToggleButton>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2026527318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("028aa7d48f5445a69f9013605656d793")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonFactory(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2026527318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonFactory):
        Array<IAppBarToggleButtonFactory?> = (elements as
        Array<IAppBarToggleButtonFactory?>).castToImpl<IAppBarToggleButtonFactory,IAppBarToggleButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonFactory?> =
        arrayOfNulls<IAppBarToggleButtonFactory_Impl>(size) as Array<IAppBarToggleButtonFactory?>
  }
}
