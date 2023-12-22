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

@ABIMarker(IGroupStyleSelectorFactory.ABI::class)
@Signature("{bf570d33-b2f6-481f-a450-c80c291fb22d}")
@Guid("bf570d33b2f6481fa450c80c291fb22d")
@WinRTInterface("bf570d33b2f6481fa450c80c291fb22d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyleSelectorFactory.ByReference::class)
public interface IGroupStyleSelectorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      GroupStyleSelector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupStyleSelectorFactory> {
    public override fun getValue() = ABI.makeIGroupStyleSelectorFactory(pointer.getPointer(0))

    public fun setValue(value: IGroupStyleSelectorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyleSelectorFactory {
    public val __1942479171_Ptr: Pointer?

    public val _1942479171_VtblPtr: Pointer?
      get() = __1942479171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GroupStyleSelector? {
      val fnPtr = _1942479171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupStyleSelector>()
      val hr = fn.invokeHR(arrayOf(__1942479171_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupStyleSelector>(result.getValue())
      return resultValue
    }
  }

  public class IGroupStyleSelectorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942479171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyleSelectorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf570d33b2f6481fa450c80c291fb22d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyleSelectorFactory(ptr: Pointer?): WithDefault =
        IGroupStyleSelectorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyleSelectorFactory {
      val address = segment.toRawLongValue()
      return makeIGroupStyleSelectorFactory(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyleSelectorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942479171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyleSelectorFactory):
        Array<IGroupStyleSelectorFactory?> = (elements as
        Array<IGroupStyleSelectorFactory?>).castToImpl<IGroupStyleSelectorFactory,IGroupStyleSelectorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyleSelectorFactory?> =
        arrayOfNulls<IGroupStyleSelectorFactory_Impl>(size) as Array<IGroupStyleSelectorFactory?>
  }
}
