package Windows.ApplicationModel.UserDataTasks.DataProvider

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IUserDataTaskListSyncManagerSyncRequest.ABI::class)
@Signature("{40a73807-7590-4149-ae19-b211431a9f48}")
@Guid("40a7380775904149ae19b211431a9f48")
@WinRTInterface("40a7380775904149ae19b211431a9f48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListSyncManagerSyncRequest.ByReference::class)
public interface IUserDataTaskListSyncManagerSyncRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskListId(): String?

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListSyncManagerSyncRequest> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListSyncManagerSyncRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListSyncManagerSyncRequest {
    public val __2133011063_Ptr: Pointer?

    public val _2133011063_VtblPtr: Pointer?
      get() = __2133011063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskListId(): String? {
      val fnPtr = _2133011063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2133011063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _2133011063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2133011063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _2133011063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2133011063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListSyncManagerSyncRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2133011063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListSyncManagerSyncRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40a7380775904149ae19b211431a9f48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListSyncManagerSyncRequest(ptr: Pointer?): WithDefault =
        IUserDataTaskListSyncManagerSyncRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskListSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2133011063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListSyncManagerSyncRequest):
        Array<IUserDataTaskListSyncManagerSyncRequest?> = (elements as
        Array<IUserDataTaskListSyncManagerSyncRequest?>).castToImpl<IUserDataTaskListSyncManagerSyncRequest,IUserDataTaskListSyncManagerSyncRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListSyncManagerSyncRequest?> =
        arrayOfNulls<IUserDataTaskListSyncManagerSyncRequest_Impl>(size) as
        Array<IUserDataTaskListSyncManagerSyncRequest?>
  }
}
