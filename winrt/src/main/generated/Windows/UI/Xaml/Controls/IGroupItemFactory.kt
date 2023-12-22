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

@ABIMarker(IGroupItemFactory.ABI::class)
@Signature("{d9a1d53e-b1e0-4319-9808-7a9e887e13b0}")
@Guid("d9a1d53eb1e0431998087a9e887e13b0")
@WinRTInterface("d9a1d53eb1e0431998087a9e887e13b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupItemFactory.ByReference::class)
public interface IGroupItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GroupItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupItemFactory> {
    public override fun getValue() = ABI.makeIGroupItemFactory(pointer.getPointer(0))

    public fun setValue(value: IGroupItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupItemFactory {
    public val __1434000748_Ptr: Pointer?

    public val _1434000748_VtblPtr: Pointer?
      get() = __1434000748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GroupItem? {
      val fnPtr = _1434000748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupItem>()
      val hr = fn.invokeHR(arrayOf(__1434000748_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupItem>(result.getValue())
      return resultValue
    }
  }

  public class IGroupItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1434000748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9a1d53eb1e0431998087a9e887e13b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupItemFactory(ptr: Pointer?): WithDefault = IGroupItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupItemFactory {
      val address = segment.toRawLongValue()
      return makeIGroupItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IGroupItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1434000748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupItemFactory): Array<IGroupItemFactory?> = (elements
        as Array<IGroupItemFactory?>).castToImpl<IGroupItemFactory,IGroupItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupItemFactory?> =
        arrayOfNulls<IGroupItemFactory_Impl>(size) as Array<IGroupItemFactory?>
  }
}
