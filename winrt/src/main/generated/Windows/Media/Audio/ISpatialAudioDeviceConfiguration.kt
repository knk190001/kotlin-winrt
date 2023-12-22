package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAudioDeviceConfiguration.ABI::class)
@Signature("{ee830034-61cf-5749-9da4-10f0fe028199}")
@Guid("ee83003461cf57499da410f0fe028199")
@WinRTInterface("ee83003461cf57499da410f0fe028199")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAudioDeviceConfiguration.ByReference::class)
public interface ISpatialAudioDeviceConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsSpatialAudioSupported(): Boolean

  @InterfaceMethod(2)
  public fun IsSpatialAudioFormatSupported(subtype: String?): Boolean

  @InterfaceMethod(3)
  public fun get_ActiveSpatialAudioFormat(): String?

  @InterfaceMethod(4)
  public fun get_DefaultSpatialAudioFormat(): String?

  @InterfaceMethod(5)
  public fun SetDefaultSpatialAudioFormatAsync(subtype: String?):
      IAsyncOperation<SetDefaultSpatialAudioFormatResult?>?

  @InterfaceMethod(6)
  public fun add_ConfigurationChanged(handler: TypedEventHandler<SpatialAudioDeviceConfiguration?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ConfigurationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAudioDeviceConfiguration> {
    public override fun getValue() = ABI.makeISpatialAudioDeviceConfiguration(pointer.getPointer(0))

    public fun setValue(value: ISpatialAudioDeviceConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAudioDeviceConfiguration {
    public val __1222118438_Ptr: Pointer?

    public val _1222118438_VtblPtr: Pointer?
      get() = __1222118438_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSpatialAudioSupported(): Boolean {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsSpatialAudioFormatSupported(subtype: String?): Boolean {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr, marshalToNative(subtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ActiveSpatialAudioFormat(): String? {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DefaultSpatialAudioFormat(): String? {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetDefaultSpatialAudioFormatAsync(subtype: String?):
        IAsyncOperation<SetDefaultSpatialAudioFormatResult?>? {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetDefaultSpatialAudioFormatResult?>>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr, marshalToNative(subtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SetDefaultSpatialAudioFormatResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun add_ConfigurationChanged(handler: TypedEventHandler<SpatialAudioDeviceConfiguration?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ConfigurationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1222118438_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1222118438_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialAudioDeviceConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1222118438_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAudioDeviceConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee83003461cf57499da410f0fe028199")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAudioDeviceConfiguration(ptr: Pointer?): WithDefault =
        ISpatialAudioDeviceConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAudioDeviceConfiguration {
      val address = segment.toRawLongValue()
      return makeISpatialAudioDeviceConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAudioDeviceConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1222118438_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAudioDeviceConfiguration):
        Array<ISpatialAudioDeviceConfiguration?> = (elements as
        Array<ISpatialAudioDeviceConfiguration?>).castToImpl<ISpatialAudioDeviceConfiguration,ISpatialAudioDeviceConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAudioDeviceConfiguration?> =
        arrayOfNulls<ISpatialAudioDeviceConfiguration_Impl>(size) as
        Array<ISpatialAudioDeviceConfiguration?>
  }
}
