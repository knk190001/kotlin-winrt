package Windows.Devices.Gpio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGpioPin.ABI::class)
@Signature("{11d9b087-afae-4790-9ee9-e0eac942d201}")
@Guid("11d9b087afae47909ee9e0eac942d201")
@WinRTInterface("11d9b087afae47909ee9e0eac942d201")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioPin.ByReference::class)
public interface IGpioPin : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_ValueChanged(handler: TypedEventHandler<GpioPin?, GpioPinValueChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ValueChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_DebounceTimeout(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_DebounceTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_PinNumber(): Int

  @InterfaceMethod(5)
  public fun get_SharingMode(): GpioSharingMode?

  @InterfaceMethod(6)
  public fun IsDriveModeSupported(driveMode: GpioPinDriveMode?): Boolean

  @InterfaceMethod(7)
  public fun GetDriveMode(): GpioPinDriveMode?

  @InterfaceMethod(8)
  public fun SetDriveMode(value: GpioPinDriveMode?): Unit

  @InterfaceMethod(9)
  public fun Write(value: GpioPinValue?): Unit

  @InterfaceMethod(10)
  public fun Read(): GpioPinValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGpioPin> {
    public override fun getValue() = ABI.makeIGpioPin(pointer.getPointer(0))

    public fun setValue(value: IGpioPin_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioPin, IClosable.WithDefault {
    public val __1784839144_Ptr: Pointer?

    public val _1784839144_VtblPtr: Pointer?
      get() = __1784839144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ValueChanged(handler: TypedEventHandler<GpioPin?,
        GpioPinValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ValueChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DebounceTimeout(): TimeSpan? {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DebounceTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PinNumber(): Int {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SharingMode(): GpioSharingMode? {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioSharingMode>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun IsDriveModeSupported(driveMode: GpioPinDriveMode?): Boolean {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(driveMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetDriveMode(): GpioPinDriveMode? {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioPinDriveMode>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioPinDriveMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetDriveMode(value: GpioPinDriveMode?): Unit {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Write(value: GpioPinValue?): Unit {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Read(): GpioPinValue? {
      val fnPtr = _1784839144_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioPinValue>()
      val hr = fn.invokeHR(arrayOf(__1784839144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioPinValue>(result.getValue())
      return resultValue
    }
  }

  public class IGpioPin_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1784839144_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1784839144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioPin, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11d9b087afae47909ee9e0eac942d201")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioPin(ptr: Pointer?): WithDefault = IGpioPin_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioPin {
      val address = segment.toRawLongValue()
      return makeIGpioPin(Pointer(address))
    }

    public override fun toNative(obj: IGpioPin): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1784839144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioPin): Array<IGpioPin?> = (elements as
        Array<IGpioPin?>).castToImpl<IGpioPin,IGpioPin_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioPin?> = arrayOfNulls<IGpioPin_Impl>(size) as
        Array<IGpioPin?>
  }
}
