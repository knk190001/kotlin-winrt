package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattCharacteristicsResult.ABI::class)
@Signature("{1194945c-b257-4f3e-9db7-f68bc9a9aef2}")
@Guid("1194945cb2574f3e9db7f68bc9a9aef2")
@WinRTInterface("1194945cb2574f3e9db7f68bc9a9aef2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicsResult.ByReference::class)
public interface IGattCharacteristicsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GattCommunicationStatus?

  @InterfaceMethod(1)
  public fun get_ProtocolError(): IReference<Byte>?

  @InterfaceMethod(2)
  public fun get_Characteristics(): IVectorView<GattCharacteristic?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicsResult> {
    public override fun getValue() = ABI.makeIGattCharacteristicsResult(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicsResult {
    public val __818501274_Ptr: Pointer?

    public val _818501274_VtblPtr: Pointer?
      get() = __818501274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GattCommunicationStatus? {
      val fnPtr = _818501274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCommunicationStatus>()
      val hr = fn.invokeHR(arrayOf(__818501274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCommunicationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtocolError(): IReference<Byte>? {
      val fnPtr = _818501274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__818501274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Characteristics(): IVectorView<GattCharacteristic?>? {
      val fnPtr = _818501274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattCharacteristic?>>()
      val hr = fn.invokeHR(arrayOf(__818501274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattCharacteristic?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818501274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1194945cb2574f3e9db7f68bc9a9aef2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicsResult(ptr: Pointer?): WithDefault =
        IGattCharacteristicsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristicsResult {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicsResult(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818501274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicsResult):
        Array<IGattCharacteristicsResult?> = (elements as
        Array<IGattCharacteristicsResult?>).castToImpl<IGattCharacteristicsResult,IGattCharacteristicsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicsResult?> =
        arrayOfNulls<IGattCharacteristicsResult_Impl>(size) as Array<IGattCharacteristicsResult?>
  }
}
