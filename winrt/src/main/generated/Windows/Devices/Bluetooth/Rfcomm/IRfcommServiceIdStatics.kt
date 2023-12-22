package Windows.Devices.Bluetooth.Rfcomm

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

@ABIMarker(IRfcommServiceIdStatics.ABI::class)
@Signature("{2a179eba-a975-46e3-b56b-08ffd783a5fe}")
@Guid("2a179ebaa97546e3b56b08ffd783a5fe")
@WinRTInterface("2a179ebaa97546e3b56b08ffd783a5fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommServiceIdStatics.ByReference::class)
public interface IRfcommServiceIdStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromUuid(uuid: com.sun.jna.platform.win32.Guid.GUID?): RfcommServiceId?

  @InterfaceMethod(1)
  public fun FromShortId(shortId: WinDef.UINT): RfcommServiceId?

  @InterfaceMethod(2)
  public fun get_SerialPort(): RfcommServiceId?

  @InterfaceMethod(3)
  public fun get_ObexObjectPush(): RfcommServiceId?

  @InterfaceMethod(4)
  public fun get_ObexFileTransfer(): RfcommServiceId?

  @InterfaceMethod(5)
  public fun get_PhoneBookAccessPce(): RfcommServiceId?

  @InterfaceMethod(6)
  public fun get_PhoneBookAccessPse(): RfcommServiceId?

  @InterfaceMethod(7)
  public fun get_GenericFileTransfer(): RfcommServiceId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommServiceIdStatics> {
    public override fun getValue() = ABI.makeIRfcommServiceIdStatics(pointer.getPointer(0))

    public fun setValue(value: IRfcommServiceIdStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommServiceIdStatics {
    public val __1366155902_Ptr: Pointer?

    public val _1366155902_VtblPtr: Pointer?
      get() = __1366155902_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromUuid(uuid: com.sun.jna.platform.win32.Guid.GUID?): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr, marshalToNative(uuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromShortId(shortId: WinDef.UINT): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr, shortId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SerialPort(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ObexObjectPush(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ObexFileTransfer(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PhoneBookAccessPce(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PhoneBookAccessPse(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_GenericFileTransfer(): RfcommServiceId? {
      val fnPtr = _1366155902_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1366155902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommServiceIdStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1366155902_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommServiceIdStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a179ebaa97546e3b56b08ffd783a5fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommServiceIdStatics(ptr: Pointer?): WithDefault =
        IRfcommServiceIdStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommServiceIdStatics {
      val address = segment.toRawLongValue()
      return makeIRfcommServiceIdStatics(Pointer(address))
    }

    public override fun toNative(obj: IRfcommServiceIdStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1366155902_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommServiceIdStatics): Array<IRfcommServiceIdStatics?>
        = (elements as
        Array<IRfcommServiceIdStatics?>).castToImpl<IRfcommServiceIdStatics,IRfcommServiceIdStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommServiceIdStatics?> =
        arrayOfNulls<IRfcommServiceIdStatics_Impl>(size) as Array<IRfcommServiceIdStatics?>
  }
}
