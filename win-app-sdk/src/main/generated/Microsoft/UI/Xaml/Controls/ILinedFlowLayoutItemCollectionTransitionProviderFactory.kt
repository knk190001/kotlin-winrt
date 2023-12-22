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

@ABIMarker(ILinedFlowLayoutItemCollectionTransitionProviderFactory.ABI::class)
@Signature("{e915c9fc-ba75-581e-9b96-20edd8befcc4}")
@Guid("e915c9fcba75581e9b9620edd8befcc4")
@WinRTInterface("e915c9fcba75581e9b9620edd8befcc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ILinedFlowLayoutItemCollectionTransitionProviderFactory.ByReference::class)
public interface ILinedFlowLayoutItemCollectionTransitionProviderFactory : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      LinedFlowLayoutItemCollectionTransitionProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayoutItemCollectionTransitionProviderFactory> {
    public override fun getValue() =
        ABI.makeILinedFlowLayoutItemCollectionTransitionProviderFactory(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayoutItemCollectionTransitionProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayoutItemCollectionTransitionProviderFactory {
    public val __2101516050_Ptr: Pointer?

    public val _2101516050_VtblPtr: Pointer?
      get() = __2101516050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        LinedFlowLayoutItemCollectionTransitionProvider? {
      val fnPtr = _2101516050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinedFlowLayoutItemCollectionTransitionProvider>()
      val hr = fn.invokeHR(arrayOf(__2101516050_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<LinedFlowLayoutItemCollectionTransitionProvider>(result.getValue())
      return resultValue
    }
  }

  public class ILinedFlowLayoutItemCollectionTransitionProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2101516050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayoutItemCollectionTransitionProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e915c9fcba75581e9b9620edd8befcc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayoutItemCollectionTransitionProviderFactory(ptr: Pointer?):
        WithDefault = ILinedFlowLayoutItemCollectionTransitionProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILinedFlowLayoutItemCollectionTransitionProviderFactory {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayoutItemCollectionTransitionProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayoutItemCollectionTransitionProviderFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2101516050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayoutItemCollectionTransitionProviderFactory):
        Array<ILinedFlowLayoutItemCollectionTransitionProviderFactory?> = (elements as
        Array<ILinedFlowLayoutItemCollectionTransitionProviderFactory?>).castToImpl<ILinedFlowLayoutItemCollectionTransitionProviderFactory,ILinedFlowLayoutItemCollectionTransitionProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ILinedFlowLayoutItemCollectionTransitionProviderFactory?> =
        arrayOfNulls<ILinedFlowLayoutItemCollectionTransitionProviderFactory_Impl>(size) as
        Array<ILinedFlowLayoutItemCollectionTransitionProviderFactory?>
  }
}
