package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IToggleButtonFactory.ABI::class)
@Signature("{d56aa2fc-fc7f-449c-9855-7a1055d668a8}")
@Guid("d56aa2fcfc7f449c98557a1055d668a8")
@WinRTInterface("d56aa2fcfc7f449c98557a1055d668a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleButtonFactory.ByReference::class)
public interface IToggleButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ToggleButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleButtonFactory> {
    public override fun getValue() = ABI.makeIToggleButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleButtonFactory {
    public val __135737896_Ptr: Pointer?

    public val _135737896_VtblPtr: Pointer?
      get() = __135737896_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ToggleButton? {
      val fnPtr = _135737896_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleButton>()
      val hr = fn.invokeHR(arrayOf(__135737896_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleButton>(result.getValue())
      return resultValue
    }
  }

  public class IToggleButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __135737896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d56aa2fcfc7f449c98557a1055d668a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleButtonFactory(ptr: Pointer?): WithDefault = IToggleButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleButtonFactory {
      val address = segment.toRawLongValue()
      return makeIToggleButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135737896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleButtonFactory): Array<IToggleButtonFactory?> =
        (elements as
        Array<IToggleButtonFactory?>).castToImpl<IToggleButtonFactory,IToggleButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleButtonFactory?> =
        arrayOfNulls<IToggleButtonFactory_Impl>(size) as Array<IToggleButtonFactory?>
  }
}
