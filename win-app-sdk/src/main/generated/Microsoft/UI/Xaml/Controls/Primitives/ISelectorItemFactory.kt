package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ISelectorItemFactory.ABI::class)
@Signature("{078039f5-76ed-5299-9715-fc8c58173560}")
@Guid("078039f576ed52999715fc8c58173560")
@WinRTInterface("078039f576ed52999715fc8c58173560")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorItemFactory.ByReference::class)
public interface ISelectorItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SelectorItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorItemFactory> {
    public override fun getValue() = ABI.makeISelectorItemFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectorItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorItemFactory {
    public val __384382681_Ptr: Pointer?

    public val _384382681_VtblPtr: Pointer?
      get() = __384382681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SelectorItem? {
      val fnPtr = _384382681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectorItem>()
      val hr = fn.invokeHR(arrayOf(__384382681_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectorItem>(result.getValue())
      return resultValue
    }
  }

  public class ISelectorItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384382681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("078039f576ed52999715fc8c58173560")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorItemFactory(ptr: Pointer?): WithDefault = ISelectorItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorItemFactory {
      val address = segment.toRawLongValue()
      return makeISelectorItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectorItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384382681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorItemFactory): Array<ISelectorItemFactory?> =
        (elements as
        Array<ISelectorItemFactory?>).castToImpl<ISelectorItemFactory,ISelectorItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorItemFactory?> =
        arrayOfNulls<ISelectorItemFactory_Impl>(size) as Array<ISelectorItemFactory?>
  }
}
