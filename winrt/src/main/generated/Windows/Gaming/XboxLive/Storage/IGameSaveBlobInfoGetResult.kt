package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGameSaveBlobInfoGetResult.ABI::class)
@Signature("{c7578582-3697-42bf-989c-665d923b5231}")
@Guid("c7578582369742bf989c665d923b5231")
@WinRTInterface("c7578582369742bf989c665d923b5231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveBlobInfoGetResult.ByReference::class)
public interface IGameSaveBlobInfoGetResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GameSaveErrorStatus?

  @InterfaceMethod(1)
  public fun get_Value(): IVectorView<GameSaveBlobInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveBlobInfoGetResult> {
    public override fun getValue() = ABI.makeIGameSaveBlobInfoGetResult(pointer.getPointer(0))

    public fun setValue(value: IGameSaveBlobInfoGetResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveBlobInfoGetResult {
    public val __412441328_Ptr: Pointer?

    public val _412441328_VtblPtr: Pointer?
      get() = __412441328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GameSaveErrorStatus? {
      val fnPtr = _412441328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__412441328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IVectorView<GameSaveBlobInfo?>? {
      val fnPtr = _412441328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GameSaveBlobInfo?>>()
      val hr = fn.invokeHR(arrayOf(__412441328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GameSaveBlobInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveBlobInfoGetResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __412441328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveBlobInfoGetResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7578582369742bf989c665d923b5231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveBlobInfoGetResult(ptr: Pointer?): WithDefault =
        IGameSaveBlobInfoGetResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveBlobInfoGetResult {
      val address = segment.toRawLongValue()
      return makeIGameSaveBlobInfoGetResult(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveBlobInfoGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__412441328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveBlobInfoGetResult):
        Array<IGameSaveBlobInfoGetResult?> = (elements as
        Array<IGameSaveBlobInfoGetResult?>).castToImpl<IGameSaveBlobInfoGetResult,IGameSaveBlobInfoGetResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveBlobInfoGetResult?> =
        arrayOfNulls<IGameSaveBlobInfoGetResult_Impl>(size) as Array<IGameSaveBlobInfoGetResult?>
  }
}
