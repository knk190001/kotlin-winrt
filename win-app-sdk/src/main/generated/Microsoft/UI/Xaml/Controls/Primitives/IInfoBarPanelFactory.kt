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

@ABIMarker(IInfoBarPanelFactory.ABI::class)
@Signature("{00d1a8c5-f631-564a-8e9c-7c5ccad238de}")
@Guid("00d1a8c5f631564a8e9c7c5ccad238de")
@WinRTInterface("00d1a8c5f631564a8e9c7c5ccad238de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarPanelFactory.ByReference::class)
public interface IInfoBarPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): InfoBarPanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarPanelFactory> {
    public override fun getValue() = ABI.makeIInfoBarPanelFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBarPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarPanelFactory {
    public val __162479206_Ptr: Pointer?

    public val _162479206_VtblPtr: Pointer?
      get() = __162479206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InfoBarPanel? {
      val fnPtr = _162479206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarPanel>()
      val hr = fn.invokeHR(arrayOf(__162479206_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarPanel>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __162479206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00d1a8c5f631564a8e9c7c5ccad238de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarPanelFactory(ptr: Pointer?): WithDefault = IInfoBarPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarPanelFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBarPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__162479206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarPanelFactory): Array<IInfoBarPanelFactory?> =
        (elements as
        Array<IInfoBarPanelFactory?>).castToImpl<IInfoBarPanelFactory,IInfoBarPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarPanelFactory?> =
        arrayOfNulls<IInfoBarPanelFactory_Impl>(size) as Array<IInfoBarPanelFactory?>
  }
}
