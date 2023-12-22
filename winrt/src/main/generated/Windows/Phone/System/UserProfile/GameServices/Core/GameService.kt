package Windows.Phone.System.UserProfile.GameServices.Core

import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GameService.ABI::class)
@WinRTByReference(brClass = GameService.ByReference::class)
public class GameService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GameService> {
    public override fun getValue() = GameService(pointer.getPointer(0))

    public fun setValue(value: GameService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameService, MemoryAddress> {
    public val IGameService_Instance: IGameService by lazy {
      createIGameService()
    }


    public val IGameService2_Instance: IGameService2 by lazy {
      createIGameService2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameService(): IGameService {
      val refiid = Guid.REFIID(IGameService.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.UserProfile.GameServices.Core.GameService".toHandle(),refiid,interfacePtr)
      val result = IGameService.ABI.makeIGameService(interfacePtr.value)
      return result
    }

    public fun createIGameService2(): IGameService2 {
      val refiid = Guid.REFIID(IGameService2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.UserProfile.GameServices.Core.GameService".toHandle(),refiid,interfacePtr)
      val result = IGameService2.ABI.makeIGameService2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameService {
      val address = segment.toRawLongValue()
      return GameService(Pointer(address))
    }

    public override fun toNative(obj: GameService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ServiceUri() = ABI.IGameService_Instance.get_ServiceUri()

    public fun GetGamerProfileAsync() = ABI.IGameService_Instance.GetGamerProfileAsync()

    public fun GetInstalledGameItemsAsync() = ABI.IGameService_Instance.GetInstalledGameItemsAsync()

    public fun GetPartnerTokenAsync(audienceUri: Uri) =
        ABI.IGameService_Instance.GetPartnerTokenAsync(audienceUri)

    public fun GetPrivilegesAsync() = ABI.IGameService_Instance.GetPrivilegesAsync()

    public fun GrantAchievement(achievementId: WinDef.UINT) =
        ABI.IGameService_Instance.GrantAchievement(achievementId)

    public fun GrantAvatarAward(avatarAwardId: WinDef.UINT) =
        ABI.IGameService_Instance.GrantAvatarAward(avatarAwardId)

    public fun PostResult(
      gameVariant: WinDef.UINT,
      scoreKind: GameServiceScoreKind,
      scoreValue: Long,
      gameOutcome: GameServiceGameOutcome,
      buffer: IBuffer
    ) = ABI.IGameService_Instance.PostResult(gameVariant, scoreKind, scoreValue, gameOutcome,
        buffer)

    public fun NotifyPartnerTokenExpired(audienceUri: Uri) =
        ABI.IGameService2_Instance.NotifyPartnerTokenExpired(audienceUri)

    public fun GetAuthenticationStatus() = ABI.IGameService2_Instance.GetAuthenticationStatus()
  }
}
