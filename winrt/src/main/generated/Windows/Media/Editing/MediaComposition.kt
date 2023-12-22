package Windows.Media.Editing

import Windows.Storage.StorageFile
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(MediaComposition.ABI::class)
@Signature("rc(Windows.Media.Editing.MediaComposition;{2e06e605-dc71-41d6-b837-2d2bc14a2947})")
@WinRTByReference(brClass = MediaComposition.ByReference::class)
public class MediaComposition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaComposition.WithDefault, IMediaComposition2.WithDefault, IWinRTObject {
  private val __1927667436_Interface: IMediaComposition.WithDefault by lazy {
    as_1927667436()
  }


  private val __371851578_Interface: IMediaComposition2.WithDefault by lazy {
    as_371851578()
  }


  public override val __1927667436_Ptr: JNAPointer? by lazy {
    __1927667436_Interface.__1927667436_Ptr
  }


  public override val __371851578_Ptr: JNAPointer? by lazy {
    __371851578_Interface.__371851578_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1927667436_Interface, __371851578_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1927667436(): IMediaComposition.WithDefault {
    if(pointer == NULL) {
      return(IMediaComposition.ABI.makeIMediaComposition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaComposition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaComposition.ABI.makeIMediaComposition(ref.value))
  }

  private fun as_371851578(): IMediaComposition2.WithDefault {
    if(pointer == NULL) {
      return(IMediaComposition2.ABI.makeIMediaComposition2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaComposition2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaComposition2.ABI.makeIMediaComposition2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaComposition> {
    public override fun getValue() = MediaComposition(pointer.getPointer(0))

    public fun setValue(value: MediaComposition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaComposition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMediaCompositionStatics_Instance: IMediaCompositionStatics by lazy {
      createIMediaCompositionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Editing.MediaComposition".toHandle(),
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

    public fun createIMediaCompositionStatics(): IMediaCompositionStatics {
      val refiid = Guid.REFIID(IMediaCompositionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Editing.MediaComposition".toHandle(),refiid,interfacePtr)
      val result = IMediaCompositionStatics.ABI.makeIMediaCompositionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaComposition {
      val address = segment.toRawLongValue()
      return MediaComposition(Pointer(address))
    }

    public override fun toNative(obj: MediaComposition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadAsync(`file`: StorageFile) =
        ABI.IMediaCompositionStatics_Instance.LoadAsync(file)
  }
}
