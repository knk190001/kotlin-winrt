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

@ABIMarker(IDropDownButtonFactory.ABI::class)
@Signature("{0d9f8ab5-e70d-52bd-9ca0-36ceecaa642a}")
@Guid("0d9f8ab5e70d52bd9ca036ceecaa642a")
@WinRTInterface("0d9f8ab5e70d52bd9ca036ceecaa642a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropDownButtonFactory.ByReference::class)
public interface IDropDownButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DropDownButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropDownButtonFactory> {
    public override fun getValue() = ABI.makeIDropDownButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IDropDownButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropDownButtonFactory {
    public val __1418928683_Ptr: Pointer?

    public val _1418928683_VtblPtr: Pointer?
      get() = __1418928683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DropDownButton? {
      val fnPtr = _1418928683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DropDownButton>()
      val hr = fn.invokeHR(arrayOf(__1418928683_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DropDownButton>(result.getValue())
      return resultValue
    }
  }

  public class IDropDownButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418928683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropDownButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d9f8ab5e70d52bd9ca036ceecaa642a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropDownButtonFactory(ptr: Pointer?): WithDefault =
        IDropDownButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropDownButtonFactory {
      val address = segment.toRawLongValue()
      return makeIDropDownButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IDropDownButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418928683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropDownButtonFactory): Array<IDropDownButtonFactory?> =
        (elements as
        Array<IDropDownButtonFactory?>).castToImpl<IDropDownButtonFactory,IDropDownButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropDownButtonFactory?> =
        arrayOfNulls<IDropDownButtonFactory_Impl>(size) as Array<IDropDownButtonFactory?>
  }
}
