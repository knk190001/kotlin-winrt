package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(IGattReadResult.ABI::class)
@Signature("{63a66f08-1aea-4c4c-a50f-97bae474b348}")
@Guid("63a66f081aea4c4ca50f97bae474b348")
@WinRTInterface("63a66f081aea4c4ca50f97bae474b348")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattReadResult.ByReference::class)
public interface IGattReadResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GattCommunicationStatus?

  @InterfaceMethod(1)
  public fun get_Value(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattReadResult> {
    public override fun getValue() = ABI.makeIGattReadResult(pointer.getPointer(0))

    public fun setValue(value: IGattReadResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattReadResult {
    public val __1293782962_Ptr: Pointer?

    public val _1293782962_VtblPtr: Pointer?
      get() = __1293782962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GattCommunicationStatus? {
      val fnPtr = _1293782962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCommunicationStatus>()
      val hr = fn.invokeHR(arrayOf(__1293782962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCommunicationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IBuffer? {
      val fnPtr = _1293782962_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1293782962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IGattReadResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1293782962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattReadResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63a66f081aea4c4ca50f97bae474b348")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattReadResult(ptr: Pointer?): WithDefault = IGattReadResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattReadResult {
      val address = segment.toRawLongValue()
      return makeIGattReadResult(Pointer(address))
    }

    public override fun toNative(obj: IGattReadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1293782962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattReadResult): Array<IGattReadResult?> = (elements as
        Array<IGattReadResult?>).castToImpl<IGattReadResult,IGattReadResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattReadResult?> =
        arrayOfNulls<IGattReadResult_Impl>(size) as Array<IGattReadResult?>
  }
}
