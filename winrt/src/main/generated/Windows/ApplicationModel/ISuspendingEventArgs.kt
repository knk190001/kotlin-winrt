package Windows.ApplicationModel

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

@ABIMarker(ISuspendingEventArgs.ABI::class)
@Signature("{96061c05-2dba-4d08-b0bd-2b30a131c6aa}")
@Guid("96061c052dba4d08b0bd2b30a131c6aa")
@WinRTInterface("96061c052dba4d08b0bd2b30a131c6aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISuspendingEventArgs.ByReference::class)
public interface ISuspendingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SuspendingOperation(): SuspendingOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISuspendingEventArgs> {
    public override fun getValue() = ABI.makeISuspendingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISuspendingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISuspendingEventArgs {
    public val __75596276_Ptr: Pointer?

    public val _75596276_VtblPtr: Pointer?
      get() = __75596276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SuspendingOperation(): SuspendingOperation? {
      val fnPtr = _75596276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SuspendingOperation>()
      val hr = fn.invokeHR(arrayOf(__75596276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SuspendingOperation>(result.getValue())
      return resultValue
    }
  }

  public class ISuspendingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __75596276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISuspendingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96061c052dba4d08b0bd2b30a131c6aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISuspendingEventArgs(ptr: Pointer?): WithDefault = ISuspendingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISuspendingEventArgs {
      val address = segment.toRawLongValue()
      return makeISuspendingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISuspendingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__75596276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISuspendingEventArgs): Array<ISuspendingEventArgs?> =
        (elements as
        Array<ISuspendingEventArgs?>).castToImpl<ISuspendingEventArgs,ISuspendingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISuspendingEventArgs?> =
        arrayOfNulls<ISuspendingEventArgs_Impl>(size) as Array<ISuspendingEventArgs?>
  }
}
