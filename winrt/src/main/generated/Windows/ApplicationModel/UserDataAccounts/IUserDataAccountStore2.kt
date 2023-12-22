package Windows.ApplicationModel.UserDataAccounts

import Windows.ApplicationModel.UserDataAccounts.IUserDataAccountStore.ABI.IID
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccountStore2.ABI::class)
@Signature("{b1e0aef7-9560-4631-8af0-061d30161469}")
@Guid("b1e0aef7956046318af0061d30161469")
@WinRTInterface("b1e0aef7956046318af0061d30161469")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountStore2.ByReference::class)
public interface IUserDataAccountStore2 : NativeMapped, IWinRTInterface, IUserDataAccountStore {
  @InterfaceMethod(0)
  public fun CreateAccountAsync(userDisplayName: String?, packageRelativeAppId: String?):
      IAsyncOperation<UserDataAccount?>?

  @InterfaceMethod(1)
  public fun add_StoreChanged(handler: TypedEventHandler<UserDataAccountStore?,
      UserDataAccountStoreChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_StoreChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountStore2> {
    public override fun getValue() = ABI.makeIUserDataAccountStore2(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountStore2, IUserDataAccountStore.WithDefault {
    public val __2019045563_Ptr: Pointer?

    public val _2019045563_VtblPtr: Pointer?
      get() = __2019045563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAccountAsync(userDisplayName: String?, packageRelativeAppId: String?):
        IAsyncOperation<UserDataAccount?>? {
      val fnPtr = _2019045563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccount?>>()
      val hr = fn.invokeHR(arrayOf(__2019045563_Ptr, marshalToNative(userDisplayName),
          marshalToNative(packageRelativeAppId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_StoreChanged(handler: TypedEventHandler<UserDataAccountStore?,
        UserDataAccountStoreChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2019045563_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2019045563_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_StoreChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2019045563_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019045563_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataAccountStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IUserDataAccountStore {
    public override val __627606157_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019045563_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2019045563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1e0aef7956046318af0061d30161469")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountStore2(ptr: Pointer?): WithDefault =
        IUserDataAccountStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountStore2 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountStore2(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2019045563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountStore2): Array<IUserDataAccountStore2?> =
        (elements as
        Array<IUserDataAccountStore2?>).castToImpl<IUserDataAccountStore2,IUserDataAccountStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountStore2?> =
        arrayOfNulls<IUserDataAccountStore2_Impl>(size) as Array<IUserDataAccountStore2?>
  }
}
