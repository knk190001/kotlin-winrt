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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPrintTaskOptionsCore.ABI::class)
@Signature("{1bdbb474-4ed1-41eb-be3c-72d18ed67337}")
@Guid("1bdbb4744ed141ebbe3c72d18ed67337")
@WinRTInterface("1bdbb4744ed141ebbe3c72d18ed67337")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionsCore.ByReference::class)
public interface IPrintTaskOptionsCore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPageDescription(jobPageNumber: WinDef.UINT): PrintPageDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionsCore> {
    public override fun getValue() = ABI.makeIPrintTaskOptionsCore(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionsCore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionsCore {
    public val __2092872985_Ptr: Pointer?

    public val _2092872985_VtblPtr: Pointer?
      get() = __2092872985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPageDescription(jobPageNumber: WinDef.UINT): PrintPageDescription? {
      val fnPtr = _2092872985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintPageDescription>()
      val hr = fn.invokeHR(arrayOf(__2092872985_Ptr, jobPageNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintPageDescription>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptionsCore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2092872985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionsCore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bdbb4744ed141ebbe3c72d18ed67337")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionsCore(ptr: Pointer?): WithDefault =
        IPrintTaskOptionsCore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionsCore {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionsCore(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionsCore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2092872985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionsCore): Array<IPrintTaskOptionsCore?> =
        (elements as
        Array<IPrintTaskOptionsCore?>).castToImpl<IPrintTaskOptionsCore,IPrintTaskOptionsCore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionsCore?> =
        arrayOfNulls<IPrintTaskOptionsCore_Impl>(size) as Array<IPrintTaskOptionsCore?>
  }
}
