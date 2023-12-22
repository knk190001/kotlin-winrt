package Microsoft.UI.Xaml.Data

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

@ABIMarker(IBindingFactory.ABI::class)
@Signature("{cb2de749-b115-5f67-b64a-797d54885d5c}")
@Guid("cb2de749b1155f67b64a797d54885d5c")
@WinRTInterface("cb2de749b1155f67b64a797d54885d5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingFactory.ByReference::class)
public interface IBindingFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Binding?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingFactory> {
    public override fun getValue() = ABI.makeIBindingFactory(pointer.getPointer(0))

    public fun setValue(value: IBindingFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingFactory {
    public val __129592024_Ptr: Pointer?

    public val _129592024_VtblPtr: Pointer?
      get() = __129592024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Binding? {
      val fnPtr = _129592024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Binding>()
      val hr = fn.invokeHR(arrayOf(__129592024_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Binding>(result.getValue())
      return resultValue
    }
  }

  public class IBindingFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129592024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb2de749b1155f67b64a797d54885d5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingFactory(ptr: Pointer?): WithDefault = IBindingFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingFactory {
      val address = segment.toRawLongValue()
      return makeIBindingFactory(Pointer(address))
    }

    public override fun toNative(obj: IBindingFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129592024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingFactory): Array<IBindingFactory?> = (elements as
        Array<IBindingFactory?>).castToImpl<IBindingFactory,IBindingFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingFactory?> =
        arrayOfNulls<IBindingFactory_Impl>(size) as Array<IBindingFactory?>
  }
}
