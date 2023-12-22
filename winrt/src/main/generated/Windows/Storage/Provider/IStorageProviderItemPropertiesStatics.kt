package Windows.Storage.Provider

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
import Windows.Storage.IStorageItem
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IStorageProviderItemPropertiesStatics.ABI::class)
@Signature("{2d2c1c97-2704-4729-8fa9-7e6b8e158c2f}")
@Guid("2d2c1c97270447298fa97e6b8e158c2f")
@WinRTInterface("2d2c1c97270447298fa97e6b8e158c2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderItemPropertiesStatics.ByReference::class)
public interface IStorageProviderItemPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAsync(item: IStorageItem?,
      itemProperties: IIterable<StorageProviderItemProperty?>?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderItemPropertiesStatics> {
    public override fun getValue() =
        ABI.makeIStorageProviderItemPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderItemPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderItemPropertiesStatics {
    public val __884711149_Ptr: Pointer?

    public val _884711149_VtblPtr: Pointer?
      get() = __884711149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAsync(item: IStorageItem?,
        itemProperties: IIterable<StorageProviderItemProperty?>?): IAsyncAction? {
      val fnPtr = _884711149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__884711149_Ptr, marshalToNative(item),
          marshalToNative(itemProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderItemPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __884711149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderItemPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d2c1c97270447298fa97e6b8e158c2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderItemPropertiesStatics(ptr: Pointer?): WithDefault =
        IStorageProviderItemPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderItemPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIStorageProviderItemPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderItemPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__884711149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderItemPropertiesStatics):
        Array<IStorageProviderItemPropertiesStatics?> = (elements as
        Array<IStorageProviderItemPropertiesStatics?>).castToImpl<IStorageProviderItemPropertiesStatics,IStorageProviderItemPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderItemPropertiesStatics?> =
        arrayOfNulls<IStorageProviderItemPropertiesStatics_Impl>(size) as
        Array<IStorageProviderItemPropertiesStatics?>
  }
}
