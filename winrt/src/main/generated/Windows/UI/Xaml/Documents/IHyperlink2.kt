package Windows.UI.Xaml.Documents

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

@ABIMarker(IHyperlink2.ABI::class)
@Signature("{4ce9da5f-7cff-4291-b78f-dfec72490576}")
@Guid("4ce9da5f7cff4291b78fdfec72490576")
@WinRTInterface("4ce9da5f7cff4291b78fdfec72490576")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlink2.ByReference::class)
public interface IHyperlink2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnderlineStyle(): UnderlineStyle?

  @InterfaceMethod(1)
  public fun put_UnderlineStyle(value: UnderlineStyle?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHyperlink2> {
    public override fun getValue() = ABI.makeIHyperlink2(pointer.getPointer(0))

    public fun setValue(value: IHyperlink2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlink2 {
    public val __932194124_Ptr: Pointer?

    public val _932194124_VtblPtr: Pointer?
      get() = __932194124_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnderlineStyle(): UnderlineStyle? {
      val fnPtr = _932194124_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnderlineStyle>()
      val hr = fn.invokeHR(arrayOf(__932194124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnderlineStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UnderlineStyle(value: UnderlineStyle?): Unit {
      val fnPtr = _932194124_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194124_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHyperlink2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932194124_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlink2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ce9da5f7cff4291b78fdfec72490576")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlink2(ptr: Pointer?): WithDefault = IHyperlink2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlink2 {
      val address = segment.toRawLongValue()
      return makeIHyperlink2(Pointer(address))
    }

    public override fun toNative(obj: IHyperlink2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932194124_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlink2): Array<IHyperlink2?> = (elements as
        Array<IHyperlink2?>).castToImpl<IHyperlink2,IHyperlink2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlink2?> =
        arrayOfNulls<IHyperlink2_Impl>(size) as Array<IHyperlink2?>
  }
}
