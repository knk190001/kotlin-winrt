package Windows.Graphics.Printing

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

@ABIMarker(IPrintPageRangeFactory.ABI::class)
@Signature("{408fd45f-e047-5f85-7129-fb085a4fad14}")
@Guid("408fd45fe0475f857129fb085a4fad14")
@WinRTInterface("408fd45fe0475f857129fb085a4fad14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintPageRangeFactory.ByReference::class)
public interface IPrintPageRangeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(firstPage: Int, lastPage: Int): PrintPageRange?

  @InterfaceMethod(1)
  public fun CreateWithSinglePage(page: Int): PrintPageRange?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintPageRangeFactory> {
    public override fun getValue() = ABI.makeIPrintPageRangeFactory(pointer.getPointer(0))

    public fun setValue(value: IPrintPageRangeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintPageRangeFactory {
    public val __1021239501_Ptr: Pointer?

    public val _1021239501_VtblPtr: Pointer?
      get() = __1021239501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(firstPage: Int, lastPage: Int): PrintPageRange? {
      val fnPtr = _1021239501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintPageRange>()
      val hr = fn.invokeHR(arrayOf(__1021239501_Ptr, firstPage, lastPage, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintPageRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithSinglePage(page: Int): PrintPageRange? {
      val fnPtr = _1021239501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintPageRange>()
      val hr = fn.invokeHR(arrayOf(__1021239501_Ptr, page, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintPageRange>(result.getValue())
      return resultValue
    }
  }

  public class IPrintPageRangeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021239501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintPageRangeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("408fd45fe0475f857129fb085a4fad14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintPageRangeFactory(ptr: Pointer?): WithDefault =
        IPrintPageRangeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintPageRangeFactory {
      val address = segment.toRawLongValue()
      return makeIPrintPageRangeFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrintPageRangeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021239501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintPageRangeFactory): Array<IPrintPageRangeFactory?> =
        (elements as
        Array<IPrintPageRangeFactory?>).castToImpl<IPrintPageRangeFactory,IPrintPageRangeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintPageRangeFactory?> =
        arrayOfNulls<IPrintPageRangeFactory_Impl>(size) as Array<IPrintPageRangeFactory?>
  }
}
