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

@ABIMarker(IGattDescriptorsResult.ABI::class)
@Signature("{9bc091f3-95e7-4489-8d25-ff81955a57b9}")
@Guid("9bc091f395e744898d25ff81955a57b9")
@WinRTInterface("9bc091f395e744898d25ff81955a57b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDescriptorsResult.ByReference::class)
public interface IGattDescriptorsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GattCommunicationStatus?

  @InterfaceMethod(1)
  public fun get_ProtocolError(): IReference<Byte>?

  @InterfaceMethod(2)
  public fun get_Descriptors(): IVectorView<GattDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDescriptorsResult> {
    public override fun getValue() = ABI.makeIGattDescriptorsResult(pointer.getPointer(0))

    public fun setValue(value: IGattDescriptorsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDescriptorsResult {
    public val __1505421510_Ptr: Pointer?

    public val _1505421510_VtblPtr: Pointer?
      get() = __1505421510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GattCommunicationStatus? {
      val fnPtr = _1505421510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCommunicationStatus>()
      val hr = fn.invokeHR(arrayOf(__1505421510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCommunicationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtocolError(): IReference<Byte>? {
      val fnPtr = _1505421510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__1505421510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Descriptors(): IVectorView<GattDescriptor?>? {
      val fnPtr = _1505421510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1505421510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDescriptorsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1505421510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDescriptorsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bc091f395e744898d25ff81955a57b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDescriptorsResult(ptr: Pointer?): WithDefault =
        IGattDescriptorsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDescriptorsResult {
      val address = segment.toRawLongValue()
      return makeIGattDescriptorsResult(Pointer(address))
    }

    public override fun toNative(obj: IGattDescriptorsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1505421510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDescriptorsResult): Array<IGattDescriptorsResult?> =
        (elements as
        Array<IGattDescriptorsResult?>).castToImpl<IGattDescriptorsResult,IGattDescriptorsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDescriptorsResult?> =
        arrayOfNulls<IGattDescriptorsResult_Impl>(size) as Array<IGattDescriptorsResult?>
  }
}
