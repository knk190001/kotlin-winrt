package Windows.System.UserProfile

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UserInformation.ABI::class)
@WinRTByReference(brClass = UserInformation.ByReference::class)
public class UserInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserInformation> {
    public override fun getValue() = UserInformation(pointer.getPointer(0))

    public fun setValue(value: UserInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserInformation, MemoryAddress> {
    public val IUserInformationStatics_Instance: IUserInformationStatics by lazy {
      createIUserInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserInformationStatics(): IUserInformationStatics {
      val refiid = Guid.REFIID(IUserInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.UserInformation".toHandle(),refiid,interfacePtr)
      val result = IUserInformationStatics.ABI.makeIUserInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserInformation {
      val address = segment.toRawLongValue()
      return UserInformation(Pointer(address))
    }

    public override fun toNative(obj: UserInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AccountPictureChangeEnabled() =
        ABI.IUserInformationStatics_Instance.get_AccountPictureChangeEnabled()

    public fun get_NameAccessAllowed() =
        ABI.IUserInformationStatics_Instance.get_NameAccessAllowed()

    public fun GetAccountPicture(kind: AccountPictureKind) =
        ABI.IUserInformationStatics_Instance.GetAccountPicture(kind)

    public fun SetAccountPictureAsync(image: IStorageFile) =
        ABI.IUserInformationStatics_Instance.SetAccountPictureAsync(image)

    public fun SetAccountPicturesAsync(
      smallImage: IStorageFile,
      largeImage: IStorageFile,
      video: IStorageFile
    ) = ABI.IUserInformationStatics_Instance.SetAccountPicturesAsync(smallImage, largeImage, video)

    public fun SetAccountPictureFromStreamAsync(image: IRandomAccessStream) =
        ABI.IUserInformationStatics_Instance.SetAccountPictureFromStreamAsync(image)

    public fun SetAccountPicturesFromStreamsAsync(
      smallImage: IRandomAccessStream,
      largeImage: IRandomAccessStream,
      video: IRandomAccessStream
    ) = ABI.IUserInformationStatics_Instance.SetAccountPicturesFromStreamsAsync(smallImage,
        largeImage, video)

    public fun add_AccountPictureChanged(changeHandler: EventHandler<IUnknown?>) =
        ABI.IUserInformationStatics_Instance.add_AccountPictureChanged(changeHandler)

    public fun remove_AccountPictureChanged(token: EventRegistrationToken) =
        ABI.IUserInformationStatics_Instance.remove_AccountPictureChanged(token)

    public fun GetDisplayNameAsync() = ABI.IUserInformationStatics_Instance.GetDisplayNameAsync()

    public fun GetFirstNameAsync() = ABI.IUserInformationStatics_Instance.GetFirstNameAsync()

    public fun GetLastNameAsync() = ABI.IUserInformationStatics_Instance.GetLastNameAsync()

    public fun GetPrincipalNameAsync() =
        ABI.IUserInformationStatics_Instance.GetPrincipalNameAsync()

    public fun GetSessionInitiationProtocolUriAsync() =
        ABI.IUserInformationStatics_Instance.GetSessionInitiationProtocolUriAsync()

    public fun GetDomainNameAsync() = ABI.IUserInformationStatics_Instance.GetDomainNameAsync()
  }
}
