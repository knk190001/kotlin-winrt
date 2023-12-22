package Windows.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(MediaExtensionManager.ABI::class)
@Signature("rc(Windows.Media.MediaExtensionManager;{4a25eaf5-242d-4dfb-97f4-69b7c42576ff})")
@WinRTByReference(brClass = MediaExtensionManager.ByReference::class)
public class MediaExtensionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaExtensionManager.WithDefault, IMediaExtensionManager2.WithDefault,
    IWinRTObject {
  private val __418870942_Interface: IMediaExtensionManager.WithDefault by lazy {
    as_418870942()
  }


  private val __100097264_Interface: IMediaExtensionManager2.WithDefault by lazy {
    as_100097264()
  }


  public override val __418870942_Ptr: JNAPointer? by lazy {
    __418870942_Interface.__418870942_Ptr
  }


  public override val __100097264_Ptr: JNAPointer? by lazy {
    __100097264_Interface.__100097264_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__418870942_Interface, __100097264_Interface)

  public constructor() : this(ABI.activate())

  private fun as_418870942(): IMediaExtensionManager.WithDefault {
    if(pointer == NULL) {
      return(IMediaExtensionManager.ABI.makeIMediaExtensionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaExtensionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaExtensionManager.ABI.makeIMediaExtensionManager(ref.value))
  }

  private fun as_100097264(): IMediaExtensionManager2.WithDefault {
    if(pointer == NULL) {
      return(IMediaExtensionManager2.ABI.makeIMediaExtensionManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaExtensionManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaExtensionManager2.ABI.makeIMediaExtensionManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaExtensionManager> {
    public override fun getValue() = MediaExtensionManager(pointer.getPointer(0))

    public fun setValue(value: MediaExtensionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaExtensionManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.MediaExtensionManager".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MediaExtensionManager {
      val address = segment.toRawLongValue()
      return MediaExtensionManager(Pointer(address))
    }

    public override fun toNative(obj: MediaExtensionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
