package Windows.UI.Xaml.Controls

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

@ABIMarker(ITextBoxTextChangingEventArgs2.ABI::class)
@Signature("{c0723d44-53a6-415f-a981-50dfaf1becbe}")
@Guid("c0723d4453a6415fa98150dfaf1becbe")
@WinRTInterface("c0723d4453a6415fa98150dfaf1becbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxTextChangingEventArgs2.ByReference::class)
public interface ITextBoxTextChangingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsContentChanging(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxTextChangingEventArgs2> {
    public override fun getValue() = ABI.makeITextBoxTextChangingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ITextBoxTextChangingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxTextChangingEventArgs2 {
    public val __512267575_Ptr: Pointer?

    public val _512267575_VtblPtr: Pointer?
      get() = __512267575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsContentChanging(): Boolean {
      val fnPtr = _512267575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__512267575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextBoxTextChangingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __512267575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxTextChangingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0723d4453a6415fa98150dfaf1becbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxTextChangingEventArgs2(ptr: Pointer?): WithDefault =
        ITextBoxTextChangingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxTextChangingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeITextBoxTextChangingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxTextChangingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__512267575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxTextChangingEventArgs2):
        Array<ITextBoxTextChangingEventArgs2?> = (elements as
        Array<ITextBoxTextChangingEventArgs2?>).castToImpl<ITextBoxTextChangingEventArgs2,ITextBoxTextChangingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxTextChangingEventArgs2?> =
        arrayOfNulls<ITextBoxTextChangingEventArgs2_Impl>(size) as
        Array<ITextBoxTextChangingEventArgs2?>
  }
}
