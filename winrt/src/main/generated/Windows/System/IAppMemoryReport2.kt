package Windows.System

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

@ABIMarker(IAppMemoryReport2.ABI::class)
@Signature("{5f7f3738-51b7-42dc-b7ed-79ba46d28857}")
@Guid("5f7f373851b742dcb7ed79ba46d28857")
@WinRTInterface("5f7f373851b742dcb7ed79ba46d28857")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppMemoryReport2.ByReference::class)
public interface IAppMemoryReport2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpectedTotalCommitLimit(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppMemoryReport2> {
    public override fun getValue() = ABI.makeIAppMemoryReport2(pointer.getPointer(0))

    public fun setValue(value: IAppMemoryReport2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppMemoryReport2 {
    public val __279898613_Ptr: Pointer?

    public val _279898613_VtblPtr: Pointer?
      get() = __279898613_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpectedTotalCommitLimit(): WinDef.ULONG {
      val fnPtr = _279898613_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__279898613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppMemoryReport2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __279898613_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppMemoryReport2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f7f373851b742dcb7ed79ba46d28857")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppMemoryReport2(ptr: Pointer?): WithDefault = IAppMemoryReport2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppMemoryReport2 {
      val address = segment.toRawLongValue()
      return makeIAppMemoryReport2(Pointer(address))
    }

    public override fun toNative(obj: IAppMemoryReport2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__279898613_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppMemoryReport2): Array<IAppMemoryReport2?> = (elements
        as Array<IAppMemoryReport2?>).castToImpl<IAppMemoryReport2,IAppMemoryReport2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppMemoryReport2?> =
        arrayOfNulls<IAppMemoryReport2_Impl>(size) as Array<IAppMemoryReport2?>
  }
}
