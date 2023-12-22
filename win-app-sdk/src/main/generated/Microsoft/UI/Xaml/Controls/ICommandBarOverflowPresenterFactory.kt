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

@ABIMarker(ICommandBarOverflowPresenterFactory.ABI::class)
@Signature("{d066acf7-0ef5-591a-801e-52a084eea6eb}")
@Guid("d066acf70ef5591a801e52a084eea6eb")
@WinRTInterface("d066acf70ef5591a801e52a084eea6eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarOverflowPresenterFactory.ByReference::class)
public interface ICommandBarOverflowPresenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CommandBarOverflowPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarOverflowPresenterFactory> {
    public override fun getValue() =
        ABI.makeICommandBarOverflowPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: ICommandBarOverflowPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarOverflowPresenterFactory {
    public val __1437938259_Ptr: Pointer?

    public val _1437938259_VtblPtr: Pointer?
      get() = __1437938259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CommandBarOverflowPresenter? {
      val fnPtr = _1437938259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarOverflowPresenter>()
      val hr = fn.invokeHR(arrayOf(__1437938259_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarOverflowPresenter>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarOverflowPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1437938259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarOverflowPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d066acf70ef5591a801e52a084eea6eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarOverflowPresenterFactory(ptr: Pointer?): WithDefault =
        ICommandBarOverflowPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarOverflowPresenterFactory {
      val address = segment.toRawLongValue()
      return makeICommandBarOverflowPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarOverflowPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1437938259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarOverflowPresenterFactory):
        Array<ICommandBarOverflowPresenterFactory?> = (elements as
        Array<ICommandBarOverflowPresenterFactory?>).castToImpl<ICommandBarOverflowPresenterFactory,ICommandBarOverflowPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarOverflowPresenterFactory?> =
        arrayOfNulls<ICommandBarOverflowPresenterFactory_Impl>(size) as
        Array<ICommandBarOverflowPresenterFactory?>
  }
}
