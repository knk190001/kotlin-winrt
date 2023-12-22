package Windows.Perception.Spatial

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISpatialEntityStore.ABI::class)
@Signature("{329788ba-e513-4f06-889d-1be30ecf43e6}")
@Guid("329788bae5134f06889d1be30ecf43e6")
@WinRTInterface("329788bae5134f06889d1be30ecf43e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityStore.ByReference::class)
public interface ISpatialEntityStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SaveAsync(entity: SpatialEntity?): IAsyncAction?

  @InterfaceMethod(1)
  public fun RemoveAsync(entity: SpatialEntity?): IAsyncAction?

  @InterfaceMethod(2)
  public fun CreateEntityWatcher(): SpatialEntityWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityStore> {
    public override fun getValue() = ABI.makeISpatialEntityStore(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityStore {
    public val __1140391773_Ptr: Pointer?

    public val _1140391773_VtblPtr: Pointer?
      get() = __1140391773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SaveAsync(entity: SpatialEntity?): IAsyncAction? {
      val fnPtr = _1140391773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1140391773_Ptr, marshalToNative(entity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RemoveAsync(entity: SpatialEntity?): IAsyncAction? {
      val fnPtr = _1140391773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1140391773_Ptr, marshalToNative(entity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateEntityWatcher(): SpatialEntityWatcher? {
      val fnPtr = _1140391773_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntityWatcher>()
      val hr = fn.invokeHR(arrayOf(__1140391773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntityWatcher>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1140391773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("329788bae5134f06889d1be30ecf43e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityStore(ptr: Pointer?): WithDefault = ISpatialEntityStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityStore {
      val address = segment.toRawLongValue()
      return makeISpatialEntityStore(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1140391773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityStore): Array<ISpatialEntityStore?> =
        (elements as
        Array<ISpatialEntityStore?>).castToImpl<ISpatialEntityStore,ISpatialEntityStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityStore?> =
        arrayOfNulls<ISpatialEntityStore_Impl>(size) as Array<ISpatialEntityStore?>
  }
}
