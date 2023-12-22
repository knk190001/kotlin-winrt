package Microsoft.UI.Xaml.Printing

import Windows.Graphics.Printing.PrintTaskOptions
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

@ABIMarker(IPaginateEventArgs.ABI::class)
@Signature("{6499c196-11a9-5ef8-91cb-52fb963bf172}")
@Guid("6499c19611a95ef891cb52fb963bf172")
@WinRTInterface("6499c19611a95ef891cb52fb963bf172")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaginateEventArgs.ByReference::class)
public interface IPaginateEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrintTaskOptions(): PrintTaskOptions?

  @InterfaceMethod(1)
  public fun get_CurrentPreviewPageNumber(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaginateEventArgs> {
    public override fun getValue() = ABI.makeIPaginateEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPaginateEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaginateEventArgs {
    public val __1301141144_Ptr: Pointer?

    public val _1301141144_VtblPtr: Pointer?
      get() = __1301141144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintTaskOptions(): PrintTaskOptions? {
      val fnPtr = _1301141144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskOptions>()
      val hr = fn.invokeHR(arrayOf(__1301141144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentPreviewPageNumber(): Int {
      val fnPtr = _1301141144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1301141144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IPaginateEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1301141144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaginateEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6499c19611a95ef891cb52fb963bf172")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaginateEventArgs(ptr: Pointer?): WithDefault = IPaginateEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaginateEventArgs {
      val address = segment.toRawLongValue()
      return makeIPaginateEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPaginateEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1301141144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaginateEventArgs): Array<IPaginateEventArgs?> =
        (elements as
        Array<IPaginateEventArgs?>).castToImpl<IPaginateEventArgs,IPaginateEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaginateEventArgs?> =
        arrayOfNulls<IPaginateEventArgs_Impl>(size) as Array<IPaginateEventArgs?>
  }
}
