package Windows.UI.Xaml.Documents

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

@ABIMarker(IInlineFactory.ABI::class)
@Signature("{4058acd1-2f90-4b8f-99dd-4218ef5f03de}")
@Guid("4058acd12f904b8f99dd4218ef5f03de")
@WinRTInterface("4058acd12f904b8f99dd4218ef5f03de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInlineFactory.ByReference::class)
public interface IInlineFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Inline?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInlineFactory>
      {
    public override fun getValue() = ABI.makeIInlineFactory(pointer.getPointer(0))

    public fun setValue(value: IInlineFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInlineFactory {
    public val __1393376503_Ptr: Pointer?

    public val _1393376503_VtblPtr: Pointer?
      get() = __1393376503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Inline? {
      val fnPtr = _1393376503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Inline>()
      val hr = fn.invokeHR(arrayOf(__1393376503_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Inline>(result.getValue())
      return resultValue
    }
  }

  public class IInlineFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1393376503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInlineFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4058acd12f904b8f99dd4218ef5f03de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInlineFactory(ptr: Pointer?): WithDefault = IInlineFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInlineFactory {
      val address = segment.toRawLongValue()
      return makeIInlineFactory(Pointer(address))
    }

    public override fun toNative(obj: IInlineFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1393376503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInlineFactory): Array<IInlineFactory?> = (elements as
        Array<IInlineFactory?>).castToImpl<IInlineFactory,IInlineFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInlineFactory?> =
        arrayOfNulls<IInlineFactory_Impl>(size) as Array<IInlineFactory?>
  }
}
