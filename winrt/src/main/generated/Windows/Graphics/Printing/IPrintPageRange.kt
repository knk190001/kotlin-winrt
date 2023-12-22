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

@ABIMarker(IPrintPageRange.ABI::class)
@Signature("{f8a06c54-6e7c-51c5-57fd-0660c2d71513}")
@Guid("f8a06c546e7c51c557fd0660c2d71513")
@WinRTInterface("f8a06c546e7c51c557fd0660c2d71513")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintPageRange.ByReference::class)
public interface IPrintPageRange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FirstPageNumber(): Int

  @InterfaceMethod(1)
  public fun get_LastPageNumber(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintPageRange> {
    public override fun getValue() = ABI.makeIPrintPageRange(pointer.getPointer(0))

    public fun setValue(value: IPrintPageRange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintPageRange {
    public val __461459075_Ptr: Pointer?

    public val _461459075_VtblPtr: Pointer?
      get() = __461459075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FirstPageNumber(): Int {
      val fnPtr = _461459075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__461459075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_LastPageNumber(): Int {
      val fnPtr = _461459075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__461459075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintPageRange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __461459075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintPageRange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8a06c546e7c51c557fd0660c2d71513")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintPageRange(ptr: Pointer?): WithDefault = IPrintPageRange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintPageRange {
      val address = segment.toRawLongValue()
      return makeIPrintPageRange(Pointer(address))
    }

    public override fun toNative(obj: IPrintPageRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__461459075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintPageRange): Array<IPrintPageRange?> = (elements as
        Array<IPrintPageRange?>).castToImpl<IPrintPageRange,IPrintPageRange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintPageRange?> =
        arrayOfNulls<IPrintPageRange_Impl>(size) as Array<IPrintPageRange?>
  }
}
