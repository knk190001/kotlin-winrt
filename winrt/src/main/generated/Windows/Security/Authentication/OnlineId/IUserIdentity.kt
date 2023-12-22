package Windows.Security.Authentication.OnlineId

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IUserIdentity.ABI::class)
@Signature("{2146d9cd-0742-4be3-8a1c-7c7ae679aa88}")
@Guid("2146d9cd07424be38a1c7c7ae679aa88")
@WinRTInterface("2146d9cd07424be38a1c7c7ae679aa88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserIdentity.ByReference::class)
public interface IUserIdentity : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Tickets(): IVectorView<OnlineIdServiceTicket?>?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_SafeCustomerId(): String?

  @InterfaceMethod(3)
  public fun get_SignInName(): String?

  @InterfaceMethod(4)
  public fun get_FirstName(): String?

  @InterfaceMethod(5)
  public fun get_LastName(): String?

  @InterfaceMethod(6)
  public fun get_IsBetaAccount(): Boolean

  @InterfaceMethod(7)
  public fun get_IsConfirmedPC(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserIdentity>
      {
    public override fun getValue() = ABI.makeIUserIdentity(pointer.getPointer(0))

    public fun setValue(value: IUserIdentity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserIdentity {
    public val __1261552879_Ptr: Pointer?

    public val _1261552879_VtblPtr: Pointer?
      get() = __1261552879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Tickets(): IVectorView<OnlineIdServiceTicket?>? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<OnlineIdServiceTicket?>>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<OnlineIdServiceTicket?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SafeCustomerId(): String? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SignInName(): String? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FirstName(): String? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LastName(): String? {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsBetaAccount(): Boolean {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsConfirmedPC(): Boolean {
      val fnPtr = _1261552879_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1261552879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUserIdentity_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1261552879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserIdentity, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2146d9cd07424be38a1c7c7ae679aa88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserIdentity(ptr: Pointer?): WithDefault = IUserIdentity_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserIdentity {
      val address = segment.toRawLongValue()
      return makeIUserIdentity(Pointer(address))
    }

    public override fun toNative(obj: IUserIdentity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1261552879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserIdentity): Array<IUserIdentity?> = (elements as
        Array<IUserIdentity?>).castToImpl<IUserIdentity,IUserIdentity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserIdentity?> =
        arrayOfNulls<IUserIdentity_Impl>(size) as Array<IUserIdentity?>
  }
}
