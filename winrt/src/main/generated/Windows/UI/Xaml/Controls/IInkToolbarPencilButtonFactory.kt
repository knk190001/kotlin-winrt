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

@ABIMarker(IInkToolbarPencilButtonFactory.ABI::class)
@Signature("{db66d85f-cfd6-495f-93ab-b8566af9f8af}")
@Guid("db66d85fcfd6495f93abb8566af9f8af")
@WinRTInterface("db66d85fcfd6495f93abb8566af9f8af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPencilButtonFactory.ByReference::class)
public interface IInkToolbarPencilButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarPencilButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPencilButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarPencilButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPencilButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPencilButtonFactory {
    public val __646990810_Ptr: Pointer?

    public val _646990810_VtblPtr: Pointer?
      get() = __646990810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarPencilButton? {
      val fnPtr = _646990810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarPencilButton>()
      val hr = fn.invokeHR(arrayOf(__646990810_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarPencilButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarPencilButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __646990810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPencilButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db66d85fcfd6495f93abb8566af9f8af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPencilButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarPencilButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPencilButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPencilButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPencilButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__646990810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPencilButtonFactory):
        Array<IInkToolbarPencilButtonFactory?> = (elements as
        Array<IInkToolbarPencilButtonFactory?>).castToImpl<IInkToolbarPencilButtonFactory,IInkToolbarPencilButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPencilButtonFactory?> =
        arrayOfNulls<IInkToolbarPencilButtonFactory_Impl>(size) as
        Array<IInkToolbarPencilButtonFactory?>
  }
}
