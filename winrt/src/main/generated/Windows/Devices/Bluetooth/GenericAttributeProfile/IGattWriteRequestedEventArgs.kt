package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.Deferral
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattWriteRequestedEventArgs.ABI::class)
@Signature("{2dec8bbe-a73a-471a-94d5-037deadd0806}")
@Guid("2dec8bbea73a471a94d5037deadd0806")
@WinRTInterface("2dec8bbea73a471a94d5037deadd0806")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattWriteRequestedEventArgs.ByReference::class)
public interface IGattWriteRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): GattSession?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  @InterfaceMethod(2)
  public fun GetRequestAsync(): IAsyncOperation<GattWriteRequest?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattWriteRequestedEventArgs> {
    public override fun getValue() = ABI.makeIGattWriteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGattWriteRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattWriteRequestedEventArgs {
    public val __2085936621_Ptr: Pointer?

    public val _2085936621_VtblPtr: Pointer?
      get() = __2085936621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): GattSession? {
      val fnPtr = _2085936621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSession>()
      val hr = fn.invokeHR(arrayOf(__2085936621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2085936621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2085936621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRequestAsync(): IAsyncOperation<GattWriteRequest?>? {
      val fnPtr = _2085936621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattWriteRequest?>>()
      val hr = fn.invokeHR(arrayOf(__2085936621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattWriteRequest?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattWriteRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2085936621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattWriteRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2dec8bbea73a471a94d5037deadd0806")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattWriteRequestedEventArgs(ptr: Pointer?): WithDefault =
        IGattWriteRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattWriteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGattWriteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGattWriteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2085936621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattWriteRequestedEventArgs):
        Array<IGattWriteRequestedEventArgs?> = (elements as
        Array<IGattWriteRequestedEventArgs?>).castToImpl<IGattWriteRequestedEventArgs,IGattWriteRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattWriteRequestedEventArgs?> =
        arrayOfNulls<IGattWriteRequestedEventArgs_Impl>(size) as
        Array<IGattWriteRequestedEventArgs?>
  }
}
