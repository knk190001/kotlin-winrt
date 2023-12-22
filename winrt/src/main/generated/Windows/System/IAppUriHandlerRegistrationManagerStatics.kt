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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppUriHandlerRegistrationManagerStatics.ABI::class)
@Signature("{d5cedd9f-5729-5b76-a1d4-0285f295c124}")
@Guid("d5cedd9f57295b76a1d40285f295c124")
@WinRTInterface("d5cedd9f57295b76a1d40285f295c124")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerRegistrationManagerStatics.ByReference::class)
public interface IAppUriHandlerRegistrationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AppUriHandlerRegistrationManager?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): AppUriHandlerRegistrationManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerRegistrationManagerStatics> {
    public override fun getValue() =
        ABI.makeIAppUriHandlerRegistrationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerRegistrationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerRegistrationManagerStatics {
    public val __350664385_Ptr: Pointer?

    public val _350664385_VtblPtr: Pointer?
      get() = __350664385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AppUriHandlerRegistrationManager? {
      val fnPtr = _350664385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppUriHandlerRegistrationManager>()
      val hr = fn.invokeHR(arrayOf(__350664385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppUriHandlerRegistrationManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): AppUriHandlerRegistrationManager? {
      val fnPtr = _350664385_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppUriHandlerRegistrationManager>()
      val hr = fn.invokeHR(arrayOf(__350664385_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppUriHandlerRegistrationManager>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerRegistrationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __350664385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerRegistrationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5cedd9f57295b76a1d40285f295c124")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerRegistrationManagerStatics(ptr: Pointer?): WithDefault =
        IAppUriHandlerRegistrationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppUriHandlerRegistrationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerRegistrationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerRegistrationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__350664385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerRegistrationManagerStatics):
        Array<IAppUriHandlerRegistrationManagerStatics?> = (elements as
        Array<IAppUriHandlerRegistrationManagerStatics?>).castToImpl<IAppUriHandlerRegistrationManagerStatics,IAppUriHandlerRegistrationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerRegistrationManagerStatics?> =
        arrayOfNulls<IAppUriHandlerRegistrationManagerStatics_Impl>(size) as
        Array<IAppUriHandlerRegistrationManagerStatics?>
  }
}
