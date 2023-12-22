package Windows.Media.Capture

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

@ABIMarker(MediaCaptureInitializationSettings.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureInitializationSettings;{9782ba70-ea65-4900-9356-8ca887726884})")
@WinRTByReference(brClass = MediaCaptureInitializationSettings.ByReference::class)
public class MediaCaptureInitializationSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureInitializationSettings.WithDefault,
    IMediaCaptureInitializationSettings2.WithDefault,
    IMediaCaptureInitializationSettings3.WithDefault,
    IMediaCaptureInitializationSettings4.WithDefault,
    IMediaCaptureInitializationSettings5.WithDefault,
    IMediaCaptureInitializationSettings6.WithDefault,
    IMediaCaptureInitializationSettings7.WithDefault, IWinRTObject {
  private val __1466123235_Interface: IMediaCaptureInitializationSettings.WithDefault by lazy {
    as_1466123235()
  }


  private val __1794820021_Interface: IMediaCaptureInitializationSettings2.WithDefault by lazy {
    as_1794820021()
  }


  private val __1794820022_Interface: IMediaCaptureInitializationSettings3.WithDefault by lazy {
    as_1794820022()
  }


  private val __1794820023_Interface: IMediaCaptureInitializationSettings4.WithDefault by lazy {
    as_1794820023()
  }


  private val __1794820024_Interface: IMediaCaptureInitializationSettings5.WithDefault by lazy {
    as_1794820024()
  }


  private val __1794820025_Interface: IMediaCaptureInitializationSettings6.WithDefault by lazy {
    as_1794820025()
  }


  private val __1794820026_Interface: IMediaCaptureInitializationSettings7.WithDefault by lazy {
    as_1794820026()
  }


  public override val __1466123235_Ptr: JNAPointer? by lazy {
    __1466123235_Interface.__1466123235_Ptr
  }


  public override val __1794820021_Ptr: JNAPointer? by lazy {
    __1794820021_Interface.__1794820021_Ptr
  }


  public override val __1794820022_Ptr: JNAPointer? by lazy {
    __1794820022_Interface.__1794820022_Ptr
  }


  public override val __1794820023_Ptr: JNAPointer? by lazy {
    __1794820023_Interface.__1794820023_Ptr
  }


  public override val __1794820024_Ptr: JNAPointer? by lazy {
    __1794820024_Interface.__1794820024_Ptr
  }


  public override val __1794820025_Ptr: JNAPointer? by lazy {
    __1794820025_Interface.__1794820025_Ptr
  }


  public override val __1794820026_Ptr: JNAPointer? by lazy {
    __1794820026_Interface.__1794820026_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1466123235_Interface, __1794820021_Interface, __1794820022_Interface,
        __1794820023_Interface, __1794820024_Interface, __1794820025_Interface,
        __1794820026_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1466123235(): IMediaCaptureInitializationSettings.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings.ABI.makeIMediaCaptureInitializationSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings.ABI.makeIMediaCaptureInitializationSettings(ref.value))
  }

  private fun as_1794820021(): IMediaCaptureInitializationSettings2.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings2.ABI.makeIMediaCaptureInitializationSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings2.ABI.makeIMediaCaptureInitializationSettings2(ref.value))
  }

  private fun as_1794820022(): IMediaCaptureInitializationSettings3.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings3.ABI.makeIMediaCaptureInitializationSettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings3.ABI.makeIMediaCaptureInitializationSettings3(ref.value))
  }

  private fun as_1794820023(): IMediaCaptureInitializationSettings4.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings4.ABI.makeIMediaCaptureInitializationSettings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings4.ABI.makeIMediaCaptureInitializationSettings4(ref.value))
  }

  private fun as_1794820024(): IMediaCaptureInitializationSettings5.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings5.ABI.makeIMediaCaptureInitializationSettings5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings5.ABI.makeIMediaCaptureInitializationSettings5(ref.value))
  }

  private fun as_1794820025(): IMediaCaptureInitializationSettings6.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings6.ABI.makeIMediaCaptureInitializationSettings6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings6.ABI.makeIMediaCaptureInitializationSettings6(ref.value))
  }

  private fun as_1794820026(): IMediaCaptureInitializationSettings7.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureInitializationSettings7.ABI.makeIMediaCaptureInitializationSettings7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureInitializationSettings7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureInitializationSettings7.ABI.makeIMediaCaptureInitializationSettings7(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureInitializationSettings> {
    public override fun getValue() = MediaCaptureInitializationSettings(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureInitializationSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureInitializationSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.MediaCaptureInitializationSettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaCaptureInitializationSettings {
      val address = segment.toRawLongValue()
      return MediaCaptureInitializationSettings(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureInitializationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
