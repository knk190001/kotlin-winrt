package Windows.Networking.Connectivity

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

@ABIMarker(ICellularApnContext2.ABI::class)
@Signature("{76b0eb1a-ac49-4350-b1e5-dc4763bc69c7}")
@Guid("76b0eb1aac494350b1e5dc4763bc69c7")
@WinRTInterface("76b0eb1aac494350b1e5dc4763bc69c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICellularApnContext2.ByReference::class)
public interface ICellularApnContext2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun put_ProfileName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICellularApnContext2> {
    public override fun getValue() = ABI.makeICellularApnContext2(pointer.getPointer(0))

    public fun setValue(value: ICellularApnContext2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICellularApnContext2 {
    public val __1670636981_Ptr: Pointer?

    public val _1670636981_VtblPtr: Pointer?
      get() = __1670636981_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _1670636981_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1670636981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProfileName(value: String?): Unit {
      val fnPtr = _1670636981_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1670636981_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICellularApnContext2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1670636981_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICellularApnContext2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76b0eb1aac494350b1e5dc4763bc69c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICellularApnContext2(ptr: Pointer?): WithDefault = ICellularApnContext2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICellularApnContext2 {
      val address = segment.toRawLongValue()
      return makeICellularApnContext2(Pointer(address))
    }

    public override fun toNative(obj: ICellularApnContext2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1670636981_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICellularApnContext2): Array<ICellularApnContext2?> =
        (elements as
        Array<ICellularApnContext2?>).castToImpl<ICellularApnContext2,ICellularApnContext2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICellularApnContext2?> =
        arrayOfNulls<ICellularApnContext2_Impl>(size) as Array<ICellularApnContext2?>
  }
}
