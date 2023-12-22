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

@ABIMarker(IToggleMenuFlyoutItemFactory.ABI::class)
@Signature("{426dfd57-6cc9-570f-950d-37437235dc89}")
@Guid("426dfd576cc9570f950d37437235dc89")
@WinRTInterface("426dfd576cc9570f950d37437235dc89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleMenuFlyoutItemFactory.ByReference::class)
public interface IToggleMenuFlyoutItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ToggleMenuFlyoutItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleMenuFlyoutItemFactory> {
    public override fun getValue() = ABI.makeIToggleMenuFlyoutItemFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleMenuFlyoutItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleMenuFlyoutItemFactory {
    public val __1726920898_Ptr: Pointer?

    public val _1726920898_VtblPtr: Pointer?
      get() = __1726920898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ToggleMenuFlyoutItem? {
      val fnPtr = _1726920898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleMenuFlyoutItem>()
      val hr = fn.invokeHR(arrayOf(__1726920898_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleMenuFlyoutItem>(result.getValue())
      return resultValue
    }
  }

  public class IToggleMenuFlyoutItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1726920898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleMenuFlyoutItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("426dfd576cc9570f950d37437235dc89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleMenuFlyoutItemFactory(ptr: Pointer?): WithDefault =
        IToggleMenuFlyoutItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleMenuFlyoutItemFactory {
      val address = segment.toRawLongValue()
      return makeIToggleMenuFlyoutItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleMenuFlyoutItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1726920898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleMenuFlyoutItemFactory):
        Array<IToggleMenuFlyoutItemFactory?> = (elements as
        Array<IToggleMenuFlyoutItemFactory?>).castToImpl<IToggleMenuFlyoutItemFactory,IToggleMenuFlyoutItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleMenuFlyoutItemFactory?> =
        arrayOfNulls<IToggleMenuFlyoutItemFactory_Impl>(size) as
        Array<IToggleMenuFlyoutItemFactory?>
  }
}
