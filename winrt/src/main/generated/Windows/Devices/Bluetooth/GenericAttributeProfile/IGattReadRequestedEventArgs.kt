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

@ABIMarker(IGattReadRequestedEventArgs.ABI::class)
@Signature("{93497243-f39c-484b-8ab6-996ba486cfa3}")
@Guid("93497243f39c484b8ab6996ba486cfa3")
@WinRTInterface("93497243f39c484b8ab6996ba486cfa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattReadRequestedEventArgs.ByReference::class)
public interface IGattReadRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): GattSession?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  @InterfaceMethod(2)
  public fun GetRequestAsync(): IAsyncOperation<GattReadRequest?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattReadRequestedEventArgs> {
    public override fun getValue() = ABI.makeIGattReadRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGattReadRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattReadRequestedEventArgs {
    public val __1331575430_Ptr: Pointer?

    public val _1331575430_VtblPtr: Pointer?
      get() = __1331575430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): GattSession? {
      val fnPtr = _1331575430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSession>()
      val hr = fn.invokeHR(arrayOf(__1331575430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1331575430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1331575430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRequestAsync(): IAsyncOperation<GattReadRequest?>? {
      val fnPtr = _1331575430_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattReadRequest?>>()
      val hr = fn.invokeHR(arrayOf(__1331575430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattReadRequest?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattReadRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1331575430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattReadRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93497243f39c484b8ab6996ba486cfa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattReadRequestedEventArgs(ptr: Pointer?): WithDefault =
        IGattReadRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattReadRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGattReadRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGattReadRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1331575430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattReadRequestedEventArgs):
        Array<IGattReadRequestedEventArgs?> = (elements as
        Array<IGattReadRequestedEventArgs?>).castToImpl<IGattReadRequestedEventArgs,IGattReadRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattReadRequestedEventArgs?> =
        arrayOfNulls<IGattReadRequestedEventArgs_Impl>(size) as Array<IGattReadRequestedEventArgs?>
  }
}
