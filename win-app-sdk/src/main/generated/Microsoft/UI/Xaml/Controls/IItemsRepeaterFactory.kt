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

@ABIMarker(IItemsRepeaterFactory.ABI::class)
@Signature("{c3c1f244-67a8-568f-a6f7-5da8b0eadd49}")
@Guid("c3c1f24467a8568fa6f75da8b0eadd49")
@WinRTInterface("c3c1f24467a8568fa6f75da8b0eadd49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterFactory.ByReference::class)
public interface IItemsRepeaterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ItemsRepeater?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterFactory> {
    public override fun getValue() = ABI.makeIItemsRepeaterFactory(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterFactory {
    public val __1462895415_Ptr: Pointer?

    public val _1462895415_VtblPtr: Pointer?
      get() = __1462895415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ItemsRepeater? {
      val fnPtr = _1462895415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsRepeater>()
      val hr = fn.invokeHR(arrayOf(__1462895415_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsRepeater>(result.getValue())
      return resultValue
    }
  }

  public class IItemsRepeaterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1462895415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3c1f24467a8568fa6f75da8b0eadd49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterFactory(ptr: Pointer?): WithDefault =
        IItemsRepeaterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterFactory {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1462895415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterFactory): Array<IItemsRepeaterFactory?> =
        (elements as
        Array<IItemsRepeaterFactory?>).castToImpl<IItemsRepeaterFactory,IItemsRepeaterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterFactory?> =
        arrayOfNulls<IItemsRepeaterFactory_Impl>(size) as Array<IItemsRepeaterFactory?>
  }
}
