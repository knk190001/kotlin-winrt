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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStandardPrintTaskOptionsStatic3.ABI::class)
@Signature("{bbf68e86-3858-41b3-a799-55dd9888d475}")
@Guid("bbf68e86385841b3a79955dd9888d475")
@WinRTInterface("bbf68e86385841b3a79955dd9888d475")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardPrintTaskOptionsStatic3.ByReference::class)
public interface IStandardPrintTaskOptionsStatic3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CustomPageRanges(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardPrintTaskOptionsStatic3> {
    public override fun getValue() = ABI.makeIStandardPrintTaskOptionsStatic3(pointer.getPointer(0))

    public fun setValue(value: IStandardPrintTaskOptionsStatic3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardPrintTaskOptionsStatic3 {
    public val __493834304_Ptr: Pointer?

    public val _493834304_VtblPtr: Pointer?
      get() = __493834304_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CustomPageRanges(): String? {
      val fnPtr = _493834304_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__493834304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStandardPrintTaskOptionsStatic3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493834304_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardPrintTaskOptionsStatic3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbf68e86385841b3a79955dd9888d475")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardPrintTaskOptionsStatic3(ptr: Pointer?): WithDefault =
        IStandardPrintTaskOptionsStatic3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardPrintTaskOptionsStatic3 {
      val address = segment.toRawLongValue()
      return makeIStandardPrintTaskOptionsStatic3(Pointer(address))
    }

    public override fun toNative(obj: IStandardPrintTaskOptionsStatic3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493834304_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardPrintTaskOptionsStatic3):
        Array<IStandardPrintTaskOptionsStatic3?> = (elements as
        Array<IStandardPrintTaskOptionsStatic3?>).castToImpl<IStandardPrintTaskOptionsStatic3,IStandardPrintTaskOptionsStatic3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardPrintTaskOptionsStatic3?> =
        arrayOfNulls<IStandardPrintTaskOptionsStatic3_Impl>(size) as
        Array<IStandardPrintTaskOptionsStatic3?>
  }
}
