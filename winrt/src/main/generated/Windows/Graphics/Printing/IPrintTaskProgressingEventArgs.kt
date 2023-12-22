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

@ABIMarker(IPrintTaskProgressingEventArgs.ABI::class)
@Signature("{810cd3cb-b410-4282-a073-5ac378234174}")
@Guid("810cd3cbb4104282a0735ac378234174")
@WinRTInterface("810cd3cbb4104282a0735ac378234174")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskProgressingEventArgs.ByReference::class)
public interface IPrintTaskProgressingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DocumentPageCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskProgressingEventArgs> {
    public override fun getValue() = ABI.makeIPrintTaskProgressingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskProgressingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskProgressingEventArgs {
    public val __1582285624_Ptr: Pointer?

    public val _1582285624_VtblPtr: Pointer?
      get() = __1582285624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DocumentPageCount(): WinDef.UINT {
      val fnPtr = _1582285624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1582285624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTaskProgressingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1582285624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskProgressingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("810cd3cbb4104282a0735ac378234174")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskProgressingEventArgs(ptr: Pointer?): WithDefault =
        IPrintTaskProgressingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskProgressingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskProgressingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskProgressingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1582285624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskProgressingEventArgs):
        Array<IPrintTaskProgressingEventArgs?> = (elements as
        Array<IPrintTaskProgressingEventArgs?>).castToImpl<IPrintTaskProgressingEventArgs,IPrintTaskProgressingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskProgressingEventArgs?> =
        arrayOfNulls<IPrintTaskProgressingEventArgs_Impl>(size) as
        Array<IPrintTaskProgressingEventArgs?>
  }
}
