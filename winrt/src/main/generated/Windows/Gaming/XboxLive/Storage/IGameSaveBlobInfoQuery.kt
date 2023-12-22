package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGameSaveBlobInfoQuery.ABI::class)
@Signature("{9fdd74b2-eeee-447b-a9d2-7f96c0f83208}")
@Guid("9fdd74b2eeee447ba9d27f96c0f83208")
@WinRTInterface("9fdd74b2eeee447ba9d27f96c0f83208")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveBlobInfoQuery.ByReference::class)
public interface IGameSaveBlobInfoQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetBlobInfoAsync(): IAsyncOperation<GameSaveBlobInfoGetResult?>?

  @InterfaceMethod(1)
  public fun GetBlobInfoAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<GameSaveBlobInfoGetResult?>?

  @InterfaceMethod(2)
  public fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveBlobInfoQuery> {
    public override fun getValue() = ABI.makeIGameSaveBlobInfoQuery(pointer.getPointer(0))

    public fun setValue(value: IGameSaveBlobInfoQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveBlobInfoQuery {
    public val __580649179_Ptr: Pointer?

    public val _580649179_VtblPtr: Pointer?
      get() = __580649179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetBlobInfoAsync(): IAsyncOperation<GameSaveBlobInfoGetResult?>? {
      val fnPtr = _580649179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveBlobInfoGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__580649179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveBlobInfoGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetBlobInfoAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
        IAsyncOperation<GameSaveBlobInfoGetResult?>? {
      val fnPtr = _580649179_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveBlobInfoGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__580649179_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveBlobInfoGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _580649179_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__580649179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveBlobInfoQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __580649179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveBlobInfoQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fdd74b2eeee447ba9d27f96c0f83208")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveBlobInfoQuery(ptr: Pointer?): WithDefault =
        IGameSaveBlobInfoQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveBlobInfoQuery {
      val address = segment.toRawLongValue()
      return makeIGameSaveBlobInfoQuery(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveBlobInfoQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__580649179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveBlobInfoQuery): Array<IGameSaveBlobInfoQuery?> =
        (elements as
        Array<IGameSaveBlobInfoQuery?>).castToImpl<IGameSaveBlobInfoQuery,IGameSaveBlobInfoQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveBlobInfoQuery?> =
        arrayOfNulls<IGameSaveBlobInfoQuery_Impl>(size) as Array<IGameSaveBlobInfoQuery?>
  }
}
