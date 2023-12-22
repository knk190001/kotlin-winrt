package Windows.UI.Input.Inking.Core

import Windows.UI.Core.CoreCursor
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

@ABIMarker(ICoreInkIndependentInputSource2.ABI::class)
@Signature("{2846b012-0b59-5bb9-a3c5-becb7cf03a33}")
@Guid("2846b0120b595bb9a3c5becb7cf03a33")
@WinRTInterface("2846b0120b595bb9a3c5becb7cf03a33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInkIndependentInputSource2.ByReference::class)
public interface ICoreInkIndependentInputSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerCursor(): CoreCursor?

  @InterfaceMethod(1)
  public fun put_PointerCursor(value: CoreCursor?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInkIndependentInputSource2> {
    public override fun getValue() = ABI.makeICoreInkIndependentInputSource2(pointer.getPointer(0))

    public fun setValue(value: ICoreInkIndependentInputSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInkIndependentInputSource2 {
    public val __361112171_Ptr: Pointer?

    public val _361112171_VtblPtr: Pointer?
      get() = __361112171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerCursor(): CoreCursor? {
      val fnPtr = _361112171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursor>()
      val hr = fn.invokeHR(arrayOf(__361112171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PointerCursor(value: CoreCursor?): Unit {
      val fnPtr = _361112171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__361112171_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreInkIndependentInputSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __361112171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInkIndependentInputSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2846b0120b595bb9a3c5becb7cf03a33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInkIndependentInputSource2(ptr: Pointer?): WithDefault =
        ICoreInkIndependentInputSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInkIndependentInputSource2 {
      val address = segment.toRawLongValue()
      return makeICoreInkIndependentInputSource2(Pointer(address))
    }

    public override fun toNative(obj: ICoreInkIndependentInputSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__361112171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInkIndependentInputSource2):
        Array<ICoreInkIndependentInputSource2?> = (elements as
        Array<ICoreInkIndependentInputSource2?>).castToImpl<ICoreInkIndependentInputSource2,ICoreInkIndependentInputSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInkIndependentInputSource2?> =
        arrayOfNulls<ICoreInkIndependentInputSource2_Impl>(size) as
        Array<ICoreInkIndependentInputSource2?>
  }
}
