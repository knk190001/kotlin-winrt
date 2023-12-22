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

@ABIMarker(IScalarTransitionFactory.ABI::class)
@Signature("{c9b1e9ee-90da-5ddd-be64-3e47977ea280}")
@Guid("c9b1e9ee90da5dddbe643e47977ea280")
@WinRTInterface("c9b1e9ee90da5dddbe643e47977ea280")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScalarTransitionFactory.ByReference::class)
public interface IScalarTransitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ScalarTransition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScalarTransitionFactory> {
    public override fun getValue() = ABI.makeIScalarTransitionFactory(pointer.getPointer(0))

    public fun setValue(value: IScalarTransitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScalarTransitionFactory {
    public val __1579068201_Ptr: Pointer?

    public val _1579068201_VtblPtr: Pointer?
      get() = __1579068201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ScalarTransition? {
      val fnPtr = _1579068201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarTransition>()
      val hr = fn.invokeHR(arrayOf(__1579068201_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarTransition>(result.getValue())
      return resultValue
    }
  }

  public class IScalarTransitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1579068201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScalarTransitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9b1e9ee90da5dddbe643e47977ea280")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScalarTransitionFactory(ptr: Pointer?): WithDefault =
        IScalarTransitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScalarTransitionFactory {
      val address = segment.toRawLongValue()
      return makeIScalarTransitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IScalarTransitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1579068201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScalarTransitionFactory):
        Array<IScalarTransitionFactory?> = (elements as
        Array<IScalarTransitionFactory?>).castToImpl<IScalarTransitionFactory,IScalarTransitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScalarTransitionFactory?> =
        arrayOfNulls<IScalarTransitionFactory_Impl>(size) as Array<IScalarTransitionFactory?>
  }
}
