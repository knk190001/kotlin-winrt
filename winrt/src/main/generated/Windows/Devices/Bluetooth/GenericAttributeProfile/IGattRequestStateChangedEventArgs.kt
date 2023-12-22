package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothError
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

@ABIMarker(IGattRequestStateChangedEventArgs.ABI::class)
@Signature("{e834d92c-27be-44b3-9d0d-4fc6e808dd3f}")
@Guid("e834d92c27be44b39d0d4fc6e808dd3f")
@WinRTInterface("e834d92c27be44b39d0d4fc6e808dd3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattRequestStateChangedEventArgs.ByReference::class)
public interface IGattRequestStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): GattRequestState?

  @InterfaceMethod(1)
  public fun get_Error(): BluetoothError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattRequestStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIGattRequestStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGattRequestStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattRequestStateChangedEventArgs {
    public val __1807730656_Ptr: Pointer?

    public val _1807730656_VtblPtr: Pointer?
      get() = __1807730656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): GattRequestState? {
      val fnPtr = _1807730656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattRequestState>()
      val hr = fn.invokeHR(arrayOf(__1807730656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattRequestState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1807730656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1807730656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }
  }

  public class IGattRequestStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1807730656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattRequestStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e834d92c27be44b39d0d4fc6e808dd3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattRequestStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IGattRequestStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattRequestStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGattRequestStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGattRequestStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1807730656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattRequestStateChangedEventArgs):
        Array<IGattRequestStateChangedEventArgs?> = (elements as
        Array<IGattRequestStateChangedEventArgs?>).castToImpl<IGattRequestStateChangedEventArgs,IGattRequestStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattRequestStateChangedEventArgs?> =
        arrayOfNulls<IGattRequestStateChangedEventArgs_Impl>(size) as
        Array<IGattRequestStateChangedEventArgs?>
  }
}
