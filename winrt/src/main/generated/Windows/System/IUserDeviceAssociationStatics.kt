package Windows.System

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IUserDeviceAssociationStatics.ABI::class)
@Signature("{7e491e14-f85a-4c07-8da9-7fe3d0542343}")
@Guid("7e491e14f85a4c078da97fe3d0542343")
@WinRTInterface("7e491e14f85a4c078da97fe3d0542343")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDeviceAssociationStatics.ByReference::class)
public interface IUserDeviceAssociationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindUserFromDeviceId(deviceId: String?): User?

  @InterfaceMethod(1)
  public
      fun add_UserDeviceAssociationChanged(handler: EventHandler<UserDeviceAssociationChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_UserDeviceAssociationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDeviceAssociationStatics> {
    public override fun getValue() = ABI.makeIUserDeviceAssociationStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDeviceAssociationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDeviceAssociationStatics {
    public val __999365932_Ptr: Pointer?

    public val _999365932_VtblPtr: Pointer?
      get() = __999365932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindUserFromDeviceId(deviceId: String?): User? {
      val fnPtr = _999365932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__999365932_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_UserDeviceAssociationChanged(handler: EventHandler<UserDeviceAssociationChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _999365932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__999365932_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_UserDeviceAssociationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _999365932_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__999365932_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDeviceAssociationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __999365932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDeviceAssociationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e491e14f85a4c078da97fe3d0542343")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDeviceAssociationStatics(ptr: Pointer?): WithDefault =
        IUserDeviceAssociationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDeviceAssociationStatics {
      val address = segment.toRawLongValue()
      return makeIUserDeviceAssociationStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDeviceAssociationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__999365932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDeviceAssociationStatics):
        Array<IUserDeviceAssociationStatics?> = (elements as
        Array<IUserDeviceAssociationStatics?>).castToImpl<IUserDeviceAssociationStatics,IUserDeviceAssociationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDeviceAssociationStatics?> =
        arrayOfNulls<IUserDeviceAssociationStatics_Impl>(size) as
        Array<IUserDeviceAssociationStatics?>
  }
}
