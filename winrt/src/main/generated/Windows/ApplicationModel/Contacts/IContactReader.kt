package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactReader.ABI::class)
@Signature("{d397e42e-1488-42f2-bf64-253f4884bfed}")
@Guid("d397e42e148842f2bf64253f4884bfed")
@WinRTInterface("d397e42e148842f2bf64253f4884bfed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactReader.ByReference::class)
public interface IContactReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<ContactBatch?>?

  @InterfaceMethod(1)
  public fun GetMatchingPropertiesWithMatchReason(contact: Contact?):
      IVectorView<ContactMatchReason?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactReader>
      {
    public override fun getValue() = ABI.makeIContactReader(pointer.getPointer(0))

    public fun setValue(value: IContactReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactReader {
    public val __2097001577_Ptr: Pointer?

    public val _2097001577_VtblPtr: Pointer?
      get() = __2097001577_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<ContactBatch?>? {
      val fnPtr = _2097001577_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactBatch?>>()
      val hr = fn.invokeHR(arrayOf(__2097001577_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactBatch?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetMatchingPropertiesWithMatchReason(contact: Contact?):
        IVectorView<ContactMatchReason?>? {
      val fnPtr = _2097001577_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ContactMatchReason?>>()
      val hr = fn.invokeHR(arrayOf(__2097001577_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ContactMatchReason?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2097001577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d397e42e148842f2bf64253f4884bfed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactReader(ptr: Pointer?): WithDefault = IContactReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactReader {
      val address = segment.toRawLongValue()
      return makeIContactReader(Pointer(address))
    }

    public override fun toNative(obj: IContactReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2097001577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactReader): Array<IContactReader?> = (elements as
        Array<IContactReader?>).castToImpl<IContactReader,IContactReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactReader?> =
        arrayOfNulls<IContactReader_Impl>(size) as Array<IContactReader?>
  }
}
