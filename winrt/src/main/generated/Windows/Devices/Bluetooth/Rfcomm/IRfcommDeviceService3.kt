package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.Rfcomm.IRfcommDeviceService2.ABI.IID
import Windows.Devices.Enumeration.DeviceAccessInformation
import Windows.Devices.Enumeration.DeviceAccessStatus
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IRfcommDeviceService3.ABI::class)
@Signature("{1c22ace6-dd44-4d23-866d-8f3486ee6490}")
@Guid("1c22ace6dd444d23866d8f3486ee6490")
@WinRTInterface("1c22ace6dd444d23866d8f3486ee6490")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommDeviceService3.ByReference::class)
public interface IRfcommDeviceService3 : NativeMapped, IWinRTInterface, IRfcommDeviceService2,
    IRfcommDeviceService {
  @InterfaceMethod(0)
  public fun get_DeviceAccessInformation(): DeviceAccessInformation?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommDeviceService3> {
    public override fun getValue() = ABI.makeIRfcommDeviceService3(pointer.getPointer(0))

    public fun setValue(value: IRfcommDeviceService3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommDeviceService3, IRfcommDeviceService2.WithDefault,
      IRfcommDeviceService.WithDefault {
    public val __1388805729_Ptr: Pointer?

    public val _1388805729_VtblPtr: Pointer?
      get() = __1388805729_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceAccessInformation(): DeviceAccessInformation? {
      val fnPtr = _1388805729_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__1388805729_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>? {
      val fnPtr = _1388805729_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1388805729_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommDeviceService3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRfcommDeviceService2,
      IRfcommDeviceService {
    public override val __1388805728_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1388805729_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1202125806_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IRfcommDeviceService.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1388805729_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1388805729_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommDeviceService3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c22ace6dd444d23866d8f3486ee6490")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommDeviceService3(ptr: Pointer?): WithDefault =
        IRfcommDeviceService3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommDeviceService3 {
      val address = segment.toRawLongValue()
      return makeIRfcommDeviceService3(Pointer(address))
    }

    public override fun toNative(obj: IRfcommDeviceService3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1388805729_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommDeviceService3): Array<IRfcommDeviceService3?> =
        (elements as
        Array<IRfcommDeviceService3?>).castToImpl<IRfcommDeviceService3,IRfcommDeviceService3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommDeviceService3?> =
        arrayOfNulls<IRfcommDeviceService3_Impl>(size) as Array<IRfcommDeviceService3?>
  }
}
