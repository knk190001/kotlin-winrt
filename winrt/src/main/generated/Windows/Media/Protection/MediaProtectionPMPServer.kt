package Windows.Media.Protection

import Windows.Foundation.Collections.IPropertySet
import Windows.Media.Protection.IMediaProtectionPMPServerFactory.ABI.IID
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

@ABIMarker(MediaProtectionPMPServer.ABI::class)
@Signature("rc(Windows.Media.Protection.MediaProtectionPMPServer;{0c111226-7b26-4d31-95bb-9c1b08ef7fc0})")
@WinRTByReference(brClass = MediaProtectionPMPServer.ByReference::class)
public class MediaProtectionPMPServer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaProtectionPMPServer.WithDefault, IWinRTObject {
  private val __1533107340_Interface: IMediaProtectionPMPServer.WithDefault by lazy {
    as_1533107340()
  }


  public override val __1533107340_Ptr: JNAPointer? by lazy {
    __1533107340_Interface.__1533107340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1533107340_Interface)

  public constructor(pProperties: IPropertySet) : this(ABI.activate(pProperties))

  private fun as_1533107340(): IMediaProtectionPMPServer.WithDefault {
    if(pointer == NULL) {
      return(IMediaProtectionPMPServer.ABI.makeIMediaProtectionPMPServer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProtectionPMPServer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProtectionPMPServer.ABI.makeIMediaProtectionPMPServer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaProtectionPMPServer> {
    public override fun getValue() = MediaProtectionPMPServer(pointer.getPointer(0))

    public fun setValue(value: MediaProtectionPMPServer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaProtectionPMPServer, MemoryAddress> {
    public val IMediaProtectionPMPServerFactory_Instance: IMediaProtectionPMPServerFactory by lazy {
      createIMediaProtectionPMPServerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaProtectionPMPServerFactory(): IMediaProtectionPMPServerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.MediaProtectionPMPServer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaProtectionPMPServerFactory.ABI.makeIMediaProtectionPMPServerFactory(factoryActivatorPtr.value))
    }

    public fun activate(pProperties: IPropertySet): JNAPointer? =
        IMediaProtectionPMPServerFactory_Instance.CreatePMPServer(pProperties)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaProtectionPMPServer {
      val address = segment.toRawLongValue()
      return MediaProtectionPMPServer(Pointer(address))
    }

    public override fun toNative(obj: MediaProtectionPMPServer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
