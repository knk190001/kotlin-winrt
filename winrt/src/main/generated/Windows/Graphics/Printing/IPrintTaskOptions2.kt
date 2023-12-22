package Windows.Graphics.Printing

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IPrintTaskOptions2.ABI::class)
@Signature("{eb9b1606-9a36-4b59-8617-b217849262e1}")
@Guid("eb9b16069a364b598617b217849262e1")
@WinRTInterface("eb9b16069a364b598617b217849262e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptions2.ByReference::class)
public interface IPrintTaskOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PageRangeOptions(): PrintPageRangeOptions?

  @InterfaceMethod(1)
  public fun get_CustomPageRanges(): IVector<PrintPageRange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptions2> {
    public override fun getValue() = ABI.makeIPrintTaskOptions2(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptions2 {
    public val __729573898_Ptr: Pointer?

    public val _729573898_VtblPtr: Pointer?
      get() = __729573898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PageRangeOptions(): PrintPageRangeOptions? {
      val fnPtr = _729573898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintPageRangeOptions>()
      val hr = fn.invokeHR(arrayOf(__729573898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintPageRangeOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CustomPageRanges(): IVector<PrintPageRange?>? {
      val fnPtr = _729573898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PrintPageRange?>>()
      val hr = fn.invokeHR(arrayOf(__729573898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PrintPageRange?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __729573898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb9b16069a364b598617b217849262e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptions2(ptr: Pointer?): WithDefault = IPrintTaskOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptions2 {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptions2(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__729573898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptions2): Array<IPrintTaskOptions2?> =
        (elements as
        Array<IPrintTaskOptions2?>).castToImpl<IPrintTaskOptions2,IPrintTaskOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptions2?> =
        arrayOfNulls<IPrintTaskOptions2_Impl>(size) as Array<IPrintTaskOptions2?>
  }
}
