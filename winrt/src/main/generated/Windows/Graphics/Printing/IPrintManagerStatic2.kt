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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintManagerStatic2.ABI::class)
@Signature("{35a99955-e6ab-4139-9abd-b86a729b3598}")
@Guid("35a99955e6ab41399abdb86a729b3598")
@WinRTInterface("35a99955e6ab41399abdb86a729b3598")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintManagerStatic2.ByReference::class)
public interface IPrintManagerStatic2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintManagerStatic2> {
    public override fun getValue() = ABI.makeIPrintManagerStatic2(pointer.getPointer(0))

    public fun setValue(value: IPrintManagerStatic2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintManagerStatic2 {
    public val __1305154280_Ptr: Pointer?

    public val _1305154280_VtblPtr: Pointer?
      get() = __1305154280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1305154280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1305154280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintManagerStatic2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1305154280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintManagerStatic2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35a99955e6ab41399abdb86a729b3598")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintManagerStatic2(ptr: Pointer?): WithDefault = IPrintManagerStatic2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintManagerStatic2 {
      val address = segment.toRawLongValue()
      return makeIPrintManagerStatic2(Pointer(address))
    }

    public override fun toNative(obj: IPrintManagerStatic2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305154280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintManagerStatic2): Array<IPrintManagerStatic2?> =
        (elements as
        Array<IPrintManagerStatic2?>).castToImpl<IPrintManagerStatic2,IPrintManagerStatic2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintManagerStatic2?> =
        arrayOfNulls<IPrintManagerStatic2_Impl>(size) as Array<IPrintManagerStatic2?>
  }
}
