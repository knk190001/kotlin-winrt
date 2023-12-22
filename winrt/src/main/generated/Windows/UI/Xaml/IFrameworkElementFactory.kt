package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementFactory.ABI::class)
@Signature("{deaee126-03ca-4966-b576-604cce93b5e8}")
@Guid("deaee12603ca4966b576604cce93b5e8")
@WinRTInterface("deaee12603ca4966b576604cce93b5e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementFactory.ByReference::class)
public interface IFrameworkElementFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FrameworkElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementFactory> {
    public override fun getValue() = ABI.makeIFrameworkElementFactory(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementFactory {
    public val __544293510_Ptr: Pointer?

    public val _544293510_VtblPtr: Pointer?
      get() = __544293510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FrameworkElement? {
      val fnPtr = _544293510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__544293510_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544293510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("deaee12603ca4966b576604cce93b5e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementFactory(ptr: Pointer?): WithDefault =
        IFrameworkElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementFactory {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544293510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementFactory):
        Array<IFrameworkElementFactory?> = (elements as
        Array<IFrameworkElementFactory?>).castToImpl<IFrameworkElementFactory,IFrameworkElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementFactory?> =
        arrayOfNulls<IFrameworkElementFactory_Impl>(size) as Array<IFrameworkElementFactory?>
  }
}
