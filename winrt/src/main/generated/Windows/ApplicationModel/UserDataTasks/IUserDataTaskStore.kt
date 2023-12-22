package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IUserDataTaskStore.ABI::class)
@Signature("{f06a9cb0-f1db-45ba-8a62-086004c0213d}")
@Guid("f06a9cb0f1db45ba8a62086004c0213d")
@WinRTInterface("f06a9cb0f1db45ba8a62086004c0213d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskStore.ByReference::class)
public interface IUserDataTaskStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateListAsync(name: String?): IAsyncOperation<UserDataTaskList?>?

  @InterfaceMethod(1)
  public fun CreateListAsync(name: String?, userDataAccountId: String?):
      IAsyncOperation<UserDataTaskList?>?

  @InterfaceMethod(2)
  public fun FindListsAsync(): IAsyncOperation<IVectorView<UserDataTaskList?>?>?

  @InterfaceMethod(3)
  public fun GetListAsync(taskListId: String?): IAsyncOperation<UserDataTaskList?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskStore> {
    public override fun getValue() = ABI.makeIUserDataTaskStore(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskStore {
    public val __958732973_Ptr: Pointer?

    public val _958732973_VtblPtr: Pointer?
      get() = __958732973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateListAsync(name: String?): IAsyncOperation<UserDataTaskList?>? {
      val fnPtr = _958732973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTaskList?>>()
      val hr = fn.invokeHR(arrayOf(__958732973_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTaskList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateListAsync(name: String?, userDataAccountId: String?):
        IAsyncOperation<UserDataTaskList?>? {
      val fnPtr = _958732973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTaskList?>>()
      val hr = fn.invokeHR(arrayOf(__958732973_Ptr, marshalToNative(name),
          marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTaskList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindListsAsync(): IAsyncOperation<IVectorView<UserDataTaskList?>?>? {
      val fnPtr = _958732973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UserDataTaskList?>?>>()
      val hr = fn.invokeHR(arrayOf(__958732973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UserDataTaskList?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetListAsync(taskListId: String?): IAsyncOperation<UserDataTaskList?>? {
      val fnPtr = _958732973_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTaskList?>>()
      val hr = fn.invokeHR(arrayOf(__958732973_Ptr, marshalToNative(taskListId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTaskList?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __958732973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f06a9cb0f1db45ba8a62086004c0213d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskStore(ptr: Pointer?): WithDefault = IUserDataTaskStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskStore {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskStore(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__958732973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskStore): Array<IUserDataTaskStore?> =
        (elements as
        Array<IUserDataTaskStore?>).castToImpl<IUserDataTaskStore,IUserDataTaskStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskStore?> =
        arrayOfNulls<IUserDataTaskStore_Impl>(size) as Array<IUserDataTaskStore?>
  }
}
