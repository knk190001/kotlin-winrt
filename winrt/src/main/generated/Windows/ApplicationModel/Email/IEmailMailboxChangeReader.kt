package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxChangeReader.ABI::class)
@Signature("{bdbd0ebb-c53d-4331-97be-be75a2146a75}")
@Guid("bdbd0ebbc53d433197bebe75a2146a75")
@WinRTInterface("bdbd0ebbc53d433197bebe75a2146a75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxChangeReader.ByReference::class)
public interface IEmailMailboxChangeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcceptChanges(): Unit

  @InterfaceMethod(1)
  public fun AcceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange?): Unit

  @InterfaceMethod(2)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<EmailMailboxChange?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxChangeReader> {
    public override fun getValue() = ABI.makeIEmailMailboxChangeReader(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxChangeReader {
    public val __579692226_Ptr: Pointer?

    public val _579692226_VtblPtr: Pointer?
      get() = __579692226_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcceptChanges(): Unit {
      val fnPtr = _579692226_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__579692226_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AcceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange?): Unit {
      val fnPtr = _579692226_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__579692226_Ptr, marshalToNative(lastChangeToAcknowledge),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<EmailMailboxChange?>?>? {
      val fnPtr = _579692226_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailMailboxChange?>?>>()
      val hr = fn.invokeHR(arrayOf(__579692226_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailMailboxChange?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __579692226_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bdbd0ebbc53d433197bebe75a2146a75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxChangeReader(ptr: Pointer?): WithDefault =
        IEmailMailboxChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxChangeReader {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__579692226_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxChangeReader):
        Array<IEmailMailboxChangeReader?> = (elements as
        Array<IEmailMailboxChangeReader?>).castToImpl<IEmailMailboxChangeReader,IEmailMailboxChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxChangeReader?> =
        arrayOfNulls<IEmailMailboxChangeReader_Impl>(size) as Array<IEmailMailboxChangeReader?>
  }
}
