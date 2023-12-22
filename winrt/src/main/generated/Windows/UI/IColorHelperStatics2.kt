package Windows.UI

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

@ABIMarker(IColorHelperStatics2.ABI::class)
@Signature("{24d9af02-6eb0-4b94-855c-fcf0818d9a16}")
@Guid("24d9af026eb04b94855cfcf0818d9a16")
@WinRTInterface("24d9af026eb04b94855cfcf0818d9a16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorHelperStatics2.ByReference::class)
public interface IColorHelperStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToDisplayName(color: Color?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorHelperStatics2> {
    public override fun getValue() = ABI.makeIColorHelperStatics2(pointer.getPointer(0))

    public fun setValue(value: IColorHelperStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorHelperStatics2 {
    public val __942677356_Ptr: Pointer?

    public val _942677356_VtblPtr: Pointer?
      get() = __942677356_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToDisplayName(color: Color?): String? {
      val fnPtr = _942677356_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__942677356_Ptr, marshalToNative(color), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IColorHelperStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942677356_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorHelperStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24d9af026eb04b94855cfcf0818d9a16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorHelperStatics2(ptr: Pointer?): WithDefault = IColorHelperStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorHelperStatics2 {
      val address = segment.toRawLongValue()
      return makeIColorHelperStatics2(Pointer(address))
    }

    public override fun toNative(obj: IColorHelperStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942677356_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorHelperStatics2): Array<IColorHelperStatics2?> =
        (elements as
        Array<IColorHelperStatics2?>).castToImpl<IColorHelperStatics2,IColorHelperStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorHelperStatics2?> =
        arrayOfNulls<IColorHelperStatics2_Impl>(size) as Array<IColorHelperStatics2?>
  }
}
