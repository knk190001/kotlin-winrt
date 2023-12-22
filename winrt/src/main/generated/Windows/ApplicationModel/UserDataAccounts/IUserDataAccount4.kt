package Windows.ApplicationModel.UserDataAccounts

import Windows.ApplicationModel.Contacts.ContactGroup
import Windows.ApplicationModel.UserDataTasks.UserDataTaskList
import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccount4.ABI::class)
@Signature("{c4315210-eae5-4f0a-a8b2-1cca115e008f}")
@Guid("c4315210eae54f0aa8b21cca115e008f")
@WinRTInterface("c4315210eae54f0aa8b21cca115e008f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccount4.ByReference::class)
public interface IUserDataAccount4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanShowCreateContactGroup(): Boolean

  @InterfaceMethod(1)
  public fun put_CanShowCreateContactGroup(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ProviderProperties(): IPropertySet?

  @InterfaceMethod(3)
  public fun FindUserDataTaskListsAsync(): IAsyncOperation<IVectorView<UserDataTaskList?>?>?

  @InterfaceMethod(4)
  public fun FindContactGroupsAsync(): IAsyncOperation<IVectorView<ContactGroup?>?>?

  @InterfaceMethod(5)
  public fun TryShowCreateContactGroupAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(6)
  public fun put_IsProtectedUnderLock(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun put_Icon(value: IRandomAccessStreamReference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccount4> {
    public override fun getValue() = ABI.makeIUserDataAccount4(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccount4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccount4 {
    public val __199409664_Ptr: Pointer?

    public val _199409664_VtblPtr: Pointer?
      get() = __199409664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanShowCreateContactGroup(): Boolean {
      val fnPtr = _199409664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanShowCreateContactGroup(value: Boolean): Unit {
      val fnPtr = _199409664_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ProviderProperties(): IPropertySet? {
      val fnPtr = _199409664_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindUserDataTaskListsAsync():
        IAsyncOperation<IVectorView<UserDataTaskList?>?>? {
      val fnPtr = _199409664_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UserDataTaskList?>?>>()
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UserDataTaskList?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindContactGroupsAsync(): IAsyncOperation<IVectorView<ContactGroup?>?>? {
      val fnPtr = _199409664_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactGroup?>?>>()
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactGroup?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryShowCreateContactGroupAsync(): IAsyncOperation<String?>? {
      val fnPtr = _199409664_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_IsProtectedUnderLock(value: Boolean): Unit {
      val fnPtr = _199409664_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun put_Icon(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _199409664_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199409664_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataAccount4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __199409664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccount4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4315210eae54f0aa8b21cca115e008f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccount4(ptr: Pointer?): WithDefault = IUserDataAccount4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccount4 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccount4(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccount4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199409664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccount4): Array<IUserDataAccount4?> = (elements
        as Array<IUserDataAccount4?>).castToImpl<IUserDataAccount4,IUserDataAccount4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccount4?> =
        arrayOfNulls<IUserDataAccount4_Impl>(size) as Array<IUserDataAccount4?>
  }
}
