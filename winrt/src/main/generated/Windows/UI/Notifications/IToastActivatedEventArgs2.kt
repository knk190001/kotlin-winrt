package Windows.UI.Notifications

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IToastActivatedEventArgs2.ABI::class)
@Signature("{ab7da512-cc61-568e-81be-304ac31038fa}")
@Guid("ab7da512cc61568e81be304ac31038fa")
@WinRTInterface("ab7da512cc61568e81be304ac31038fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastActivatedEventArgs2.ByReference::class)
public interface IToastActivatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserInput(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastActivatedEventArgs2> {
    public override fun getValue() = ABI.makeIToastActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IToastActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastActivatedEventArgs2 {
    public val __948055029_Ptr: Pointer?

    public val _948055029_VtblPtr: Pointer?
      get() = __948055029_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserInput(): ValueSet? {
      val fnPtr = _948055029_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__948055029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IToastActivatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __948055029_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastActivatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab7da512cc61568e81be304ac31038fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastActivatedEventArgs2(ptr: Pointer?): WithDefault =
        IToastActivatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastActivatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIToastActivatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IToastActivatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__948055029_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastActivatedEventArgs2):
        Array<IToastActivatedEventArgs2?> = (elements as
        Array<IToastActivatedEventArgs2?>).castToImpl<IToastActivatedEventArgs2,IToastActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastActivatedEventArgs2?> =
        arrayOfNulls<IToastActivatedEventArgs2_Impl>(size) as Array<IToastActivatedEventArgs2?>
  }
}
