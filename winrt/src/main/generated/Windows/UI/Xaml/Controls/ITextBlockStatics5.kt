package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ITextBlockStatics5.ABI::class)
@Signature("{8e4d9c70-0d4e-48df-ae7f-bb7a9af6852e}")
@Guid("8e4d9c700d4e48dfae7fbb7a9af6852e")
@WinRTInterface("8e4d9c700d4e48dfae7fbb7a9af6852e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlockStatics5.ByReference::class)
public interface ITextBlockStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDecorationsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBlockStatics5> {
    public override fun getValue() = ABI.makeITextBlockStatics5(pointer.getPointer(0))

    public fun setValue(value: ITextBlockStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlockStatics5 {
    public val __106258444_Ptr: Pointer?

    public val _106258444_VtblPtr: Pointer?
      get() = __106258444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDecorationsProperty(): DependencyProperty? {
      val fnPtr = _106258444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__106258444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBlockStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106258444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlockStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e4d9c700d4e48dfae7fbb7a9af6852e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlockStatics5(ptr: Pointer?): WithDefault = ITextBlockStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlockStatics5 {
      val address = segment.toRawLongValue()
      return makeITextBlockStatics5(Pointer(address))
    }

    public override fun toNative(obj: ITextBlockStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106258444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlockStatics5): Array<ITextBlockStatics5?> =
        (elements as
        Array<ITextBlockStatics5?>).castToImpl<ITextBlockStatics5,ITextBlockStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlockStatics5?> =
        arrayOfNulls<ITextBlockStatics5_Impl>(size) as Array<ITextBlockStatics5?>
  }
}
