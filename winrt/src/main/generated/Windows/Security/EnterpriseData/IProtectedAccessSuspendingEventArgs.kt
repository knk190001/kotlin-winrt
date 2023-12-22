package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProtectedAccessSuspendingEventArgs.ABI::class)
@Signature("{75a193e0-a344-429f-b975-04fc1f88c185}")
@Guid("75a193e0a344429fb97504fc1f88c185")
@WinRTInterface("75a193e0a344429fb97504fc1f88c185")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectedAccessSuspendingEventArgs.ByReference::class)
public interface IProtectedAccessSuspendingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identities(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectedAccessSuspendingEventArgs> {
    public override fun getValue() =
        ABI.makeIProtectedAccessSuspendingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProtectedAccessSuspendingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectedAccessSuspendingEventArgs {
    public val __187387430_Ptr: Pointer?

    public val _187387430_VtblPtr: Pointer?
      get() = __187387430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identities(): IVectorView<String?>? {
      val fnPtr = _187387430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__187387430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _187387430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__187387430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _187387430_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__187387430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IProtectedAccessSuspendingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __187387430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectedAccessSuspendingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75a193e0a344429fb97504fc1f88c185")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectedAccessSuspendingEventArgs(ptr: Pointer?): WithDefault =
        IProtectedAccessSuspendingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectedAccessSuspendingEventArgs {
      val address = segment.toRawLongValue()
      return makeIProtectedAccessSuspendingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProtectedAccessSuspendingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__187387430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectedAccessSuspendingEventArgs):
        Array<IProtectedAccessSuspendingEventArgs?> = (elements as
        Array<IProtectedAccessSuspendingEventArgs?>).castToImpl<IProtectedAccessSuspendingEventArgs,IProtectedAccessSuspendingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectedAccessSuspendingEventArgs?> =
        arrayOfNulls<IProtectedAccessSuspendingEventArgs_Impl>(size) as
        Array<IProtectedAccessSuspendingEventArgs?>
  }
}
