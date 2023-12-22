package Windows.System

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IUser.ABI::class)
@Signature("{df9a26c6-e746-4bcd-b5d4-120103c4209b}")
@Guid("df9a26c6e7464bcdb5d4120103c4209b")
@WinRTInterface("df9a26c6e7464bcdb5d4120103c4209b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUser.ByReference::class)
public interface IUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NonRoamableId(): String?

  @InterfaceMethod(1)
  public fun get_AuthenticationStatus(): UserAuthenticationStatus?

  @InterfaceMethod(2)
  public fun get_Type(): UserType?

  @InterfaceMethod(3)
  public fun GetPropertyAsync(value: String?): IAsyncOperation<IUnknown?>?

  @InterfaceMethod(4)
  public fun GetPropertiesAsync(values: IVectorView<String?>?): IAsyncOperation<IPropertySet?>?

  @InterfaceMethod(5)
  public fun GetPictureAsync(desiredSize: UserPictureSize?):
      IAsyncOperation<IRandomAccessStreamReference?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUser> {
    public override fun getValue() = ABI.makeIUser(pointer.getPointer(0))

    public fun setValue(value: IUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUser {
    public val __866270278_Ptr: Pointer?

    public val _866270278_VtblPtr: Pointer?
      get() = __866270278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NonRoamableId(): String? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AuthenticationStatus(): UserAuthenticationStatus? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationStatus>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Type(): UserType? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserType>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetPropertyAsync(value: String?): IAsyncOperation<IUnknown?>? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPropertiesAsync(values: IVectorView<String?>?):
        IAsyncOperation<IPropertySet?>? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IPropertySet?>>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IPropertySet?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetPictureAsync(desiredSize: UserPictureSize?):
        IAsyncOperation<IRandomAccessStreamReference?>? {
      val fnPtr = _866270278_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__866270278_Ptr, marshalToNative(desiredSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }
  }

  public class IUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866270278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df9a26c6e7464bcdb5d4120103c4209b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUser(ptr: Pointer?): WithDefault = IUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUser {
      val address = segment.toRawLongValue()
      return makeIUser(Pointer(address))
    }

    public override fun toNative(obj: IUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866270278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUser): Array<IUser?> = (elements as
        Array<IUser?>).castToImpl<IUser,IUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUser?> = arrayOfNulls<IUser_Impl>(size) as
        Array<IUser?>
  }
}
