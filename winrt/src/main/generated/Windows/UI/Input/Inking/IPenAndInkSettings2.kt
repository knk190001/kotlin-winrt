package Windows.UI.Input.Inking

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

@ABIMarker(IPenAndInkSettings2.ABI::class)
@Signature("{3262da53-1f44-55e2-9929-ebf77e5481b8}")
@Guid("3262da531f4455e29929ebf77e5481b8")
@WinRTInterface("3262da531f4455e29929ebf77e5481b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenAndInkSettings2.ByReference::class)
public interface IPenAndInkSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPenHandedness(value: PenHandedness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenAndInkSettings2> {
    public override fun getValue() = ABI.makeIPenAndInkSettings2(pointer.getPointer(0))

    public fun setValue(value: IPenAndInkSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenAndInkSettings2 {
    public val __1072244577_Ptr: Pointer?

    public val _1072244577_VtblPtr: Pointer?
      get() = __1072244577_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPenHandedness(value: PenHandedness?): Unit {
      val fnPtr = _1072244577_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1072244577_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPenAndInkSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1072244577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenAndInkSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3262da531f4455e29929ebf77e5481b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenAndInkSettings2(ptr: Pointer?): WithDefault = IPenAndInkSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenAndInkSettings2 {
      val address = segment.toRawLongValue()
      return makeIPenAndInkSettings2(Pointer(address))
    }

    public override fun toNative(obj: IPenAndInkSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1072244577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenAndInkSettings2): Array<IPenAndInkSettings2?> =
        (elements as
        Array<IPenAndInkSettings2?>).castToImpl<IPenAndInkSettings2,IPenAndInkSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenAndInkSettings2?> =
        arrayOfNulls<IPenAndInkSettings2_Impl>(size) as Array<IPenAndInkSettings2?>
  }
}
