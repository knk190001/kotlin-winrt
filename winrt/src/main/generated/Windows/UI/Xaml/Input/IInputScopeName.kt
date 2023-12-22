package Windows.UI.Xaml.Input

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

@ABIMarker(IInputScopeName.ABI::class)
@Signature("{fd3e6997-08fb-4cba-a021-792d7589fd5a}")
@Guid("fd3e699708fb4cbaa021792d7589fd5a")
@WinRTInterface("fd3e699708fb4cbaa021792d7589fd5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputScopeName.ByReference::class)
public interface IInputScopeName : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NameValue(): InputScopeNameValue?

  @InterfaceMethod(1)
  public fun put_NameValue(value: InputScopeNameValue?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputScopeName> {
    public override fun getValue() = ABI.makeIInputScopeName(pointer.getPointer(0))

    public fun setValue(value: IInputScopeName_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputScopeName {
    public val __660912469_Ptr: Pointer?

    public val _660912469_VtblPtr: Pointer?
      get() = __660912469_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NameValue(): InputScopeNameValue? {
      val fnPtr = _660912469_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScopeNameValue>()
      val hr = fn.invokeHR(arrayOf(__660912469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScopeNameValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NameValue(value: InputScopeNameValue?): Unit {
      val fnPtr = _660912469_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__660912469_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputScopeName_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __660912469_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputScopeName, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd3e699708fb4cbaa021792d7589fd5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputScopeName(ptr: Pointer?): WithDefault = IInputScopeName_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputScopeName {
      val address = segment.toRawLongValue()
      return makeIInputScopeName(Pointer(address))
    }

    public override fun toNative(obj: IInputScopeName): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660912469_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputScopeName): Array<IInputScopeName?> = (elements as
        Array<IInputScopeName?>).castToImpl<IInputScopeName,IInputScopeName_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputScopeName?> =
        arrayOfNulls<IInputScopeName_Impl>(size) as Array<IInputScopeName?>
  }
}
