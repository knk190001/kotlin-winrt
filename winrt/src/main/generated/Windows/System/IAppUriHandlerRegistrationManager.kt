package Windows.System

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

@ABIMarker(IAppUriHandlerRegistrationManager.ABI::class)
@Signature("{e62c9a52-ac94-5750-ac1b-6cfb6f250263}")
@Guid("e62c9a52ac945750ac1b6cfb6f250263")
@WinRTInterface("e62c9a52ac945750ac1b6cfb6f250263")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerRegistrationManager.ByReference::class)
public interface IAppUriHandlerRegistrationManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun TryGetRegistration(name: String?): AppUriHandlerRegistration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerRegistrationManager> {
    public override fun getValue() =
        ABI.makeIAppUriHandlerRegistrationManager(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerRegistrationManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerRegistrationManager {
    public val __195979364_Ptr: Pointer?

    public val _195979364_VtblPtr: Pointer?
      get() = __195979364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _195979364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__195979364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetRegistration(name: String?): AppUriHandlerRegistration? {
      val fnPtr = _195979364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppUriHandlerRegistration>()
      val hr = fn.invokeHR(arrayOf(__195979364_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppUriHandlerRegistration>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerRegistrationManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __195979364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerRegistrationManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e62c9a52ac945750ac1b6cfb6f250263")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerRegistrationManager(ptr: Pointer?): WithDefault =
        IAppUriHandlerRegistrationManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerRegistrationManager {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerRegistrationManager(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerRegistrationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__195979364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerRegistrationManager):
        Array<IAppUriHandlerRegistrationManager?> = (elements as
        Array<IAppUriHandlerRegistrationManager?>).castToImpl<IAppUriHandlerRegistrationManager,IAppUriHandlerRegistrationManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerRegistrationManager?> =
        arrayOfNulls<IAppUriHandlerRegistrationManager_Impl>(size) as
        Array<IAppUriHandlerRegistrationManager?>
  }
}
