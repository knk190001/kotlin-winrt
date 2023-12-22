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

@ABIMarker(IGattServiceProviderResult.ABI::class)
@Signature("{764696d8-c53e-428c-8a48-67afe02c3ae6}")
@Guid("764696d8c53e428c8a4867afe02c3ae6")
@WinRTInterface("764696d8c53e428c8a4867afe02c3ae6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderResult.ByReference::class)
public interface IGattServiceProviderResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  @InterfaceMethod(1)
  public fun get_ServiceProvider(): GattServiceProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderResult> {
    public override fun getValue() = ABI.makeIGattServiceProviderResult(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderResult {
    public val __612143704_Ptr: Pointer?

    public val _612143704_VtblPtr: Pointer?
      get() = __612143704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _612143704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__612143704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceProvider(): GattServiceProvider? {
      val fnPtr = _612143704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattServiceProvider>()
      val hr = fn.invokeHR(arrayOf(__612143704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattServiceProvider>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __612143704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("764696d8c53e428c8a4867afe02c3ae6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderResult(ptr: Pointer?): WithDefault =
        IGattServiceProviderResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderResult {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderResult(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__612143704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderResult):
        Array<IGattServiceProviderResult?> = (elements as
        Array<IGattServiceProviderResult?>).castToImpl<IGattServiceProviderResult,IGattServiceProviderResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderResult?> =
        arrayOfNulls<IGattServiceProviderResult_Impl>(size) as Array<IGattServiceProviderResult?>
  }
}
