package Windows.Media.Miracast

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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiverStatus.ABI::class)
@Signature("{c28a5591-23ab-519e-ad09-90bff6dcc87e}")
@Guid("c28a559123ab519ead0990bff6dcc87e")
@WinRTInterface("c28a559123ab519ead0990bff6dcc87e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverStatus.ByReference::class)
public interface IMiracastReceiverStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ListeningStatus(): MiracastReceiverListeningStatus?

  @InterfaceMethod(1)
  public fun get_WiFiStatus(): MiracastReceiverWiFiStatus?

  @InterfaceMethod(2)
  public fun get_IsConnectionTakeoverSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_MaxSimultaneousConnections(): Int

  @InterfaceMethod(4)
  public fun get_KnownTransmitters(): IVectorView<MiracastTransmitter?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverStatus> {
    public override fun getValue() = ABI.makeIMiracastReceiverStatus(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverStatus {
    public val __1216171061_Ptr: Pointer?

    public val _1216171061_VtblPtr: Pointer?
      get() = __1216171061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ListeningStatus(): MiracastReceiverListeningStatus? {
      val fnPtr = _1216171061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverListeningStatus>()
      val hr = fn.invokeHR(arrayOf(__1216171061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverListeningStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WiFiStatus(): MiracastReceiverWiFiStatus? {
      val fnPtr = _1216171061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverWiFiStatus>()
      val hr = fn.invokeHR(arrayOf(__1216171061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverWiFiStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsConnectionTakeoverSupported(): Boolean {
      val fnPtr = _1216171061_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1216171061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxSimultaneousConnections(): Int {
      val fnPtr = _1216171061_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1216171061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_KnownTransmitters(): IVectorView<MiracastTransmitter?>? {
      val fnPtr = _1216171061_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MiracastTransmitter?>>()
      val hr = fn.invokeHR(arrayOf(__1216171061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MiracastTransmitter?>>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216171061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c28a559123ab519ead0990bff6dcc87e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverStatus(ptr: Pointer?): WithDefault =
        IMiracastReceiverStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverStatus {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverStatus(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216171061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverStatus): Array<IMiracastReceiverStatus?>
        = (elements as
        Array<IMiracastReceiverStatus?>).castToImpl<IMiracastReceiverStatus,IMiracastReceiverStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverStatus?> =
        arrayOfNulls<IMiracastReceiverStatus_Impl>(size) as Array<IMiracastReceiverStatus?>
  }
}
