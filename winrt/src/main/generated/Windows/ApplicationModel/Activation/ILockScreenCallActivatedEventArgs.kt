package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.ILaunchActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Calls.LockScreenCallUI
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ILockScreenCallActivatedEventArgs.ABI::class)
@Signature("{06f37fbe-b5f2-448b-b13e-e328ac1c516a}")
@Guid("06f37fbeb5f2448bb13ee328ac1c516a")
@WinRTInterface("06f37fbeb5f2448bb13ee328ac1c516a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenCallActivatedEventArgs.ByReference::class)
public interface ILockScreenCallActivatedEventArgs : NativeMapped, IWinRTInterface,
    ILaunchActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_CallUI(): LockScreenCallUI?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenCallActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeILockScreenCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILockScreenCallActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenCallActivatedEventArgs,
      ILaunchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __1984481316_Ptr: Pointer?

    public val _1984481316_VtblPtr: Pointer?
      get() = __1984481316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallUI(): LockScreenCallUI? {
      val fnPtr = _1984481316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LockScreenCallUI>()
      val hr = fn.invokeHR(arrayOf(__1984481316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LockScreenCallUI>(result.getValue())
      return resultValue
    }
  }

  public class ILockScreenCallActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILaunchActivatedEventArgs,
      IActivatedEventArgs {
    public override val __183308062_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1984481316_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1984481316_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1984481316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenCallActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06f37fbeb5f2448bb13ee328ac1c516a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenCallActivatedEventArgs(ptr: Pointer?): WithDefault =
        ILockScreenCallActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeILockScreenCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1984481316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenCallActivatedEventArgs):
        Array<ILockScreenCallActivatedEventArgs?> = (elements as
        Array<ILockScreenCallActivatedEventArgs?>).castToImpl<ILockScreenCallActivatedEventArgs,ILockScreenCallActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenCallActivatedEventArgs?> =
        arrayOfNulls<ILockScreenCallActivatedEventArgs_Impl>(size) as
        Array<ILockScreenCallActivatedEventArgs?>
  }
}
