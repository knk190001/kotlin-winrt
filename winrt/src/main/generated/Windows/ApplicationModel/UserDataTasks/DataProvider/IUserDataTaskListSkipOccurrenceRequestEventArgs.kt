package Windows.ApplicationModel.UserDataTasks.DataProvider

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskListSkipOccurrenceRequestEventArgs.ABI::class)
@Signature("{7a3b924a-cc2f-4e7b-aacd-a5b9d29cfa4e}")
@Guid("7a3b924acc2f4e7baacda5b9d29cfa4e")
@WinRTInterface("7a3b924acc2f4e7baacda5b9d29cfa4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListSkipOccurrenceRequestEventArgs.ByReference::class)
public interface IUserDataTaskListSkipOccurrenceRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): UserDataTaskListSkipOccurrenceRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListSkipOccurrenceRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListSkipOccurrenceRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListSkipOccurrenceRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListSkipOccurrenceRequestEventArgs {
    public val __1406699361_Ptr: Pointer?

    public val _1406699361_VtblPtr: Pointer?
      get() = __1406699361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): UserDataTaskListSkipOccurrenceRequest? {
      val fnPtr = _1406699361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListSkipOccurrenceRequest>()
      val hr = fn.invokeHR(arrayOf(__1406699361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListSkipOccurrenceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1406699361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1406699361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListSkipOccurrenceRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1406699361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListSkipOccurrenceRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a3b924acc2f4e7baacda5b9d29cfa4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListSkipOccurrenceRequestEventArgs(ptr: Pointer?): WithDefault =
        IUserDataTaskListSkipOccurrenceRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListSkipOccurrenceRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListSkipOccurrenceRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListSkipOccurrenceRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1406699361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListSkipOccurrenceRequestEventArgs):
        Array<IUserDataTaskListSkipOccurrenceRequestEventArgs?> = (elements as
        Array<IUserDataTaskListSkipOccurrenceRequestEventArgs?>).castToImpl<IUserDataTaskListSkipOccurrenceRequestEventArgs,IUserDataTaskListSkipOccurrenceRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListSkipOccurrenceRequestEventArgs?>
        = arrayOfNulls<IUserDataTaskListSkipOccurrenceRequestEventArgs_Impl>(size) as
        Array<IUserDataTaskListSkipOccurrenceRequestEventArgs?>
  }
}
