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

@ABIMarker(IGameSaveContainerInfoQuery.ABI::class)
@Signature("{3c94e863-6f80-4327-9327-ffc11afd42b3}")
@Guid("3c94e8636f8043279327ffc11afd42b3")
@WinRTInterface("3c94e8636f8043279327ffc11afd42b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveContainerInfoQuery.ByReference::class)
public interface IGameSaveContainerInfoQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetContainerInfoAsync(): IAsyncOperation<GameSaveContainerInfoGetResult?>?

  @InterfaceMethod(1)
  public fun GetContainerInfoAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<GameSaveContainerInfoGetResult?>?

  @InterfaceMethod(2)
  public fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveContainerInfoQuery> {
    public override fun getValue() = ABI.makeIGameSaveContainerInfoQuery(pointer.getPointer(0))

    public fun setValue(value: IGameSaveContainerInfoQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveContainerInfoQuery {
    public val __1541686095_Ptr: Pointer?

    public val _1541686095_VtblPtr: Pointer?
      get() = __1541686095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetContainerInfoAsync(): IAsyncOperation<GameSaveContainerInfoGetResult?>? {
      val fnPtr = _1541686095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveContainerInfoGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__1541686095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveContainerInfoGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetContainerInfoAsync(startIndex: WinDef.UINT,
        maxNumberOfItems: WinDef.UINT): IAsyncOperation<GameSaveContainerInfoGetResult?>? {
      val fnPtr = _1541686095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveContainerInfoGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__1541686095_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveContainerInfoGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1541686095_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1541686095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveContainerInfoQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541686095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveContainerInfoQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c94e8636f8043279327ffc11afd42b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveContainerInfoQuery(ptr: Pointer?): WithDefault =
        IGameSaveContainerInfoQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveContainerInfoQuery {
      val address = segment.toRawLongValue()
      return makeIGameSaveContainerInfoQuery(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveContainerInfoQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541686095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveContainerInfoQuery):
        Array<IGameSaveContainerInfoQuery?> = (elements as
        Array<IGameSaveContainerInfoQuery?>).castToImpl<IGameSaveContainerInfoQuery,IGameSaveContainerInfoQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveContainerInfoQuery?> =
        arrayOfNulls<IGameSaveContainerInfoQuery_Impl>(size) as Array<IGameSaveContainerInfoQuery?>
  }
}
