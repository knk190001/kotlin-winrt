package Windows.Gaming.XboxLive.Storage

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

@ABIMarker(IGameSaveProviderGetResult.ABI::class)
@Signature("{3ab90816-d393-4d65-ac16-41c3e67ab945}")
@Guid("3ab90816d3934d65ac1641c3e67ab945")
@WinRTInterface("3ab90816d3934d65ac1641c3e67ab945")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveProviderGetResult.ByReference::class)
public interface IGameSaveProviderGetResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GameSaveErrorStatus?

  @InterfaceMethod(1)
  public fun get_Value(): GameSaveProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveProviderGetResult> {
    public override fun getValue() = ABI.makeIGameSaveProviderGetResult(pointer.getPointer(0))

    public fun setValue(value: IGameSaveProviderGetResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveProviderGetResult {
    public val __1007054250_Ptr: Pointer?

    public val _1007054250_VtblPtr: Pointer?
      get() = __1007054250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GameSaveErrorStatus? {
      val fnPtr = _1007054250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1007054250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): GameSaveProvider? {
      val fnPtr = _1007054250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveProvider>()
      val hr = fn.invokeHR(arrayOf(__1007054250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveProvider>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveProviderGetResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1007054250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveProviderGetResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ab90816d3934d65ac1641c3e67ab945")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveProviderGetResult(ptr: Pointer?): WithDefault =
        IGameSaveProviderGetResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveProviderGetResult {
      val address = segment.toRawLongValue()
      return makeIGameSaveProviderGetResult(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveProviderGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007054250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveProviderGetResult):
        Array<IGameSaveProviderGetResult?> = (elements as
        Array<IGameSaveProviderGetResult?>).castToImpl<IGameSaveProviderGetResult,IGameSaveProviderGetResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveProviderGetResult?> =
        arrayOfNulls<IGameSaveProviderGetResult_Impl>(size) as Array<IGameSaveProviderGetResult?>
  }
}
