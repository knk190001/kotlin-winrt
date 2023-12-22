package Windows.UI.Input

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemFunctionLockChangedEventArgs.ABI::class)
@Signature("{cd040608-fcf9-585c-beab-f1d2eaf364ab}")
@Guid("cd040608fcf9585cbeabf1d2eaf364ab")
@WinRTInterface("cd040608fcf9585cbeabf1d2eaf364ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemFunctionLockChangedEventArgs.ByReference::class)
public interface ISystemFunctionLockChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_IsLocked(): Boolean

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemFunctionLockChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISystemFunctionLockChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemFunctionLockChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemFunctionLockChangedEventArgs {
    public val __2126687069_Ptr: Pointer?

    public val _2126687069_VtblPtr: Pointer?
      get() = __2126687069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _2126687069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2126687069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsLocked(): Boolean {
      val fnPtr = _2126687069_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2126687069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _2126687069_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2126687069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _2126687069_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2126687069_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemFunctionLockChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2126687069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemFunctionLockChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd040608fcf9585cbeabf1d2eaf364ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemFunctionLockChangedEventArgs(ptr: Pointer?): WithDefault =
        ISystemFunctionLockChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemFunctionLockChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemFunctionLockChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemFunctionLockChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2126687069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemFunctionLockChangedEventArgs):
        Array<ISystemFunctionLockChangedEventArgs?> = (elements as
        Array<ISystemFunctionLockChangedEventArgs?>).castToImpl<ISystemFunctionLockChangedEventArgs,ISystemFunctionLockChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemFunctionLockChangedEventArgs?> =
        arrayOfNulls<ISystemFunctionLockChangedEventArgs_Impl>(size) as
        Array<ISystemFunctionLockChangedEventArgs?>
  }
}
