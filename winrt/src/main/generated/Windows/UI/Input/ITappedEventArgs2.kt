package Windows.UI.Input

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

@ABIMarker(ITappedEventArgs2.ABI::class)
@Signature("{294388f2-177e-51d5-be56-ee0866fa968c}")
@Guid("294388f2177e51d5be56ee0866fa968c")
@WinRTInterface("294388f2177e51d5be56ee0866fa968c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITappedEventArgs2.ByReference::class)
public interface ITappedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITappedEventArgs2> {
    public override fun getValue() = ABI.makeITappedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ITappedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITappedEventArgs2 {
    public val __787443957_Ptr: Pointer?

    public val _787443957_VtblPtr: Pointer?
      get() = __787443957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _787443957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__787443957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ITappedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __787443957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITappedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("294388f2177e51d5be56ee0866fa968c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITappedEventArgs2(ptr: Pointer?): WithDefault = ITappedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITappedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeITappedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ITappedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__787443957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITappedEventArgs2): Array<ITappedEventArgs2?> = (elements
        as Array<ITappedEventArgs2?>).castToImpl<ITappedEventArgs2,ITappedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITappedEventArgs2?> =
        arrayOfNulls<ITappedEventArgs2_Impl>(size) as Array<ITappedEventArgs2?>
  }
}
