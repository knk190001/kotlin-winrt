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

@ABIMarker(IInkToolbarRulerButtonFactory.ABI::class)
@Signature("{bb26d85f-cfd6-495f-93ab-b8566af9f8af}")
@Guid("bb26d85fcfd6495f93abb8566af9f8af")
@WinRTInterface("bb26d85fcfd6495f93abb8566af9f8af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarRulerButtonFactory.ByReference::class)
public interface IInkToolbarRulerButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarRulerButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarRulerButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarRulerButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarRulerButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarRulerButtonFactory {
    public val __861971501_Ptr: Pointer?

    public val _861971501_VtblPtr: Pointer?
      get() = __861971501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarRulerButton? {
      val fnPtr = _861971501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarRulerButton>()
      val hr = fn.invokeHR(arrayOf(__861971501_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarRulerButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarRulerButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __861971501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarRulerButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb26d85fcfd6495f93abb8566af9f8af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarRulerButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarRulerButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarRulerButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarRulerButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarRulerButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__861971501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarRulerButtonFactory):
        Array<IInkToolbarRulerButtonFactory?> = (elements as
        Array<IInkToolbarRulerButtonFactory?>).castToImpl<IInkToolbarRulerButtonFactory,IInkToolbarRulerButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarRulerButtonFactory?> =
        arrayOfNulls<IInkToolbarRulerButtonFactory_Impl>(size) as
        Array<IInkToolbarRulerButtonFactory?>
  }
}
