package Windows.Graphics.Printing

import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IPrintTaskOptions.ABI::class)
@Signature("{5a0a66bb-d289-41bb-96dd-57e28338ae3f}")
@Guid("5a0a66bbd28941bb96dd57e28338ae3f")
@WinRTInterface("5a0a66bbd28941bb96dd57e28338ae3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptions.ByReference::class)
public interface IPrintTaskOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Bordering(value: PrintBordering?): Unit

  @InterfaceMethod(1)
  public fun get_Bordering(): PrintBordering?

  @InterfaceMethod(2)
  public fun GetPagePrintTicket(printPageInfo: PrintPageInfo?): IRandomAccessStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptions> {
    public override fun getValue() = ABI.makeIPrintTaskOptions(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptions {
    public val __253560024_Ptr: Pointer?

    public val _253560024_VtblPtr: Pointer?
      get() = __253560024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Bordering(value: PrintBordering?): Unit {
      val fnPtr = _253560024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__253560024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Bordering(): PrintBordering? {
      val fnPtr = _253560024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintBordering>()
      val hr = fn.invokeHR(arrayOf(__253560024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintBordering>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPagePrintTicket(printPageInfo: PrintPageInfo?): IRandomAccessStream? {
      val fnPtr = _253560024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__253560024_Ptr, marshalToNative(printPageInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253560024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a0a66bbd28941bb96dd57e28338ae3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptions(ptr: Pointer?): WithDefault = IPrintTaskOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptions {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptions(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253560024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptions): Array<IPrintTaskOptions?> = (elements
        as Array<IPrintTaskOptions?>).castToImpl<IPrintTaskOptions,IPrintTaskOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptions?> =
        arrayOfNulls<IPrintTaskOptions_Impl>(size) as Array<IPrintTaskOptions?>
  }
}
