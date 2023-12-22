package Windows.Security.Authorization.AppCapabilityAccess

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.System.User
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

@ABIMarker(IAppCapability.ABI::class)
@Signature("{4c49d915-8a2a-4295-9437-2df7c396aff4}")
@Guid("4c49d9158a2a429594372df7c396aff4")
@WinRTInterface("4c49d9158a2a429594372df7c396aff4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCapability.ByReference::class)
public interface IAppCapability : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CapabilityName(): String?

  @InterfaceMethod(1)
  public fun get_User(): User?

  @InterfaceMethod(2)
  public fun RequestAccessAsync(): IAsyncOperation<AppCapabilityAccessStatus?>?

  @InterfaceMethod(3)
  public fun CheckAccess(): AppCapabilityAccessStatus?

  @InterfaceMethod(4)
  public fun add_AccessChanged(handler: TypedEventHandler<AppCapability?,
      AppCapabilityAccessChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_AccessChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppCapability>
      {
    public override fun getValue() = ABI.makeIAppCapability(pointer.getPointer(0))

    public fun setValue(value: IAppCapability_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCapability {
    public val __1695161493_Ptr: Pointer?

    public val _1695161493_VtblPtr: Pointer?
      get() = __1695161493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CapabilityName(): String? {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAccessAsync(): IAsyncOperation<AppCapabilityAccessStatus?>? {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppCapabilityAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppCapabilityAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CheckAccess(): AppCapabilityAccessStatus? {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCapabilityAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCapabilityAccessStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_AccessChanged(handler: TypedEventHandler<AppCapability?,
        AppCapabilityAccessChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_AccessChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1695161493_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1695161493_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppCapability_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1695161493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCapability, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c49d9158a2a429594372df7c396aff4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCapability(ptr: Pointer?): WithDefault = IAppCapability_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCapability {
      val address = segment.toRawLongValue()
      return makeIAppCapability(Pointer(address))
    }

    public override fun toNative(obj: IAppCapability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1695161493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCapability): Array<IAppCapability?> = (elements as
        Array<IAppCapability?>).castToImpl<IAppCapability,IAppCapability_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCapability?> =
        arrayOfNulls<IAppCapability_Impl>(size) as Array<IAppCapability?>
  }
}
