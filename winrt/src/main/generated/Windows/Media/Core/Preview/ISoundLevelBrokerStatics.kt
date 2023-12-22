package Windows.Media.Core.Preview

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Media.SoundLevel
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

@ABIMarker(ISoundLevelBrokerStatics.ABI::class)
@Signature("{6a633961-dbed-464c-a09a-33412f5caa3f}")
@Guid("6a633961dbed464ca09a33412f5caa3f")
@WinRTInterface("6a633961dbed464ca09a33412f5caa3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISoundLevelBrokerStatics.ByReference::class)
public interface ISoundLevelBrokerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SoundLevel(): SoundLevel?

  @InterfaceMethod(1)
  public fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_SoundLevelChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISoundLevelBrokerStatics> {
    public override fun getValue() = ABI.makeISoundLevelBrokerStatics(pointer.getPointer(0))

    public fun setValue(value: ISoundLevelBrokerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISoundLevelBrokerStatics {
    public val __2057623748_Ptr: Pointer?

    public val _2057623748_VtblPtr: Pointer?
      get() = __2057623748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SoundLevel(): SoundLevel? {
      val fnPtr = _2057623748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoundLevel>()
      val hr = fn.invokeHR(arrayOf(__2057623748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoundLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2057623748_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2057623748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_SoundLevelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2057623748_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2057623748_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISoundLevelBrokerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2057623748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISoundLevelBrokerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a633961dbed464ca09a33412f5caa3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISoundLevelBrokerStatics(ptr: Pointer?): WithDefault =
        ISoundLevelBrokerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISoundLevelBrokerStatics {
      val address = segment.toRawLongValue()
      return makeISoundLevelBrokerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISoundLevelBrokerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2057623748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISoundLevelBrokerStatics):
        Array<ISoundLevelBrokerStatics?> = (elements as
        Array<ISoundLevelBrokerStatics?>).castToImpl<ISoundLevelBrokerStatics,ISoundLevelBrokerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISoundLevelBrokerStatics?> =
        arrayOfNulls<ISoundLevelBrokerStatics_Impl>(size) as Array<ISoundLevelBrokerStatics?>
  }
}
