package Windows.Devices.Printers

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

@ABIMarker(IPrintSchema.ABI::class)
@Signature("{c2b98316-26b8-4bfb-8138-9f962c22a35b}")
@Guid("c2b9831626b84bfb81389f962c22a35b")
@WinRTInterface("c2b9831626b84bfb81389f962c22a35b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSchema.ByReference::class)
public interface IPrintSchema : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultPrintTicketAsync(): IAsyncOperation<IRandomAccessStreamWithContentType?>?

  @InterfaceMethod(1)
  public fun GetCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType?):
      IAsyncOperation<IRandomAccessStreamWithContentType?>?

  @InterfaceMethod(2)
  public
      fun MergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType?):
      IAsyncOperation<IRandomAccessStreamWithContentType?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintSchema> {
    public override fun getValue() = ABI.makeIPrintSchema(pointer.getPointer(0))

    public fun setValue(value: IPrintSchema_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSchema {
    public val __765291238_Ptr: Pointer?

    public val _765291238_VtblPtr: Pointer?
      get() = __765291238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultPrintTicketAsync():
        IAsyncOperation<IRandomAccessStreamWithContentType?>? {
      val fnPtr = _765291238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamWithContentType?>>()
      val hr = fn.invokeHR(arrayOf(__765291238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamWithContentType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType?):
        IAsyncOperation<IRandomAccessStreamWithContentType?>? {
      val fnPtr = _765291238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamWithContentType?>>()
      val hr = fn.invokeHR(arrayOf(__765291238_Ptr, marshalToNative(constrainTicket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamWithContentType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun MergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType?):
        IAsyncOperation<IRandomAccessStreamWithContentType?>? {
      val fnPtr = _765291238_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamWithContentType?>>()
      val hr = fn.invokeHR(arrayOf(__765291238_Ptr, marshalToNative(deltaTicket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamWithContentType?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSchema_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __765291238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSchema, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2b9831626b84bfb81389f962c22a35b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSchema(ptr: Pointer?): WithDefault = IPrintSchema_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintSchema {
      val address = segment.toRawLongValue()
      return makeIPrintSchema(Pointer(address))
    }

    public override fun toNative(obj: IPrintSchema): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__765291238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSchema): Array<IPrintSchema?> = (elements as
        Array<IPrintSchema?>).castToImpl<IPrintSchema,IPrintSchema_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSchema?> =
        arrayOfNulls<IPrintSchema_Impl>(size) as Array<IPrintSchema?>
  }
}
