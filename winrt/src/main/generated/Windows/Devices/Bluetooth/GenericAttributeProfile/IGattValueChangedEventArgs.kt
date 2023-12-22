package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.DateTime
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IGattValueChangedEventArgs.ABI::class)
@Signature("{d21bdb54-06e3-4ed8-a263-acfac8ba7313}")
@Guid("d21bdb5406e34ed8a263acfac8ba7313")
@WinRTInterface("d21bdb5406e34ed8a263acfac8ba7313")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattValueChangedEventArgs.ByReference::class)
public interface IGattValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CharacteristicValue(): IBuffer?

  @InterfaceMethod(1)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattValueChangedEventArgs> {
    public override fun getValue() = ABI.makeIGattValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGattValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattValueChangedEventArgs {
    public val __921022457_Ptr: Pointer?

    public val _921022457_VtblPtr: Pointer?
      get() = __921022457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CharacteristicValue(): IBuffer? {
      val fnPtr = _921022457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__921022457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _921022457_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__921022457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IGattValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __921022457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d21bdb5406e34ed8a263acfac8ba7313")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IGattValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGattValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGattValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__921022457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattValueChangedEventArgs):
        Array<IGattValueChangedEventArgs?> = (elements as
        Array<IGattValueChangedEventArgs?>).castToImpl<IGattValueChangedEventArgs,IGattValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattValueChangedEventArgs?> =
        arrayOfNulls<IGattValueChangedEventArgs_Impl>(size) as Array<IGattValueChangedEventArgs?>
  }
}
