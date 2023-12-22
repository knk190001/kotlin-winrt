package Windows.ApplicationModel.Calls

import Windows.Foundation.DateTime
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

@ABIMarker(ILockScreenCallEndRequestedEventArgs.ABI::class)
@Signature("{8190a363-6f27-46e9-aeb6-c0ae83e47dc7}")
@Guid("8190a3636f2746e9aeb6c0ae83e47dc7")
@WinRTInterface("8190a3636f2746e9aeb6c0ae83e47dc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenCallEndRequestedEventArgs.ByReference::class)
public interface ILockScreenCallEndRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): LockScreenCallEndCallDeferral?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenCallEndRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeILockScreenCallEndRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILockScreenCallEndRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenCallEndRequestedEventArgs {
    public val __1067376047_Ptr: Pointer?

    public val _1067376047_VtblPtr: Pointer?
      get() = __1067376047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): LockScreenCallEndCallDeferral? {
      val fnPtr = _1067376047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LockScreenCallEndCallDeferral>()
      val hr = fn.invokeHR(arrayOf(__1067376047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LockScreenCallEndCallDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1067376047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1067376047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ILockScreenCallEndRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1067376047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenCallEndRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8190a3636f2746e9aeb6c0ae83e47dc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenCallEndRequestedEventArgs(ptr: Pointer?): WithDefault =
        ILockScreenCallEndRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenCallEndRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeILockScreenCallEndRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenCallEndRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1067376047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenCallEndRequestedEventArgs):
        Array<ILockScreenCallEndRequestedEventArgs?> = (elements as
        Array<ILockScreenCallEndRequestedEventArgs?>).castToImpl<ILockScreenCallEndRequestedEventArgs,ILockScreenCallEndRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenCallEndRequestedEventArgs?> =
        arrayOfNulls<ILockScreenCallEndRequestedEventArgs_Impl>(size) as
        Array<ILockScreenCallEndRequestedEventArgs?>
  }
}
