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

@ABIMarker(ITabViewItemFactory.ABI::class)
@Signature("{b64c2423-7e56-5d41-8a84-1ee28f9826a4}")
@Guid("b64c24237e565d418a841ee28f9826a4")
@WinRTInterface("b64c24237e565d418a841ee28f9826a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemFactory.ByReference::class)
public interface ITabViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TabViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemFactory> {
    public override fun getValue() = ABI.makeITabViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemFactory {
    public val __1124322372_Ptr: Pointer?

    public val _1124322372_VtblPtr: Pointer?
      get() = __1124322372_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TabViewItem? {
      val fnPtr = _1124322372_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewItem>()
      val hr = fn.invokeHR(arrayOf(__1124322372_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewItem>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1124322372_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b64c24237e565d418a841ee28f9826a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemFactory(ptr: Pointer?): WithDefault = ITabViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemFactory {
      val address = segment.toRawLongValue()
      return makeITabViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1124322372_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemFactory): Array<ITabViewItemFactory?> =
        (elements as
        Array<ITabViewItemFactory?>).castToImpl<ITabViewItemFactory,ITabViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemFactory?> =
        arrayOfNulls<ITabViewItemFactory_Impl>(size) as Array<ITabViewItemFactory?>
  }
}
