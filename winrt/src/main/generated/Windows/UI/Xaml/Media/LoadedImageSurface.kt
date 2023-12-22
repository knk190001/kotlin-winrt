package Windows.UI.Xaml.Media

import Windows.Foundation.IClosable
import Windows.Foundation.Size
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStream
import Windows.UI.Composition.ICompositionSurface
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

@ABIMarker(LoadedImageSurface.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.LoadedImageSurface;{050c8313-6737-45ba-8531-33094febef55})")
@WinRTByReference(brClass = LoadedImageSurface.ByReference::class)
public class LoadedImageSurface(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoadedImageSurface.WithDefault, IClosable.WithDefault,
    ICompositionSurface.WithDefault, IWinRTObject {
  private val __1537909133_Interface: ILoadedImageSurface.WithDefault by lazy {
    as_1537909133()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1111408593_Interface: ICompositionSurface.WithDefault by lazy {
    as_1111408593()
  }


  public override val __1537909133_Ptr: JNAPointer? by lazy {
    __1537909133_Interface.__1537909133_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1111408593_Ptr: JNAPointer? by lazy {
    __1111408593_Interface.__1111408593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1537909133_Interface, __1260617006_Interface, __1111408593_Interface)

  private fun as_1537909133(): ILoadedImageSurface.WithDefault {
    if(pointer == NULL) {
      return(ILoadedImageSurface.ABI.makeILoadedImageSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoadedImageSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoadedImageSurface.ABI.makeILoadedImageSurface(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1111408593(): ICompositionSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurface.ABI.makeICompositionSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurface.ABI.makeICompositionSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoadedImageSurface> {
    public override fun getValue() = LoadedImageSurface(pointer.getPointer(0))

    public fun setValue(value: LoadedImageSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoadedImageSurface, MemoryAddress> {
    public val ILoadedImageSurfaceStatics_Instance: ILoadedImageSurfaceStatics by lazy {
      createILoadedImageSurfaceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILoadedImageSurfaceStatics(): ILoadedImageSurfaceStatics {
      val refiid = Guid.REFIID(ILoadedImageSurfaceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.LoadedImageSurface".toHandle(),refiid,interfacePtr)
      val result = ILoadedImageSurfaceStatics.ABI.makeILoadedImageSurfaceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LoadedImageSurface {
      val address = segment.toRawLongValue()
      return LoadedImageSurface(Pointer(address))
    }

    public override fun toNative(obj: LoadedImageSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun StartLoadFromUri(uri: Uri, desiredMaxSize: Size) =
        ABI.ILoadedImageSurfaceStatics_Instance.StartLoadFromUri(uri, desiredMaxSize)

    public fun StartLoadFromUri(uri: Uri) =
        ABI.ILoadedImageSurfaceStatics_Instance.StartLoadFromUri(uri)

    public fun StartLoadFromStream(stream: IRandomAccessStream, desiredMaxSize: Size) =
        ABI.ILoadedImageSurfaceStatics_Instance.StartLoadFromStream(stream, desiredMaxSize)

    public fun StartLoadFromStream(stream: IRandomAccessStream) =
        ABI.ILoadedImageSurfaceStatics_Instance.StartLoadFromStream(stream)
  }
}
