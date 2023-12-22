package Windows.Phone.System.UserProfile.GameServices.Core

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameServicePropertyCollection.ABI::class)
@Signature("{07e57fc8-debb-4609-9cc8-529d16bc2bd9}")
@Guid("07e57fc8debb46099cc8529d16bc2bd9")
@WinRTInterface("07e57fc8debb46099cc8529d16bc2bd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameServicePropertyCollection.ByReference::class)
public interface IGameServicePropertyCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPropertyAsync(propertyName: String?): IAsyncOperation<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameServicePropertyCollection> {
    public override fun getValue() = ABI.makeIGameServicePropertyCollection(pointer.getPointer(0))

    public fun setValue(value: IGameServicePropertyCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameServicePropertyCollection {
    public val __1155340262_Ptr: Pointer?

    public val _1155340262_VtblPtr: Pointer?
      get() = __1155340262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPropertyAsync(propertyName: String?): IAsyncOperation<IUnknown?>? {
      val fnPtr = _1155340262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1155340262_Ptr, marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameServicePropertyCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1155340262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameServicePropertyCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07e57fc8debb46099cc8529d16bc2bd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameServicePropertyCollection(ptr: Pointer?): WithDefault =
        IGameServicePropertyCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameServicePropertyCollection {
      val address = segment.toRawLongValue()
      return makeIGameServicePropertyCollection(Pointer(address))
    }

    public override fun toNative(obj: IGameServicePropertyCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1155340262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameServicePropertyCollection):
        Array<IGameServicePropertyCollection?> = (elements as
        Array<IGameServicePropertyCollection?>).castToImpl<IGameServicePropertyCollection,IGameServicePropertyCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameServicePropertyCollection?> =
        arrayOfNulls<IGameServicePropertyCollection_Impl>(size) as
        Array<IGameServicePropertyCollection?>
  }
}
