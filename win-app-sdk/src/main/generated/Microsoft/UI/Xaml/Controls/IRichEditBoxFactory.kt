package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRichEditBoxFactory.ABI::class)
@Signature("{7c993c60-f5b6-589f-bba8-b68b9713e4ae}")
@Guid("7c993c60f5b6589fbba8b68b9713e4ae")
@WinRTInterface("7c993c60f5b6589fbba8b68b9713e4ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxFactory.ByReference::class)
public interface IRichEditBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RichEditBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxFactory> {
    public override fun getValue() = ABI.makeIRichEditBoxFactory(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxFactory {
    public val __500231060_Ptr: Pointer?

    public val _500231060_VtblPtr: Pointer?
      get() = __500231060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RichEditBox? {
      val fnPtr = _500231060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditBox>()
      val hr = fn.invokeHR(arrayOf(__500231060_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditBox>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __500231060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c993c60f5b6589fbba8b68b9713e4ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxFactory(ptr: Pointer?): WithDefault = IRichEditBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxFactory {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__500231060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxFactory): Array<IRichEditBoxFactory?> =
        (elements as
        Array<IRichEditBoxFactory?>).castToImpl<IRichEditBoxFactory,IRichEditBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxFactory?> =
        arrayOfNulls<IRichEditBoxFactory_Impl>(size) as Array<IRichEditBoxFactory?>
  }
}
