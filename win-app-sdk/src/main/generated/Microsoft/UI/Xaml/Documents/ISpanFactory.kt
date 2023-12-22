package Microsoft.UI.Xaml.Documents

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

@ABIMarker(ISpanFactory.ABI::class)
@Signature("{a6e87c16-c175-55c8-bbd3-ce40f9d0a680}")
@Guid("a6e87c16c17555c8bbd3ce40f9d0a680")
@WinRTInterface("a6e87c16c17555c8bbd3ce40f9d0a680")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpanFactory.ByReference::class)
public interface ISpanFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Span?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpanFactory> {
    public override fun getValue() = ABI.makeISpanFactory(pointer.getPointer(0))

    public fun setValue(value: ISpanFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpanFactory {
    public val __1219892323_Ptr: Pointer?

    public val _1219892323_VtblPtr: Pointer?
      get() = __1219892323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Span? {
      val fnPtr = _1219892323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Span>()
      val hr = fn.invokeHR(arrayOf(__1219892323_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Span>(result.getValue())
      return resultValue
    }
  }

  public class ISpanFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1219892323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpanFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6e87c16c17555c8bbd3ce40f9d0a680")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpanFactory(ptr: Pointer?): WithDefault = ISpanFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpanFactory {
      val address = segment.toRawLongValue()
      return makeISpanFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpanFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1219892323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpanFactory): Array<ISpanFactory?> = (elements as
        Array<ISpanFactory?>).castToImpl<ISpanFactory,ISpanFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpanFactory?> =
        arrayOfNulls<ISpanFactory_Impl>(size) as Array<ISpanFactory?>
  }
}
