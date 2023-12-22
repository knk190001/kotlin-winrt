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

@ABIMarker(IRightTappedEventArgs2.ABI::class)
@Signature("{61c7b7bb-9f57-5857-a33c-c58c3dfa959e}")
@Guid("61c7b7bb9f575857a33cc58c3dfa959e")
@WinRTInterface("61c7b7bb9f575857a33cc58c3dfa959e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRightTappedEventArgs2.ByReference::class)
public interface IRightTappedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRightTappedEventArgs2> {
    public override fun getValue() = ABI.makeIRightTappedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IRightTappedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRightTappedEventArgs2 {
    public val __407654827_Ptr: Pointer?

    public val _407654827_VtblPtr: Pointer?
      get() = __407654827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _407654827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__407654827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IRightTappedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407654827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRightTappedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61c7b7bb9f575857a33cc58c3dfa959e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRightTappedEventArgs2(ptr: Pointer?): WithDefault =
        IRightTappedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRightTappedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIRightTappedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IRightTappedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407654827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRightTappedEventArgs2): Array<IRightTappedEventArgs2?> =
        (elements as
        Array<IRightTappedEventArgs2?>).castToImpl<IRightTappedEventArgs2,IRightTappedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRightTappedEventArgs2?> =
        arrayOfNulls<IRightTappedEventArgs2_Impl>(size) as Array<IRightTappedEventArgs2?>
  }
}
