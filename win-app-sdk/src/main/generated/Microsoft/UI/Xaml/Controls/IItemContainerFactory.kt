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

@ABIMarker(IItemContainerFactory.ABI::class)
@Signature("{ee1cc57c-6bf2-5ee9-a943-c95ca775edb4}")
@Guid("ee1cc57c6bf25ee9a943c95ca775edb4")
@WinRTInterface("ee1cc57c6bf25ee9a943c95ca775edb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerFactory.ByReference::class)
public interface IItemContainerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ItemContainer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerFactory> {
    public override fun getValue() = ABI.makeIItemContainerFactory(pointer.getPointer(0))

    public fun setValue(value: IItemContainerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerFactory {
    public val __80606915_Ptr: Pointer?

    public val _80606915_VtblPtr: Pointer?
      get() = __80606915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ItemContainer? {
      val fnPtr = _80606915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemContainer>()
      val hr = fn.invokeHR(arrayOf(__80606915_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemContainer>(result.getValue())
      return resultValue
    }
  }

  public class IItemContainerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __80606915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee1cc57c6bf25ee9a943c95ca775edb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerFactory(ptr: Pointer?): WithDefault =
        IItemContainerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerFactory {
      val address = segment.toRawLongValue()
      return makeIItemContainerFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__80606915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerFactory): Array<IItemContainerFactory?> =
        (elements as
        Array<IItemContainerFactory?>).castToImpl<IItemContainerFactory,IItemContainerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerFactory?> =
        arrayOfNulls<IItemContainerFactory_Impl>(size) as Array<IItemContainerFactory?>
  }
}
