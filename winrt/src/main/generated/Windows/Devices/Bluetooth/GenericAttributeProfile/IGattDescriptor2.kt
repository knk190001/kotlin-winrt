package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IGattDescriptor2.ABI::class)
@Signature("{8f563d39-d630-406c-ba11-10cdd16b0e5e}")
@Guid("8f563d39d630406cba1110cdd16b0e5e")
@WinRTInterface("8f563d39d630406cba1110cdd16b0e5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDescriptor2.ByReference::class)
public interface IGattDescriptor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun WriteValueWithResultAsync(value: IBuffer?): IAsyncOperation<GattWriteResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDescriptor2> {
    public override fun getValue() = ABI.makeIGattDescriptor2(pointer.getPointer(0))

    public fun setValue(value: IGattDescriptor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDescriptor2 {
    public val __759729928_Ptr: Pointer?

    public val _759729928_VtblPtr: Pointer?
      get() = __759729928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun WriteValueWithResultAsync(value: IBuffer?):
        IAsyncOperation<GattWriteResult?>? {
      val fnPtr = _759729928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattWriteResult?>>()
      val hr = fn.invokeHR(arrayOf(__759729928_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattWriteResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDescriptor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __759729928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDescriptor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f563d39d630406cba1110cdd16b0e5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDescriptor2(ptr: Pointer?): WithDefault = IGattDescriptor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDescriptor2 {
      val address = segment.toRawLongValue()
      return makeIGattDescriptor2(Pointer(address))
    }

    public override fun toNative(obj: IGattDescriptor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759729928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDescriptor2): Array<IGattDescriptor2?> = (elements as
        Array<IGattDescriptor2?>).castToImpl<IGattDescriptor2,IGattDescriptor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDescriptor2?> =
        arrayOfNulls<IGattDescriptor2_Impl>(size) as Array<IGattDescriptor2?>
  }
}
