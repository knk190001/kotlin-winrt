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

@ABIMarker(IRefreshContainerFactory.ABI::class)
@Signature("{0a04777f-089e-4239-baeb-c4641484c37e}")
@Guid("0a04777f089e4239baebc4641484c37e")
@WinRTInterface("0a04777f089e4239baebc4641484c37e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshContainerFactory.ByReference::class)
public interface IRefreshContainerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RefreshContainer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshContainerFactory> {
    public override fun getValue() = ABI.makeIRefreshContainerFactory(pointer.getPointer(0))

    public fun setValue(value: IRefreshContainerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshContainerFactory {
    public val __1442193064_Ptr: Pointer?

    public val _1442193064_VtblPtr: Pointer?
      get() = __1442193064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RefreshContainer? {
      val fnPtr = _1442193064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshContainer>()
      val hr = fn.invokeHR(arrayOf(__1442193064_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshContainer>(result.getValue())
      return resultValue
    }
  }

  public class IRefreshContainerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1442193064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshContainerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a04777f089e4239baebc4641484c37e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshContainerFactory(ptr: Pointer?): WithDefault =
        IRefreshContainerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshContainerFactory {
      val address = segment.toRawLongValue()
      return makeIRefreshContainerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRefreshContainerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1442193064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshContainerFactory):
        Array<IRefreshContainerFactory?> = (elements as
        Array<IRefreshContainerFactory?>).castToImpl<IRefreshContainerFactory,IRefreshContainerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshContainerFactory?> =
        arrayOfNulls<IRefreshContainerFactory_Impl>(size) as Array<IRefreshContainerFactory?>
  }
}
