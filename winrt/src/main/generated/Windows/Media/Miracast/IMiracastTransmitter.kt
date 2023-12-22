package Windows.Media.Miracast

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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

@ABIMarker(IMiracastTransmitter.ABI::class)
@Signature("{342d79fd-2e64-5508-8a30-833d1eac70d0}")
@Guid("342d79fd2e6455088a30833d1eac70d0")
@WinRTInterface("342d79fd2e6455088a30833d1eac70d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastTransmitter.ByReference::class)
public interface IMiracastTransmitter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AuthorizationStatus(): MiracastTransmitterAuthorizationStatus?

  @InterfaceMethod(3)
  public fun put_AuthorizationStatus(value: MiracastTransmitterAuthorizationStatus?): Unit

  @InterfaceMethod(4)
  public fun GetConnections(): IVectorView<MiracastReceiverConnection?>?

  @InterfaceMethod(5)
  public fun get_MacAddress(): String?

  @InterfaceMethod(6)
  public fun get_LastConnectionTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastTransmitter> {
    public override fun getValue() = ABI.makeIMiracastTransmitter(pointer.getPointer(0))

    public fun setValue(value: IMiracastTransmitter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastTransmitter {
    public val __343977597_Ptr: Pointer?

    public val _343977597_VtblPtr: Pointer?
      get() = __343977597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _343977597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _343977597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AuthorizationStatus(): MiracastTransmitterAuthorizationStatus? {
      val fnPtr = _343977597_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastTransmitterAuthorizationStatus>()
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastTransmitterAuthorizationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AuthorizationStatus(value: MiracastTransmitterAuthorizationStatus?):
        Unit {
      val fnPtr = _343977597_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetConnections(): IVectorView<MiracastReceiverConnection?>? {
      val fnPtr = _343977597_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MiracastReceiverConnection?>>()
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MiracastReceiverConnection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MacAddress(): String? {
      val fnPtr = _343977597_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_LastConnectionTime(): DateTime? {
      val fnPtr = _343977597_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__343977597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastTransmitter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343977597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastTransmitter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("342d79fd2e6455088a30833d1eac70d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastTransmitter(ptr: Pointer?): WithDefault = IMiracastTransmitter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastTransmitter {
      val address = segment.toRawLongValue()
      return makeIMiracastTransmitter(Pointer(address))
    }

    public override fun toNative(obj: IMiracastTransmitter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343977597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastTransmitter): Array<IMiracastTransmitter?> =
        (elements as
        Array<IMiracastTransmitter?>).castToImpl<IMiracastTransmitter,IMiracastTransmitter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastTransmitter?> =
        arrayOfNulls<IMiracastTransmitter_Impl>(size) as Array<IMiracastTransmitter?>
  }
}
