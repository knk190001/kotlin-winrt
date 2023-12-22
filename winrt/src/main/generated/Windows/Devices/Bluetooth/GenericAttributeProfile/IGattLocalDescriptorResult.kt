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

@ABIMarker(IGattLocalDescriptorResult.ABI::class)
@Signature("{375791be-321f-4366-bfc1-3bc6b82c79f8}")
@Guid("375791be321f4366bfc13bc6b82c79f8")
@WinRTInterface("375791be321f4366bfc13bc6b82c79f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalDescriptorResult.ByReference::class)
public interface IGattLocalDescriptorResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Descriptor(): GattLocalDescriptor?

  @InterfaceMethod(1)
  public fun get_Error(): BluetoothError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalDescriptorResult> {
    public override fun getValue() = ABI.makeIGattLocalDescriptorResult(pointer.getPointer(0))

    public fun setValue(value: IGattLocalDescriptorResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalDescriptorResult {
    public val __1949917212_Ptr: Pointer?

    public val _1949917212_VtblPtr: Pointer?
      get() = __1949917212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Descriptor(): GattLocalDescriptor? {
      val fnPtr = _1949917212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattLocalDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1949917212_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattLocalDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1949917212_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1949917212_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalDescriptorResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1949917212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalDescriptorResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("375791be321f4366bfc13bc6b82c79f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalDescriptorResult(ptr: Pointer?): WithDefault =
        IGattLocalDescriptorResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalDescriptorResult {
      val address = segment.toRawLongValue()
      return makeIGattLocalDescriptorResult(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalDescriptorResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1949917212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalDescriptorResult):
        Array<IGattLocalDescriptorResult?> = (elements as
        Array<IGattLocalDescriptorResult?>).castToImpl<IGattLocalDescriptorResult,IGattLocalDescriptorResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalDescriptorResult?> =
        arrayOfNulls<IGattLocalDescriptorResult_Impl>(size) as Array<IGattLocalDescriptorResult?>
  }
}
