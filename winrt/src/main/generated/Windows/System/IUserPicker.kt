package Windows.System

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserPicker.ABI::class)
@Signature("{7d548008-f1e3-4a6c-8ddc-a9bb0f488aed}")
@Guid("7d548008f1e34a6c8ddca9bb0f488aed")
@WinRTInterface("7d548008f1e34a6c8ddca9bb0f488aed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserPicker.ByReference::class)
public interface IUserPicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowGuestAccounts(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowGuestAccounts(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SuggestedSelectedUser(): User?

  @InterfaceMethod(3)
  public fun put_SuggestedSelectedUser(value: User?): Unit

  @InterfaceMethod(4)
  public fun PickSingleUserAsync(): IAsyncOperation<User?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserPicker> {
    public override fun getValue() = ABI.makeIUserPicker(pointer.getPointer(0))

    public fun setValue(value: IUserPicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserPicker {
    public val __1350531864_Ptr: Pointer?

    public val _1350531864_VtblPtr: Pointer?
      get() = __1350531864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowGuestAccounts(): Boolean {
      val fnPtr = _1350531864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1350531864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowGuestAccounts(value: Boolean): Unit {
      val fnPtr = _1350531864_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350531864_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SuggestedSelectedUser(): User? {
      val fnPtr = _1350531864_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1350531864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SuggestedSelectedUser(value: User?): Unit {
      val fnPtr = _1350531864_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350531864_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun PickSingleUserAsync(): IAsyncOperation<User?>? {
      val fnPtr = _1350531864_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<User?>>()
      val hr = fn.invokeHR(arrayOf(__1350531864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<User?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserPicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350531864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserPicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d548008f1e34a6c8ddca9bb0f488aed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserPicker(ptr: Pointer?): WithDefault = IUserPicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserPicker {
      val address = segment.toRawLongValue()
      return makeIUserPicker(Pointer(address))
    }

    public override fun toNative(obj: IUserPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350531864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserPicker): Array<IUserPicker?> = (elements as
        Array<IUserPicker?>).castToImpl<IUserPicker,IUserPicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserPicker?> =
        arrayOfNulls<IUserPicker_Impl>(size) as Array<IUserPicker?>
  }
}
