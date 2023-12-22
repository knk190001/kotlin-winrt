package Windows.UI.Xaml.Input

import Windows.UI.Xaml.XamlRoot
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

@ABIMarker(IFocusManagerStatics7.ABI::class)
@Signature("{95d6fa97-f0fc-5c32-b29d-07c04ec966b0}")
@Guid("95d6fa97f0fc5c32b29d07c04ec966b0")
@WinRTInterface("95d6fa97f0fc5c32b29d07c04ec966b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics7.ByReference::class)
public interface IFocusManagerStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFocusedElement(xamlRoot: XamlRoot?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics7> {
    public override fun getValue() = ABI.makeIFocusManagerStatics7(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics7 {
    public val __687728573_Ptr: Pointer?

    public val _687728573_VtblPtr: Pointer?
      get() = __687728573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFocusedElement(xamlRoot: XamlRoot?): IUnknown? {
      val fnPtr = _687728573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__687728573_Ptr, marshalToNative(xamlRoot), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687728573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95d6fa97f0fc5c32b29d07c04ec966b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics7(ptr: Pointer?): WithDefault =
        IFocusManagerStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics7 {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics7(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687728573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics7): Array<IFocusManagerStatics7?> =
        (elements as
        Array<IFocusManagerStatics7?>).castToImpl<IFocusManagerStatics7,IFocusManagerStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics7?> =
        arrayOfNulls<IFocusManagerStatics7_Impl>(size) as Array<IFocusManagerStatics7?>
  }
}
