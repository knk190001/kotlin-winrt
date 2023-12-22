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

@ABIMarker(IUserDataTaskListDeleteTaskRequest.ABI::class)
@Signature("{4b863c68-7657-4f3d-b074-d47ec8df07e7}")
@Guid("4b863c6876574f3db074d47ec8df07e7")
@WinRTInterface("4b863c6876574f3db074d47ec8df07e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListDeleteTaskRequest.ByReference::class)
public interface IUserDataTaskListDeleteTaskRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskListId(): String?

  @InterfaceMethod(1)
  public fun get_TaskId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListDeleteTaskRequest> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListDeleteTaskRequest(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListDeleteTaskRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListDeleteTaskRequest {
    public val __1796793288_Ptr: Pointer?

    public val _1796793288_VtblPtr: Pointer?
      get() = __1796793288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskListId(): String? {
      val fnPtr = _1796793288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1796793288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TaskId(): String? {
      val fnPtr = _1796793288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1796793288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1796793288_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1796793288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1796793288_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1796793288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListDeleteTaskRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1796793288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListDeleteTaskRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b863c6876574f3db074d47ec8df07e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListDeleteTaskRequest(ptr: Pointer?): WithDefault =
        IUserDataTaskListDeleteTaskRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskListDeleteTaskRequest {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListDeleteTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListDeleteTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1796793288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListDeleteTaskRequest):
        Array<IUserDataTaskListDeleteTaskRequest?> = (elements as
        Array<IUserDataTaskListDeleteTaskRequest?>).castToImpl<IUserDataTaskListDeleteTaskRequest,IUserDataTaskListDeleteTaskRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListDeleteTaskRequest?> =
        arrayOfNulls<IUserDataTaskListDeleteTaskRequest_Impl>(size) as
        Array<IUserDataTaskListDeleteTaskRequest?>
  }
}
