package Windows.ApplicationModel.Calls

import Windows.Devices.Enumeration.DeviceAccessStatus
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineTransportDevice.ABI::class)
@Signature("{efa8f889-cffa-59f4-97e4-74705b7dc490}")
@Guid("efa8f889cffa59f497e474705b7dc490")
@WinRTInterface("efa8f889cffa59f497e474705b7dc490")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineTransportDevice.ByReference::class)
public interface IPhoneLineTransportDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Transport(): PhoneLineTransport?

  @InterfaceMethod(2)
  public fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>?

  @InterfaceMethod(3)
  public fun RegisterApp(): Unit

  @InterfaceMethod(4)
  public fun RegisterAppForUser(user: User?): Unit

  @InterfaceMethod(5)
  public fun UnregisterApp(): Unit

  @InterfaceMethod(6)
  public fun UnregisterAppForUser(user: User?): Unit

  @InterfaceMethod(7)
  public fun IsRegistered(): Boolean

  @InterfaceMethod(8)
  public fun Connect(): Boolean

  @InterfaceMethod(9)
  public fun ConnectAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineTransportDevice> {
    public override fun getValue() = ABI.makeIPhoneLineTransportDevice(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineTransportDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineTransportDevice {
    public val __65538171_Ptr: Pointer?

    public val _65538171_VtblPtr: Pointer?
      get() = __65538171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _65538171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Transport(): PhoneLineTransport? {
      val fnPtr = _65538171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineTransport>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineTransport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>? {
      val fnPtr = _65538171_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RegisterApp(): Unit {
      val fnPtr = _65538171_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RegisterAppForUser(user: User?): Unit {
      val fnPtr = _65538171_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr, marshalToNative(user),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun UnregisterApp(): Unit {
      val fnPtr = _65538171_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun UnregisterAppForUser(user: User?): Unit {
      val fnPtr = _65538171_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr, marshalToNative(user),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun IsRegistered(): Boolean {
      val fnPtr = _65538171_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun Connect(): Boolean {
      val fnPtr = _65538171_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun ConnectAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _65538171_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__65538171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineTransportDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __65538171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineTransportDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efa8f889cffa59f497e474705b7dc490")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineTransportDevice(ptr: Pointer?): WithDefault =
        IPhoneLineTransportDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineTransportDevice {
      val address = segment.toRawLongValue()
      return makeIPhoneLineTransportDevice(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineTransportDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__65538171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineTransportDevice):
        Array<IPhoneLineTransportDevice?> = (elements as
        Array<IPhoneLineTransportDevice?>).castToImpl<IPhoneLineTransportDevice,IPhoneLineTransportDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineTransportDevice?> =
        arrayOfNulls<IPhoneLineTransportDevice_Impl>(size) as Array<IPhoneLineTransportDevice?>
  }
}
