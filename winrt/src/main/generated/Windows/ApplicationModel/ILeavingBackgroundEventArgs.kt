package Windows.ApplicationModel

import Windows.Foundation.Deferral
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

@ABIMarker(ILeavingBackgroundEventArgs.ABI::class)
@Signature("{39c6ec9a-ae6e-46f9-a07a-cfc23f88733e}")
@Guid("39c6ec9aae6e46f9a07acfc23f88733e")
@WinRTInterface("39c6ec9aae6e46f9a07acfc23f88733e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILeavingBackgroundEventArgs.ByReference::class)
public interface ILeavingBackgroundEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILeavingBackgroundEventArgs> {
    public override fun getValue() = ABI.makeILeavingBackgroundEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILeavingBackgroundEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILeavingBackgroundEventArgs {
    public val __25105574_Ptr: Pointer?

    public val _25105574_VtblPtr: Pointer?
      get() = __25105574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _25105574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__25105574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ILeavingBackgroundEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __25105574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILeavingBackgroundEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39c6ec9aae6e46f9a07acfc23f88733e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILeavingBackgroundEventArgs(ptr: Pointer?): WithDefault =
        ILeavingBackgroundEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILeavingBackgroundEventArgs {
      val address = segment.toRawLongValue()
      return makeILeavingBackgroundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILeavingBackgroundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__25105574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILeavingBackgroundEventArgs):
        Array<ILeavingBackgroundEventArgs?> = (elements as
        Array<ILeavingBackgroundEventArgs?>).castToImpl<ILeavingBackgroundEventArgs,ILeavingBackgroundEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILeavingBackgroundEventArgs?> =
        arrayOfNulls<ILeavingBackgroundEventArgs_Impl>(size) as Array<ILeavingBackgroundEventArgs?>
  }
}
