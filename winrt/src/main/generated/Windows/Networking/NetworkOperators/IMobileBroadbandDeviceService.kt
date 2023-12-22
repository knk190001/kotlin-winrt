package Windows.Networking.NetworkOperators

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMobileBroadbandDeviceService.ABI::class)
@Signature("{22be1a52-bd80-40ac-8e1f-2e07836a3dbd}")
@Guid("22be1a52bd8040ac8e1f2e07836a3dbd")
@WinRTInterface("22be1a52bd8040ac8e1f2e07836a3dbd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceService.ByReference::class)
public interface IMobileBroadbandDeviceService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_SupportedCommands(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun OpenDataSession(): MobileBroadbandDeviceServiceDataSession?

  @InterfaceMethod(3)
  public fun OpenCommandSession(): MobileBroadbandDeviceServiceCommandSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceService> {
    public override fun getValue() = ABI.makeIMobileBroadbandDeviceService(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceService {
    public val __93469379_Ptr: Pointer?

    public val _93469379_VtblPtr: Pointer?
      get() = __93469379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _93469379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__93469379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedCommands(): IVectorView<WinDef.UINT>? {
      val fnPtr = _93469379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__93469379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun OpenDataSession(): MobileBroadbandDeviceServiceDataSession? {
      val fnPtr = _93469379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceServiceDataSession>()
      val hr = fn.invokeHR(arrayOf(__93469379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MobileBroadbandDeviceServiceDataSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun OpenCommandSession(): MobileBroadbandDeviceServiceCommandSession? {
      val fnPtr = _93469379_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceServiceCommandSession>()
      val hr = fn.invokeHR(arrayOf(__93469379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MobileBroadbandDeviceServiceCommandSession>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93469379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22be1a52bd8040ac8e1f2e07836a3dbd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceService(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandDeviceService {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceService(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93469379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceService):
        Array<IMobileBroadbandDeviceService?> = (elements as
        Array<IMobileBroadbandDeviceService?>).castToImpl<IMobileBroadbandDeviceService,IMobileBroadbandDeviceService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceService?> =
        arrayOfNulls<IMobileBroadbandDeviceService_Impl>(size) as
        Array<IMobileBroadbandDeviceService?>
  }
}
