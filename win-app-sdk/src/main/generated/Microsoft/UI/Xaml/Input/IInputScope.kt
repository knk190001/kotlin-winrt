package Microsoft.UI.Xaml.Input

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IInputScope.ABI::class)
@Signature("{76ea58b1-e910-5176-9147-695cc95e7da2}")
@Guid("76ea58b1e91051769147695cc95e7da2")
@WinRTInterface("76ea58b1e91051769147695cc95e7da2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputScope.ByReference::class)
public interface IInputScope : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Names(): IVector<InputScopeName?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputScope> {
    public override fun getValue() = ABI.makeIInputScope(pointer.getPointer(0))

    public fun setValue(value: IInputScope_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputScope {
    public val __1068548085_Ptr: Pointer?

    public val _1068548085_VtblPtr: Pointer?
      get() = __1068548085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Names(): IVector<InputScopeName?>? {
      val fnPtr = _1068548085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<InputScopeName?>>()
      val hr = fn.invokeHR(arrayOf(__1068548085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<InputScopeName?>>(result.getValue())
      return resultValue
    }
  }

  public class IInputScope_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1068548085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputScope, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76ea58b1e91051769147695cc95e7da2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputScope(ptr: Pointer?): WithDefault = IInputScope_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputScope {
      val address = segment.toRawLongValue()
      return makeIInputScope(Pointer(address))
    }

    public override fun toNative(obj: IInputScope): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1068548085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputScope): Array<IInputScope?> = (elements as
        Array<IInputScope?>).castToImpl<IInputScope,IInputScope_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputScope?> =
        arrayOfNulls<IInputScope_Impl>(size) as Array<IInputScope?>
  }
}
