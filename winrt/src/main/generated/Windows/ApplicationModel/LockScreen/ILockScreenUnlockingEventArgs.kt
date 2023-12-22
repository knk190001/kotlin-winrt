package Windows.ApplicationModel.LockScreen

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

@ABIMarker(ILockScreenUnlockingEventArgs.ABI::class)
@Signature("{44e6c007-75fb-4abb-9f8b-824748900c71}")
@Guid("44e6c00775fb4abb9f8b824748900c71")
@WinRTInterface("44e6c00775fb4abb9f8b824748900c71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenUnlockingEventArgs.ByReference::class)
public interface ILockScreenUnlockingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): LockScreenUnlockingDeferral?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenUnlockingEventArgs> {
    public override fun getValue() = ABI.makeILockScreenUnlockingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILockScreenUnlockingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenUnlockingEventArgs {
    public val __1040855368_Ptr: Pointer?

    public val _1040855368_VtblPtr: Pointer?
      get() = __1040855368_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): LockScreenUnlockingDeferral? {
      val fnPtr = _1040855368_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LockScreenUnlockingDeferral>()
      val hr = fn.invokeHR(arrayOf(__1040855368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LockScreenUnlockingDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1040855368_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1040855368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ILockScreenUnlockingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1040855368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenUnlockingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44e6c00775fb4abb9f8b824748900c71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenUnlockingEventArgs(ptr: Pointer?): WithDefault =
        ILockScreenUnlockingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenUnlockingEventArgs {
      val address = segment.toRawLongValue()
      return makeILockScreenUnlockingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenUnlockingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1040855368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenUnlockingEventArgs):
        Array<ILockScreenUnlockingEventArgs?> = (elements as
        Array<ILockScreenUnlockingEventArgs?>).castToImpl<ILockScreenUnlockingEventArgs,ILockScreenUnlockingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenUnlockingEventArgs?> =
        arrayOfNulls<ILockScreenUnlockingEventArgs_Impl>(size) as
        Array<ILockScreenUnlockingEventArgs?>
  }
}
