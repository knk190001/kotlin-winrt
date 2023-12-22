package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Uri
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

@ABIMarker(ContentPrefetcher.ABI::class)
@WinRTByReference(brClass = ContentPrefetcher.ByReference::class)
public class ContentPrefetcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentPrefetcher> {
    public override fun getValue() = ContentPrefetcher(pointer.getPointer(0))

    public fun setValue(value: ContentPrefetcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentPrefetcher, MemoryAddress> {
    public val IContentPrefetcher_Instance: IContentPrefetcher by lazy {
      createIContentPrefetcher()
    }


    public val IContentPrefetcherTime_Instance: IContentPrefetcherTime by lazy {
      createIContentPrefetcherTime()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentPrefetcher(): IContentPrefetcher {
      val refiid = Guid.REFIID(IContentPrefetcher.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.ContentPrefetcher".toHandle(),refiid,interfacePtr)
      val result = IContentPrefetcher.ABI.makeIContentPrefetcher(interfacePtr.value)
      return result
    }

    public fun createIContentPrefetcherTime(): IContentPrefetcherTime {
      val refiid = Guid.REFIID(IContentPrefetcherTime.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.ContentPrefetcher".toHandle(),refiid,interfacePtr)
      val result = IContentPrefetcherTime.ABI.makeIContentPrefetcherTime(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentPrefetcher {
      val address = segment.toRawLongValue()
      return ContentPrefetcher(Pointer(address))
    }

    public override fun toNative(obj: ContentPrefetcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentUris() = ABI.IContentPrefetcher_Instance.get_ContentUris()

    public fun put_IndirectContentUri(value: Uri) =
        ABI.IContentPrefetcher_Instance.put_IndirectContentUri(value)

    public fun get_IndirectContentUri() = ABI.IContentPrefetcher_Instance.get_IndirectContentUri()

    public fun get_LastSuccessfulPrefetchTime() =
        ABI.IContentPrefetcherTime_Instance.get_LastSuccessfulPrefetchTime()
  }
}
