package Windows.Graphics.Printing

import Windows.Foundation.DateTime
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

@ABIMarker(IPrintTaskSourceRequestedArgs.ABI::class)
@Signature("{f9f067be-f456-41f0-9c98-5ce73e851410}")
@Guid("f9f067bef45641f09c985ce73e851410")
@WinRTInterface("f9f067bef45641f09c985ce73e851410")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskSourceRequestedArgs.ByReference::class)
public interface IPrintTaskSourceRequestedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(1)
  public fun SetSource(source: IPrintDocumentSource?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): PrintTaskSourceRequestedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskSourceRequestedArgs> {
    public override fun getValue() = ABI.makeIPrintTaskSourceRequestedArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskSourceRequestedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskSourceRequestedArgs {
    public val __1873966746_Ptr: Pointer?

    public val _1873966746_VtblPtr: Pointer?
      get() = __1873966746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1873966746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1873966746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetSource(source: IPrintDocumentSource?): Unit {
      val fnPtr = _1873966746_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1873966746_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): PrintTaskSourceRequestedDeferral? {
      val fnPtr = _1873966746_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskSourceRequestedDeferral>()
      val hr = fn.invokeHR(arrayOf(__1873966746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskSourceRequestedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskSourceRequestedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1873966746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskSourceRequestedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9f067bef45641f09c985ce73e851410")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskSourceRequestedArgs(ptr: Pointer?): WithDefault =
        IPrintTaskSourceRequestedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskSourceRequestedArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskSourceRequestedArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskSourceRequestedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1873966746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskSourceRequestedArgs):
        Array<IPrintTaskSourceRequestedArgs?> = (elements as
        Array<IPrintTaskSourceRequestedArgs?>).castToImpl<IPrintTaskSourceRequestedArgs,IPrintTaskSourceRequestedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskSourceRequestedArgs?> =
        arrayOfNulls<IPrintTaskSourceRequestedArgs_Impl>(size) as
        Array<IPrintTaskSourceRequestedArgs?>
  }
}
