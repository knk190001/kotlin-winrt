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

@ABIMarker(IPrintTaskCompletedEventArgs.ABI::class)
@Signature("{5bcd34af-24e9-4c10-8d07-14c346ba3fce}")
@Guid("5bcd34af24e94c108d0714c346ba3fce")
@WinRTInterface("5bcd34af24e94c108d0714c346ba3fce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskCompletedEventArgs.ByReference::class)
public interface IPrintTaskCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Completion(): PrintTaskCompletion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskCompletedEventArgs> {
    public override fun getValue() = ABI.makeIPrintTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskCompletedEventArgs {
    public val __722003518_Ptr: Pointer?

    public val _722003518_VtblPtr: Pointer?
      get() = __722003518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Completion(): PrintTaskCompletion? {
      val fnPtr = _722003518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskCompletion>()
      val hr = fn.invokeHR(arrayOf(__722003518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskCompletion>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __722003518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bcd34af24e94c108d0714c346ba3fce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskCompletedEventArgs(ptr: Pointer?): WithDefault =
        IPrintTaskCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__722003518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskCompletedEventArgs):
        Array<IPrintTaskCompletedEventArgs?> = (elements as
        Array<IPrintTaskCompletedEventArgs?>).castToImpl<IPrintTaskCompletedEventArgs,IPrintTaskCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskCompletedEventArgs?> =
        arrayOfNulls<IPrintTaskCompletedEventArgs_Impl>(size) as
        Array<IPrintTaskCompletedEventArgs?>
  }
}
