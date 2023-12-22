package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadySecureStopServiceRequestFactory.ABI::class)
@Signature("{0e448ac9-e67e-494e-9f49-6285438c76cf}")
@Guid("0e448ac9e67e494e9f496285438c76cf")
@WinRTInterface("0e448ac9e67e494e9f496285438c76cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadySecureStopServiceRequestFactory.ByReference::class)
public interface IPlayReadySecureStopServiceRequestFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(publisherCertBytes: Array<Byte>): PlayReadySecureStopServiceRequest?

  @InterfaceMethod(1)
  public fun CreateInstanceFromSessionID(sessionID: com.sun.jna.platform.win32.Guid.GUID?,
      publisherCertBytes: Array<Byte>): PlayReadySecureStopServiceRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadySecureStopServiceRequestFactory> {
    public override fun getValue() =
        ABI.makeIPlayReadySecureStopServiceRequestFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadySecureStopServiceRequestFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadySecureStopServiceRequestFactory {
    public val __133464610_Ptr: Pointer?

    public val _133464610_VtblPtr: Pointer?
      get() = __133464610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(publisherCertBytes: Array<Byte>):
        PlayReadySecureStopServiceRequest? {
      val fnPtr = _133464610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadySecureStopServiceRequest>()
      val hr = fn.invokeHR(arrayOf(__133464610_Ptr,
          publisherCertBytes.size,marshalToNative(publisherCertBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadySecureStopServiceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun CreateInstanceFromSessionID(sessionID: com.sun.jna.platform.win32.Guid.GUID?,
        publisherCertBytes: Array<Byte>): PlayReadySecureStopServiceRequest? {
      val fnPtr = _133464610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadySecureStopServiceRequest>()
      val hr = fn.invokeHR(arrayOf(__133464610_Ptr, marshalToNative(sessionID),
          publisherCertBytes.size,marshalToNative(publisherCertBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadySecureStopServiceRequest>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadySecureStopServiceRequestFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __133464610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadySecureStopServiceRequestFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e448ac9e67e494e9f496285438c76cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadySecureStopServiceRequestFactory(ptr: Pointer?): WithDefault =
        IPlayReadySecureStopServiceRequestFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlayReadySecureStopServiceRequestFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadySecureStopServiceRequestFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadySecureStopServiceRequestFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__133464610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadySecureStopServiceRequestFactory):
        Array<IPlayReadySecureStopServiceRequestFactory?> = (elements as
        Array<IPlayReadySecureStopServiceRequestFactory?>).castToImpl<IPlayReadySecureStopServiceRequestFactory,IPlayReadySecureStopServiceRequestFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadySecureStopServiceRequestFactory?> =
        arrayOfNulls<IPlayReadySecureStopServiceRequestFactory_Impl>(size) as
        Array<IPlayReadySecureStopServiceRequestFactory?>
  }
}
