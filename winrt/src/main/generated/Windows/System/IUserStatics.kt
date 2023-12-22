package Windows.System

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

@ABIMarker(IUserStatics.ABI::class)
@Signature("{155eb23b-242a-45e0-a2e9-3171fc6a7fdd}")
@Guid("155eb23b242a45e0a2e93171fc6a7fdd")
@WinRTInterface("155eb23b242a45e0a2e93171fc6a7fdd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserStatics.ByReference::class)
public interface IUserStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcher(): UserWatcher?

  @InterfaceMethod(1)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<User?>?>?

  @InterfaceMethod(2)
  public fun FindAllAsync(type: UserType?): IAsyncOperation<IVectorView<User?>?>?

  @InterfaceMethod(3)
  public fun FindAllAsync(type: UserType?, status: UserAuthenticationStatus?):
      IAsyncOperation<IVectorView<User?>?>?

  @InterfaceMethod(4)
  public fun GetFromId(nonRoamableId: String?): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserStatics> {
    public override fun getValue() = ABI.makeIUserStatics(pointer.getPointer(0))

    public fun setValue(value: IUserStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserStatics {
    public val __235925845_Ptr: Pointer?

    public val _235925845_VtblPtr: Pointer?
      get() = __235925845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcher(): UserWatcher? {
      val fnPtr = _235925845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserWatcher>()
      val hr = fn.invokeHR(arrayOf(__235925845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<User?>?>? {
      val fnPtr = _235925845_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<User?>?>>()
      val hr = fn.invokeHR(arrayOf(__235925845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<User?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAllAsync(type: UserType?): IAsyncOperation<IVectorView<User?>?>? {
      val fnPtr = _235925845_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<User?>?>>()
      val hr = fn.invokeHR(arrayOf(__235925845_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<User?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAllAsync(type: UserType?, status: UserAuthenticationStatus?):
        IAsyncOperation<IVectorView<User?>?>? {
      val fnPtr = _235925845_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<User?>?>>()
      val hr = fn.invokeHR(arrayOf(__235925845_Ptr, marshalToNative(type), marshalToNative(status),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<User?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFromId(nonRoamableId: String?): User? {
      val fnPtr = _235925845_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__235925845_Ptr, marshalToNative(nonRoamableId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IUserStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __235925845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("155eb23b242a45e0a2e93171fc6a7fdd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserStatics(ptr: Pointer?): WithDefault = IUserStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserStatics {
      val address = segment.toRawLongValue()
      return makeIUserStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__235925845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserStatics): Array<IUserStatics?> = (elements as
        Array<IUserStatics?>).castToImpl<IUserStatics,IUserStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserStatics?> =
        arrayOfNulls<IUserStatics_Impl>(size) as Array<IUserStatics?>
  }
}
