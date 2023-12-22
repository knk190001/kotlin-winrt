package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarFactory.ABI::class)
@Signature("{3947aa99-36b1-4374-ab5c-98bf07a4320b}")
@Guid("3947aa9936b14374ab5c98bf07a4320b")
@WinRTInterface("3947aa9936b14374ab5c98bf07a4320b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarFactory.ByReference::class)
public interface IInkToolbarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): InkToolbar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarFactory> {
    public override fun getValue() = ABI.makeIInkToolbarFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarFactory {
    public val __1024845305_Ptr: Pointer?

    public val _1024845305_VtblPtr: Pointer?
      get() = __1024845305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbar? {
      val fnPtr = _1024845305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbar>()
      val hr = fn.invokeHR(arrayOf(__1024845305_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbar>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1024845305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3947aa9936b14374ab5c98bf07a4320b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarFactory(ptr: Pointer?): WithDefault = IInkToolbarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1024845305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarFactory): Array<IInkToolbarFactory?> =
        (elements as
        Array<IInkToolbarFactory?>).castToImpl<IInkToolbarFactory,IInkToolbarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarFactory?> =
        arrayOfNulls<IInkToolbarFactory_Impl>(size) as Array<IInkToolbarFactory?>
  }
}
