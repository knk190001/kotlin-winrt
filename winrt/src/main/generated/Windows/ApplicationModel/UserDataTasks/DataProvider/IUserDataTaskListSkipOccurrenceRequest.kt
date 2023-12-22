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

@ABIMarker(IUserDataTaskListSkipOccurrenceRequest.ABI::class)
@Signature("{ab87e34d-1cd3-431c-9f58-089aa4338d85}")
@Guid("ab87e34d1cd3431c9f58089aa4338d85")
@WinRTInterface("ab87e34d1cd3431c9f58089aa4338d85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListSkipOccurrenceRequest.ByReference::class)
public interface IUserDataTaskListSkipOccurrenceRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskListId(): String?

  @InterfaceMethod(1)
  public fun get_TaskId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListSkipOccurrenceRequest> {
    public override fun getValue() =
        ABI.makeIUserDataTaskListSkipOccurrenceRequest(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListSkipOccurrenceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListSkipOccurrenceRequest {
    public val __1421571288_Ptr: Pointer?

    public val _1421571288_VtblPtr: Pointer?
      get() = __1421571288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskListId(): String? {
      val fnPtr = _1421571288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1421571288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TaskId(): String? {
      val fnPtr = _1421571288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1421571288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1421571288_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1421571288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1421571288_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1421571288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskListSkipOccurrenceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1421571288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListSkipOccurrenceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab87e34d1cd3431c9f58089aa4338d85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListSkipOccurrenceRequest(ptr: Pointer?): WithDefault =
        IUserDataTaskListSkipOccurrenceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskListSkipOccurrenceRequest {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListSkipOccurrenceRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListSkipOccurrenceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1421571288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListSkipOccurrenceRequest):
        Array<IUserDataTaskListSkipOccurrenceRequest?> = (elements as
        Array<IUserDataTaskListSkipOccurrenceRequest?>).castToImpl<IUserDataTaskListSkipOccurrenceRequest,IUserDataTaskListSkipOccurrenceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListSkipOccurrenceRequest?> =
        arrayOfNulls<IUserDataTaskListSkipOccurrenceRequest_Impl>(size) as
        Array<IUserDataTaskListSkipOccurrenceRequest?>
  }
}
