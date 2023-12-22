package Microsoft.UI.Xaml.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IInputScopeNameFactory.ABI::class)
@Signature("{feec2efd-bc09-5cd6-9b47-6d35d1d87c61}")
@Guid("feec2efdbc095cd69b476d35d1d87c61")
@WinRTInterface("feec2efdbc095cd69b476d35d1d87c61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputScopeNameFactory.ByReference::class)
public interface IInputScopeNameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(nameValue: InputScopeNameValue?): InputScopeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputScopeNameFactory> {
    public override fun getValue() = ABI.makeIInputScopeNameFactory(pointer.getPointer(0))

    public fun setValue(value: IInputScopeNameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputScopeNameFactory {
    public val __643119306_Ptr: Pointer?

    public val _643119306_VtblPtr: Pointer?
      get() = __643119306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(nameValue: InputScopeNameValue?): InputScopeName? {
      val fnPtr = _643119306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScopeName>()
      val hr = fn.invokeHR(arrayOf(__643119306_Ptr, marshalToNative(nameValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScopeName>(result.getValue())
      return resultValue
    }
  }

  public class IInputScopeNameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __643119306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputScopeNameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("feec2efdbc095cd69b476d35d1d87c61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputScopeNameFactory(ptr: Pointer?): WithDefault =
        IInputScopeNameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputScopeNameFactory {
      val address = segment.toRawLongValue()
      return makeIInputScopeNameFactory(Pointer(address))
    }

    public override fun toNative(obj: IInputScopeNameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__643119306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputScopeNameFactory): Array<IInputScopeNameFactory?> =
        (elements as
        Array<IInputScopeNameFactory?>).castToImpl<IInputScopeNameFactory,IInputScopeNameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputScopeNameFactory?> =
        arrayOfNulls<IInputScopeNameFactory_Impl>(size) as Array<IInputScopeNameFactory?>
  }
}
