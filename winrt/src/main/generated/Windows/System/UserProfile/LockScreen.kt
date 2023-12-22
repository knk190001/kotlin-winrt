package Windows.System.UserProfile

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LockScreen.ABI::class)
@WinRTByReference(brClass = LockScreen.ByReference::class)
public class LockScreen(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LockScreen> {
    public override fun getValue() = LockScreen(pointer.getPointer(0))

    public fun setValue(value: LockScreen): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockScreen, MemoryAddress> {
    public val ILockScreenStatics_Instance: ILockScreenStatics by lazy {
      createILockScreenStatics()
    }


    public val ILockScreenImageFeedStatics_Instance: ILockScreenImageFeedStatics by lazy {
      createILockScreenImageFeedStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILockScreenStatics(): ILockScreenStatics {
      val refiid = Guid.REFIID(ILockScreenStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.LockScreen".toHandle(),refiid,interfacePtr)
      val result = ILockScreenStatics.ABI.makeILockScreenStatics(interfacePtr.value)
      return result
    }

    public fun createILockScreenImageFeedStatics(): ILockScreenImageFeedStatics {
      val refiid = Guid.REFIID(ILockScreenImageFeedStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.LockScreen".toHandle(),refiid,interfacePtr)
      val result =
          ILockScreenImageFeedStatics.ABI.makeILockScreenImageFeedStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LockScreen {
      val address = segment.toRawLongValue()
      return LockScreen(Pointer(address))
    }

    public override fun toNative(obj: LockScreen): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OriginalImageFile() = ABI.ILockScreenStatics_Instance.get_OriginalImageFile()

    public fun GetImageStream() = ABI.ILockScreenStatics_Instance.GetImageStream()

    public fun SetImageFileAsync(value: IStorageFile) =
        ABI.ILockScreenStatics_Instance.SetImageFileAsync(value)

    public fun SetImageStreamAsync(value: IRandomAccessStream) =
        ABI.ILockScreenStatics_Instance.SetImageStreamAsync(value)

    public fun RequestSetImageFeedAsync(syndicationFeedUri: Uri) =
        ABI.ILockScreenImageFeedStatics_Instance.RequestSetImageFeedAsync(syndicationFeedUri)

    public fun TryRemoveImageFeed() = ABI.ILockScreenImageFeedStatics_Instance.TryRemoveImageFeed()
  }
}
