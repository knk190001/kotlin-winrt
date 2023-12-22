package Windows.System.Profile

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemSetupInfoStatics.ABI::class)
@Signature("{2c9620a8-1d88-5e2d-a324-a543af4247ee}")
@Guid("2c9620a81d885e2da324a543af4247ee")
@WinRTInterface("2c9620a81d885e2da324a543af4247ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemSetupInfoStatics.ByReference::class)
public interface ISystemSetupInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OutOfBoxExperienceState(): SystemOutOfBoxExperienceState?

  @InterfaceMethod(1)
  public fun add_OutOfBoxExperienceStateChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_OutOfBoxExperienceStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemSetupInfoStatics> {
    public override fun getValue() = ABI.makeISystemSetupInfoStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemSetupInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemSetupInfoStatics {
    public val __979647741_Ptr: Pointer?

    public val _979647741_VtblPtr: Pointer?
      get() = __979647741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OutOfBoxExperienceState(): SystemOutOfBoxExperienceState? {
      val fnPtr = _979647741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemOutOfBoxExperienceState>()
      val hr = fn.invokeHR(arrayOf(__979647741_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemOutOfBoxExperienceState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_OutOfBoxExperienceStateChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _979647741_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__979647741_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_OutOfBoxExperienceStateChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _979647741_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__979647741_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemSetupInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __979647741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemSetupInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c9620a81d885e2da324a543af4247ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemSetupInfoStatics(ptr: Pointer?): WithDefault =
        ISystemSetupInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemSetupInfoStatics {
      val address = segment.toRawLongValue()
      return makeISystemSetupInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemSetupInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__979647741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemSetupInfoStatics): Array<ISystemSetupInfoStatics?>
        = (elements as
        Array<ISystemSetupInfoStatics?>).castToImpl<ISystemSetupInfoStatics,ISystemSetupInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemSetupInfoStatics?> =
        arrayOfNulls<ISystemSetupInfoStatics_Impl>(size) as Array<ISystemSetupInfoStatics?>
  }
}
