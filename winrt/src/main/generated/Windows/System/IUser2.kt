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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUser2.ABI::class)
@Signature("{98ba5628-a6e3-518e-89d9-d3b2b1991a10}")
@Guid("98ba5628a6e3518e89d9d3b2b1991a10")
@WinRTInterface("98ba5628a6e3518e89d9d3b2b1991a10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUser2.ByReference::class)
public interface IUser2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CheckUserAgeConsentGroupAsync(consentGroup: UserAgeConsentGroup?):
      IAsyncOperation<UserAgeConsentResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUser2> {
    public override fun getValue() = ABI.makeIUser2(pointer.getPointer(0))

    public fun setValue(value: IUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUser2 {
    public val __1084574792_Ptr: Pointer?

    public val _1084574792_VtblPtr: Pointer?
      get() = __1084574792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CheckUserAgeConsentGroupAsync(consentGroup: UserAgeConsentGroup?):
        IAsyncOperation<UserAgeConsentResult?>? {
      val fnPtr = _1084574792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserAgeConsentResult?>>()
      val hr = fn.invokeHR(arrayOf(__1084574792_Ptr, marshalToNative(consentGroup), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserAgeConsentResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IUser2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1084574792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUser2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98ba5628a6e3518e89d9d3b2b1991a10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUser2(ptr: Pointer?): WithDefault = IUser2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUser2 {
      val address = segment.toRawLongValue()
      return makeIUser2(Pointer(address))
    }

    public override fun toNative(obj: IUser2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1084574792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUser2): Array<IUser2?> = (elements as
        Array<IUser2?>).castToImpl<IUser2,IUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUser2?> = arrayOfNulls<IUser2_Impl>(size) as
        Array<IUser2?>
  }
}
