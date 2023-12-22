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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintPageRangeOptions.ABI::class)
@Signature("{ce6db728-1357-46b2-a923-79f995f448fc}")
@Guid("ce6db728135746b2a92379f995f448fc")
@WinRTInterface("ce6db728135746b2a92379f995f448fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintPageRangeOptions.ByReference::class)
public interface IPrintPageRangeOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AllowAllPages(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_AllowAllPages(): Boolean

  @InterfaceMethod(2)
  public fun put_AllowCurrentPage(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_AllowCurrentPage(): Boolean

  @InterfaceMethod(4)
  public fun put_AllowCustomSetOfPages(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_AllowCustomSetOfPages(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintPageRangeOptions> {
    public override fun getValue() = ABI.makeIPrintPageRangeOptions(pointer.getPointer(0))

    public fun setValue(value: IPrintPageRangeOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintPageRangeOptions {
    public val __863647329_Ptr: Pointer?

    public val _863647329_VtblPtr: Pointer?
      get() = __863647329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AllowAllPages(value: Boolean): Unit {
      val fnPtr = _863647329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AllowAllPages(): Boolean {
      val fnPtr = _863647329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowCurrentPage(value: Boolean): Unit {
      val fnPtr = _863647329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AllowCurrentPage(): Boolean {
      val fnPtr = _863647329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_AllowCustomSetOfPages(value: Boolean): Unit {
      val fnPtr = _863647329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_AllowCustomSetOfPages(): Boolean {
      val fnPtr = _863647329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__863647329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintPageRangeOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __863647329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintPageRangeOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce6db728135746b2a92379f995f448fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintPageRangeOptions(ptr: Pointer?): WithDefault =
        IPrintPageRangeOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintPageRangeOptions {
      val address = segment.toRawLongValue()
      return makeIPrintPageRangeOptions(Pointer(address))
    }

    public override fun toNative(obj: IPrintPageRangeOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__863647329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintPageRangeOptions): Array<IPrintPageRangeOptions?> =
        (elements as
        Array<IPrintPageRangeOptions?>).castToImpl<IPrintPageRangeOptions,IPrintPageRangeOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintPageRangeOptions?> =
        arrayOfNulls<IPrintPageRangeOptions_Impl>(size) as Array<IPrintPageRangeOptions?>
  }
}
