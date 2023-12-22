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

@ABIMarker(IInkToolbarStencilButtonFactory.ABI::class)
@Signature("{a20701d1-8a70-4d77-89d4-1730a3a58edf}")
@Guid("a20701d18a704d7789d41730a3a58edf")
@WinRTInterface("a20701d18a704d7789d41730a3a58edf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarStencilButtonFactory.ByReference::class)
public interface IInkToolbarStencilButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarStencilButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarStencilButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarStencilButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarStencilButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarStencilButtonFactory {
    public val __885416077_Ptr: Pointer?

    public val _885416077_VtblPtr: Pointer?
      get() = __885416077_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarStencilButton? {
      val fnPtr = _885416077_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarStencilButton>()
      val hr = fn.invokeHR(arrayOf(__885416077_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarStencilButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarStencilButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __885416077_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarStencilButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a20701d18a704d7789d41730a3a58edf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarStencilButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarStencilButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarStencilButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarStencilButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarStencilButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__885416077_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarStencilButtonFactory):
        Array<IInkToolbarStencilButtonFactory?> = (elements as
        Array<IInkToolbarStencilButtonFactory?>).castToImpl<IInkToolbarStencilButtonFactory,IInkToolbarStencilButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarStencilButtonFactory?> =
        arrayOfNulls<IInkToolbarStencilButtonFactory_Impl>(size) as
        Array<IInkToolbarStencilButtonFactory?>
  }
}
