package Windows.Graphics.Printing

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

@ABIMarker(IPrintTaskRequestedEventArgs.ABI::class)
@Signature("{d0aff924-a31b-454c-a7b6-5d0cc522fc16}")
@Guid("d0aff924a31b454ca7b65d0cc522fc16")
@WinRTInterface("d0aff924a31b454ca7b65d0cc522fc16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskRequestedEventArgs.ByReference::class)
public interface IPrintTaskRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): PrintTaskRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskRequestedEventArgs> {
    public override fun getValue() = ABI.makeIPrintTaskRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskRequestedEventArgs {
    public val __1485508607_Ptr: Pointer?

    public val _1485508607_VtblPtr: Pointer?
      get() = __1485508607_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): PrintTaskRequest? {
      val fnPtr = _1485508607_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskRequest>()
      val hr = fn.invokeHR(arrayOf(__1485508607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskRequest>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1485508607_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0aff924a31b454ca7b65d0cc522fc16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrintTaskRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1485508607_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskRequestedEventArgs):
        Array<IPrintTaskRequestedEventArgs?> = (elements as
        Array<IPrintTaskRequestedEventArgs?>).castToImpl<IPrintTaskRequestedEventArgs,IPrintTaskRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskRequestedEventArgs?> =
        arrayOfNulls<IPrintTaskRequestedEventArgs_Impl>(size) as
        Array<IPrintTaskRequestedEventArgs?>
  }
}
