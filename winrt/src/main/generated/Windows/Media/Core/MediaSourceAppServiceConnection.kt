package Windows.Media.Core

import Windows.ApplicationModel.AppService.AppServiceConnection
import Windows.Media.Core.IMediaSourceAppServiceConnectionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(MediaSourceAppServiceConnection.ABI::class)
@Signature("rc(Windows.Media.Core.MediaSourceAppServiceConnection;{61e1ea97-1916-4810-b7f4-b642be829596})")
@WinRTByReference(brClass = MediaSourceAppServiceConnection.ByReference::class)
public class MediaSourceAppServiceConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaSourceAppServiceConnection.WithDefault, IWinRTObject {
  private val __930575772_Interface: IMediaSourceAppServiceConnection.WithDefault by lazy {
    as_930575772()
  }


  public override val __930575772_Ptr: JNAPointer? by lazy {
    __930575772_Interface.__930575772_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__930575772_Interface)

  public constructor(appServiceConnection: AppServiceConnection) :
      this(ABI.activate(appServiceConnection))

  private fun as_930575772(): IMediaSourceAppServiceConnection.WithDefault {
    if(pointer == NULL) {
      return(IMediaSourceAppServiceConnection.ABI.makeIMediaSourceAppServiceConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSourceAppServiceConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSourceAppServiceConnection.ABI.makeIMediaSourceAppServiceConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaSourceAppServiceConnection> {
    public override fun getValue() = MediaSourceAppServiceConnection(pointer.getPointer(0))

    public fun setValue(value: MediaSourceAppServiceConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaSourceAppServiceConnection, MemoryAddress> {
    public val IMediaSourceAppServiceConnectionFactory_Instance:
        IMediaSourceAppServiceConnectionFactory by lazy {
      createIMediaSourceAppServiceConnectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaSourceAppServiceConnectionFactory():
        IMediaSourceAppServiceConnectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaSourceAppServiceConnection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaSourceAppServiceConnectionFactory.ABI.makeIMediaSourceAppServiceConnectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(appServiceConnection: AppServiceConnection): JNAPointer? =
        IMediaSourceAppServiceConnectionFactory_Instance.Create(appServiceConnection)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaSourceAppServiceConnection {
      val address = segment.toRawLongValue()
      return MediaSourceAppServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: MediaSourceAppServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
