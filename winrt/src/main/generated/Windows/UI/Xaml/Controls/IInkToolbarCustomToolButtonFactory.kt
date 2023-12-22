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

@ABIMarker(IInkToolbarCustomToolButtonFactory.ABI::class)
@Signature("{c295fe4e-30eb-4130-a6b6-8c85d8e26e89}")
@Guid("c295fe4e30eb4130a6b68c85d8e26e89")
@WinRTInterface("c295fe4e30eb4130a6b68c85d8e26e89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomToolButtonFactory.ByReference::class)
public interface IInkToolbarCustomToolButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarCustomToolButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomToolButtonFactory> {
    public override fun getValue() =
        ABI.makeIInkToolbarCustomToolButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomToolButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomToolButtonFactory {
    public val __290487870_Ptr: Pointer?

    public val _290487870_VtblPtr: Pointer?
      get() = __290487870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarCustomToolButton? {
      val fnPtr = _290487870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarCustomToolButton>()
      val hr = fn.invokeHR(arrayOf(__290487870_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarCustomToolButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomToolButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __290487870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomToolButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c295fe4e30eb4130a6b68c85d8e26e89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomToolButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarCustomToolButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomToolButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomToolButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomToolButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__290487870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomToolButtonFactory):
        Array<IInkToolbarCustomToolButtonFactory?> = (elements as
        Array<IInkToolbarCustomToolButtonFactory?>).castToImpl<IInkToolbarCustomToolButtonFactory,IInkToolbarCustomToolButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomToolButtonFactory?> =
        arrayOfNulls<IInkToolbarCustomToolButtonFactory_Impl>(size) as
        Array<IInkToolbarCustomToolButtonFactory?>
  }
}
