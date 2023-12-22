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

@ABIMarker(IItemCollectionTransitionProviderFactory.ABI::class)
@Signature("{f1b53104-24be-510d-9eb1-3401de361dbc}")
@Guid("f1b5310424be510d9eb13401de361dbc")
@WinRTInterface("f1b5310424be510d9eb13401de361dbc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransitionProviderFactory.ByReference::class)
public interface IItemCollectionTransitionProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ItemCollectionTransitionProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransitionProviderFactory> {
    public override fun getValue() =
        ABI.makeIItemCollectionTransitionProviderFactory(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransitionProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransitionProviderFactory {
    public val __686087412_Ptr: Pointer?

    public val _686087412_VtblPtr: Pointer?
      get() = __686087412_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ItemCollectionTransitionProvider? {
      val fnPtr = _686087412_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionProvider>()
      val hr = fn.invokeHR(arrayOf(__686087412_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionProvider>(result.getValue())
      return resultValue
    }
  }

  public class IItemCollectionTransitionProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __686087412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransitionProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1b5310424be510d9eb13401de361dbc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransitionProviderFactory(ptr: Pointer?): WithDefault =
        IItemCollectionTransitionProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IItemCollectionTransitionProviderFactory {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransitionProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransitionProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__686087412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransitionProviderFactory):
        Array<IItemCollectionTransitionProviderFactory?> = (elements as
        Array<IItemCollectionTransitionProviderFactory?>).castToImpl<IItemCollectionTransitionProviderFactory,IItemCollectionTransitionProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransitionProviderFactory?> =
        arrayOfNulls<IItemCollectionTransitionProviderFactory_Impl>(size) as
        Array<IItemCollectionTransitionProviderFactory?>
  }
}
