package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPhoneCallHistoryEntryReader.ABI::class)
@Signature("{61ece4be-8d86-479f-8404-a9846920fee6}")
@Guid("61ece4be8d86479f8404a9846920fee6")
@WinRTInterface("61ece4be8d86479f8404a9846920fee6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryEntryReader.ByReference::class)
public interface IPhoneCallHistoryEntryReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<PhoneCallHistoryEntry?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryEntryReader> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryEntryReader(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryEntryReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryEntryReader {
    public val __2044318575_Ptr: Pointer?

    public val _2044318575_VtblPtr: Pointer?
      get() = __2044318575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<PhoneCallHistoryEntry?>?>? {
      val fnPtr = _2044318575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PhoneCallHistoryEntry?>?>>()
      val hr = fn.invokeHR(arrayOf(__2044318575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PhoneCallHistoryEntry?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryEntryReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2044318575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryEntryReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61ece4be8d86479f8404a9846920fee6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryEntryReader(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryEntryReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryEntryReader {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryEntryReader(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryEntryReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2044318575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryEntryReader):
        Array<IPhoneCallHistoryEntryReader?> = (elements as
        Array<IPhoneCallHistoryEntryReader?>).castToImpl<IPhoneCallHistoryEntryReader,IPhoneCallHistoryEntryReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryEntryReader?> =
        arrayOfNulls<IPhoneCallHistoryEntryReader_Impl>(size) as
        Array<IPhoneCallHistoryEntryReader?>
  }
}
