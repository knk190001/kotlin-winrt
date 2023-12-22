package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IGameSaveProviderStatics.ABI::class)
@Signature("{d01d3ed0-7b03-449d-8cbd-3402842a1048}")
@Guid("d01d3ed07b03449d8cbd3402842a1048")
@WinRTInterface("d01d3ed07b03449d8cbd3402842a1048")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveProviderStatics.ByReference::class)
public interface IGameSaveProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUserAsync(user: User?, serviceConfigId: String?):
      IAsyncOperation<GameSaveProviderGetResult?>?

  @InterfaceMethod(1)
  public fun GetSyncOnDemandForUserAsync(user: User?, serviceConfigId: String?):
      IAsyncOperation<GameSaveProviderGetResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveProviderStatics> {
    public override fun getValue() = ABI.makeIGameSaveProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IGameSaveProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveProviderStatics {
    public val __7027740_Ptr: Pointer?

    public val _7027740_VtblPtr: Pointer?
      get() = __7027740_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUserAsync(user: User?, serviceConfigId: String?):
        IAsyncOperation<GameSaveProviderGetResult?>? {
      val fnPtr = _7027740_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveProviderGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__7027740_Ptr, marshalToNative(user),
          marshalToNative(serviceConfigId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveProviderGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSyncOnDemandForUserAsync(user: User?, serviceConfigId: String?):
        IAsyncOperation<GameSaveProviderGetResult?>? {
      val fnPtr = _7027740_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveProviderGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__7027740_Ptr, marshalToNative(user),
          marshalToNative(serviceConfigId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveProviderGetResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7027740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d01d3ed07b03449d8cbd3402842a1048")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveProviderStatics(ptr: Pointer?): WithDefault =
        IGameSaveProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveProviderStatics {
      val address = segment.toRawLongValue()
      return makeIGameSaveProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7027740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveProviderStatics):
        Array<IGameSaveProviderStatics?> = (elements as
        Array<IGameSaveProviderStatics?>).castToImpl<IGameSaveProviderStatics,IGameSaveProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveProviderStatics?> =
        arrayOfNulls<IGameSaveProviderStatics_Impl>(size) as Array<IGameSaveProviderStatics?>
  }
}
