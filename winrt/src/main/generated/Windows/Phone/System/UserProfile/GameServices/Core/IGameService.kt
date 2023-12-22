package Windows.Phone.System.UserProfile.GameServices.Core

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameService.ABI::class)
@Signature("{2e2d5098-48a9-4efc-afd6-8e6da09003fb}")
@Guid("2e2d509848a94efcafd68e6da09003fb")
@WinRTInterface("2e2d509848a94efcafd68e6da09003fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameService.ByReference::class)
public interface IGameService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServiceUri(): Uri?

  @InterfaceMethod(1)
  public fun GetGamerProfileAsync(): IAsyncOperation<GameServicePropertyCollection?>?

  @InterfaceMethod(2)
  public fun GetInstalledGameItemsAsync(): IAsyncOperation<GameServicePropertyCollection?>?

  @InterfaceMethod(3)
  public fun GetPartnerTokenAsync(audienceUri: Uri?): IAsyncOperation<String?>?

  @InterfaceMethod(4)
  public fun GetPrivilegesAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun GrantAchievement(achievementId: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun GrantAvatarAward(avatarAwardId: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun PostResult(
    gameVariant: WinDef.UINT,
    scoreKind: GameServiceScoreKind?,
    scoreValue: Long,
    gameOutcome: GameServiceGameOutcome?,
    buffer: IBuffer?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGameService> {
    public override fun getValue() = ABI.makeIGameService(pointer.getPointer(0))

    public fun setValue(value: IGameService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameService {
    public val __7995443_Ptr: Pointer?

    public val _7995443_VtblPtr: Pointer?
      get() = __7995443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceUri(): Uri? {
      val fnPtr = _7995443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetGamerProfileAsync(): IAsyncOperation<GameServicePropertyCollection?>? {
      val fnPtr = _7995443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameServicePropertyCollection?>>()
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameServicePropertyCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetInstalledGameItemsAsync():
        IAsyncOperation<GameServicePropertyCollection?>? {
      val fnPtr = _7995443_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameServicePropertyCollection?>>()
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameServicePropertyCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetPartnerTokenAsync(audienceUri: Uri?): IAsyncOperation<String?>? {
      val fnPtr = _7995443_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr, marshalToNative(audienceUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPrivilegesAsync(): IAsyncOperation<String?>? {
      val fnPtr = _7995443_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GrantAchievement(achievementId: WinDef.UINT): Unit {
      val fnPtr = _7995443_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr, achievementId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GrantAvatarAward(avatarAwardId: WinDef.UINT): Unit {
      val fnPtr = _7995443_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr, avatarAwardId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun PostResult(
      gameVariant: WinDef.UINT,
      scoreKind: GameServiceScoreKind?,
      scoreValue: Long,
      gameOutcome: GameServiceGameOutcome?,
      buffer: IBuffer?
    ): Unit {
      val fnPtr = _7995443_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__7995443_Ptr, gameVariant, marshalToNative(scoreKind),
          scoreValue, marshalToNative(gameOutcome), marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7995443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e2d509848a94efcafd68e6da09003fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameService(ptr: Pointer?): WithDefault = IGameService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameService {
      val address = segment.toRawLongValue()
      return makeIGameService(Pointer(address))
    }

    public override fun toNative(obj: IGameService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7995443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameService): Array<IGameService?> = (elements as
        Array<IGameService?>).castToImpl<IGameService,IGameService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameService?> =
        arrayOfNulls<IGameService_Impl>(size) as Array<IGameService?>
  }
}
