package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.Collections.IMapView
import Windows.Storage.Streams.IBuffer
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameSaveBlobGetResult.ABI::class)
@Signature("{917281e0-7201-4953-aa2c-4008f03aef45}")
@Guid("917281e072014953aa2c4008f03aef45")
@WinRTInterface("917281e072014953aa2c4008f03aef45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveBlobGetResult.ByReference::class)
public interface IGameSaveBlobGetResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GameSaveErrorStatus?

  @InterfaceMethod(1)
  public fun get_Value(): IMapView<String?, IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveBlobGetResult> {
    public override fun getValue() = ABI.makeIGameSaveBlobGetResult(pointer.getPointer(0))

    public fun setValue(value: IGameSaveBlobGetResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveBlobGetResult {
    public val __1037801090_Ptr: Pointer?

    public val _1037801090_VtblPtr: Pointer?
      get() = __1037801090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GameSaveErrorStatus? {
      val fnPtr = _1037801090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1037801090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IMapView<String?, IBuffer?>? {
      val fnPtr = _1037801090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1037801090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveBlobGetResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1037801090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveBlobGetResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("917281e072014953aa2c4008f03aef45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveBlobGetResult(ptr: Pointer?): WithDefault =
        IGameSaveBlobGetResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveBlobGetResult {
      val address = segment.toRawLongValue()
      return makeIGameSaveBlobGetResult(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveBlobGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1037801090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveBlobGetResult): Array<IGameSaveBlobGetResult?> =
        (elements as
        Array<IGameSaveBlobGetResult?>).castToImpl<IGameSaveBlobGetResult,IGameSaveBlobGetResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveBlobGetResult?> =
        arrayOfNulls<IGameSaveBlobGetResult_Impl>(size) as Array<IGameSaveBlobGetResult?>
  }
}
