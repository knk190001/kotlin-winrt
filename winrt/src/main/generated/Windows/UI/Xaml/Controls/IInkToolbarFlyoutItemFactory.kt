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

@ABIMarker(IInkToolbarFlyoutItemFactory.ABI::class)
@Signature("{352e7b93-803b-4f0e-8c72-9dfc0329329f}")
@Guid("352e7b93803b4f0e8c729dfc0329329f")
@WinRTInterface("352e7b93803b4f0e8c729dfc0329329f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarFlyoutItemFactory.ByReference::class)
public interface IInkToolbarFlyoutItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarFlyoutItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarFlyoutItemFactory> {
    public override fun getValue() = ABI.makeIInkToolbarFlyoutItemFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarFlyoutItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarFlyoutItemFactory {
    public val __1456937899_Ptr: Pointer?

    public val _1456937899_VtblPtr: Pointer?
      get() = __1456937899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarFlyoutItem? {
      val fnPtr = _1456937899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarFlyoutItem>()
      val hr = fn.invokeHR(arrayOf(__1456937899_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarFlyoutItem>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarFlyoutItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1456937899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarFlyoutItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("352e7b93803b4f0e8c729dfc0329329f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarFlyoutItemFactory(ptr: Pointer?): WithDefault =
        IInkToolbarFlyoutItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarFlyoutItemFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarFlyoutItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarFlyoutItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1456937899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarFlyoutItemFactory):
        Array<IInkToolbarFlyoutItemFactory?> = (elements as
        Array<IInkToolbarFlyoutItemFactory?>).castToImpl<IInkToolbarFlyoutItemFactory,IInkToolbarFlyoutItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarFlyoutItemFactory?> =
        arrayOfNulls<IInkToolbarFlyoutItemFactory_Impl>(size) as
        Array<IInkToolbarFlyoutItemFactory?>
  }
}
