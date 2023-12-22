package Windows.System

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
import Windows.Storage.IStorageFolder
import Windows.Storage.StorageFile
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Launcher.ABI::class)
@WinRTByReference(brClass = Launcher.ByReference::class)
public class Launcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Launcher> {
    public override fun getValue() = Launcher(pointer.getPointer(0))

    public fun setValue(value: Launcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Launcher, MemoryAddress> {
    public val ILauncherStatics3_Instance: ILauncherStatics3 by lazy {
      createILauncherStatics3()
    }


    public val ILauncherStatics4_Instance: ILauncherStatics4 by lazy {
      createILauncherStatics4()
    }


    public val ILauncherStatics5_Instance: ILauncherStatics5 by lazy {
      createILauncherStatics5()
    }


    public val ILauncherStatics2_Instance: ILauncherStatics2 by lazy {
      createILauncherStatics2()
    }


    public val ILauncherStatics_Instance: ILauncherStatics by lazy {
      createILauncherStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILauncherStatics3(): ILauncherStatics3 {
      val refiid = Guid.REFIID(ILauncherStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Launcher".toHandle(),refiid,interfacePtr)
      val result = ILauncherStatics3.ABI.makeILauncherStatics3(interfacePtr.value)
      return result
    }

    public fun createILauncherStatics4(): ILauncherStatics4 {
      val refiid = Guid.REFIID(ILauncherStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Launcher".toHandle(),refiid,interfacePtr)
      val result = ILauncherStatics4.ABI.makeILauncherStatics4(interfacePtr.value)
      return result
    }

    public fun createILauncherStatics5(): ILauncherStatics5 {
      val refiid = Guid.REFIID(ILauncherStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Launcher".toHandle(),refiid,interfacePtr)
      val result = ILauncherStatics5.ABI.makeILauncherStatics5(interfacePtr.value)
      return result
    }

    public fun createILauncherStatics2(): ILauncherStatics2 {
      val refiid = Guid.REFIID(ILauncherStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Launcher".toHandle(),refiid,interfacePtr)
      val result = ILauncherStatics2.ABI.makeILauncherStatics2(interfacePtr.value)
      return result
    }

    public fun createILauncherStatics(): ILauncherStatics {
      val refiid = Guid.REFIID(ILauncherStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Launcher".toHandle(),refiid,interfacePtr)
      val result = ILauncherStatics.ABI.makeILauncherStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Launcher {
      val address = segment.toRawLongValue()
      return Launcher(Pointer(address))
    }

    public override fun toNative(obj: Launcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LaunchFolderAsync(folder: IStorageFolder) =
        ABI.ILauncherStatics3_Instance.LaunchFolderAsync(folder)

    public fun LaunchFolderAsync(folder: IStorageFolder, options: FolderLauncherOptions) =
        ABI.ILauncherStatics3_Instance.LaunchFolderAsync(folder, options)

    public fun QueryAppUriSupportAsync(uri: Uri) =
        ABI.ILauncherStatics4_Instance.QueryAppUriSupportAsync(uri)

    public fun QueryAppUriSupportAsync(uri: Uri, packageFamilyName: String) =
        ABI.ILauncherStatics4_Instance.QueryAppUriSupportAsync(uri, packageFamilyName)

    public fun FindAppUriHandlersAsync(uri: Uri) =
        ABI.ILauncherStatics4_Instance.FindAppUriHandlersAsync(uri)

    public fun LaunchUriForUserAsync(user: User, uri: Uri) =
        ABI.ILauncherStatics4_Instance.LaunchUriForUserAsync(user, uri)

    public fun LaunchUriForUserAsync(
      user: User,
      uri: Uri,
      options: LauncherOptions
    ) = ABI.ILauncherStatics4_Instance.LaunchUriForUserAsync(user, uri, options)

    public fun LaunchUriForUserAsync(
      user: User,
      uri: Uri,
      options: LauncherOptions,
      inputData: ValueSet
    ) = ABI.ILauncherStatics4_Instance.LaunchUriForUserAsync(user, uri, options, inputData)

    public fun LaunchUriForResultsForUserAsync(
      user: User,
      uri: Uri,
      options: LauncherOptions
    ) = ABI.ILauncherStatics4_Instance.LaunchUriForResultsForUserAsync(user, uri, options)

    public fun LaunchUriForResultsForUserAsync(
      user: User,
      uri: Uri,
      options: LauncherOptions,
      inputData: ValueSet
    ) = ABI.ILauncherStatics4_Instance.LaunchUriForResultsForUserAsync(user, uri, options,
        inputData)

    public fun LaunchFolderPathAsync(path: String) =
        ABI.ILauncherStatics5_Instance.LaunchFolderPathAsync(path)

    public fun LaunchFolderPathAsync(path: String, options: FolderLauncherOptions) =
        ABI.ILauncherStatics5_Instance.LaunchFolderPathAsync(path, options)

    public fun LaunchFolderPathForUserAsync(user: User, path: String) =
        ABI.ILauncherStatics5_Instance.LaunchFolderPathForUserAsync(user, path)

    public fun LaunchFolderPathForUserAsync(
      user: User,
      path: String,
      options: FolderLauncherOptions
    ) = ABI.ILauncherStatics5_Instance.LaunchFolderPathForUserAsync(user, path, options)

    public fun LaunchUriForResultsAsync(uri: Uri, options: LauncherOptions) =
        ABI.ILauncherStatics2_Instance.LaunchUriForResultsAsync(uri, options)

    public fun LaunchUriForResultsAsync(
      uri: Uri,
      options: LauncherOptions,
      inputData: ValueSet
    ) = ABI.ILauncherStatics2_Instance.LaunchUriForResultsAsync(uri, options, inputData)

    public fun LaunchUriAsync(
      uri: Uri,
      options: LauncherOptions,
      inputData: ValueSet
    ) = ABI.ILauncherStatics2_Instance.LaunchUriAsync(uri, options, inputData)

    public fun QueryUriSupportAsync(uri: Uri, launchQuerySupportType: LaunchQuerySupportType) =
        ABI.ILauncherStatics2_Instance.QueryUriSupportAsync(uri, launchQuerySupportType)

    public fun QueryUriSupportAsync(
      uri: Uri,
      launchQuerySupportType: LaunchQuerySupportType,
      packageFamilyName: String
    ) = ABI.ILauncherStatics2_Instance.QueryUriSupportAsync(uri, launchQuerySupportType,
        packageFamilyName)

    public fun QueryFileSupportAsync(`file`: StorageFile) =
        ABI.ILauncherStatics2_Instance.QueryFileSupportAsync(file)

    public fun QueryFileSupportAsync(`file`: StorageFile, packageFamilyName: String) =
        ABI.ILauncherStatics2_Instance.QueryFileSupportAsync(file, packageFamilyName)

    public fun FindUriSchemeHandlersAsync(scheme: String) =
        ABI.ILauncherStatics2_Instance.FindUriSchemeHandlersAsync(scheme)

    public fun FindUriSchemeHandlersAsync(scheme: String,
        launchQuerySupportType: LaunchQuerySupportType) =
        ABI.ILauncherStatics2_Instance.FindUriSchemeHandlersAsync(scheme, launchQuerySupportType)

    public fun FindFileHandlersAsync(extension: String) =
        ABI.ILauncherStatics2_Instance.FindFileHandlersAsync(extension)

    public fun LaunchFileAsync(`file`: IStorageFile) =
        ABI.ILauncherStatics_Instance.LaunchFileAsync(file)

    public fun LaunchFileAsync(`file`: IStorageFile, options: LauncherOptions) =
        ABI.ILauncherStatics_Instance.LaunchFileAsync(file, options)

    public fun LaunchUriAsync(uri: Uri) = ABI.ILauncherStatics_Instance.LaunchUriAsync(uri)

    public fun LaunchUriAsync(uri: Uri, options: LauncherOptions) =
        ABI.ILauncherStatics_Instance.LaunchUriAsync(uri, options)
  }
}
