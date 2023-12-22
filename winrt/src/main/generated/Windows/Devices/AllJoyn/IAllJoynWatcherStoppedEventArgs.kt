package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynWatcherStoppedEventArgs.ABI::class)
@Signature("{c9fca03b-701d-4aa8-97dd-a2bb0a8f5fa3}")
@Guid("c9fca03b701d4aa897dda2bb0a8f5fa3")
@WinRTInterface("c9fca03b701d4aa897dda2bb0a8f5fa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynWatcherStoppedEventArgs.ByReference::class)
public interface IAllJoynWatcherStoppedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynWatcherStoppedEventArgs> {
    public override fun getValue() = ABI.makeIAllJoynWatcherStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynWatcherStoppedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynWatcherStoppedEventArgs {
    public val __1997931157_Ptr: Pointer?

    public val _1997931157_VtblPtr: Pointer?
      get() = __1997931157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): Int {
      val fnPtr = _1997931157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1997931157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynWatcherStoppedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997931157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynWatcherStoppedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9fca03b701d4aa897dda2bb0a8f5fa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynWatcherStoppedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynWatcherStoppedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynWatcherStoppedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynWatcherStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynWatcherStoppedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997931157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynWatcherStoppedEventArgs):
        Array<IAllJoynWatcherStoppedEventArgs?> = (elements as
        Array<IAllJoynWatcherStoppedEventArgs?>).castToImpl<IAllJoynWatcherStoppedEventArgs,IAllJoynWatcherStoppedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynWatcherStoppedEventArgs?> =
        arrayOfNulls<IAllJoynWatcherStoppedEventArgs_Impl>(size) as
        Array<IAllJoynWatcherStoppedEventArgs?>
  }
}
