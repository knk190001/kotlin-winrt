package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IStackPanelFactory.ABI::class)
@Signature("{64c1d388-47a2-5a74-a75b-559d151ee5ac}")
@Guid("64c1d38847a25a74a75b559d151ee5ac")
@WinRTInterface("64c1d38847a25a74a75b559d151ee5ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanelFactory.ByReference::class)
public interface IStackPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): StackPanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStackPanelFactory> {
    public override fun getValue() = ABI.makeIStackPanelFactory(pointer.getPointer(0))

    public fun setValue(value: IStackPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanelFactory {
    public val __452831705_Ptr: Pointer?

    public val _452831705_VtblPtr: Pointer?
      get() = __452831705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        StackPanel? {
      val fnPtr = _452831705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StackPanel>()
      val hr = fn.invokeHR(arrayOf(__452831705_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StackPanel>(result.getValue())
      return resultValue
    }
  }

  public class IStackPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452831705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64c1d38847a25a74a75b559d151ee5ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanelFactory(ptr: Pointer?): WithDefault = IStackPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanelFactory {
      val address = segment.toRawLongValue()
      return makeIStackPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IStackPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452831705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanelFactory): Array<IStackPanelFactory?> =
        (elements as
        Array<IStackPanelFactory?>).castToImpl<IStackPanelFactory,IStackPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanelFactory?> =
        arrayOfNulls<IStackPanelFactory_Impl>(size) as Array<IStackPanelFactory?>
  }
}
