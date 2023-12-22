package Windows.ApplicationModel.LockScreen

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

@ABIMarker(ILockScreenUnlockingDeferral.ABI::class)
@Signature("{7e7d1ad6-5203-43e7-9bd6-7c3947d1e3fe}")
@Guid("7e7d1ad6520343e79bd67c3947d1e3fe")
@WinRTInterface("7e7d1ad6520343e79bd67c3947d1e3fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenUnlockingDeferral.ByReference::class)
public interface ILockScreenUnlockingDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenUnlockingDeferral> {
    public override fun getValue() = ABI.makeILockScreenUnlockingDeferral(pointer.getPointer(0))

    public fun setValue(value: ILockScreenUnlockingDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenUnlockingDeferral {
    public val __1464890582_Ptr: Pointer?

    public val _1464890582_VtblPtr: Pointer?
      get() = __1464890582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1464890582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1464890582_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILockScreenUnlockingDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464890582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenUnlockingDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e7d1ad6520343e79bd67c3947d1e3fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenUnlockingDeferral(ptr: Pointer?): WithDefault =
        ILockScreenUnlockingDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenUnlockingDeferral {
      val address = segment.toRawLongValue()
      return makeILockScreenUnlockingDeferral(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenUnlockingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464890582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenUnlockingDeferral):
        Array<ILockScreenUnlockingDeferral?> = (elements as
        Array<ILockScreenUnlockingDeferral?>).castToImpl<ILockScreenUnlockingDeferral,ILockScreenUnlockingDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenUnlockingDeferral?> =
        arrayOfNulls<ILockScreenUnlockingDeferral_Impl>(size) as
        Array<ILockScreenUnlockingDeferral?>
  }
}
