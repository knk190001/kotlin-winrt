package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowClosedEventArgs.ABI::class)
@Signature("{cc7df816-9520-5a06-821e-456ad8b358aa}")
@Guid("cc7df81695205a06821e456ad8b358aa")
@WinRTInterface("cc7df81695205a06821e456ad8b358aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowClosedEventArgs.ByReference::class)
public interface IAppWindowClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): AppWindowClosedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowClosedEventArgs> {
    public override fun getValue() = ABI.makeIAppWindowClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppWindowClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowClosedEventArgs {
    public val __1284663295_Ptr: Pointer?

    public val _1284663295_VtblPtr: Pointer?
      get() = __1284663295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): AppWindowClosedReason? {
      val fnPtr = _1284663295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowClosedReason>()
      val hr = fn.invokeHR(arrayOf(__1284663295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowClosedReason>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1284663295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc7df81695205a06821e456ad8b358aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowClosedEventArgs(ptr: Pointer?): WithDefault =
        IAppWindowClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppWindowClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1284663295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowClosedEventArgs):
        Array<IAppWindowClosedEventArgs?> = (elements as
        Array<IAppWindowClosedEventArgs?>).castToImpl<IAppWindowClosedEventArgs,IAppWindowClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowClosedEventArgs?> =
        arrayOfNulls<IAppWindowClosedEventArgs_Impl>(size) as Array<IAppWindowClosedEventArgs?>
  }
}
