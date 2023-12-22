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

@ABIMarker(IRelativePanelFactory.ABI::class)
@Signature("{8460193c-361b-44ba-a17e-b84c9dcdc772}")
@Guid("8460193c361b44baa17eb84c9dcdc772")
@WinRTInterface("8460193c361b44baa17eb84c9dcdc772")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativePanelFactory.ByReference::class)
public interface IRelativePanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RelativePanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativePanelFactory> {
    public override fun getValue() = ABI.makeIRelativePanelFactory(pointer.getPointer(0))

    public fun setValue(value: IRelativePanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativePanelFactory {
    public val __1820714350_Ptr: Pointer?

    public val _1820714350_VtblPtr: Pointer?
      get() = __1820714350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RelativePanel? {
      val fnPtr = _1820714350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RelativePanel>()
      val hr = fn.invokeHR(arrayOf(__1820714350_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RelativePanel>(result.getValue())
      return resultValue
    }
  }

  public class IRelativePanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1820714350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativePanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8460193c361b44baa17eb84c9dcdc772")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativePanelFactory(ptr: Pointer?): WithDefault =
        IRelativePanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativePanelFactory {
      val address = segment.toRawLongValue()
      return makeIRelativePanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IRelativePanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1820714350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativePanelFactory): Array<IRelativePanelFactory?> =
        (elements as
        Array<IRelativePanelFactory?>).castToImpl<IRelativePanelFactory,IRelativePanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativePanelFactory?> =
        arrayOfNulls<IRelativePanelFactory_Impl>(size) as Array<IRelativePanelFactory?>
  }
}
