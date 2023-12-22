package Microsoft.UI.Xaml.Input

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

@ABIMarker(IXamlUICommandFactory.ABI::class)
@Signature("{f1f80a20-0e31-5505-8bc3-cdd1f0947f1d}")
@Guid("f1f80a200e3155058bc3cdd1f0947f1d")
@WinRTInterface("f1f80a200e3155058bc3cdd1f0947f1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUICommandFactory.ByReference::class)
public interface IXamlUICommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): XamlUICommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUICommandFactory> {
    public override fun getValue() = ABI.makeIXamlUICommandFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlUICommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUICommandFactory {
    public val __41712954_Ptr: Pointer?

    public val _41712954_VtblPtr: Pointer?
      get() = __41712954_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        XamlUICommand? {
      val fnPtr = _41712954_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlUICommand>()
      val hr = fn.invokeHR(arrayOf(__41712954_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlUICommand>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUICommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __41712954_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUICommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1f80a200e3155058bc3cdd1f0947f1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUICommandFactory(ptr: Pointer?): WithDefault =
        IXamlUICommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUICommandFactory {
      val address = segment.toRawLongValue()
      return makeIXamlUICommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlUICommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__41712954_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUICommandFactory): Array<IXamlUICommandFactory?> =
        (elements as
        Array<IXamlUICommandFactory?>).castToImpl<IXamlUICommandFactory,IXamlUICommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUICommandFactory?> =
        arrayOfNulls<IXamlUICommandFactory_Impl>(size) as Array<IXamlUICommandFactory?>
  }
}
